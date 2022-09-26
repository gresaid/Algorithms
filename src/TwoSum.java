import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int searchNum = target - nums[i];
            if (map.containsKey(searchNum)) {
                return new int[]{map.get(searchNum), i};
            }
            map.put(nums[i], i);

        }
        return null;
    }
}
