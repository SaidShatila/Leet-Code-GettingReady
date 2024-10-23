import java.util.*;

public class Main {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 6, 5, 3};
        int[] numsKExcept = {1, 2, 4, 6};
        char[][] board = {{'1', '2', '.', '.', '3', '.', '.', '.', '.'},
                {'4', '.', '.', '5', '.', '.', '.', '.', '.'},
                {'.', '9', '1', '.', '.', '.', '.', '.', '3'},
                {'5', '.', '.', '.', '6', '.', '.', '.', '4'},
                {'.', '.', '.', '8', '.', '3', '.', '.', '5'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '.', '.', '.', '.', '.', '2', '.', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '8'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}};

        char[][] boardTwo = {
                {'.', '.', '4', '.', '.', '.', '6', '3', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '.', '.'},
                {'5', '.', '.', '.', '.', '.', '.', '9', '.'},
                {'.', '.', '.', '5', '6', '.', '.', '.', '.'},
                {'4', '.', '3', '.', '.', '.', '.', '.', '1'},
                {'.', '.', '.', '7', '.', '.', '.', '.', '.'},
                {'.', '.', '.', '5', '.', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '.', '.'}
        };
        int target = 11;
        String[] strs = {"act", "pots", "tops", "cat", "stop", "hat"};
        String stringOne = "racecar";
        String stringTwo = "carrace";

        int[] nums1 = {1, 2, 2, 3, 3, 3};
        int k1 = 2;
        System.out.println(Arrays.toString(topKFrequent(nums1, k1))); // Replace 'yourMethodName' with your function name

        // Example 2
        int[] nums2 = {1, 1, 1, 2, 2, 3};
        int k2 = 1;
        System.out.println(Arrays.toString(topKFrequent(nums2, k2)));

        // Example 3
        int[] nums3 = {7, 7, 8, 8, 8, 9};
        int k3 = 2;
        System.out.println(Arrays.toString(topKFrequent(nums3, k3)));

        int[] nums4 = {1, 2, 2, 3, 3, 3};
        int k4 = 2;
        System.out.println(Arrays.toString(topKFrequent(nums4, k4)));

        int[] nums5 = {1, 2};
        int k5 = 2;
        System.out.println(Arrays.toString(topKFrequent(nums5, k5)));

        List<String> strs1 = Arrays.asList("hello", "world", "");
        String encoded = encode(strs1);
        System.out.println("Encoded: " + encoded);
        List<String> decoded = decode(encoded);
        System.out.println("Decoded: " + decoded);

        System.out.println(isAnagram(stringOne, stringTwo));
        System.out.println(Arrays.toString(twoSum(nums, target)));
        System.out.println(groupAnagrams(strs));

        System.out.println(Arrays.toString(productExceptSelf(numsKExcept)));
        System.out.println(isValidSudoku(boardTwo));

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
                return new int[]{map.get(complement), index};
            }

            // Store the current value and its index
            map.put(n, index);
            index++;
        }

        // In case no solution is found, though this shouldn't happen per the problem guarantees
        throw new IllegalArgumentException("No two sum solution");
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        String[] sortedStrs = new String[strs.length];
        List<List<String>> finalList = new ArrayList<>(Collections.emptyList());
        for (int i = 0; i < strs.length; i++) {
            char[] chars = strs[i].toCharArray();
            Arrays.sort(chars);
            String sortedStr = new String(chars);
            sortedStrs[i] = sortedStr;
        }

        HashMap<String, List<String>> mapOfAnagrams = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {
            if (mapOfAnagrams.containsKey(sortedStrs[i])) {
                mapOfAnagrams.get(sortedStrs[i]).add(strs[i]);
            }

            if (!mapOfAnagrams.containsKey(sortedStrs[i])) {
                mapOfAnagrams.put(sortedStrs[i], new ArrayList<>());
                mapOfAnagrams.get(sortedStrs[i]).add(strs[i]);
            }

        }
        finalList.addAll(mapOfAnagrams.values());


        return finalList;
    }

    public static int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int num : nums) {
            hashMap.put(num, hashMap.getOrDefault(num, 0) + 1);
        }
        List<int[]> values = new ArrayList<>();  // Initialize list to store the keys\

        for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
            values.add(new int[]{entry.getValue(), entry.getKey()});
        }

        values.sort((a, b) -> b[0] - a[0]);

        int[] topKElements = new int[k]; // Initialize an array to store the top k elements.

        for (int i = 0; i < k; i++) {
            topKElements[i] = values.get(i)[1]; // Get the key (which is at index 1 of the int[] array).
        }

        return topKElements;
    }

    public static String encode(List<String> strs) {
        StringBuilder encodedString = new StringBuilder();
        for (String str : strs) {
            encodedString.append(str.length()).append("#").append(str);
        }
        return encodedString.toString();
    }

    public static List<String> decode(String str) {
        int i = 0;
        List<String> decoded = new ArrayList<>();
        while (i < str.length()) {
            int j = i;
            while (str.charAt(j) != '#') j++;

            int length = Integer.parseInt(str.substring(i, j));
            i = j + 1 + length;
            decoded.add(str.substring(j + 1, i));
        }
        return decoded;
    }


    public static int[] productExceptSelf(int[] nums) {
        int[] listProduct = new int[nums.length];

        int runningProduct = 1;
        for (int i = 0; i < nums.length; i++) {
            listProduct[i] = runningProduct; // Set the value for the current index
            runningProduct *= nums[i];  // Update running product with the current valu
        }

        System.out.println("PREFIX DONE" + Arrays.toString(listProduct));
        runningProduct = 1;
        for (int i = listProduct.length - 1; i >= 0; i--) {
            listProduct[i] *= runningProduct;
            runningProduct *= nums[i];
        }
        System.out.println("SUFFIX DONE" + Arrays.toString(listProduct));

        return listProduct;
    }

    public static boolean isValidSudokuSaid(char[][] board) {
        HashMap<Integer, List<Character>> mapOfThree = new HashMap<>();

        for (int i = 0; i <= board.length - 1; i++) {
            System.out.println();
            for (int j = 0; j <= board[i].length - 1; j++) {
                switch (i) {
                    case 0, 1, 2: {
                        switch (j) {
                            case 0, 1, 2: {
                                List<Character> list = mapOfThree.computeIfAbsent(1, k -> new ArrayList<>());
                                list.add(board[i][j]);
                                break;
                            }
                            case 3, 4, 5: {
                                List<Character> list = mapOfThree.computeIfAbsent(2, k -> new ArrayList<>());
                                list.add(board[i][j]);
                                break;
                            }
                            case 6, 7, 8: {
                                List<Character> list = mapOfThree.computeIfAbsent(3, k -> new ArrayList<>());
                                list.add(board[i][j]);
                                break;
                            }
                        }
                        break;
                    }
                    case 3, 4, 5: {
                        switch (j) {
                            case 0, 1, 2: {
                                List<Character> list = mapOfThree.computeIfAbsent(4, k -> new ArrayList<>());
                                list.add(board[i][j]);
                                break;
                            }
                            case 3, 4, 5: {
                                List<Character> list = mapOfThree.computeIfAbsent(5, k -> new ArrayList<>());
                                list.add(board[i][j]);
                                break;
                            }
                            case 6, 7, 8: {
                                List<Character> list = mapOfThree.computeIfAbsent(6, k -> new ArrayList<>());
                                list.add(board[i][j]);
                                break;
                            }
                        }
                        break;
                    }
                    case 6, 7, 8: {
                        switch (j) {
                            case 0, 1, 2: {
                                List<Character> list = mapOfThree.computeIfAbsent(7, k -> new ArrayList<>());
                                list.add(board[i][j]);
                                break;
                            }
                            case 3, 4, 5: {
                                List<Character> list = mapOfThree.computeIfAbsent(8, k -> new ArrayList<>());
                                list.add(board[i][j]);
                                break;
                            }
                            case 6, 7, 8: {
                                List<Character> list = mapOfThree.computeIfAbsent(9, k -> new ArrayList<>());
                                list.add(board[i][j]);
                                break;
                            }
                        }
                        break;
                    }
                }
            }
        }

        for (HashMap.Entry<Integer, List<Character>> entry : mapOfThree.entrySet()) {
            List<Character> list = entry.getValue();

            HashSet<Character> seenValues = new HashSet<>(); // Track seen values within the current box

            // Iterate over each character in the current box
            for (Character value : list) {
                // Ignore empty cells represented by '.'
                if (value == '.') {
                    continue;
                }

                if (seenValues.contains(value)) {
                    // Duplicate found within the current box
                    return false; // Return false if a duplicate is found
                } else {
                    // Add this value to the seen set
                    seenValues.add(value);
                }
            }
        }
        printMapThreeByThree(mapOfThree);
        return true;
    }

    public static boolean isValidSudoku(char[][] board) {

        for (int i = 0; i < 9; i++) {
            Set<Character> rowSet = new HashSet<>();
            Set<Character> colSet = new HashSet<>();

            for (int j = 0; j < 9; j++) {
                char rowChar = board[i][j];
                if (rowChar != '.') {
                    if (rowSet.contains(rowChar)) {
                        return false;
                    } else {
                        rowSet.add(rowChar);
                    }
                }

                char colChar = board[j][i];
                if (colChar != '.') {
                    if (colSet.contains(colChar)) {
                        return false;
                    } else {
                        colSet.add(colChar);
                    }
                }
            }
        }

        HashMap<Integer, List<Character>> mapOfThree = new HashMap<>();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                int boxKey = (i / 3) * 3 + (j / 3) + 1;

                List<Character> list = mapOfThree.computeIfAbsent(boxKey, k -> new ArrayList<>());
                list.add(board[i][j]);
            }
        }
        for (Map.Entry<Integer, List<Character>> entry : mapOfThree.entrySet()) {
            List<Character> list = entry.getValue();

            HashSet<Character> seenValues = new HashSet<>();
            for (Character value : list) {
                if (value == '.') {continue;}
                if (seenValues.contains(value)) {
                    return false;
                } else {
                    seenValues.add(value);
                }
            }
        }
        return true;
    }


    public static void printMapThreeByThree(HashMap<Integer, List<Character>> hashMap) {
        for (Map.Entry<Integer, List<Character>> entry : hashMap.entrySet()) {
            Integer key = entry.getKey();
            List<Character> list = entry.getValue();

            System.out.println("Box Key: " + key);
            int count = 0;
            for (Character charArray : list) {
                System.out.print(Arrays.toString(charArray.toString().toCharArray()) + " ");
                count++;
                if (count % 3 == 0) {
                    System.out.println(); // New line after every 3 elements to create a 3x3 format
                }
            }
            System.out.println("\n----------------------");
        }
    }
}
