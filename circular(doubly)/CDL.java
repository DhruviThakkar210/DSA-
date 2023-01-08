
import java.util.Scanner;

class Node
{
	int data;
	Node next ;
	Node prev ;

	Node(int data)
	{
		this.data = data;
		Node next = null;
		Node prev = null;

	}
}

class CDLOperations 
{
   Node head = null,tail =null ,p,q;
   Scanner sc=new Scanner(System.in);

   void create(int n)
   {
      int x;
      
      for (int i=0; i<n;i++ ) 
      {
         System.out.println("enter the data ");
         x=sc.nextInt();
         p=new Node(x);
         if(head==null || tail == null)
         {
            head=p;
            tail = p;
            p.next = p;
            p.prev = p;
         }
         else 
         {
          tail.next = p;
          p.prev = tail;
          p.next = head;
          head.prev = p;
          tail = p;

         }
         
         }
      }

 
 void display()
 {
         Node p=head;
    
      do
      {
         System.out.print(p.data+" -> ");
         p=p.next;

      }  while(p!=head);
  
 }

 void insertAtBeg()
 {
 	Node p ;
 	Scanner sc = new Scanner(System.in);
 	System.out.println("enter the no. u wanna add at the beg.");
 	int x = sc.nextInt();
 	p = new Node(x);
 	p.next = head;
   p.prev = tail;
   head.prev = p;
   tail.next = p;
    head = p;
   System.out.println("INSERTED!!");
 }
 void insertInBet()
 {
 	Node p ,q = head;
 	Scanner sc = new Scanner(System.in);
 	System.out.println("enter the pos u wanna enter");
 	int pos = sc.nextInt();
 	System.out.println("enter the no. u wanna add bet.");
 	int x = sc.nextInt();
 	p = new Node(x);
 	for (int i =1;i<pos-1 ;i++ )
 	 {
 		q = q.next;
 	}
    p.next = q.next;
    p.prev = q;
    q.next = p;
    p.next.prev = p;
    System.out.println("INSERTED!!!");

 }

 void insertAtEnd()
 {
 	Node p = tail;
 	Scanner sc = new Scanner(System.in);
 	System.out.println("enter the no. u wanna add at the end.");
 	int x = sc.nextInt();
 	p = new Node(x);
 	p.next = head;
   p.prev = head.prev;
   head.prev = p;
   p.prev.next=p;
 	tail = p;
   System.out.println("INSERTED!!!");

 }

 void delAtBeg()
 {
 	Node p = head ;


  tail.next = head.next ;

  head.next.prev = head.prev;

 	head = head.next;

   p = null ;
 
 
   System.out.println("DELETED!!!");
}

 void delInBet()
 {
        Node p ,q = head;
 	Scanner sc = new Scanner(System.in);
 	System.out.println("enter the pos u wanna delete");
 	int pos = sc.nextInt();
   for (int i = 1;i<pos-1;i++ )
   {
   	     q = q.next;
   }
   p = q.next;
   q.next = p.next;
   p.next.prev = p.prev;
   p = null;
   System.out.println(" DELETED");

 }

 void delAtEnd()
 {
 	Node p = tail;
   head.prev = tail.prev;
   tail.prev.next = tail.next;
   tail = tail.next ;
   p = null;
   System.out.println("DELETED!!!");
 }


}






class CDL 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		CDLOperations obj=new CDLOperations();
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
          


            case 10: System.exit(0);
               break;

			}
		}
	}
}