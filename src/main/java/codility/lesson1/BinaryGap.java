package codility.lesson1;

import java.util.ArrayList;
import java.util.List;

/**
 * @see <a href="https://app.codility.com/programmers/lessons/1-iterations/binary_gap/">BinaryGap</a>
 * @see <a href="https://app.codility.com/demo/results/training4USM4U-NPB/">Solution</a>
 * <br/> (1) 10진수 -> 2진수 char[]
 * <br/> (2) 2진수 char[]에서 1 index 찾기
 * <br/> (3) gap이 가장 큰 것을 반환 또는 gap이 없을 경우 0반환
 */
public class BinaryGap {

    public static void main(String[] args) {
        System.out.println(solution(1041));
        System.out.println(solution(32));
    }

    public static int solution(int N) {
        // (1)
        String str = Integer.toBinaryString(N);
        char[] chars = str.toCharArray();

        // (2)
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '1')
                list.add(i);
        }

        // (3)
        if (list.size() < 2)
            return 0;

        int maxGap = 0;
        for (int i = 0; i < list.size() - 1; i++) {
            int gap = Math.abs(list.get(i) - list.get(i + 1) + 1);
            if (gap > maxGap)
                maxGap = gap;
        }
        return maxGap;
    }
}
