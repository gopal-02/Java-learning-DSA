public class min_max_subarray_sum {
    public static void subarray(int nums[]) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += nums[k];
                }
                if (min > sum)
                    min = sum;
                if (max < sum)
                    max = sum;
            }

        }
        System.out.println("min =" + min);
        System.out.println("max =" + max);
    }

    public static void main(String[] args) {
        int array[] = { 1, 2, 3, 7, 5, 6 };
        subarray(array);
    }
}
