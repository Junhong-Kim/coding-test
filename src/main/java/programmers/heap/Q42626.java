package programmers.heap;

import java.util.PriorityQueue;

/**
 * PriorityQueue
 */
public class Q42626 {

    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 2, 3, 9, 10, 12}, 7));
    }

    public static int solution(int[] scoville, int K) {
        int answer = 0;

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i : scoville) {
            pq.offer(i);
        }

        while (pq.peek() <= K) {
            if (pq.size() == 1) {
                return -1;
            }

            Integer first = pq.poll();
            Integer second = pq.poll();

            int newScoville = first + (second * 2);
            pq.add(newScoville);
            answer++;
        }
        return answer;
    }
}
