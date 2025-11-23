import java.util.HashMap;
import java.util.Map;

public class VentanaConHashmap {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLength = 0;
        // Mapa: Caracter -> Índice donde lo vimos
        Map<Character, Integer> map = new HashMap<>();

        // left es el inicio de la ventana
        for (int right = 0, left = 0; right < n; right++) {
            char currentChar = s.charAt(right);

            if (map.containsKey(currentChar)) {

                left = Math.max(map.get(currentChar) + 1, left);
            }

            map.put(currentChar, right); // Actualizamos la posición a la más reciente
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        VentanaConHashmap solucion = new VentanaConHashmap();
        String s = "pwwkew";
        System.out.println(solucion.lengthOfLongestSubstring(s));
    }
}
