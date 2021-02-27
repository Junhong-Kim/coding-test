package programmers.hash;

import java.util.Arrays;

/**
 * startsWith
 */
public class Q42577 {

    public static void main(String[] args) {
        System.out.println(solution(new String[]{"119", "97674223", "1195524421"}));
        System.out.println(solution(new String[]{"010111", "010"}));
    }

    public static boolean solution(String[] phone_book) {
        Arrays.sort(phone_book);
        for (String s : phone_book) {
            return Arrays.stream(phone_book).noneMatch(p -> {
                if (p.equals(s)) {
                    return false;
                }
                return p.startsWith(s);
            });
        }
        return true;
    }
}
