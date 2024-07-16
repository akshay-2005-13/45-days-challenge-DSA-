import java.util.HashMap;
import java.util.Map;

public class twoSum {
    public int[] TwoSum(int[] nums, int target) {
        int a[] = new int[2];
        Map<Integer, Integer> m = new HashMap<>();
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int c = target - nums[i];
            if (m.containsKey(c)) {
                a[1] = m.get(c);
                a[0] = i;
                return a;
            }
            m.put(nums[i], i);
        }

        return a;
    }
}
