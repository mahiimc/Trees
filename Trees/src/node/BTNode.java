package node;



public class BTNode {

		public int data;
		public BTNode left;
		public BTNode right;
		public BTNode parent;
		
		
		public BTNode(int data) {
			this.data = data;
			left = null;
			right= null;
		}


		@Override
		public String toString() {
			return "BTNode [data=" + data + ", left=" + left + ", right=" + right + ", parent=" + parent + "]";
		}
		
		
		
	}

