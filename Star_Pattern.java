import java.util.Scanner;



public class star {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n, i, j, k;
        System.out.println("How many row you want: ");
         n = sc.nextInt();
         for(i=1;i<=n;i++)
            {
                for(k=0;k<=n-i;k++)
                {
                     System.out.print(" ");
                }

               for(j=n;j>=k;j--)
               {
                   System.out.print("*");
               }

                 System.out.print("\n");
            }

    }

}