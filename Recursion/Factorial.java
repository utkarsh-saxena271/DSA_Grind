public class Factorial {
    public static int factorial(int n){
        int fac;
        if(n==0){
            return 1;
        }
        fac = n * factorial(n-1);
        return fac;

    }
    public static void main(String[] args) {
       System.out.println( factorial(3));

    }
}
