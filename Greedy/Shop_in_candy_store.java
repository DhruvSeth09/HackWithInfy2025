
import java.util.*;

public class Shop_in_candy_store {
    public static void main(String[] args) {
        int[] arr={3,2,1,4};
        int n=4;
        int k=2;
        System.out.println(candyStore(arr, n, k));
    }
      public static ArrayList<Integer> candyStore(int arr[], int n, int k) {
        // code here
        int min=0;
        int max=0;
        Arrays.sort(arr);
        int p=n;
        for(int i=0; i<p; i++){
            min+=arr[i];
            p-=k;
        }
        
          p=0;
        for(int i=n-1; i>=p; i--){
            max+=arr[i];
            p+=k;
        }
        ArrayList<Integer> ll=new ArrayList<>();
        ll.add(min);
        ll.add(max);
        return ll ;
    }
}
