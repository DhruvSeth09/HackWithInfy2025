public class Minimum_rotations_to_unlock_a_circular_lock {
    public static void main(String[] args) {
        long R=222;
        long D=333;
        System.out.println(rotationCount(R, D));
    }
    private  static int rotationCount(long R, long D) {
        // code here
        int ans=0;
        while(R>0){
            long a=R%10;
            long b=D%10;
            R/=10;
            D/=10;
            ans+=Math.min(Math.abs(a-b),10-Math.abs(a-b));
        }
        return ans;
    }
}
