package dec22;

class Operations{
    void createArray()
    {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("enter the total no. of elements ");
            n=scanner.nextInt();
            for(int i=0;i<n;i++)
            {
                ar[i]=scanner.nextInt();
            }
        }
    }
    void displayArray()
    {

        System.out.println("display array ");
       for (int i : ar) {
        System.out.println(ar[i]);
       }

    }

    int search(int a[],int key)
    {
       for(int i = 0 ;i<n;i++)
       {
        if(ar[i]== key)
        {
            System.out.println("found");
            return i;
        }
        else {
            System.out.println();
            return -1;
        }

       }
    }
}
public class LinearDemo {
   public static void main(String[] args) {
    int ar[]=new int[10];
    static int n;
   
    
    
   } 
}
