import java.util.*;
public class TwoSum {
    public static void main(String[] args) {
        int[] input = {-1,1,2,3,4,5,6,8};
        int target = 7;
        pairs(input, target);
    }

    private static void pairs(int input[], int target){
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<input.length; i++){
            if(map.containsKey(target - input[i]))
                map.put(target - input[i], input[i]);
            else
                map.put(input[i], null);

        }

        for(Map.Entry<Integer, Integer> item : map.entrySet()){
            if(item.getValue() != null)
                System.out.println(item.getKey()+" "+item.getValue());
        }
    }
}
