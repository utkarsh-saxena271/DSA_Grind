public class GetSetClear {


    public static int getBit(int n, int i){
        int bitMask = 1<<i;
        return ((n & bitMask) == 0 ? 0 : 1);
    }
    public static int setBit(int n, int i){
        int bitMask = 1<<i;
        return (n | bitMask);
    }
    public static int clearBit(int n, int i){
        int bitMask = ~(1<<i);
        return (n & bitMask);
    }
    public static int updateBit(int n, int i, int newBit){
        // if(newBit == 0 ){
        //     return clearBit(n, i);
        // }else{
        //     return setBit(n, i);
        // }
        n  = clearBit(n, i);
        int bitMask = (newBit<<i);
        return bitMask | n;
    }

    public static void main(String[] args) {
        System.out.println(getBit(2,1));
        System.out.println(setBit(2,1));
        System.out.println(clearBit(2,1));
        System.out.println(updateBit(2,1,1));
    }
}
