import java.util.Scanner;
class Node
{
	int data;
	Node next;
	Node(int data)
	{
		this.data=data;
		next=null;
	}
}
class SLLOperations
{
	Node head=null,p,q;
	Scanner sc=new Scanner(System.in);

	void create(int n)
	{
		int x;
		
		for (int i=0; i<n;i++ ) {
			System.out.println("enter the data ");
			x=sc.nextInt();
			p=new Node(x);
			if(head==null)
			{
				head=p;
				q=p;
			}
			else 
			{
				q.next=p;
				q=p;

			}
			
		}

	}
	void display()
	{
		Node p=head;
		while(p!=null)
		{
			System.out.print(p.data+" -> ");
			p=p.next;
		}
		System.out.print("null");

	}
	void insertBeg()
	{
		Node p;
		System.out.println("enter the data ");
		int x=sc.nextInt();
		p=new Node(x);
		p.next=head;
		head=p;

	}
	void insertInBet()
	{
		Node p,q=head;
		System.out.println("enter the posiiton ");
		int pos=sc.nextInt();
		System.out.println("enter the data ");
		int x=sc.nextInt();
		//to allocate memory for new node 
		p=new Node(x);
		for (int i=1;i<pos-1 ;i++ ) {
			q=q.next;
		}
		p.next=q.next;
		q.next=p;
	}

	void insertAtEnd()
	{
		Node p,q=head;
		System.out.println("enter the data ");
		int x=sc.nextInt();
		p = new Node(x);
		while(q.next!=null)
		{
			q = q.next;
		}
		q.next = p;
		p.next = null;
	}

	void delAtBeg()
	{
		Node p = head;
		head = head.next;
		p = null;
	}
	void delInBet()
	{
		Node p,q = head;
	   System.out.println("enter the posiiton ");
		int pos=sc.nextInt();
		for (int i=1;i<pos-1 ;i++ ) 
		{
			q = q.next;
		}
		p = q.next;
		q.next = p.next;
		p = null;
	}
	void delAtEnd()
	{
		Node p,q=head;
		while(q.next.next!=null)
		{
			q=q.next;
		}
		p = q.next;
		q.next = null;
		p = null;
	}

	void search()
	{
		   System.out.println("enter the no. u wanna search! ");
		int num=sc.nextInt();
		Node p=head;
		boolean flag=false;
		while(p!=null)
		{
			if(p.data == num)
			{
				flag=true;
				break;

			}
			p=p.next;
		
		}
		if(flag==true)
			System.out.println(num + " found ");
		else 
			System.out.println(num+" not found ");
	}
}

class SLL
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		SLLOperations obj=new SLLOperations();
		while(true)
		{
			System.out.println("\n1.create\n2.display\n3.insert in beg\n4.Insert in between\n5.INsert at the end\n6.Delete at the begining\n7. Delete at end\n8.Delete in between.\n9. Search the element\n10.exit");
			System.out.println("enter your choice ");
			int ch=sc.nextInt();
			switch(ch)
			{
				case 1:System.out.println("enter the total no. of nodes ");
					int x=sc.nextInt();
					obj.create(x);
					break;
				case 2:obj.display();
					break;
				case 3:obj.insertBeg();
					break;
				case 4:obj.insertInBet();
					break;
			    case 5:obj.insertAtEnd();
					break;
				case 6:obj.delAtBeg();
					break;
				case 7:obj.delAtEnd();
					break;
				case 8:obj.delInBet();
					break;
				case 9:obj.search();
					break;
				case 10:System.exit(0);
					break;
				default:System.out.println("wrong choice ");
					break;
			}
		}
	}
}