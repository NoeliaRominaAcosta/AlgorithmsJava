
/*
* Validar Palíndromo: Escribe una función que determine si
*  un String es un palíndromo (se lee igual al derecho y al revés),
* ignorando espacios, mayúsculas y puntuación.
Ejemplo: "A man, a plan, a canal: Panama" -> true*/
public static void main(String[] args) {
    String texto1 = "A man, a plan, a canal: Panama";
    String texto2 = "Hello, World!";

    esPalindromo(texto1);

}
public static boolean esPalindromo (String texto){
    String textoLimpio = texto.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

    int izquierda = 0;
    int derecha = textoLimpio.length() - 1;
    while (izquierda < derecha) {
        if (textoLimpio.charAt(izquierda) != textoLimpio.charAt(derecha)) {
            return false;
        }
        izquierda++;
        derecha--;
    }
    return true;
}


