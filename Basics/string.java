import java.util.*;

public class string {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        // String name=sc.nextLine();
        // System.out.println(name);
        // concatination ( + )
        String s1 = "Tony";
        String s2 = "Stark";
        String s3 = s1 + " @ " + s2;
        System.out.println(s3);
        // length()
        System.out.println(s3.length());
        // chaeAt()
        for (int i = 0; i < s3.length(); i++) {
            System.out.println(s3.charAt(i));
        }

        sc.close();
    }
}
