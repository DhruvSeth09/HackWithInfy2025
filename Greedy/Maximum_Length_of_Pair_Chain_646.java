
import java.util.*;
public class Maximum_Length_of_Pair_Chain_646{
    public static void main(String[] args) {
        int[][] arr={{1,2},{3,4},{5,6}};
        int ans=findLongestChain(arr);
        System.out.println(ans);
    }
    public static int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs, Comparator.comparingDouble(o -> o[1]));
        int c = 1;
        int end = pairs[0][1];
        for (int i = 1; i < pairs.length; i++) {
            if (pairs[i][0] > end) {
                c++;
                end = pairs[i][1];
            }
        }
        return c;
    }
}