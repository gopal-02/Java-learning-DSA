
public class BitManipulation {
    public static void oddeven(int n) {
        if ((n & 1) == 0)
            System.out.println(n + " is even number.");
        else
            System.out.println(n + " is odd number.");

    }

    public static void main(String[] args) {
        oddeven(3);
        oddeven(8);
    }
}
