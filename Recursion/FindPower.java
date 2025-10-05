public class FindPower {
    public static int findPower(int num, int pow){
        if(pow == 0) return 1;
        int res = num * findPower(num, pow-1);
        return res;

    }
    public static int optimisedPower(int num, int pow){
        if(pow == 0) return 1;
        int halfpow = optimisedPower(num, pow/2);
        int halfpowSq = halfpow * halfpow;
        if(pow%2 != 0){
            halfpowSq = num*halfpowSq;
        } 
        return halfpowSq;
    }
    public static void main(String[] args) {
        System.out.println(optimisedPower(2, 10));
    }
}
