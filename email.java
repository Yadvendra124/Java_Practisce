import java.util.*;


public class email {
   public static void main(String args[]) {
     Scanner sc = new Scanner (System.in);
     System.out.print("Email Id : ");
     String email = sc.next();
     System.out.println();
     String userName = "";


     for(int i=0; i<email.length(); i++) {
       if(email.charAt(i) == '@') {
        break;
       } else {
         userName += email.charAt(i);
       }
     }


     System.out.println(" Username : "+userName);
   }
}