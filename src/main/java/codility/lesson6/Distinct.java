package codility.lesson6;

import java.util.HashSet;

/**
 * @see <a href="https://app.codility.com/demo/results/trainingZSY9G9-FAA/">Solution</a>
 */
public class Distinct {

    public static void main(String[] args) {
        System.out.println(solution(new int[] {2, 1, 1, 2, 3, 1}));
    }

    public static int solution(int[] A) {
        HashSet<Integer> set = new HashSet<>();

        for (int i : A)
            set.add(i);

        return set.size();
    }
}
