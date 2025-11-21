/*
* Dada una colección de números enteros (int[] nums) y un número entero objetivo (target), devuelve los índices de los dos números en el array que suman el valor del target.

Asume que siempre existe exactamente una solución, y no puedes usar el mismo elemento dos veces.

Ejemplo:

Input: nums = [2, 7, 11, 15], target = 9

Output: [0, 1] (porque nums[0] + nums[1] = 2 + 7 = 9)*/

import java.util.HashMap;
public class SumaNumeros {
    public static int[] encontrarIndices(int[] nums, int target) {
        HashMap<Integer, Integer> mapa = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complemento = target - nums[i];
            if (mapa.containsKey(complemento)) {
                return new int[]{mapa.get(complemento), i};
            }
            mapa.put(nums[i], i);
        }

        throw new IllegalArgumentException("No se encontraron dos números que sumen el objetivo.");
    }
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] resultado = encontrarIndices(nums, target);
        System.out.println("Índices encontrados: [" + resultado[0] + ", " + resultado[1] + "]");
    }
}
