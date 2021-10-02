package programmers.hash;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Q42578 {

    public static void main(String[] args) {
        String[][] clothes1 = {{"yellowhat", "headgear"}, {"bluesunglasses", "eyewear"}, {"green_turban", "headgear"}};
        System.out.println(solution(clothes1));

        String[][] clothes2 = {{"crowmask", "face"}, {"bluesunglasses", "face"}, {"smoky_makeup", "face"}};
        System.out.println(solution(clothes2));
    }

    public static int solution(String[][] clothes) {
        Map<String, List<String>> clothMap = Arrays.stream(clothes)
                .collect(Collectors.groupingBy(
                        cloth -> cloth[1],
                        Collectors.mapping(cloth -> cloth[0], Collectors.toList())));

        int answer = 1;
        for (List<String> value : clothMap.values()) {
            answer = answer * (value.size() + 1);
        }
        return answer - 1;
    }
}
