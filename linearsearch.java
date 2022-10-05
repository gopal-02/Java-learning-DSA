
public class linearsearch {
    public static int linearrsearch(int nums[], int key) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == key)
                return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        int num1[]={1,2,3,4,5,6,7,7,8,8,9};
        int key = 7;
        int index = linearrsearch(num1, key);
        System.out.println(index);
    }
    
}
