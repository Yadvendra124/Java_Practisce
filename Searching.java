import java.util.*;
public class Searching {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size =  sc.nextInt();
        int number[] = new int[size];
        for(int i=0;i<size;i++){
            number[i] = sc.nextInt();
        }
        System.out.println("Enter the to be Search : ");
        int x = sc.nextInt();
       for(int i=0;i<size;i++){
        if(number[i] == x){
            System.out.print(i+" ");
        }
    }
  }
}

