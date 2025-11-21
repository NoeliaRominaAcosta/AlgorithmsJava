import java.util.HashMap;
import java.util.Map;

public class EncontrarDuplicados {

    // Paso 1: Conteo de Frecuencias (Tu Código)
    private static Map<Character, Integer> contarFrecuencias(String texto) {
        Map<Character, Integer> frecuencias = new HashMap<>();
        for (char c : texto.toCharArray()) {
            frecuencias.put(c, frecuencias.getOrDefault(c, 0) + 1);
            System.out.println("Caracter: " + c + ", Frecuencia: " + frecuencias.get(c));
        }
        return frecuencias;
    }

    // Paso 2: Encontrar el Primero No Repetido
    public static Character findFirstNonRepeatingChar(String texto) {
        // 1. Ejecutar la primera pasada para contar
        Map<Character, Integer> frecuencias = contarFrecuencias(texto);

        // 2. Ejecutar la segunda pasada para encontrar el primero con count == 1
        //    Al iterar sobre el String original, garantizamos el ORDEN.
        for (char c : texto.toCharArray()) {
            if (frecuencias.get(c) == 1) {
                // ¡Encontrado! Es el primero que aparece con una frecuencia de 1.
                return c;
            }
        }

        // Si el bucle termina, significa que todos los caracteres se repitieron.
        return null; // o lanzar una excepción, o devolver Character.MIN_VALUE
    }

    public static void main(String[] args) {
        String s1 = "loveleetcode";
        String s2 = "aabb";

        System.out.println("Input: " + s1 + " -> Primer no repetido: " + findFirstNonRepeatingChar(s1)); // Output: v
        System.out.println("Input: " + s2 + " -> Primer no repetido: " + findFirstNonRepeatingChar(s2)); // Output: null
    }
}