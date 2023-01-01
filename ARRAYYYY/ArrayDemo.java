package dec22;
import java.util.Scanner;




class ArraysOperations
{
    int ar[]=new int[10];
    static int n;
   
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
       for (int i=0;i<n;i++) {
        System.out.println(ar[i]);
       }
    }
    int linearSearch(int k)
    {
        boolean flag=false;
        int i;
        for (i=0;i<n;i++)
        {
            if(ar[i]==k)
            {
                flag=true;
                break;
            }
        }
        if(flag==true)
        {
            return i;
        }
        else{
            return -1;
        }
    }
}
public class ArrayDemo {
    public static void main(String[] args) {
        ArraysOperations obj=new ArraysOperations();
        try (Scanner scanner = new Scanner(System.in)) {
            int i=0;
             while(true)
                {
                    System.out.println("1.craete arrays\n2.display array\n3.reverse array\n4.sum of even  elements\n5.min and max\n6.copy array\n7.duplicate elements\n8.swap 1st and last element \n9.Searchinhg\n10.exit");
                    System.out.println("enter choice ");
                    int ch=scanner.nextInt();
                    switch(ch)
                    {
                        case 1:obj.createArray();
                        break;
                        case 2:obj.displayArray();
                            break;
                        case 3:System.exit(0);
                            break;
                        case 10:System.out.println("enter the element u want to serach ");
                                int x=scanner.nextInt();
                                i=obj.linearSearch(x);
                                if(i>0)
                                {
                                    System.out.println("element found at "+(i+1)+" psoition ");
                                }
                                else{
                                    System.out.println("element not found ");
                                }
                                break;

                        default:System.out.println("wrong choice ");
                        break;
                    }
                }
        }catch(Exception e)
        {
            System.out.println(e);
        }
        }
        
    }

