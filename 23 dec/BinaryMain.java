import java.util.Scanner;


class Search
{
	Scanner sc = new Scanner(System.in);
	     int n = sc.nextInt();
		
	int a[] = new int[20];

	void create ()
	{   
		for (int i=0;i<n ;i++ )
		 {
			System.out.println("enter the value of element");
			a[i] = sc.nextInt();
			 
		}
	}
	void display()
	{
		for (int i=0;i<n ;i++ )
		 {
			System.out.println(a[i]);
		
	     }
     }
     

     void binary()
     {
     	Scanner sc = new Scanner(System.in);
     	System.out.println("enter the key!");
     	int key = sc.nextInt();
     	int j = 0;
     	int k = n-1;
        int mid = j+k/2;
        while(j<=k)
        {
        	if(a[mid]<key)
        	{
        		j = mid+1;
        		System.out.println("key found at" + mid);
        	}

        	else if(a[mid] == key)
        	{
        		System.out.println("found key at index" + mid);
        	}

        	else if (a[mid]>key)
        	{
        		k = mid - 1;
        		     		System.out.println("key found at" + mid);
        	}

        	mid = j+k/2;
}
}
}

       

      



  



class BinaryMain
{

 public static void main(String[] args)
 { 
 
 	Search ss = new Search ();
 	ss.create();
 	ss.display();
 	ss.binary();
 }
 	
 
}