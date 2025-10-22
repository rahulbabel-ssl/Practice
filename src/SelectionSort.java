public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {11, 3, 5, 23, 5, 7};
        int temp = 0;
        int minIndex = -1;

        for(int i = 0 ; i < arr.length-1 ; i++){
            minIndex = i;

            for(int j = i+1 ; j < arr.length ; j++) {

                if (arr[minIndex] > arr[j]) {
                    minIndex = j;
                }
            }
                temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
                //System.out.println();

//                for(int num : arr){
//                    System.out.print(num + "  ");
//                }


        }


        for (int i = 0; i < 6; i++) {
            System.out.print(arr[i] + "  ");
        }

    }

}
