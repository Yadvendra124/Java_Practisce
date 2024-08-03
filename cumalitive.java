import java.util.*;
public class cumalitive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        String combined[] = new String[size];
        for(int i=0;i<size;i++){
            combined[i] = sc.nextLine();
        }
        int length = 0;
        for(int i=0;i<size;i++){
            length+=combined[i].length();
        }
        System.out.println(length);

    }
}
