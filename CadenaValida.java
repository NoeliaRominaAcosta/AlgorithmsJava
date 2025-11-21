/*
Dada una cadena s que contiene solo los caracteres '(', ')', '{', '}', '[' y ']', determiná si la cadena de entrada es válida.*/

import java.util.ArrayDeque;
import java.util.Deque;

public static void main(String[] args) {
    String s = "{[(]}";
    System.out.println(isValid(s));

}
public static boolean isValid(String s) {
    Deque<Character> stack = new ArrayDeque<>();
    for (char c : s.toCharArray()) {
        if (c == '(') {
            stack.push(')');
        } else if (c == '{') {
            stack.push('}');
        } else if (c == '[') {
            stack.push(']');
        } else {
            if (stack.isEmpty() || stack.pop() != c) {
                return false;
            }
        }
    }
    return stack.isEmpty();
}