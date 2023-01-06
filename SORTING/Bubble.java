
import java.util.Scanner;
class Bubble
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
	void bubble()
	{
		int i,j,temp=0;
		for ( i = 0;i<n-1 ;i++ )
		{
			for( j = 0;j<n-i-1;j++)
			{
				if(a[j]>a[j+1])
				{
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
	}
	public static void main(String[] args) {
		Bubble a  = new Bubble();
		a.create();
		
		a.bubble();
		a.display();
	}
}