/*
* Revertir un String: Escribe una función que revierta un String sin
*  usar métodos nativos como StringBuilder.reverse()*/

public class InvertirStream {
    public static String invertirString(String str) {
        char[] caracteres = str.toCharArray();
        int izquierda = 0;
        int derecha = caracteres.length - 1;

        while (izquierda < derecha) {
            // Intercambiar los caracteres
            char temp = caracteres[izquierda];
            caracteres[izquierda] = caracteres[derecha];
            caracteres[derecha] = temp;

            // Mover los índices hacia el centro
            izquierda++;
            derecha--;
        }

        return new String(caracteres);
    }

    public static void main(String[] args) {
        String original = "Hola Mundo";
        String invertido = invertirString(original);
        System.out.println("Original: " + original);
        System.out.println("Invertido: " + invertido);
    }

}
