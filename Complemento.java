import java.util.HashMap;
import java.util.Map;

class Main {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
    }

    public int[] twoSum(int[] nums, int target){
        Map<Integer, Integer> saved = new HashMap<>();
        for(int i = 0; i< nums.length; i++)
        {
            int complemento = target - nums[i];
            if(saved.containsKey(complemento)){
                return new int[]{saved.get(complemento), i};
            } else {
                saved.put(nums[i], i);
            }
        }
        throw new IllegalArgumentException("No match found");
    }
}