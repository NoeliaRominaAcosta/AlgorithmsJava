import java.util.stream.IntStream;/*
* empecemos con FizzBuzz: Escribe un programa que imprima números del 1 al 100.
* Pero para múltiplos de 3, imprime "Fizz" en lugar del número, y para múltiplos de 5,
*  imprime "Buzz". Para números que son múltiplos de ambos, imprime "FizzBuzz".
* */
public class FizzBuzzStreams {
    public static void main(String[] args) {
        IntStream.rangeClosed(1, 100)
                .mapToObj(FizzBuzzStreams::fizzBuzz
                ).forEach(System.out::println);
    }

    public static String fizzBuzz(int i) {
        String resultado = "";
        if (i % 3 == 0) resultado += "Fizz";
        if (i % 5 == 0) resultado += "Buzz";
        return resultado.isEmpty() ? Integer.toString(i): resultado;
    }

}