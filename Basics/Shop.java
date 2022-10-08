import java.util.*;

public class Shop {
    public static void main(String args[]) {
        Scanner objec1 = new Scanner(System.in);
        float pencil = objec1.nextFloat();
        float pen = objec1.nextFloat();
        float eraser = objec1.nextFloat();
        float cost = pencil + pen + eraser;
        System.out.println(cost);
        float gst = 20 / 100f * cost;
        System.out.println("cost =" + (cost + gst));
        objec1.close();
    }
}
