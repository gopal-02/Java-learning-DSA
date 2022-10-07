public class Swap {
    public static void main(String[] args) {
        int a=5,b=7;
        //swaping using xor operator
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.print("a="+a+"\nb="+b);
    }
}
