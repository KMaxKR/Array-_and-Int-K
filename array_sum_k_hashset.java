import java.util.HashSet;
import java.util.Set;

public class array_sum_k_hashset {
    public static void main(String[] args){
        int[] t = {1,3,5,7,0,9, -2,4,6,2,8};
        int k = 7;
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < t.length; i++){
            int numbToFind = k - t[i];
            if(set.contains(numbToFind)){
                System.out.println(numbToFind + " " + t[i]);
            }
            set.add(t[i]);
        }
        System.out.println("None");
    }
}
