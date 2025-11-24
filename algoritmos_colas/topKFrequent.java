import java.util.HashMap;
import java.util.*;
import java.util.Map.Entry;

public static List<String> topKFrequent(String[] products, int k){
    Map<String, Integer> countMap = new HashMap<>();
    for (String p : products){
        countMap.put(p, countMap.getOrDefault(p, 0) + 1);
    }

    PriorityQueue<Entry<String, Integer>> heap = new PriorityQueue<>((a, b) -> a.getValue() - b.getValue());

    for (var entry : countMap.entrySet()) {
        heap.offer(entry);
        if (heap.size() > k){
            heap.poll();
        }
    }
    List<String> result = new ArrayList<>();
    while (!heap.isEmpty()) {
        result.add(heap.poll().getKey());
    }

    Collections.reverse(result);
    return result;
}


public static void main(String[] args) {
    String[] products = {"apple", "banana", "apple", "orange", "banana", "apple"};
    int k = 2;
    List<String> topK = topKFrequent(products, k);
    System.out.println(topK); // Salida esperada: ["apple", "banana"]
}





