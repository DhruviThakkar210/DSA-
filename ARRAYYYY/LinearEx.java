package dec22;

import java.util.Scanner;

public class LinearEx {
    int ar[] = new int[10];
    static int n;

    void createArray() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("enter the total no. of elements ");
            n = scanner.nextInt();
            for (int i = 0; i < n; i++) {
                ar[i] = scanner.nextInt();
            }
        }
    }

    void displayArray() {

        System.out.println("display array ");
        for (int i = 0; i < n; i++) {
            System.out.println(ar[i]);
        }
    }

    int linearSearch(int k) {
        boolean flag = false;
        int i;
        for (i = 0; i < n; i++) {
            if (ar[i] == k) {
                flag = true;
                break;
            }
        }
        if (flag == true) {
            return i;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        LinearEx obj = new LinearEx();
        try  {
            Scanner scanner = new Scanner(System.in);
            obj.createArray();
            scanner.nextLine();
            System.out.println("enter the element u want to serach ");
            int x = scanner.nextInt();
            int i = obj.linearSearch(x);
            if (i > 0) {
                System.out.println("element found at " + (i + 1) + " psoition ");
            } else {
                System.out.println("element not found ");
            }
            scanner.close();
        }catch(Exception e)
        {
            System.out.println(e);
        }
        

    }
}
