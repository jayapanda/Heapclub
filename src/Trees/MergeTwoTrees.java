package Trees;

class Node{
	int data;
	Node left, right;
	public Node(int data){
		this.data = data;
		this.left = null;
		this.right = null;
	}
	
}

public class MergeTwoTrees {
	Node root1, root2;
	
	public Node mergeTrees(Node root1, Node root2){
		if(root1==null){
			return root2;			
		}
		if(root2==null){
			return root1;			
		}
		//creating a new merged tree
		Node root3 = new Node(root1.data + root2.data);
		root3.left = mergeTrees(root1.left, root2.left);
		root3.right = mergeTrees(root1.right, root2.right);
		return root3;
	}
	
	public Node mergeTreesNoNewTree(Node root1, Node root2){
		if(root1==null){
			return root2;			
		}
		if(root2==null){
			return root1;			
		}
		root1.data = root1.data + root2.data;
		root1.left = mergeTrees(root1.left, root2.left);
		root1.right = mergeTrees(root1.right, root2.right);
		return root1;
	}
	
	public void inOrderTraversal(Node root){
		if(root == null)
			return;
		inOrderTraversal(root.left);
		System.out.print(root.data + " ");
		inOrderTraversal(root.right);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MergeTwoTrees mtt = new MergeTwoTrees();
		
		
		mtt.root1 = new Node(1);
		mtt.root1.left = new Node(3);
		mtt.root1.right = new Node(2);
		mtt.root1.left.left = new Node(5);
		
		mtt.root2 = new Node(2);
		mtt.root2.left = new Node(1);
		mtt.root2.left.right = new Node(4);
		mtt.root2.right = new Node(3);
		mtt.root2.right.right = new Node(7);
		
//		Node root3 = mtt.mergeTrees(mtt.root1, mtt.root2); 
//		mtt.inOrderTraversal(root3);
		
		Node root3 = mtt.mergeTreesNoNewTree(mtt.root1, mtt.root2); 
		mtt.inOrderTraversal(root3);
		
		
		

	}

}
