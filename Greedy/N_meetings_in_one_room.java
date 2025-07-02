import java.util.Arrays;

public class N_meetings_in_one_room {
    public static void main(String[] args) {
        int[] a={1, 3, 0, 5, 8, 5};
        int[] b={2, 4, 6, 7, 9, 9};
        System.out.println(maxMeetings(a,b));
    }
     public static int maxMeetings(int start[], int end[]) {
        int n=start.length;
        int[][] arr=new int[start.length][2];
        for(int i=0 ; i<n ; i++){
            arr[i][0]=start[i];
            arr[i][1]=end[i];
        }
        int s=1;
       
        Arrays.sort(arr,(a,b)->a[1]-b[1]);
         int c=arr[0][1];
        for(int i=1 ; i<n ; i++){
            if(c<arr[i][0]){
                s++;
                c=arr[i][1];
            }
        }
        return s;
    }
}
