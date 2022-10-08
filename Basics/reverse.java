public class reverse {
    public static void main(String[] args) {
        int n=324354356;
        System.out.println("Number = "+n);
        int newnum=0,r;
        while(n>0){
            r=n%10;
            newnum=newnum*10+r;
            n=n/10;
        }
        System.out.println("reverse number = "+newnum);
    }
}
