package codility.lesson7;

import java.util.Stack;

/**
 * @see <a href="https://app.codility.com/demo/results/trainingUXA9KD-2A9/">Solution</a>
 */
public class Brackets {

    public static void main(String[] args) {
        System.out.println(solution("{[()()]}"));
        System.out.println(solution("([)()]"));
        System.out.println(solution("}([)()]}"));
        System.out.println(solution(""));
    }

    public static int solution(String S) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < S.length(); i++) {
            char bracket = S.charAt(i);

            if (bracket == '{' || bracket == '[' || bracket == '(') {
                stack.push(bracket);
            } else {
                if (stack.isEmpty())
                    return 0;

                Character pop = stack.pop();
                if (pop == '{' && bracket != '}') return 0;
                if (pop == '[' && bracket != ']') return 0;
                if (pop == '(' && bracket != ')') return 0;
            }
        }

        return stack.isEmpty() ? 1 : 0;
    }
}
