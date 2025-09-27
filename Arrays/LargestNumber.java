public class LargestNumber {
    public static int largestNumber(int arr[]){
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[] = {12,3,22,34,5,4};
        int max = largestNumber(arr);
        System.out.println(max);
    }    
}
