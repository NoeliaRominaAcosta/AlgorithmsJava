/*
* Dada una cadena de texto s, escribe un algoritmo para encontrar la longitud de la subcadena contigua más larga
* que no contenga ningún carácter repetido.Ejemplo:Input: "abcabcbb" $\rightarrow$ Output: 3 (La subcadena más larga es "abc")
* Input: "bbbbb" $\rightarrow$ Output: 1 (La subcadena más larga es "b")Input: "pwwkew" $\rightarrow$ Output: 3
* (La subcadena más larga es "wke" o "kew")*/

import java.util.HashSet;
import java.util.Set;

public static void main(String[] args) {
    String s = "pwwkew";
    System.out.println(lengthOfLongestSubstring(s));

}
public static int lengthOfLongestSubstring(String s) {
    int n = s.length();
    int maxLength = 0;
    int left = 0;
    Set<Character> charSet = new HashSet<>();
    for (int right = 0; right < n; right++) {
        char currentChar = s.charAt(right);
        while (charSet.contains(currentChar)) {
            charSet.remove(s.charAt(left));
            left++;
        }
        charSet.add(currentChar);
        maxLength = Math.max(maxLength, right - left + 1);
    }
    return maxLength;


}