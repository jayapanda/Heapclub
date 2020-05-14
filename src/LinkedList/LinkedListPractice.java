package LinkedList;


class Node{
	int val;
	Node next;
	
	public Node(int val){
		this.val = val;
		this.next = null;
	}
}
public class LinkedListPractice {
	
	Node head;
	
	public void insertNode(int val, int pos){
		Node newNode = new Node(val);
		if(head  == null){
			head = newNode;
			return;
		}
		if(pos == 0){
			newNode.next = head;
			head = newNode;
		} else {
			int currPos = 1;
			Node current = head;
			
			while(currPos < pos-1 && current.next!=null){
				currPos++;
				current = current.next;
				
			}
			if(current.next == null){
				current.next = newNode;
				
			}
			else{
				Node temp = current.next;
				current.next = newNode;
				newNode.next = temp;
			}
			
		}
			
	
	}
	
	public boolean findNode(int val){
		Node current = head;
		while(current.next!=null&&current.val!=val){
			
			current = current.next;
		}
		if(current.val == val)
			return true;
		else 
			return false;
		
	}
	
	public boolean deleteNode(int val){
		Node current = head;
		Node prev = null;
		while(current.next!=null&&current.val!=val){
			prev = current;
			current = current.next;
		}
		if(current.next == null){
			
			prev.next = current.next;
			return true;
		}
		else{ 
			prev.next = current.next;
			return true;
		}
			

		
		
	}
	
	public void reverseList(){
		
		Node prev = null;
		Node current = head;
		while(current!=null){
			Node temp = current.next;
			current.next = prev;
			prev = current;
			current =temp;
		}
		
		head = prev;
		
	}
	
	public void printList(){
		Node current = head;
		while(current!=null){
			System.out.println(current.val + " ");
			current = current.next;
		}
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedListPractice llp = new LinkedListPractice();
		llp.insertNode(4, 1);
		llp.insertNode(3, 0);
		llp.insertNode(5, 2);
		llp.insertNode(6, 1);
		llp.printList();
		System.out.println();
		
		System.out.println();
		llp.reverseList();
		llp.printList();
		System.out.println();
		llp.reverseList();
		llp.printList();
		System.out.println();
		System.out.println(llp.findNode(3));
		System.out.println(llp.findNode(4));
		System.out.println(llp.findNode(5));
		System.out.println(llp.findNode(6));
		System.out.println(llp.findNode(7));
		
		llp.deleteNode(4);
		llp.printList();
		System.out.println();
		llp.deleteNode(6);
		llp.printList();
		System.out.println();
		llp.deleteNode(5);
		llp.printList();
		
		

	}

}
