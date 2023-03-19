package Rikkei.academy;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class PairOfBrackets {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Nhập vào biểu thức bạn muốn kiểm tra: ");
//        String data = sc.nextLine();
        System.out.println("Biểu thức 1--> :" + checkBracket("s * (s – a) * (s – b) * (s – c) "));
        System.out.println("Biểu thức 2--> :" + checkBracket("(– b + (b2 – 4 * a * c)^0.5) / 2*a"));
        System.out.println("Biểu thức 3--> :" + checkBracket("(s * (s – a) * (s – b * (s – c)"));
        System.out.println("Biểu thức 4--> :" + checkBracket("s * (s – a) * s – b) * (s – c)"));
        System.out.println("Biểu thức 5--> :" + checkBracket("(– b + (b^2 – 4 * a * c)^(0.5/ 2 * a))"));
    }

    public static boolean checkBracket(String data) {
        Stack<String> bStack = new Stack<>();
        String[] arr = data.split("");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals("(")) {
                bStack.push(arr[i]);
            } else if (arr[i].equals(")")) {
                if (bStack.isEmpty() || bStack.pop().equals("")) {
                    return false;
                }
            }
        }
        return bStack.isEmpty();
    }
}