import java.util.*;

class removeDuplicate {
    public static int findDuplicate(int[] nums) {
        int cnt[] = new int[nums.length - 1];
        for (int i = 0; i < nums.length; i++) {
            cnt[nums[i] - 1]++;
        }
        for (int i = 0; i < nums.length - 1; i++) {
            if (cnt[i] > 1)
                return i + 1;
        }
        return -1;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size:");
        int n = sc.nextInt();
        int nums[] = new int[n];
        System.out.println("enter elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println(findDuplicate(nums));

    }
}