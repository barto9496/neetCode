import java.util.HashMap;
import java.util.Map;

public class DuplicateInteger {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer, Integer> value = new HashMap<>();
        for (int element: nums){
            if(value.containsValue(element)){
                return true;
            }
            value.put(element, element);
        }
        return false;
    }
}


