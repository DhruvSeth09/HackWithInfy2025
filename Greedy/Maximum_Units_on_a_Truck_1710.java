import java.util.*;
public class Maximum_Units_on_a_Truck_1710 {
    public static void main(String[] args) {
        int[][] arr={{1,3},{2,2},{3,1}};
        int t=4;
        System.out.println(maximumUnits(arr,t));
    }
    public static int maximumUnits(int[][] arr, int t) {
        Arrays.sort(arr, (a, b) -> b[1] - a[1]);
        int ans=0;
        for(int i=0 ; i<arr.length ; i++){
            if(arr[i][0]>t){
                ans+=(arr[i][1]*t);
                break;
            }else{
                ans+=(arr[i][1]*arr[i][0]);
                t-=arr[i][0];
            }
        }
        return ans;
    }
    
}
