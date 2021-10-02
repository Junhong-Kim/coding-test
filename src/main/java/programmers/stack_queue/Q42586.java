package programmers.stack_queue;

import java.util.*;
import java.util.stream.Collectors;

public class Q42586 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{93, 30, 55}, new int[]{1, 30, 5})));
        System.out.println(Arrays.toString(solution(new int[]{95, 90, 99, 99, 80, 99}, new int[]{1, 1, 1, 1, 1, 1})));
    }

    public static int[] solution(int[] progresses, int[] speeds) {
        List<Integer> answerList = new ArrayList<>();
        int[] completeDate = new int[progresses.length];
        int workingDate = 0;

        while (!Arrays.stream(progresses).allMatch(i -> i >= 100)) {
            workingDate++;
            for (int i = 0; i < progresses.length; i++) {
                progresses[i] = progresses[i] + speeds[i];
                if (progresses[i] >= 100 && completeDate[i] == 0) {
                    completeDate[i] = workingDate;
                }
            }
        }

        Queue<Integer> queue = Arrays.stream(completeDate)
                .boxed()
                .collect(Collectors.toCollection(LinkedList::new));

        do {
            Integer criteria = queue.poll();
            int count = 1;

            for (int i : queue) {
                if (criteria < i) {
                    break;
                }
                count++;
            }

            for (int i = 0; i < count - 1; i++) {
                queue.poll();
            }
            answerList.add(count);
        } while (!queue.isEmpty());
        return answerList.stream().mapToInt(i -> i).toArray();
    }
}
