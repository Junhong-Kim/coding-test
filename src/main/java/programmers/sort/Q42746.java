package programmers.sort;

import java.util.Arrays;

/**
 * Comparator
 */
public class Q42746 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{6, 10, 2}));
        System.out.println(solution(new int[]{3, 30, 34, 5, 9}));
    }

    public static String solution(int[] numbers) {
        String[] strings = Arrays.stream(numbers).mapToObj(String::valueOf).toArray(String[]::new);
//        Arrays.sort(strings, Collections.reverseOrder());
        Arrays.sort(strings, (o1, o2) -> (o2 + o1).compareTo(o1 + o2));

        if(strings[0].equals("0")) return "0";
        return String.join("", strings);
    }
}
