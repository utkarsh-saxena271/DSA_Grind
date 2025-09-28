public class Palindrome {

    public static boolean palindrome(String str){
        int mid = str.length()/2;
        int n = str.length()-1;
        for(int i = 0; i <= mid; i++){
            if(str.charAt(i)!= str.charAt(n)){
                return false;
            }
            n--;
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "ssss";
        if(palindrome(str)){
            System.out.println("Yes str is a palindrome");
        }else{
            System.out.println("No str is not a palindrome");
        }
    }
}
