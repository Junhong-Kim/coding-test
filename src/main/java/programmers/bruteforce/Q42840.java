package programmers.bruteforce;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 배열 반복 탐색: i % a.length
 * 배열 최대 값 찾기: Math.max(score[0], Math.max(score[1], score[2]))
 */
public class Q42840 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{1, 2, 3, 4, 5})));
        System.out.println(Arrays.toString(solution(new int[]{1, 3, 2, 4, 2})));
    }

    /**
     * second solution
     */
    public static int[] solution(int[] answer) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] c = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] score = new int[3];

        for (int i=0; i<answer.length; i++) {
            if(answer[i] == a[i % a.length]) score[0]++;
            if(answer[i] == b[i % b.length]) score[1]++;
            if(answer[i] == c[i % c.length]) score[2]++;
        }
        int maxScore = Math.max(score[0], Math.max(score[1], score[2]));
        ArrayList<Integer> list = new ArrayList<>();
        if(maxScore == score[0]) {list.add(1);}
        if(maxScore == score[1]) {list.add(2);}
        if(maxScore == score[2]) {list.add(3);}

        int[] array = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            array[i] = list.get(i);
        }
        return array;
    }

    /**
     * first solution
     */
//    public static int[] solution(int[] answers) {
//        int questionSize = answers.length;
//
//        int[] firstPattern = new int[]{1, 2, 3, 4, 5};
//        int[] secondPattern= new int[]{2, 1, 2, 3, 2, 4, 2, 5};
//        int[] thirdPattern = new int[]{3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
//
//        int[] firstAnswer = getFullAnswer(firstPattern, questionSize);
//        int[] secondAnswer = getFullAnswer(secondPattern, questionSize);
//        int[] thirdAnswer = getFullAnswer(thirdPattern, questionSize);
//
//        int firstCount = getCorrectCount(firstAnswer, answers);
//        int secondCount = getCorrectCount(secondAnswer, answers);
//        int thirdCount = getCorrectCount(thirdAnswer, answers);
//
//        int[] countArray = {firstCount, secondCount, thirdCount};
//        int maxCount = Arrays.stream(countArray).max().orElse(0);
//
//        Map<Integer, Integer> map = new HashMap<>();
//        map.put(1, firstCount);
//        map.put(2, secondCount);
//        map.put(3, thirdCount);
//
//        List<Integer> list = new ArrayList<>();
//        map.forEach((key, value) -> {
//            if (value == maxCount)
//                list.add(key);
//        });
//        return list.stream().mapToInt(i -> i).toArray();
//    }
//
//    private static int[] getFullAnswer(int[] pattern, int questionSize) {
//        List<Integer> list = new ArrayList<>();
//        while (list.size() < questionSize) {
//            for (int i : pattern) {
//                list.add(i);
//                if (list.size() == questionSize)
//                    break;
//            }
//        }
//        return list.stream().mapToInt(i -> i).toArray();
//    }
//
//    private static int getCorrectCount(int[] answer, int[] question) {
//        int count = 0;
//        for (int i = 0; i < question.length; i++) {
//            if (answer[i] == question[i]) count++;
//        }
//        return count;
//    }
}
