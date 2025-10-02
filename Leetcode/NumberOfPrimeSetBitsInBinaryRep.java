class Solution {
    public int countPrimeSetBits(int left, int right) {
        int primeCount = 0;
        int count;
        int num;
        while(left <= right){
            count = 0;
            num = left;
            while(num>0){
                if((num & 1) == 1){
                    count++;
                }
                num = num>>1;
            }
            left++;
            if(isPrime(count)){primeCount++;}
        }
        return primeCount;
    }
    public boolean isPrime(int num) {
        if (num < 2) return false;  
        int sqrtNum = (int)Math.sqrt(num); 
        for (int i = 2; i <= sqrtNum; i++) { 
            if (num % i == 0) return false;
        }

        return true; 
    }
}