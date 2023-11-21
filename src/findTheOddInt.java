import java.util.HashMap;
import java.util.Map;

public class findTheOddInt {

    public int SolveFindTheOddInt(int[] nums){
        HashMap<Integer, Integer> count = new HashMap<>();

        for (int i = 0; i < nums.length; i++){
            int c = nums[i];

            if (count.containsKey(c)){
                int occ = count.get(c);
                count.replace(c, ++occ);
            } else {
                count.put(c, 1);
            }
        }

        for (Map.Entry<Integer, Integer> set : count.entrySet()){
            if (set.getValue() % 2 != 0){
                return set.getKey();
            }
        }

        return -1;
    }
}
