public class factorial1 {
    public static int factorial(int n) {
        if(n==0||n==1) return 1;
        int f=n*factorial(n-1);
        return f;
    }
    public static void main(String[] args) {
       System.out.println("factorial  is "+factorial(5)); 
    }
}
