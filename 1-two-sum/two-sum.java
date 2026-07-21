import java.util.*;

public class Solution {
    public static int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            int num = nums[i];
            int moreNeeded = target - num;

            if (map.containsKey(moreNeeded)) {
                return new int[]{map.get(moreNeeded), i};
            }

            map.put(num, i);
        }

        return new int[]{-1, -1};
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.print("Enter target: ");
        int target = sc.nextInt();

        int[] result = twoSum(nums, target);

        System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");

        sc.close();
    }
}