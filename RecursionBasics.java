public class RecursionBasics {
    public static void printDec(int m) {
        if (m == 1) {
            System.out.print(m);
            return;
        }
        System.out.print(m + " ");
        printDec(m - 1);
    }

    public static void printInc(int m) {
        if (m == 1) {
            System.out.print(m + " ");
            return;
        }

        printInc(m - 1);
        System.out.print(m + " ");
    }

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);

    }

    public static int sum(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sum(n - 1);

    }

    public static int fib(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);

    }

    public static boolean issorted(int arr[],int i) {
        if (i==arr.length-1) {
            return true;
        }
        if(arr[i+1]<arr[i]){
            return false;
        }
        return issorted(arr,i+1);

    }

    public static void main(String[] args) {
        int arr[]={1,4,3};
        System.out.println(issorted(arr,0));
    }
}
