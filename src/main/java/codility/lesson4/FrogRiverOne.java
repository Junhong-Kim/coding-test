package codility.lesson4;

import java.util.HashSet;
import java.util.Set;

/**
 * @see <a href="https://app.codility.com/demo/results/trainingESMGBY-WYE/">FrogRiverOne</a>
 * @see <a href="https://app.codility.com/programmers/lessons/4-counting_elements/frog_river_one/">Solution</a>
 */
public class FrogRiverOne {

    public static void main(String[] args) {
        System.out.println(solution(5, new int[]{ 1, 3, 1, 4, 2, 3, 5, 4}));
    }

    public static int solution(int X, int[] A) {
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < A.length; i++) {
            if (A[i] <= X) set.add(A[i]);
            if (set.size() == X) return i;
        }
        return -1;
    }
}
