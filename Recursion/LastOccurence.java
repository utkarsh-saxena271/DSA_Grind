public class LastOccurence {
      public static int lastOccurence(int arr[], int key, int i){
        // if(arr[i] == key) return i;
        // if(i == 0) return -1;
        // return lastOccurence(arr, key,i-1);
        if(i == arr.length) return -1;
        int isfound = lastOccurence(arr, key, i+1);
        if(isfound == -1 && arr[i] == key) return i;
        return isfound;
    }
    public static void main(String[] args) {
        int arr[] = {2,5,22,1,3,4,3,5};
        // System.out.println(lastOccurence(arr, 5, arr.length-1));
        System.out.println(lastOccurence(arr, 5, 0));
    }
}
