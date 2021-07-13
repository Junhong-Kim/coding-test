package codility.lesson15;

import java.util.HashSet;
import java.util.Set;

public class AbsDistinct {

    public static void main(String[] args) {
        System.out.println(solution(new int[]{-5, -3, -1, 0, 3, 6}));
    }

    /**
     * @see <a href="https://app.codility.com/demo/results/trainingEHYUTP-HK2/">Solution</a>
     *
     * 1. 배열을 순회하면서 절대값으로 만들어서 Set 자료형에 추가
     * 2. Set 자료형 크기 반환
     */
    public static int solution(int[] A) {
        Set<Integer> set = new HashSet<>();
        for (int i : A) {
            set.add(Math.abs(i));
        }
        return set.size();
    }
}
