import java.util.Scanner;
// # to remember syntax


//   System.out.println("Test");            
//     Scanner sc = new Scanner(System.in);   
//     sc.close();
//arr[i] = sc.nextInt();
//int arr[] = new int[n];


class selectionsort{
 

   
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
         int x;

         for (int i = 0; i < n; i++) {
 
             for (int j = i + 1; j < n; j++) {
                 if (a[i] > a[j]) {
 
                     x= a[i];
                     a[i] = a[j];
                     a[j] =x;
                 }
             }
         }
         for (int i = 0; i < n; i++) {
             System.out.print(a[i] + " ");
         }
        sc.close();
    }
}