package codility.lesson12;

import java.util.HashSet;
import java.util.Set;

public class ChocolatesByNumbers {

    public static void main(String[] args) {
        System.out.println(solution(10, 4));
        System.out.println(solution(9, 2));
    }

    /**
     * @see <a href="https://app.codility.com/demo/results/training8CGGDT-6CA/">Solution</a>
     *
     * 1. 유클리드 호제법을 사용하여 최대 공약수 구하기
     * 2. N까지의 최대 공약수 배수의 개수 구하기
     */
    public static int solution(int N, int M) {
        return N / gcd(N, M);
    }

    public static int gcd(int x, int y) {
        if (y == 0)
            return x;
        return gcd(y, x % y);
    }

    /**
     * @see <a href="https://app.codility.com/demo/results/trainingJDWHW6-GA8/">Solution</a>
     *
     * 1. 이미 먹은 위치 값이 나올 때까지 while 문을 실행
     */
    public static int solution1(int N, int M) {
        int X = 0;
        Set<Integer> set = new HashSet<>();
        set.add(X);

        while (true) {
            X = (X + M) % N;
            if (set.contains(X)) {
                break;
            } else {
                set.add(X);
            }
        }
        return set.size();
    }
}
