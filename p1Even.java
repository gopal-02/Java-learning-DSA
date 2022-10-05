import java.util.Scanner;

public class p1Even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = 1;
        if ((a & b) == 0)
            System.out.print("even");
        else
            System.out.print("odd");
        sc.close();
    }
}
