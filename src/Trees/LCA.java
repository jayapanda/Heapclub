package Trees;

public class LCA {
	Node root;
	
	public Node commonAncestor(Node root, int n1, int n2){
		if(root == null)
			return null;
		if(root.data == n1 || root.data == n2)
			return root;
		Node left = commonAncestor(root.left,n1,n2);
		Node right = commonAncestor(root.right, n1, n2);
		if(left == null && right == null)
			return null;
		else if(left !=null && right!=null )
			return root;
		return (left!=null? left:right);
			
		
		
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LCA lca = new LCA();
		
		lca.root = new Node(1);
		lca.root.left = new Node(3);
		lca.root.right = new Node(2);
		lca.root.left.left = new Node(5);
		
		int n1 = 3;
		int n2 = 2;
		
		System.out.println(lca.commonAncestor(null,n1, n2));

	}
	
	

}
