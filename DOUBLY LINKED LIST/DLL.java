import java.util.Scanner;

class Node
{
   Node next;
   Node prev;
   int data;
   Node (int data)
   {
   	this.data = data;
   	next = null;
   	prev=null;
   }

}

class DLLOperation
{
	Node head = null ,p,q;
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
				q = p;
			}
			else 
			{
			 p.prev = q;
			 q.next = p;
			 q = p;

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

	void displayrev()
	{

	}

  void insertAtBeg()
  {
  	  Node p  ;
  	  Scanner sc = new Scanner(System.in);
  	  System.out.println("enter the number u want to at the beggining!");
  	  int x = sc.nextInt();
  	  p = new Node(x);
  	  head.prev = p;
  	  p.next=head;
  	  p.prev = null;
  	  head=p;
      

  }

  void insertAtEnd()
  {
  	Node p,q = head;
Scanner sc = new Scanner(System.in);
  	  System.out.println("enter the number u want to at the end!");
  	  int x = sc.nextInt();
  	p = new Node(x);
  	while(q.next!=null)
  	{
  		q = q.next;
  	}

  	 q.next = p;
  	 p.prev= q;
  	 p.next = null;
  }


  void insertInBet()
  {
  	Node p, q = head;
  	System.out.println("enter the posiiton");
  	int pos = sc.nextInt();
  	int x = sc.nextInt();
  	p = new Node(x);
  	for (int i = 1;i<pos-1 ;i++ )
    {
  		q = q.next;
  	}

      p.prev = q;
      p.next = q.next;
  	  q.next = p;

  }

void delAtBeg()
{
	Node p = head;
	head = head.next;
	p = null;
	head.prev = null;

}
void delAtEnd()
{
	Node p,q = head;
	while(q.next.next!=null)
	{
		q = q.next;

	}
      q.next = null;
      p = null;

}
void delInBet()
{
	Node p,q = head;
	System.out.println("enter the posiiton");
  	int pos = sc.nextInt();
  	
  	for(int i = 1;i<pos-1;i++)
  	{
  		q = q.next;

  	}
  	p = q.next;
  	q.next.prev = q;
  	q.next = p.next;
  	p = null;

}

void search ()
{
	System.out.println("enter the no. u wanna search! ");
		int num=sc.nextInt();
		Node p=head;
		boolean flag=false;
	
	while(p!=null)
	{

	if( p.data == numcl)
	{
		flag = true;

	}

	 p = p.next;
   }
   if(flag== true)
   {
   	System.out.println("number found");
   }
   else 
   {
   	System.out.println("not found");
   }
}


}


class DLL 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		DLLOperation obj=new DLLOperation();
		while(true)
		{
			System.out.println("\n1.create\n2.display\n3.insert in beg\n4. insert at end\n5. Insert in bet\n6. Delete from beg\n7. del at the end\n8. del in bet\n 9. searching\n  10.exit");
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
				case 9:obj.search();
					break;


				case 10: System.exit(0);
					break;
			}
		}
	}
}