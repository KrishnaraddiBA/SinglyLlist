import java.util.Scanner;

public class Singly {
	
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
			this.next=null;
		}
		
	}
	Node head=null;
	public void insertElement() {
		
		int data,n,p,key;
		do {
			Scanner scan=new Scanner(System.in);
		System.out.println("Enter the data");
		data=scan.nextInt();
		Node newnode=new Node(data);
		if (head==null) {
			head=newnode;
			
		}
		else {
			System.out.println("hit 1 to insert at front");
			System.out.println("hit 2 to insert at end");
			System.out.println("hit 3 to insert at specified position");
			key=scan.nextInt();
			switch (key) {
			case 1:
				newnode.next=head;
				head=newnode;
				break;
			case 2:
				Node temp=head;
				while (temp.next!=null) {
					temp=temp.next;
				}
				temp.next=newnode;
				break;
			case 3:
				temp=head;
				System.out.println("Enter the specified position");
				p=scan.nextInt();
				
				for (int i = 0; i < (p-1); i++) {
					temp=temp.next;
				}
				newnode.next=temp.next;
				
				temp.next=newnode;
				
				break;

			default:
				System.out.println("U have selected an inappropriate data please try again by rerunning the program");
				break;
			}
		}
		System.out.println("press 1 to add more values");
	n=scan.nextInt();
		}
		while(n==1);
	
	
	}
	public void traverse() {
		Node temp=head;
		if (temp==null) {
			System.out.println("There is no singly linked list");
			
		}
		else {
			while (temp!=null) {
				System.out.println(temp.data);

				temp=temp.next;
			}
		}
		
	}
	
	
	public static void main(String[] args) {
		Singly s=new Singly();
		s.insertElement();
		s.traverse();
	
	}

}
