public class ShortestPath {


    public static double getShortestPath(String path){
        int x = 0, y = 0;
        for(int i = 0; i < path.length(); i++){
            if(path.charAt(i)=='N' || path.charAt(i)=='n'){
                y++;
            }
            else if(path.charAt(i)=='S' || path.charAt(i)=='S'){
                y--;
            }
            else if(path.charAt(i)=='W' || path.charAt(i)=='w'){
                x--;
            }
            else if(path.charAt(i)=='E' || path.charAt(i)=='e'){
                x++;
            }
        }
        double rep = (x*x) + (y*y);
        double sp = Math.sqrt(rep);
        return sp;

    }
    public static void main(String[] args) {
        String path = "WNEENESENNN";
        System.out.println(getShortestPath(path));
    }
}
