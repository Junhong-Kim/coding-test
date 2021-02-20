package codility.lesson10;

public class CountFactors {

    public static void main(String[] args) {
        System.out.println(solution(24));
        System.out.println(solution(16));
        System.out.println(solution(15));
        System.out.println(solution(1));
    }

    /**
     * @see <a href="https://app.codility.com/demo/results/trainingM33PU8-PTE/">Solution</a>
     */
    public static int solution(int N) {
        int count = 0;

        for (int D = 1; D < Math.sqrt(N); D++) {
            if (N % D == 0) {
                count++;
            }
        }
        count *= 2;

        if (Math.sqrt(N) % 1 == 0)
            count++;
        return count;
    }

    /**
     * @see <a href="https://app.codility.com/demo/results/trainingG7SJX9-N27/"></a>
     * second solution
     */
//    public static int solution(int N) {
//        int count = 0;
//        for (int D = 1; D * D <= N; D++) {
//            if (N % D == 0) {
//                count++;
//
//                if (D * D < N) {
//                    count++;
//                }
//            }
//        }
//        return count;
//    }

    /**
     * @see <a href="https://app.codility.com/demo/results/trainingH7TQX8-SHR/"></a>
     * first solution
     */
//    public static int solution(int N) {
//        if (N == 1) {
//            return 1;
//        }
//
//        int count = 2;
//        for (int D = 2; D <= N / 2; D++) {
//            if (N % D == 0) {
//                count++;
//            }
//        }
//
//        return count;
//    }
}
