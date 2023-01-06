class Insertion
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

	void insertion()
	{

        for (int i = 1; i < n; ++i) 
        {
            int key = a[i];
            int j = i - 1;

            while (j >= 0 && a[j] > key) 
            {
                a[j + 1] = arr[j];
                j = j - 1;
            }
            a[j + 1] = key;
        }

	}
    
    





	public static void main(String[] args)
	{
		Insertion b = new Insertion();
		a.create();
		a.insertion();
		a.display();


		
	}
}