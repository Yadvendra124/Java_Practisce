import java.util.*;
public class email {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Email id :");
        String EmailId = sc.next();
        String username = "";
        for(int i=0;i<EmailId.length();i++){
            if(username.charAt(i)=='@'){
                break;
            }else{
                username += EmailId.charAt(i);
            }
        }
        System.out.println(" Your Username : " + username);

    }
    
}