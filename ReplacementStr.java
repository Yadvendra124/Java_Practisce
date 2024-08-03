import java.util.*;
public class ReplacementStr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Original = sc.nextLine();
        String result = "";
        for(int i=0;i<Original.length();i++){
            if(Original.charAt(i)=='e'){
                result += 'i';
            }else{
                result += Original.charAt(i);
            }
        }
        System.out.println(result);

    }
    
}
