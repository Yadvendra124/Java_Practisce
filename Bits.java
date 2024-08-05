public class Bits{
    public static void main(String[] args) {
        int n =5;
        int pos =2;
        //for get Bit
        int bitMask = 1<<pos;
        
        if((bitMask&n)==0){
           System.out.println("Bits was zero");
        }else{
            System.out.println("Bits Was one");
        }
        //for set Bit 
        int newNumber = bitMask | n;
        System.out.println(newNumber);
        //clear Bit
        int bitNot = ~(bitMask);
        int newNumber1 = n & bitNot;
        System.out.println(newNumber1);

    }
}