import java.util.Scanner;
class CNode 
{
	int data;
	CNode next;
	CNode(int data)
	{
		this.data=data;
		next=null;
	}
}
class CLLOperations
{
	CNode head=null,tail=null;
	CNode p;
	Scanner sc=new Scanner(System.in);
	void create(int n)
	{
		int x;
		
		for (int i=0; i<n;i++ ) {
			System.out.println("enter the data ");
			x=sc.nextInt();
			p=new CNode(x);
			if(head==null)
			{
				head=p;
				tail = p;
				p.next=head;
			}
			else 
			{
				tail.next=p;
				p.next=head;
				tail=p;

			}
			
		}

	}

void display()
	{
		CNode p=head;
		do
		{
			System.out.print(p.data+" -> ");
			p=p.next;
		}while(p!=head);
		System.out.print("null");

	}
	void insertAtBeg()
	{
		CNode p = head;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value u wanna add at beg.");
		int x = sc.nextInt();
		 p = new CNode(x);
		p.next = head;
		tail.next = p;
	     head = p;
	}
	void insertAtEnd()
	{
		CNode p = tail;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value u wanna add at end.");
		int x = sc.nextInt();
		 p = new CNode(x);
		p.next = head;
		tail.next = p;
	     tail = p;
	}
	void insertInBet()
	{
		CNode p,q = head;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the posiiton");
		int pos = sc.nextInt();

		System.out.println("enter the value u wanna insert in bet.");
		int x = sc.nextInt();
		p = new CNode(x);
		for (int i = 1; i<pos-1;i++ )
		 {
			 q = q.next;
		 }
		 p.next = q.next;
		 q.next = p; 

	}
	void delAtBeg()
	{
	CNode p = head;
	head = head.next;
	p = null;
		
	}
	void delAtEnd()
	{
	CNode p = tail;
    head.next = p.next;
     p.next = null ;
     p = null;
	}
	void delInBet()
	{
		CNode p,q=head;
		Scanner sc = new Scanner(System.in);
		int pos = sc.nextInt();
		for (int i = 1;i<pos-1 ;i++ )
	    {
			q = q.next;
		}
		p = q.next;
		q.next  = p.next;
		p = null;

	}


}
class CLL 
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		CLLOperations obj=new CLLOperations();
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
				case 3:obj.insertAtBeg();
					break;
				case 4:obj.insertAtEnd();
					break;
				case 5:obj.insertInBet();
					break;
				case 6:obj.delAtBeg();
					break;
				case 7:obj.delAtEnd();
					break;
				case 8:obj.delInBet();
					break;
				/*case 4:obj.insertInBet();
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
					break;*/
				case 10:System.exit(0);
					break;
				default:System.out.println("wrong choice ");
					break;
			}
		}
	}
}