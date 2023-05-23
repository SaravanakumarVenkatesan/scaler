import java.util.*;

public class TwoSumFindIndices {
    public static void main(String[] args) {
        int arr[]={11,3,7,9,14,2};
        int target=17;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<arr.length; i++){
            if(map.containsKey(target-arr[i]))
                System.out.println(i+" "+map.get(target-arr[i]));
            map.put(arr[i], i);
        }
    }
}
