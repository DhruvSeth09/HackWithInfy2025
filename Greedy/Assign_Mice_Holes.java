import java.util.Arrays;

public class Assign_Mice_Holes {
    public static void main(String[] args) {
        int N=3;
        int[] M={4,-4,2};
        int[] H={4,0,5};
        System.out.println(assignMiceHoles(N, M, H));
    }
    public  static int assignMiceHoles(int N, int[] M, int[] H) {
        Arrays.sort(M);
        Arrays.sort(H);
        int max=0;
        for(int i=0 ; i<N ; i++){
            max=Math.max(max,Math.abs(M[i]-H[i]));
        }
        return max;
    }
}
