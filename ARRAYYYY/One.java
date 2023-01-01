import java.util.Scanner;
import java.util.Arrays;
class Travel
{
	Scanner sc = new Scanner(System.in);
	     int n = sc.nextInt();
		
	int a[] = new int[20];
	int b[] = new int[20];
	void create ()
	{   
		for (int i=0;i<n ;i++ ) {
			System.out.println("enter the value of element");
			a[i] = sc.nextInt();
			 
		}
	}
	void display()
	{
		for (int i=0;i<n ;i++ ) {
			System.out.println(a[i]);
		
			 
		}
	}

	void swap ()
	{
		System.out.println(" before swapping no are : " + a[0] + "and last no is" + a[n-1]);
		int temp = a[0];
		a[0] = a[n-1];
		a[n-1] = temp;
		System.out.println("after swapping no. are" + a[0]+"and last no is" + a[n-1]);

	}
	void copy()
	{
		
	      for ( int i = 0;i<n ;i++ )
	       {
	      	   b[i] = a[i];
	      	  
	      	   System.out.println(  b[i]);
	       }
	}

	void sum()
	{
		int sum = 0;
         for (int i=0 ;i<n ;i= i+2) 
         {

             sum = sum + a[i];


         	
         }
         System.out.println(" sum of even no  is " + sum);
	}

	void reverse () 
	{
		for (int i=n-1;i>=0 ;i-- ) {
			System.out.println( "AFTER REVERSING " + a[i]);
		
			 
		}
	}

	void min()
	{
		int max = a[0];
		int min = a[0];
		
		for (int i = 0;i<n ;i++ )
		{
		   if(a[i]<min)
		   {
		   min = a[i];
		   }
		   if(a[i]>max)
				{
					max = a[i];
				}

		}
		 System.out.println("MIN IS :" + min);
		 System.out.println("max is " + max);
	}

	


	int search()
	{
		boolean flag=false;
		int i;
		Scanner s = new Scanner(System.in);
		System.out.println("enter the searching element ");
		int b = s.nextInt();
		for (i=0;i<n ;i++ ) 
		{
			if(a[i] == b)
			{
				flag=true;
				break;
			}	

		}
		if(flag==true)
			return i;
		else 
			return -1;
	}
	void duplicate()
	{
		
		for (int i=0;i<n ;i++ ) 
		{
			for (int j = i+1;j<n ;j++ ) 
			{
				if(a[i] == a[j])
				{
				System.out.println(" duplicate :" +a[i]);
			} 
			}
		}
	}



}

class One
{
	public static void main(String[] args) {
		Travel obj = new Travel();
		obj.create();
		obj.display();
		obj.min();
		
		/*obj.duplicate();
        int r=obj.search();
        if(r>=0)
        	System.out.println("element found at "+r+" position");
        else 
        	System.out.println("element not found ");
		obj.sum();
		obj.reverse();
		obj.swap();
		obj.copy();*/

	}
}