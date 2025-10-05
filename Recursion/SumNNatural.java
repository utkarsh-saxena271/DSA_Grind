public class SumNNatural {
    public static int sumN(int n){
        int sum;
        if(n==1){
            return 1;
        }
        sum = n+sumN(n-1);
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(sumN(4));
    }
}
