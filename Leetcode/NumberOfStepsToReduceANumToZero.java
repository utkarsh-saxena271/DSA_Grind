class Solution {
    public int numberOfSteps(int num) {
        int steps = 0;
        while(num > 0){
            if((num & 1) == 0){
                num = num/2;
                steps++;
            }else if((num & 1) == 1){
                num--;
                steps++;
            }
        }
        return steps;
    }
}