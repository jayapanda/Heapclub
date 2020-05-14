package LinkedList;

public class AddTwoNumbers {
	
	public static Node addTwoNumbers(Node head1, Node head2){
		
		int sum = 0;
		int carry =0;
		Node result = null, resultTail = null;
		
		while(head1!=null && head2!=null){
			sum = (head1!=null?head1.val:0) + (head2!=null?head2.val:0);
			sum+=carry;
			
			if(sum > 9)
				carry =1;
			sum = sum%10;
			Node newNode = new Node(sum);
	
			if(result == null){
				result = newNode;
				resultTail = result;
				
			} else {
				resultTail.next = newNode;
				resultTail = resultTail.next;
			}
			head1=head1.next;
			head2 = head2.next;
		}
		if(carry==1)
			resultTail.next = new Node(carry);
		return result;
		
			
	}
		
		
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Node head1 = new Node(1);
		head1.next = new Node(3);
		head1.next.next = new Node(5);
		
		Node head2 = new Node(2);
		head2.next = new Node(4);
		head2.next.next = new Node(5);
		
		Node result = addTwoNumbers(head1,head2);
		while(result!=null){
			System.out.print(result.val);
			result = result.next;
		}
			

	}

}
