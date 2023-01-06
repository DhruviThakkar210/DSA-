
import java.util.Scanner;
class Selection
{
     Scanner sc = new Scanner(System.in);
	     int n = sc.nextInt();
		
	int a[] = new int[20];
	void create()
	{
		for (int i = 0;i<n ;i++ )
	    {
			System.out.println("enter the value");
			a[i] = sc.nextInt();
		}
	}


	void display ()
	{
		for (int i = 0;i<n ;i++ )
	    {
	    	System.out.println("display!!!");
			System.out.println(a[i]);
		}
	}
	void selection()
	{
		
 
        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n-1; i++)
        {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (a[j] < a[min_idx])
                    min_idx = j;
 
            
            int temp = a[min_idx];
            a[min_idx] = a[i];
            a[i] = temp;
        }
	}
	public static void main(String[] args) {
		Selection  a  = new Selection();
		a.create();
		
		a.selection();
		a.display();
	}
}