class ListNode {
	int val;
	ListNode next;
	ListNode(int val) {
	this.val = val;
	} // end constrcutor

} //  end class ListNode


class ListNode_2 {

public static void main(String[] args) {


	ListNode head = new ListNode(1);
	ListNode current = new ListNode(2);
	 head.next = current;

	
	ListNode a = new ListNode(3);
	current.next = a;
	ListNode b = new ListNode(4);
	a.next = b;
	ListNode c = new ListNode(5);
	b.next = c;
	

	//System.out.print("next" + head.next);

	ListNode_2 test = new ListNode_2();

	System.out.println("Length " + test.getLength(head));

	ListNode t = test.removeNthFromEnd(head, 4);

	System.out.println("Length after deletion " + test.getLength(t));
	
	
	} // end method main


	public ListNode removeNthFromEnd(ListNode head, int n) {
	int position = getLength(head) - n;
	ListNode pointer = null;
	ListNode temp = null;
	ListNode head2 = head;

	for (int i = 0; i < position; i++) {
	
	pointer = head;
	head = head.next;
	}

	if (position == 0) {
	head2 = head.next;
	}
	else if (pointer.next == null) {
	// temp = pointer.next;
	pointer = null;

	} else {
	temp = pointer.next.next;
	pointer.next = temp;
	}

	// pointer.next = null;
	

	return head2;


} // end method removeNthFromEnd

 public int getLength(ListNode head) {
	int i = 1; // counter

	while(head.next != null ){
	i++;
	head = head.next;
	}
	return i;

} // end method getLength

} // end class Solution