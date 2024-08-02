import java.util.Scanner;

public class SpiralMatrix {
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
      int rowStart =0;
      int rowEnd = Rows-1;
      int columnStart =0;
      int columnEnd = Column-1;
      while(rowStart<=rowEnd && columnStart<=columnEnd){


        for(int col=columnStart;col<=columnEnd;col++){
            System.out.print(Matrix[rowStart][col]+" ");
        }
        rowStart++;


        for(int row=rowStart;row<=rowEnd;row++){
            System.out.print(Matrix[row][columnEnd]+" ");
        }
        columnEnd--;

        for(int col=columnEnd;col>=columnStart;col--){
            System.out.print(Matrix[rowEnd][col]+" ");
        }
        rowEnd--;

        for(int row=rowEnd;row>=rowStart;row--){
            System.out.print(Matrix[row][columnStart]+" ");
        }
        columnStart++;

        System.out.println();
      }
    }
}
