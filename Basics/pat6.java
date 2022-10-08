public class pat6 {
    public static void main(String args[]) {
        int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n - i; j++) {
                System.out.print(" ");
            }
            int n1 = 1;
            for (int k = 0; k <=i ; k++) {
                System.out.print(" "+n1);
                n1=n1* (i-k)/(k+1);
            }
            System.out.println();
        }

    }
}
