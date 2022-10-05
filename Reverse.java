public class Reverse {
    public static void reverse(int arr[]){
        int f=0,l=arr.length-1;
        while(f<l){
            int t=arr[l];
            arr[l]=arr[f];
            arr[f]=t;
            f++;
            l--;
        }
    }
    public static void printarray(int arr[]) {
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int array[]={1,2,3,4,5,6};
        reverse(array);
        printarray(array);

    }
}
