public class LinearSearch{
    
    public static int linearSearch(int arr[], int target){
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                return i;
            }
        }
        
        
        
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {2,33,122,31,4,6,72};
        int target = 6;
        
        int index = linearSearch(arr, target);
        if(index == -1){
            System.out.println("Element not found");
        }else{
            System.out.println(index);
        }

    }
}