package Easy;

public class ReverseLinkedList {
	public ListNode reverseList(ListNode head) {
		ListNode temp = head;

		ListNode after;
		ListNode before = null;

		while(temp != null) {
			after = temp.next;
			temp.next = before;
			before = temp;
			temp = after;
		}

		return before;
	}
}

public class ListNode {
     int val;
     public ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
