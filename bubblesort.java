import java.util.Scanner;
// # to remember syntax


//   System.out.println("Test");            
//     Scanner sc = new Scanner(System.in);   
//     sc.close();
//arr[i] = sc.nextInt();
//int arr[] = new int[n];


class bubblesort{
 

   
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
       
         int gg;
         int flag = 0;
 
         for (int i = 0; i < n - 1; i++) {
             flag = 0;
             for (int j = 0; j < n - i - 1; j++) {
                 if (a[j] > a[j + 1]) {
                     gg = a[j];
                     a[j] = a[j + 1];
                     a[j + 1] = gg;
                     flag = 1;
                 }
             }
             if (flag == 0) {
                 break;
             }
         }
 
         for (int i = 0; i < n; i++) {
             System.out.print(a[i] + " ");
         }
         System.out.println();
        sc.close();
    }
}