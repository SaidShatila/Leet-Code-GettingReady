import java.util.HashMap;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
        int[] nums = {1, 2,3,3, 4, 4};

        System.out.println(containsDuplicate(nums));

    }

    public static boolean containsDuplicate(int[] nums) {
        if (nums.length == 0 || nums.length == 1) return false;
        if (nums.length ==2 ) { return nums[0] == nums[1] ;}

        HashSet<Integer> dups = new HashSet<>();
        for (int n : nums){
            if (dups.contains(n)){
                return true;
            }
            dups.add(n);
        }
        return false;
    }
}
