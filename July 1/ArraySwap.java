import java.util.Arrays;

public class ArraySwap {

    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int[] brr = {4,5,6};

        System.out.println(Arrays.toString(arr)+ " "+Arrays.toString(brr));
        swap(arr, brr);
        System.out.println(Arrays.toString(arr)+ " "+Arrays.toString(brr));

    }

    //only possible when lengths are equal
    private static void swap(int[]arr, int[]brr){
        for(int i=0; i<3; i++){
            int temp = arr[i];
            arr[i]=brr[i];
            brr[i]=temp;
        }
    }
}
