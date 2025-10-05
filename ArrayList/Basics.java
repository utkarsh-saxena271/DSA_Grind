import java.util.ArrayList;
public class Basics {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1); //to add
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);
        list.add(1,11);
        System.out.println(list);
        // System.out.println(list.get(0)); //to get
        // list.remove(0); //to remove
        // System.out.println(list);
        // list.set(2, 10);
        // System.out.println(list);
        // System.out.println(list.contains(10));
        System.out.println(list.size());
    }
}
