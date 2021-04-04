package hackerrank;

import java.io.IOException;
import java.util.HashMap;


public class SalesByMatch {

    // Complete the sockMerchant function below.
//    static int sockMerchant(int n, int[] ar) {
//        HashMap<Integer, Integer> map = new HashMap<>();
//        for (int value: ar) {
//            map.put(value, map.getOrDefault(value, 0) + 1);
//        }
//
//        int count = 0;
//        for (Integer value : map.values()) {
//            if (value >= 2) {
//                count += (value / 2);
//            }
//        }
//        return count;
//    }

    static int sockMerchant(int n, int[] ar) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int value : ar) {
            Integer currentValue = map.get(value);
            if (currentValue == null) {
                map.put(value, 1);
            } else {
                map.put(value, currentValue + 1);
            }
        }

        int count = 0;
        for (Integer value : map.values()) {
            if (value >= 2) {
                count += (value / 2);
            }
        }
        return count;
    }

    public static void main(String[] args) throws IOException {
        int result = sockMerchant(9, new int[]{10, 20, 20, 10, 10, 30, 50, 10, 20});
        System.out.println("result = " + result);
    }
}
