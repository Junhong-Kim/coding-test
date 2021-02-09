package codility.lesson5;

/**
 * @see <a href="https://app.codility.com/demo/results/trainingJ5XMAR-G3D/">Solution</a>
 */
public class CountDiv {

    public static void main(String[] args) {
        System.out.println(solution(6, 11, 2));
    }

    /**
     * second solution
     */
    public static int solution(int A, int B, int K) {
        int count = 0;

        if (A % K == 0)
            count++;

        if (A != B) {
            int quotient1 = A / K;
            int quotient2 = B / K;
            count += quotient2 - quotient1;
        }
        return count;
    }

    /**
     * first solution
     */
//    public static int solution(int A, int B, int K) {
//        int count = 0;
//        for (int i = A; i <= B; i++) {
//            if (i % K == 0) count++;
//        }
//        return count;
//    }
}
