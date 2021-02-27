package programmers.greedy;

import java.util.Arrays;

/**
 * Arrays.fill()
 */
public class Q42862 {

    public static void main(String[] args) {
        System.out.println(solution(5, new int[]{2, 4}, new int[]{1, 3, 5}));
        System.out.println(solution(5, new int[]{2, 4}, new int[]{3}));
        System.out.println(solution(3, new int[]{3}, new int[]{1}));
    }

    public static int solution(int n, int[] lost, int[] reserve) {
        int[] cloths = new int[n];
        Arrays.fill(cloths, 1);

        for (int i : lost) cloths[i-1]--;
        for (int i : reserve) cloths[i-1]++;

        for (int i = 0; i < cloths.length - 1; i++) {
            if (cloths[i] == 0) {
                if (i == 0) {
                    if (cloths[i + 1] == 2) {
                        cloths[i]++;
                        cloths[i+1]--;
                    }
                } else if (cloths[i+1] == 2) {
                    cloths[i]++;
                    cloths[i+1]--;
                } else if (cloths[i-1] == 2) {
                    cloths[i]++;
                    cloths[i-1]--;
                }
            }
        }

        int answer = 0;
        for (int cloth : cloths) {
            if (cloth >= 1) answer++;
        }
        return answer;
    }
}
