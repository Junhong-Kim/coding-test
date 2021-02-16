package codility.lesson8;

import java.util.HashMap;
import java.util.Map;

/**
 * @see <a href="https://app.codility.com/demo/results/trainingRK23NQ-A2W/">Solution</a>
 */
public class Dominator {

    public static void main(String[] args) {
        System.out.println(solution(new int[]{3, 4, 3, 2, 3, -1, 3, 3}));
        System.out.println(solution(new int[]{1, 2, 3}));
    }

    public static int solution(int[] A) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : A) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        int maxKey = 0;
        int maxCount = 0;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxKey = entry.getKey();
                maxCount = entry.getValue();
            }
        }

        if (maxCount <= A.length / 2) {
            return -1;
        }

        for (int i = 0; i < A.length; i++) {
            if (A[i] == maxKey) {
                return i;
            }
        }

        return -1;
    }
}
