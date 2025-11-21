/*
* Encontrar el número faltante: Te dan un array de n-1 enteros únicos en el rango de 1 a n.
* Encuentra el número que falta.

Ejemplo: [1, 2, 4, 5] -> falta el 3.*/


import java.util.Arrays;
import java.util.stream.Stream;

public class NumeroFaltante {
    public static int encontrarNumeroFaltante(int[] numeros) {
        int n = numeros.length + 1; // Como falta un número, la longitud real es n
        int sumaEsperada = n * (n + 1) / 2; // Suma de los primeros n números naturales
        int sumaActual = 0;
            sumaActual = Arrays.stream(numeros).sum();
        return sumaEsperada - sumaActual; // El número faltante es la diferencia
    }

    public static void main(String[] args) {
        int[] numeros = {1, 2, 4, 5};
        int numeroFaltante = encontrarNumeroFaltante(numeros);
        System.out.println("El número faltante es: " + numeroFaltante); // Debería imprimir 3
    }
}

