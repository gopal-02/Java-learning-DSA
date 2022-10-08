public class fibonacirecursion {
    public static int fib(int n) {
       if(n==0||n==1){
        return 1;
       }
        int fn=fib(n-1)+fib(n-2);
        return fn;

    }
    public static void main(String[] args) {
        int n=4;
        System.out.println(fib(n));

    }
}
