import java.util.*;
public class Transpose{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of row : ");
        int row = sc.nextInt ();
        System.out.println("Enter the no. of column : ");
        int column =sc.nextInt();
        int matrix[][] = new int[row][column];
        for(int i=0;i<row;i++){
            for(int j =0;j<column;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.println("The Transpose of matrix is  : ");
        for(int j=0;j<column;j++){
            for(int i=0;i<row;i++){
              System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
            
        }
        ;
        
        
    }

}