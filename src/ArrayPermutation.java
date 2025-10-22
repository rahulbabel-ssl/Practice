public class ArrayPermutation {
    public static void main(String[] args) {
        int [] num = {0,1,2,5,4,3};
        int [] ans = build(num);
        for(int res : ans ){
            System.out.print(res + " ");
        }
    }

    public static int[] build(int []num){
        int n = num.length;
        int[] ans = new int[n];
        for(int i = 0 ; i<n ; i++){
            ans[i] = num[num[i]];
        }
        return ans;
    }
}
