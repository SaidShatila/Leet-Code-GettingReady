import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 6, 5, 3};
        int target = 11;
        String stringOne = "racecar";
        String stringTwo = "carrace";

        System.out.println(isAnagram(stringOne, stringTwo));
        System.out.println(Arrays.toString(twoSum(nums, target)));

    }

    public static boolean containsDuplicate(int[] nums) {
        if (nums.length <= 1) return false;
        if (nums.length == 2) {
            return nums[0] == nums[1];
        }

        HashSet<Integer> dups = new HashSet<>();
        for (int n : nums) {
            if (dups.contains(n)) {
                return true;
            }
            dups.add(n);
        }
        return false;
    }

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        HashMap<Character, Integer> charCount = new HashMap<>();

        for (char c : s.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        for (char c : t.toCharArray()) {
            if (!charCount.containsKey(c)) {
                return false;
            }
            charCount.put(c, charCount.get(c) - 1);
            if (charCount.get(c) == 0) {
                charCount.remove(c);
            }
        }

        return charCount.isEmpty();
    }

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int index = 0;

        for (int n : nums) {
            int complement = target - n;

            // If the complement exists in the map, return both indices
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), index };
            }

            // Store the current value and its index
            map.put(n, index);
            index++;
        }

        // In case no solution is found, though this shouldn't happen per the problem guarantees
        throw new IllegalArgumentException("No two sum solution");
    }

}
