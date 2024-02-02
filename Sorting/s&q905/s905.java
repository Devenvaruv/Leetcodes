public class sort905 {
    public int[] sortArrayByParity(int[] nums) {
        int current;
        int j;
        for (int i = 1; i < nums.length; i++){
            current = nums[i];
            j = i -1;

            while(j >=0 && (current%2 < nums[j]%2)){
                nums[j+1] = nums[j];
                j = j - 1;
            }
            nums[j+1] = current;
        }
        return nums;
    }
}