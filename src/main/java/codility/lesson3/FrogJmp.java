package codility.lesson3;

/**
 * @see <a href="https://app.codility.com/demo/results/trainingU39S2F-XUP/">FrogJmp</a>
 * @see <a href="https://app.codility.com/programmers/lessons/3-time_complexity/frog_jmp/">Solution</a>
 */
public class FrogJmp {

    public static void main(String[] args) {
        System.out.println(solution(10, 85, 30));
    }

    public static int solution(int X, int Y, int D) {
        Y = Y - X;
        int val = Y % D > 0 ? 1 : 0;
        return Y / D + val;
    }
}
