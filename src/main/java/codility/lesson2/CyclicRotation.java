package codility.lesson2;

import java.util.Arrays;

/**
 * @see <a href="https://app.codility.com/programmers/lessons/2-arrays/cyclic_rotation/">CyclicRotation</a>
 * @see <a href="https://app.codility.com/demo/results/trainingYZPADM-TYC/">Solution</a>
 */
public class CyclicRotation {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[] {1, 2, 3, 4}, 1)));
    }

    public static int[] solution(int[] A, int K) {
        int[] before = A;
        int[] after = new int[A.length];

        for (int j = 0; j < K; j++) {
            for (int i = 0; i < before.length; i++) {
                if (i == before.length - 1) // last index
                    after[0] = before[i];
                else
                    after[i+1] = before[i];
            }
            before = after.clone();
        }
        return before;
    }
}
