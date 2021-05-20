package codility.lesson10;

public class MinPerimeterRectangle {

    /**
     * @see <a href="https://app.codility.com/demo/results/trainingXU3ED4-E2D/">Solution</a>
     */
    public static void main(String[] args) {
        System.out.println(solution(30));
    }

    public static int solution(int N) {
        int min = Integer.MAX_VALUE;
        for (int i = 1; i <= (int) Math.sqrt(N); i++) {
            if ((N % i == 0) && ((i + (N / i)) * 2 < min)) {
                min = (i + (N / i)) * 2;
            }
        }
        return min;
    }
}
