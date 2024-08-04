import java.util.*;
public class StringsBulider {
    public static void main(String[] args) {
        StringBuilder ab = new StringBuilder("Yadvendra");
        System.out.println(ab);
        //char at index 0
        System.out.println(ab.charAt(0));
        //set char or exchange char 
        ab.setCharAt(0, 'S');
        System.out.println(ab);
        //To insert the char
        ab.insert(0,'Y');
        System.out.println(ab);
        //To delete the char 
        ab.delete(1, 2);
        System.out.println(ab);
        //to appen or to add
        ab.append(" Singh");
        System.out.println(ab);
        //To find length of string
        System.out.println(ab.length());
        //To Reverse the String
        for(int i=0;i<ab.length()/2;i++){
            int front = i ;
            int back = ab.length()-i-1;
            char frontChar = ab.charAt(front);
            char backChar = ab.charAt(back);
            ab.setCharAt(front, backChar);
            ab.setCharAt(back, frontChar);

        }
        System.out.println(ab);
    }
}
