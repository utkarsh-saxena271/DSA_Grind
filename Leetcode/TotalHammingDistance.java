class TotalHammingDistance {
    public int totalHammingDistance(int[] nums){
        int totalDist = 0;
        int ones;
        int zeroes;
        for(int i = 0; i < 32; i++){
            ones = 0;
            for(int j = 0; j < nums.length; j++){
                if(((nums[j]>>i) & 1) ==1){ones++;}
            }
            zeroes = nums.length-ones;
            totalDist+=ones*zeroes;
        }
        return totalDist;
    }
    // BruteForce
    // public int totalHammingDistance(int[] nums) {
    //     int totalDist = 0;
    //     for(int i = 0; i < nums.length; i++){
    //         for(int j = i+1; j < nums.length; j++){
    //             totalDist+= getHammingDistance(nums[i],nums[j]);
    //         }
    //     }
    //     return totalDist;
    // }
    // public static int getHammingDistance(int start, int end){
    //     int dist = 0;
    //     while(start > 0 || end > 0){
    //         if((start & 1) != (end & 1)){
    //             dist++;
    //         }
    //         start = start>>1;
    //         end = end>>1;
    //     }
    //     return dist;
    // }
}
