import java.util.*;
public class SearchingMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Rows");
      int Rows = sc.nextInt();
      System.out.println("Enter the number of Column");
      int Column = sc.nextInt();
      int [][] Matrix = new int [Rows][Column];
      for(int i=0;i<Rows;i++){
        for (int j=0;j<Column;j++){
            Matrix[i][j] = sc.nextInt();
        }
      }
      System.out.println("Enter that should be need to be find : ");
      int x = sc.nextInt();
      for(int i=0;i<Rows;i++){
        for (int j=0;j<Column;j++){
            if(Matrix[i][j] == x){
                System.out.println(x+" has been found at : Row : "+ (i+1) +" Column : "+ (j+1));
            }
          
        }
      }
    }
}
