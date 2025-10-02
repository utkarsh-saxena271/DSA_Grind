class Solution {
    public int minBitFlips(int start, int goal) {
        int count = 0;
        while(start>0 || goal > 0){
        // Both approaches are correct
            // if((((x & 1) | (y & 1))==1) && (((x & 1) & (y & 1))==0) ){
            //     count++;
            // }
            if((start & 1) != (goal & 1)){
                count++;
            }
            start = start>>1;
            goal = goal>>1;
        }
        return count;
    }
}