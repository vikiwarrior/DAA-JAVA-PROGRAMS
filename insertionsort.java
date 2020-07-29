import java.util.Scanner;
// # to remember syntax


//   System.out.println("Test");            
//     Scanner sc = new Scanner(System.in);   
//     sc.close();
//arr[i] = sc.nextInt();
//int arr[] = new int[n];


class insertionsort{
 

   
    public static void main(String args[]) {
        Scanner sc = new Scanner (System.in);
        System.out.println("no of elements you need to sort"); 
        int n =sc.nextInt();
       
        System.out.println("enter the elements you need to sort");
        int a[]=new int[10] ;
         for(int i=0;i<n;i++)
         {
            a[i] = sc.nextInt();
         } 
           
         System.out.println("no of elements you need to search");


         int gg, j;
         for (int i = 1; i < n; i++) {
             gg = a[i];
             j = i - 1;
             while (j >= 0 && a[j] > gg) {
                 a[j + 1] = a[j];
                 j = j - 1;
             }
             a[j + 1] = gg;
         }
 
         for (int i = 0; i < n; i++) {
             System.out.print(a[i] + " ");
         }
         System.out.println();
        sc.close();
    }
}