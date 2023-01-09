import java.util.Scanner;
class QueueOp
{
	int f,r;
	final int MAX=5;
	int q[]=new int [MAX];
	//constructor 
	QueueOp()
	{
		f=-1;
		r=-1;
	}
	//methods 

	boolean isFull()
	{
		if(r==MAX-1)
			return true;	
		else 
			return false;
	}
	boolean isEmpty()
	{
		if(f==-1 && r==-1)
			return true;	
		else 
			return false;
	}
	void enqueue(int x)
	{
		if(isFull())
		{
			System.out.println("queue is full ");
			return ;
		}
		if(f==-1 && r==-1)
		{
			f=0;
		}
		
		r++;
		q[r]=x;
		//q[++r]=x;
		

	}
	void display()
	{
		if(isEmpty())
		{
			System.out.println("Queue is empty ");
			return;
		}
		System.out.println("display queue ");
		for(int i=f;i<=r;i++)
		{
			System.out.print(q[i]+"\t");
		}
	}
	int dequeue()
	{
		if(isEmpty())
		{
			//System.out.println("Queue is empty ");
			return -1;
		}
		int x=q[f];
		f++;
		//int x=q[f++];
		return x;
	}
	void peek()
	{
		if(f==-1)
			System.out.println("queue is empty ");
		else 
			System.out.println("fron elemmtn "+q[f]);
	}
	void getLastElement()
	{
		if(r==-1)
			System.out.println("queue is empty ");
		else 
			System.out.println("last elemmtn "+q[r]);
	}
}
class QueueUsingArrays
{
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		QueueOp obj=new QueueOp();

		while(true)
		{
			System.out.println("\n1.insert\n2.display\n3.delete\n4.peek\n5.Get last element\n6.exit");
			System.out.println("enter your choice ");
			int ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				System.out.println("enter the element");
				int x=sc.nextInt();
				obj.enqueue(x);
				break;
			case 2:obj.display();
				break;
			case 3:
				int m=obj.dequeue();
				if(m>=0)
					System.out.println("deleted element is "+m);
				else 
					System.out.println("queue is empty");
				break;
			case 4:obj.peek();
				break;
			case 5:obj.getLastElement();
					break;
			case 6:System.exit(0);
					break;
			default:
				System.out.println("wrong choice ");
				break;
			}
		}
	}
}