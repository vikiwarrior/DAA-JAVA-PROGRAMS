import java.util.Scanner;
// # to remember syntax

//   System.out.println("Test");            
//     Scanner sc = new Scanner(System.in);   
//     sc.close();
//arr[i] = sc.nextInt();
//int arr[] = new int[n];

class binarysearch {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("no of elements you need to store");
        int n = sc.nextInt();

        System.out.println("enter the elements you need to store");
        int a[] = new int[10];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("elements you need to search");
        int x;
        x = sc.nextInt();
      
        
     

        int l = n;
        int gg = -1;
        int m = l / 2;
        int f = 0;
        l = l - 1;
        while (l >= f) {
            if (a[m] == x) {
               gg=m;
                break;

            } else if (a[m] < x) {
                f = m + 1;
                m = (f + l) / 2;

            } else {
                l = m - 1;
                m = (f + l) / 2;

            }
        }
        if (gg == -1) {
            System.out.println("Not found");
        }
        else{
            System.out.println("found at "+(gg+1)+"\n");
        }

        sc.close();
    }
}