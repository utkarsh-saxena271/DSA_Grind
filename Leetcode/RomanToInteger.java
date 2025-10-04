class Solution {
    public int romanToInt(String s) {
        int nums = 0;
        
        for(int i = 0; i < s.length();i++){
            int current = 0;
            if(s.charAt(i)=='I'){
                current=1;
            }else if(s.charAt(i) == 'V'){
                current=5;
            }else if(s.charAt(i) == 'X'){
                current=10;
            }else if(s.charAt(i) == 'L'){
                current=50;
            }else if(s.charAt(i) == 'C'){
                current=100;
            }else if(s.charAt(i) == 'D'){
                current=500;
            }else if(s.charAt(i) == 'M'){
                current=1000;
            }

            // Calculations
            if(i < s.length() - 1){
                int next = 0;
                char nxt = s.charAt(i+1);
                if(nxt=='I') next = 1;
                else if(nxt=='V') next = 5;
                else if(nxt=='X') next = 10;
                else if(nxt=='L') next = 50;
                else if(nxt=='C') next = 100;
                else if(nxt=='D') next = 500;
                else if(nxt=='M') next = 1000;

                if(current < next)
                    nums -= current;
                else{
                    nums += current;
                }  
            } else {
                nums += current; // last char
            }
        }
        return nums;
    }
}