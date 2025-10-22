public class LargrstSmallest {
    int[] numbers = {45, 22, 89, 16, 90, 33};
    int largest = numbers[0];
    int smallest = numbers[0];

    public static void main(String[] args) {
        LargrstSmallest obj = new LargrstSmallest();

        for (int num : obj.numbers) {

            if (num>obj.largest){
                obj.largest = num;
            }
            if (num<obj.smallest){
                obj.smallest = num;
            }
        }
        System.out.println(obj.largest);
        System.out.println(obj.smallest);
    }
}