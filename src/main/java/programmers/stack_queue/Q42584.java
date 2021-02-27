package programmers.stack_queue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q42584 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{1, 2, 3, 2, 3})));
    }

    public static int[] solution(int[] prices) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                if (prices[j] < prices[i]) {
                    list.add(j - i);
                    break;
                }
                if (j == prices.length - 1) {
                    list.add(prices.length - (i + 1));
                }
            }
        }
        list.add(0);

        int[] array = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            array[i] = list.get(i);
        }
        return array;
    }
}
