public class array_sum_k {
    public static void main(String[] args){
        int[] n = {1,3,5,7,0,9, -2,4,6,2,8};
        int k = 7;
        for(int i = 0; i < n.length; i++){
            for(int j = 0; j < i; j++){
                if(n[i] + n[j] == k){
                    System.out.println(n[i] + " " + n[j]);
                }
            }
        }
        char f = 63;
        System.out.println(f);
    }
}
