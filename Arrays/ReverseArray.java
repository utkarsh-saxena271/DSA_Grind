public class ReverseArray {
    public static void reverseArray(int arr[]){
        int start = 0; 
        int end = arr.length-1;
        // for(int i = 0; i < arr.length/2; i++){
        //     int temp = arr[start];
        //     arr[start] = arr[end];
        //     arr[end] = temp;
        //     start++;
        //     end--;
        // }
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void printArray(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        reverseArray(arr);
        printArray(arr);
    }
    
}
