package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TwoSum {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{2, 7, 11, 15}, 9)));
        System.out.println(Arrays.toString(twoSum(new int[]{3, 2, 4}, 6)));
        System.out.println(Arrays.toString(twoSum(new int[]{3, 3}, 6)));
    }

    /**
     * ArrayList를 사용해서 구했는데, HashMap을 사용하는게 더 빠를 것 같음
     */
    public static int[] twoSum(int[] nums, int target) {
        List<Integer> list = new ArrayList<>();
        for (int num : nums) {
            list.add(num);
        }

        int[] result = null;

        for (int i = 0; i < list.size(); i++) {
            int x = list.get(i);
            int y = target - x;

            int targetIndex = list.indexOf(y);
            if (targetIndex != i && targetIndex != -1) {
                result = new int[]{i, targetIndex};
                break;
            }
        }

        return result;
    }
}
