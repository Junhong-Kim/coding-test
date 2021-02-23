package programmers.hash;

import java.util.HashMap;
import java.util.Map;

public class Q42576 {

    public static void main(String[] args) {
        String solution = solution(new String[]{"leo", "kiki", "eden"}, new String[]{"eden", "kiki"});
        System.out.println("solution = " + solution);
    }

    public static String solution(String[] participant, String[] completion) {
        String answer = "";

        Map<String, Integer> pMap = new HashMap<>();
        for (String s : participant) {
            pMap.put(s, pMap.getOrDefault(s, 0) + 1);
        }

        Map<String, Integer> cMap = new HashMap<>();
        for (String s : completion) {
            cMap.put(s, cMap.getOrDefault(s, 0) + 1);
        }

        for (String s : participant) {
            if (!pMap.get(s).equals(cMap.get(s)))
                answer = s;
        }
        return answer;
    }
}
