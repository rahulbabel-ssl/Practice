public class BinarySearch {
    public static void main(String[] args) {

        int res = sort(new int[] {1,3,5,7,9} , 3);
        System.out.println(res);
    }


    public static int sort(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;

        while (start<=end){
            int mid = (start+end)/2;
            if(arr[mid] == target) {
                return mid;
            }
            else if(arr[mid]<target){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return -1;
    }
}