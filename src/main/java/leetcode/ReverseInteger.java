package leetcode;

public class ReverseInteger {

    public static void main(String[] args) {
        System.out.println(reverse(123));
        System.out.println(reverse(-123));
        System.out.println(reverse(120));
        System.out.println(reverse(0));
        System.out.println(reverse(1534236469));
    }

    public static int reverse(int x) {
        boolean isNegative = x < 0;
        StringBuilder sb = new StringBuilder();

        char[] chars = String.valueOf(Math.abs(x)).toCharArray();
        for (int i = chars.length - 1; i >= 0 ; i--) {
            sb.append(chars[i]);
        }

        if (isNegative) {
            sb.insert(0, "-");
        }

        try {
            return Integer.parseInt(sb.toString());
        } catch (NumberFormatException e) {
            return 0;
        }
    }
}
