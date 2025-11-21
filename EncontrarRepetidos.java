/*
* Encontrar Duplicados: Dada una lista de enteros, devuelve una lista (o Set) con los números
* que aparecen más de una vez.

Intenta resolverlo primero con un Map y luego con la API de Streams (groupingBy, counting).*/

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class EncontrarRepetidos {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 2, 3, 6, 7, 8, 1, 9, 10, 3);

        // Usando Map
        Set<Integer> repetidosConMap = encontrarRepetidosConMap(numeros);
        System.out.println("Números repetidos usando Map: " + repetidosConMap);

        // Usando Streams
        Set<Integer> repetidosConStreams = encontrarRepetidosConStreams(numeros);
        System.out.println("Números repetidos usando Streams: " + repetidosConStreams);
    }

    public static Set<Integer> encontrarRepetidosConMap(List<Integer> numeros) {
        Map<Integer, Integer> contador = new HashMap<>();
        Set<Integer> repetidos = new HashSet<>();

        for (Integer numero : numeros) {
            contador.put(numero, contador.getOrDefault(numero, 0) + 1);
            if (contador.get(numero) == 2) {
                repetidos.add(numero);
            }
        }
        return repetidos;
    }

    public static Set<Integer> encontrarRepetidosConStreams(List<Integer> numeros) {
        return numeros.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toSet());
    }
}
