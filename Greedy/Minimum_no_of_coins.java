import java.util.*;
public class Minimum_no_of_coins {
    static int[] coin={ 1, 2, 5, 10, 20, 50, 100, 200, 500, 2000 };
    public static void main(String[] args) {
        int n=43;
        System.out.println(minPartitions(n));
    }
//    TLE
//    public static List<Integer> minPartition(int n) {
//        List<Integer> ll= new ArrayList<>();
//        while(n!=0){
//            for(int i=0 ; i<coin.length ; i++){
//                if(n<coin[i]){
//                    ll.add(coin[i-1]);
//                    n-=coin[i-1];
//                    break;
//                }
//            }
//        }
//        return ll;
//    }
    public static List<Integer> minPartition(int n) {
        // code here
        int i = coin.length-1;
        List<Integer> ll= new ArrayList<>();
        while(n!=0){
            if(n>=coin[i]){
                ll.add(coin[i]);
                n-=coin[i];
            }
            else{
                i--;
            }
        }
        return ll;
    }
    public static List<Integer> minPartitions(int n){
        int i=coin.length-1;
        List<Integer> ll= new ArrayList<>();
        while(n!=0){
            int div=n/coin[i];
            while(div-->0){
                ll.add(coin[i]);
            }
            n%=coin[i];
            i--;
        }
        return ll;
    }
}
