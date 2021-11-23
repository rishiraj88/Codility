package codility;

public class ReversingLinkedList {
public static void main(String[] args) {
	
	ListNode head = new ListNode(1);
	ListNode two = new ListNode(2); head.next = two;
	ListNode three = new ListNode(3); two.next = three;
	ListNode four = new ListNode(4); three.next = four;
	ListNode five = new ListNode(5); four.next = five;

	System.out.println(head);
	
	System.out.println(solution(head));

}

static ListNode solution(ListNode head) {
	ListNode prev = null;
	
	while(head !=null) {
		ListNode next = head.next;
		head.next = prev;
		prev = head;
		head = next;
	}
	return prev;
}

}

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}

	ListNode(int x, ListNode next) {
		val = x;
		this.next = next;
	}
	
	@Override
	public String toString() {
		String nextString = "";
		if(null != next) nextString = next.toString();
		return val +" " + nextString;
	}
}