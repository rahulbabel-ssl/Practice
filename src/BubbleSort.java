public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {11, 3, 5, 23, 5, 7};

//    public static int sort(int[] arr) {


        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < 6; i++) {
            System.out.print(arr[i] + "  ");
        }

    }

}

