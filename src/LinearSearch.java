public class LinearSearch {
    public static void main(String[] args) {
        int res = sort(new int[]{1, 3, 5, 7, 9},7);
        System.out.println(res);
    }

    public static int sort(int[] arr, int target) {

        int length = arr.length;
        for (int i = 0; i < length-1 ; i++) {

            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
