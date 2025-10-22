import java.util.Scanner;

public class GuessGame {

    static int pick = 7;

    public static void main(String[] args) {
        int n = 10;
        int res = GuessNo(7);
        System.out.println(res);

    }

    public static int no(int num) {

        if (num == pick) {
            return 0;
        } else if (num > pick) {
            return -1;
        } else {
            return 1;
        }
    }

    public static int GuessNo(int n) {
        int start = 1;
        int end = n;

        while (start <= end) {
            int mid = (start + end) / 2;
            int res = no(mid);

            if(res == 0){
                return mid;
            }
            else if (res < 0){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return -1;
    }
}