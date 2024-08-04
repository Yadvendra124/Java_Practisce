public class Bits{
    public static void main(String[] args) {
        int n =5;
        int pos =3;
        int bitMask = 1<<pos;
        if((bitMask&n)==0){
           System.out.println("Bits was zero");
        }else{
            System.out.println("Bits Was one");
        }
    }
}