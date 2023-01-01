/*Input: nums = [1,2,3,4]
Output: [1,3,6,10]
Explanation: Running sum is obtained as follows: 
[1, 1+2, 1+2+3, 1+2+3+4].*/
import java.util.Scanner;
class Operation
{
	int a[] = new int[20];
	Scanner sc = new Scanner(System.in);
	
	int n = sc.nextInt();

	void input()
	{
		for (int i=0;i<n;i++ ) 
		{
			System.out.println("enter the value");
			a[i] = sc.nextInt();
		}
	}

	void display() 
	{
		for (int i=0;i<n;i++ ) 
		{
			System.out.println("DISPLAY CALLED");
			System.out.println(a[i]);
			
		}
	}

	void sum ()
	{

		int total = 0;
		for (int i=0;i<n ;i++ )
		 {
			 total = total+a[i];
			 a[i]= total;
			 System.out.println( + a[i]);
		}
		

	}


}

class Leetcode1
{
	public static void main(String[] args) 
	{
		Operation c = new Operation();
		c.input();
		c.display();
		c.sum();
	}
}

