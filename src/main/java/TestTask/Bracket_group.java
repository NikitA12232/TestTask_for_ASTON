package TestTask;
import java.util.Stack;

public class Bracket_group {
    public static boolean isBracketSequenceValid(String sequence) {
        Stack<Character> stack = new Stack<>();

        for (char bracket : sequence.toCharArray()) {
            if (bracket == '(' || bracket == '[') {
                stack.push(bracket);
            } else if (bracket == ')' || bracket == ']') {
                if (stack.isEmpty()) {
                    return false;
                }

                char openBracket = stack.pop();
                if ((bracket == ')' && openBracket != '(') || (bracket == ']' && openBracket != '[')) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String sequence = "[(())()(())]]";
        boolean isValid = isBracketSequenceValid(sequence);

        if (isValid) {
            System.out.println("Скобочная последовательность правильная.");
        } else {
            System.out.println("Скобочная последовательность неправильная.");
        }
    }
}
