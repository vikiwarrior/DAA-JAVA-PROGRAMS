import java.util.Scanner;
// # to remember syntax


//   System.out.println("Test");            
//     Scanner sc = new Scanner(System.in);   
//     sc.close();
//arr[i] = sc.nextInt();
//int arr[] = new int[n];


class LinearSearch{
 

   
    public static void main(String args[]) {
        Scanner sc = new Scanner (System.in);
        System.out.println("no of elements you need to store"); 
        int n =sc.nextInt();
       
        System.out.println("enter the elements you need to store");
        int a[]=new int[10] ;
         for(int i=0;i<n;i++)
         {
            a[i] = sc.nextInt();
         } 
           
         System.out.println(" elements you need to search");
int x;
x = sc.nextInt();
int gg=0;;
 for(int i=0;i<n;i++)
         {
            if(a[i]== x)
            {
                System.out.println("found at "+(i+1)+"\n");
                gg=1;
            }
         } 
    if(gg==0)       
    {
        System.out.println("Not found");
    }
 

        sc.close();
    }
}