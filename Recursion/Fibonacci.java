public class Fibonacci {
    public static int fibonacci(int n){
        int fib;
        if(n==0 || n == 1){return n;}
       fib = fibonacci(n-1)+fibonacci(n-2);
        return fib;

    }
    public static void main(String[] args) {
        System.out.println(fibonacci(25));
    }
}
