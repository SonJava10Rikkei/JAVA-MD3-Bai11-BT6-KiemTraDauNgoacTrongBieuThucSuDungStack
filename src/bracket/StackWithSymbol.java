package bracket;

import java.util.Scanner;
import java.util.Stack;

public class StackWithSymbol {
    static Stack<Character> bStack = new Stack<>();
    static String expression;

    public static void checkBracketSymbol() {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập vào một chuỗi biểu thức: ");
        expression = input.nextLine();
        boolean checkResult = checkMatchSymbol();
        if (checkResult)
            System.out.println("Chuỗi biểu thức hợp lệ !");
        else
            System.err.println("Chuỗi biểu thức không hợp lệ !");
    }

    private static boolean checkMatchSymbol() {
        char left;
        char roundOpenBracket = '(';
        char roundCloseBracket = ')';


        for (int i = 0; i < expression.length(); i++) {
            char sym = expression.charAt(i);
            if (sym == roundOpenBracket) {
                bStack.push(sym);
                continue;
            }
            if (sym == roundCloseBracket) {
                if (bStack.isEmpty()) {
                    return false;
                }
                left = bStack.pop();
                if ((left == roundOpenBracket && sym != roundCloseBracket)

                ) {
                    return false;
                }
            }
        }
        if (bStack.isEmpty()) {
            return true;
        } else {
            return false;
        }

    }
}
