public class SquareRoot {
    public static void main(String[] args) {
        int res = sqrt(256);
        System.out.println(res);
    }

    public static int sqrt(int n){
        int start = 0;
        int end = n;
        int ans = 0;

        while (start <= end){
            int mid = (start + end)/2;

            if(mid * mid == n){
                ans = mid;
                break;
            } else if (mid * mid < n) {
                ans = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }
}
