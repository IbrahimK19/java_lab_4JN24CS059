package sem3;
import java.util.Scanner;
public class lab1 {
    public static void main(String[] args) {
        int a[][] = new int[10][10];
        int b[][] = new int[10][10];
        int c[][] = new int[10][10];
        int i,j;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the value of n\n");
        int n = Integer.parseInt(args[0]);
        System.out.println("Enter the elements of matrix A\n");
        for(i=0; i<n; i++) {
            for(j=0; j<n; j++) {
                a[i][j] = s.nextInt();
            }
        }
        System.out.println("enter the elements of matrix B\n");
        for(i=0; i<n; i++)
            for(j=0; j<n; j++)
                b[i][j] = s.nextInt();
        for(i=0; i<n; i++)
            for(j=0; j<n; j++)
                c[i][j] = a[i][j] + b[i][j];
        System.out.println("sum of matrix is\n");
        for(i=0; i<n; i++) {
            for(j=0; j<n; j++) {
                System.out.println(c[i][j]+ " ");
            }
            System.out.println();
        }
    }

}
