public class movingZeroes {
    public void moveZeroes(int[] nums) {
        int i = 0, j = 0, t;
        while (j < nums.length) {
            if (nums[j] != 0) {
                t = nums[j];
                nums[j] = nums[i];
                nums[i] = t;
                i++;
                j++;
            } else
                j++;
        }
    }
}
