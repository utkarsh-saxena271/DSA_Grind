import java.util.ArrayList;

public class MaxInList {
    public static int maxElem(ArrayList <Integer> list){
        int max = list.get(0);
        for(int i = 1; i < list.size(); i++){
            if(list.get(i)>max){
                max = list.get(i);
            }
        }
        return max;
    }
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(99);
        list.add(4);
        list.add(5);
        list.add(6);
        System.out.println(maxElem(list));

    }
}
