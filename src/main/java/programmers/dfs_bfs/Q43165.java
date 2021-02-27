package programmers.dfs_bfs;

/**
 * DFS
 */
public class Q43165 {

    private static int count = 0;

    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 1, 1, 1, 1}, 3));
//        System.out.println(solution(new int[]{1, 1}, 2));
    }

    public static int solution(int[] numbers, int target) {
        dfs(numbers, 0, 0, target);
        return count;
    }

    private static void dfs(int[] numbers, int sum, int index, int target) {
        if (numbers.length == index) {
            if (sum == target) count++;
        } else {
            dfs(numbers, sum + numbers[index], index + 1, target);
            dfs(numbers, sum - numbers[index], index + 1, target);
        }
    }
}
