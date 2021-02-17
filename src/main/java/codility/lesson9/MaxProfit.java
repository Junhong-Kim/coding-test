package codility.lesson9;

public class MaxProfit {

    /**
     * @see <a href="https://app.codility.com/demo/results/training9G5Q5V-NAP/">Solution</a>
     */
    public static void main(String[] args) {
        System.out.println(solution(new int[]{23171, 21011, 21123, 21366, 21013, 21367}));
    }

    /**
     * second solution
     */
    public static int solution(int[] A) {
        if (A.length < 2) {
            return 0;
        }

        int minPrice = A[0];
        int maxProfit = A[1] - A[0];

        for (int price : A) {
            if (price < minPrice) {
                minPrice = price;
            } else {
                maxProfit = Math.max(maxProfit, price - minPrice);
            }
        }
        return maxProfit;
    }

    /**
     * first solution
     */
//    public static int solution(int[] A) {
//        int[] profitArray = new int[A.length];
//
//        for (int i = 0; i < A.length; i++) {
//            int buyPrice = A[i];
//            int maxProfit = 0;
//
//            for (int j = i + 1; j < A.length; j++) {
//                if (A[j] > maxProfit) {
//                    maxProfit = A[j];
//                }
//            }
//            profitArray[i] = maxProfit - buyPrice;
//        }
//
//        int maxProfit = 0;
//        for (int i : profitArray) {
//            if (i > maxProfit)
//                maxProfit = i;
//        }
//        return maxProfit;
//    }
}
