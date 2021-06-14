package implementations;

import adts.TreeADT;
import node.BTNode;

public class BinaryTree implements TreeADT {

	private BTNode root;

	public BTNode getRoot() {
		return root;
	}

	public BinaryTree() {
		root = null;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BinaryTree bt = new BinaryTree();
		bt.put(5);
		bt.put(7);
		bt.put(3);
		bt.put(2);
		bt.put(4);
		bt.put(8);
		bt.put(6);
	
		bt.postOrder(bt.root);
		
		

	}

	@Override
	public BTNode find(int key) {

		BTNode current = root;
		while (current != null) {
			if (key < current.data) {
				if (current.left == null) {
					return current;
				}
				current = current.left;
			} else if (key > current.data) {
				if (current.right == null)
					return current;

				current = current.right;
			} else {
				return current;
			}
		}

		return null;
	}

	@Override
	public void put(int value) {
		// TODO Auto-generated method stub
		BTNode newNode = new BTNode(value);
		if (root == null) {
			root = newNode;
		} else {
			BTNode parent = find(value);
			if (value < parent.data) {
				parent.left = newNode;
				parent.left.parent = parent;
				return;
			} else {
				parent.right = newNode;
				parent.right.parent = parent;
			}
		}

	}

	@Override
	public void inOrder(BTNode localRoot) {
		// TODO Auto-generated method stub
		if (localRoot != null) {
			inOrder(localRoot.left);
			System.out.println(localRoot.data + " ");
			inOrder(localRoot.right);
		}

	}

	@Override
	public void preOrder(BTNode localRoot) {
		// TODO Auto-generated method stub
		if (localRoot != null) {
			System.out.print(localRoot.data + " ");
			preOrder(localRoot.left);
			preOrder(localRoot.right);
		}

	}

	@Override
	public void postOrder(BTNode localRoot) {
		// TODO Auto-generated method stub
		if (localRoot != null) {
			postOrder(localRoot.left);
			postOrder(localRoot.right);
			System.out.print(localRoot.data + " ");
		}

	}

	@Override
	public void remove(int value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public BTNode findSuccessor(BTNode node) {
		// TODO Auto-generated method stub
		return null;
	}

}
