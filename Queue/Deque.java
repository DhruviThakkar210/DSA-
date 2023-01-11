import java.util.Scanner;

class DequeOperation 
{
	final  int MAX=6;
	int  f, r;

	int cq[]=new int[MAX];
	// Constructor
	DequeOperation()
	{
		
		this.f = this.r = -1;
	}
   

	void insertAtFront(int x)
	{
		if((f==0 && r == MAX-1)||(f==r+1))
		{
			System.out.println("OVERFLOWWWW");
			return;
		}

		else if(f == -1 && r == -1)
		{
			f = 0;
			r = 0;
			cq[f] = x;
		}
		else if(f == 0)
		{
			f=MAX-1;    
           cq[f]=x;  
		}
		else
		{
			f = f-1;
			cq[f] = x;
		}
	}

	
void insert_rear(int x)    
{    
    if((f==0 && r==MAX-1) || (f==r+1))    
    {    
        System.out.println("Overflow");    
    }    
    else if((f==-1) && (r==-1))    
    {    
        r=0;    
        cq[r]=x;    
    }    
    else if(r==MAX-1)    
    {    
        r=0;    
        cq[r]=x;    
    }    
    else    
    {    
        r++;    
        cq[r]=x;    
    }    
    
}

void display()    
{    
    int i=f;    
    System.out.println("\nElements in a deque are: ");    
        
    while(i!=r)    
    {    
        System.out.println(cq[i]);    
        i=(i+1)%MAX;    
    }    
     System.out.println(cq[r]);    
}  





}



class Deque 
{
	
 public static void main(String[] args) 
 {
 	Scanner sc=new Scanner(System.in);
	DequeOperation obj = new DequeOperation();
		while(true)
		{
			System.out.println("\n1.enqueue\n2.display\n3.dequeue\n4.exit");
			System.out.println("enter your choice ");
			int ch=sc.nextInt();
			switch(ch)
			{
			case 1:	System.out.println("enter the x ");
 						int x=sc.nextInt();
 						obj.insertAtFront(x);
					break;
				case 2:obj.display();
					break;

				case 3:System.out.println("enter the x ");
 						 x=sc.nextInt();
 						 obj.insert_rear(x);
					
					break;
				case 4:System.exit(0);
					break;
				default:System.out.println("Wrongc choice");
					break;
			}

		}
 }


}