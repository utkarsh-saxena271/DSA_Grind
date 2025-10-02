class Solution {
    public int findComplement(int num) {
         int temp = num;
         int count = 0;
         while(num > 0){
            count++;
            num = num>>1;
         }
        int mask = (1<<count) - 1;
        return temp ^ mask;
    }
}