import java.util.*;
public class Strings{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your First Name : ");
        String firstName = sc.nextLine();
        System.out.println("Enter Your Last Name : ");
        String lastName = sc.nextLine();

        //concatetion
        String fullName = firstName + " " + lastName;
        System.out.println("Your name is : "+fullName);


        //To print length of string
        System.out.println(fullName.length());
        
        
        //To print charcater of string
        for(int i=0;i<fullName.length();i++){
            System.out.print(fullName.charAt(i) + " ");
        }
        
        
        //To compare two String
        if(firstName.compareTo(lastName)==0){
            System.out.println("String are equal");
        }else{
            System.out.println("String are not equal");
        }
        

        //Substring 
        String sub = fullName.substring(2, 5);
        System.out.println("Substring  of Full Name : "+sub);

    }
}