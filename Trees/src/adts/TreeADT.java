package adts;

import node.BTNode;

public interface TreeADT {
	
	BTNode find(int key);
	void put(int value);
	void remove(int value);
	BTNode findSuccessor(BTNode node);
	void inOrder(BTNode localRoot);
	void preOrder(BTNode localRoot);
	void postOrder(BTNode localRoot);
	

}
