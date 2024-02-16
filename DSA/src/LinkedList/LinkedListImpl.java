package LinkedList;

public class LinkedListImpl {

	Node head;
	void insert(int value) {
		Node n=new Node(value);
		if(head==null) {
			head=n;
		}
		else {
			Node temp=head;
			while(temp.next!=null) {
				temp=temp.next;
			}
			temp.next=n;
		}
		System.out.println(value+" had been inserted in linkedList");
	}

	void display() {
		if(head==null) {
			System.out.println("linked list is empty");
		}
		else {
			Node temp=head;
			while(temp.next!=null){
				System.out.print(temp.data+"-->");
				temp=temp.next;
			}
			System.out.println(temp.data);
		}
	}

	void insertFront(int value) {

		Node n=new Node(value);
		if(head==null) {
			head=n;
		}
		else {
			n.next=head;
			head=n;
		}
		System.out.println(value+"has been in first vale");
	}
	void delete() {
		if(head==null) {
			System.out.println("Linked list is empty");
		}
		else if(head.next==null) {
			System.out.println(head.data+"has been deleted");
		}
		else {
			Node temp=head;
			while(temp.next.data+"had been Deleted" != null);
			temp.next=null;
		}
	}

}
