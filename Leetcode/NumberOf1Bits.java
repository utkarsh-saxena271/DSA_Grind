class Solution {
    public int hammingWeight(int n) {
        int count = 0;
        int bitMask = 1;
        while (n > 0) {
            if ((n & bitMask) == 1) {
                count++;
                
            }
            n = n>>1;
        }
        return count;
    }
}