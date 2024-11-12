import java.util.*;

public class Main {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 6, 5, 3};
        int[] numsDuplicateSorted = {1, 2, 3, 4, 5, 5, 5, 6, 7, 8, 8};
        int[] numsSorted = {2, 3, 4};
        int[] numsKExcept = {1, 2, 4, 6};
        int[] threeSumsArray = {-1, 0, 1, 2, -1, -4};
        int[] numsSortedTobe = {9, 1, 4, 7, 3, -1, 0, 5, 8, -1, 6}; //0,3,2,5,4,6,1,1
        int[] heights = {1, 7, 2, 5, 4, 7, 3, 6};
        int[] height = {0, 2, 0, 3, 1, 0, 1, 3, 2, 1};
        int[] prices = {7, 1, 5, 3, 6, 4};
        int[] nums1 = {2, 0};
        int n = 1;
        int[] nums2 = {1};
        int m = 1;
        String longestSubString = "c";
        String characterReplacement = "AABABBA";
        String sOne = "ab";
        String sTwo = "eidbaooo";
        String isValidString = "([{}])";
        String romanString = "MCMXCIV";
        String isPalindrome = "Was it a car or a cat I saw?";
        String isPalindromeTwo = "tab a cat";
        String isPalindromeThree = "0P";
        String haycat = "a";
        String needle = "a";
        char[][] board = {{'1', '2', '.', '.', '3', '.', '.', '.', '.'}, {'4', '.', '.', '5', '.', '.', '.', '.', '.'}, {'.', '9', '1', '.', '.', '.', '.', '.', '3'}, {'5', '.', '.', '.', '6', '.', '.', '.', '4'}, {'.', '.', '.', '8', '.', '3', '.', '.', '5'}, {'7', '.', '.', '.', '2', '.', '.', '.', '6'}, {'.', '.', '.', '.', '.', '.', '2', '.', '.'}, {'.', '.', '.', '4', '1', '9', '.', '.', '8'}, {'.', '.', '.', '.', '8', '.', '.', '7', '9'}};

        char[][] boardTwo = {{'.', '.', '4', '.', '.', '.', '6', '3', '.'}, {'.', '.', '.', '.', '.', '.', '.', '.', '.'}, {'5', '.', '.', '.', '.', '.', '.', '9', '.'}, {'.', '.', '.', '5', '6', '.', '.', '.', '.'}, {'4', '.', '3', '.', '.', '.', '.', '.', '1'}, {'.', '.', '.', '7', '.', '.', '.', '.', '.'}, {'.', '.', '.', '5', '.', '.', '.', '.', '.'}, {'.', '.', '.', '.', '.', '.', '.', '.', '.'}, {'.', '.', '.', '.', '.', '.', '.', '.', '.'}};
        int target = 0;
        String[] strs = {"act", "pots", "tops", "cat", "stop", "hat"};
        String stringOne = "racecar";
        String stringTwo = "carrace";
        String[] longestPrefix = {"flower", "flow", "flight"};
        Utils.ListNode listOne = new Utils.ListNode(1);
        listOne.next = new Utils.ListNode(2);
        listOne.next.next = new Utils.ListNode(3);
        listOne.next.next.next = new Utils.ListNode(4);
        listOne.next.next.next.next = new Utils.ListNode(4);
        listOne.next.next.next.next.next = new Utils.ListNode(5);
        listOne.next.next.next.next.next = new Utils.ListNode(5);
        Utils.ListNode listTwo = new Utils.ListNode(6);
        listTwo.next = new Utils.ListNode(7);
        listTwo.next.next = new Utils.ListNode(8);
        listTwo.next.next.next = new Utils.ListNode(9);
        listTwo.next.next.next.next = new Utils.ListNode(10);
        Utils.ListNode listThree = new Utils.ListNode(1);
        listThree.next = new Utils.ListNode(1);
        listThree.next.next = new Utils.ListNode(2);
        Utils.ListNode head = new Utils.ListNode(1);
        head.next = new Utils.ListNode(1);
        head.next.next = new Utils.ListNode(2);
        head.next.next.next = new Utils.ListNode(3);
        head.next.next.next.next = new Utils.ListNode(3);
        Utils.ListNode headTwo = new Utils.ListNode(0);
        head.next = new Utils.ListNode(0);
        head.next.next = new Utils.ListNode(0);
        head.next.next.next = new Utils.ListNode(0);
        head.next.next.next.next = new Utils.ListNode(3);
        String s = "ADOBECODEBANC";
        String t = "ABC";
        Utils.TreeNode root = new Utils.TreeNode(1);
        root.right = new Utils.TreeNode(2);
        root.right.left = new Utils.TreeNode(3);
        String[] tempOperators = {"1","2","+","3","*","4","-"};
//        int[] nums1 = {1, 2, 2, 3, 3, 3};
//        int k1 = 2;
//        System.out.println(Arrays.toString(topKFrequent(nums1, k1))); // Replace 'yourMethodName' with your function name
//
//        // Example 2
//        int[] nums2 = {1, 1, 1, 2, 2, 3};
//        int k2 = 1;
//        System.out.println(Arrays.toString(topKFrequent(nums2, k2)));
//
//        // Example 3
//        int[] nums3 = {7, 7, 8, 8, 8, 9};
//        int k3 = 2;
//        System.out.println(Arrays.toString(topKFrequent(nums3, k3)));
//
//        int[] nums4 = {1, 2, 2, 3, 3, 3};
//        int k4 = 2;
//        System.out.println(Arrays.toString(topKFrequent(nums4, k4)));
//
//        int[] nums5 = {1, 2};
//        int k5 = 2;
//        System.out.println(Arrays.toString(topKFrequent(nums5, k5)));
//
//        List<String> strs1 = Arrays.asList("hello", "world", "");
//        String encoded = encode(strs1);
//        System.out.println("Encoded: " + encoded);
//        List<String> decoded = decode(encoded);
//        System.out.println("Decoded: " + decoded);
//
//        System.out.println(isAnagram(stringOne, stringTwo));
////        System.out.println(Arrays.toString(twoSum(nums, target)));
//        System.out.println(groupAnagrams(strs));
//
//        System.out.println(Arrays.toString(productExceptSelf(numsKExcept)));
//        System.out.println(isValidSudoku(boardTwo));
//        System.out.println(longestConsecutive(numsSorted));
//        System.out.println(isPalindrome(isPalindromeThree));
//
//
//        System.out.println(Arrays.toString(twoSum(nums, target)));
//        System.out.println(threeSum(threeSumsArray));
//        System.out.println(maxArea(heights));
//        System.out.println(trap(height));
//        System.out.println(maxProfit(prices));
//        System.out.println(lengthOfLongestSubstring(longestSubString));
//        System.out.println(characterReplacement(characterReplacement, 1));
//        System.out.println(checkInclusion(sOne, sTwo));
//        System.out.println(isValid(isValidString));
//        System.out.println(romanToInt(romanString));
//        System.out.println(longestCommonPrefix(longestPrefix));
//        System.out.println(mergeTwoLists(listOne, listTwo));
//        System.out.println(removeDuplicates(numsDuplicateSorted));
//        System.out.println(removeElement(numsDuplicateSorted));
//        System.out.println(addBinary("1010", "1011"));
//        System.out.println(climbStairs(5));
//        System.out.println(deleteDuplicates(headTwo));
//        System.out.println(minWindow(s, t));
//        merge(nums1, n, nums2, m);
        System.out.println(inorderTraversal(root));
        System.out.println(evalRPN(tempOperators));
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

//    public static int[] twoSum(int[] nums, int target) {
//        HashMap<Integer, Integer> map = new HashMap<>();
//        int index = 0;
//
//        for (int n : nums) {
//            int complement = target - n;
//
//            // If the complement exists in the map, return both indices
//            if (map.containsKey(complement)) {
//                return new int[]{map.get(complement), index};
//            }
//
//            // Store the current value and its index
//            map.put(n, index);
//            index++;
//        }
//
//        // In case no solution is found, though this shouldn't happen per the problem guarantees
//        throw new IllegalArgumentException("No two sum solution");
//    }

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
            if (i != 0) {
                int multipliedValue = nums[i] * listProduct[i - 1];
                listProduct[i] = multipliedValue;
            } else {
                listProduct[i] = nums[i];
            }
            System.out.println("PREFIX LOOP" + Arrays.toString(listProduct));

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
                if (value == '.') {
                    continue;
                }
                if (seenValues.contains(value)) {
                    return false;
                } else {
                    seenValues.add(value);
                }
            }
        }
        return true;
    }

    public static int longestConsecutive(int[] sums) {
        if (sums.length == 0) return 0;
        int consSeq = 1;
        int maxSeq = 1;
        int[] sortedSums = Arrays.stream(sums).sorted().toArray();

        System.out.println(Arrays.toString(sortedSums));
        for (int i = 1; i < sortedSums.length; i++) {
            if (sortedSums[i - 1] == sortedSums[i]) {
                continue;
            }
            if (Math.abs(sortedSums[i - 1] - sortedSums[i]) == 1) {
                consSeq++;
            } else {
                maxSeq = Math.max(maxSeq, consSeq);
                consSeq = 1;
            }
        }

        return Math.max(maxSeq, consSeq);
    }


    public static boolean isPalindrome(String s) {
        String loweredCase = s.toLowerCase().replaceAll("[^[a-zA-Z0-9]*$]", "");
        System.out.println(loweredCase);
        int left = 0;
        int right = loweredCase.length() - 1;
        while (left <= right) {
            if (loweredCase.charAt(left) == loweredCase.charAt(right)) {
                left++;
                right--;
            } else {
                return false;
            }
        }
        return true;
    }

    public boolean isPalindromeInt(int x) {
        String convertedX = String.valueOf(x);
        int i = 0;
        int j = convertedX.length() - 1;
        while (i < j) {
            int left = convertedX.charAt(i);
            int right = convertedX.charAt(j);
            if (left == right) {
                i++;
                j--;
            } else {
                return false;
            }
        }
        return true;
    }

    public static int romanToInt(String s) {
        int romanInt = 0;
        HashMap<String, Integer> map = new HashMap<>();
        map.put("I", 1);
        map.put("V", 5);
        map.put("X", 10);
        map.put("L", 50);
        map.put("C", 100);
        map.put("D", 500);
        map.put("M", 1000);
        map.put("IV", 4);
        map.put("IX", 9);
        map.put("XL", 40);
        map.put("XC", 90);
        map.put("CD", 400);
        map.put("CM", 900);

        for (int i = s.length() - 1; i >= 0; i--) {
            if (i > 0) {
                String key = "" + s.charAt(i - 1) + s.charAt(i); // Combine two characters, starting from right to left
                if (map.containsKey(key)) {
                    romanInt += map.get(key);
                    i--; // Skip the previous character since we've already processed it as a two-character combination
                    continue;
                }
            }
            romanInt += map.get(String.valueOf(s.charAt(i)));
        }
        return romanInt;
    }

    public static int[] twoSum(int[] numbers, int target) {
        //Leet code version is left <= right neet code left != right
        int[] twoSum = new int[2];
        int i = 0;
        int j = 1;
        int left = numbers[i];
        int right = numbers[numbers.length - j];
        while (left != right) {
            if (numbers[i] + numbers[numbers.length - j] == target) {
                twoSum[0] = i + 1;
                twoSum[1] = numbers.length - j + 1;
                break;
            }
            if (numbers[i] + numbers[numbers.length - j] < target) {
                i++;
                left = numbers[i];
            } else if (numbers[i] + numbers[numbers.length - j] > target) {
                j++;
                right = numbers[numbers.length - j];
            }
        }
        return twoSum;
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> threeSum = new ArrayList<>();
        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            int j = i + 1;
            int k = nums.length - 1;
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum == 0) {
                    List<Integer> newList = Arrays.asList(nums[i], nums[j], nums[k]);
                    threeSum.add(newList);
                    j++;
                    k--;
                    while (j < k && nums[j] == nums[j - 1]) j++;
                    while (j < k && nums[k] == nums[k + 1]) k--;
                } else if (sum < 0) j++;
                else k--;
            }
        }
        return threeSum;
    }

    public static int maxArea(int[] heights) {
        int i = 0;
        int j = heights.length - 1;
        int biggestArea = 0;
        while (i < j) {
            int left = heights[i];
            int right = heights[j];
            int area = (j - i) * (Math.min(left, right));
            biggestArea = Math.max(biggestArea, area);
            if (left > right) {
                j--;
            } else {
                i++;
            }
        }
        return biggestArea;
    }

    public static int trap(int[] height) {
        int i = 0;
        int j = height.length - 1;
        int trap = 0;
        int maxHeightLeft = height[i];
        int maxHeightRight = height[j];
        while (i < j) {
            int left = height[i];
            int right = height[j];

            if (left < right) {
                maxHeightLeft = Math.max(left, maxHeightLeft);
                i++;
            }
            if (right <= left) {
                maxHeightRight = Math.max(right, maxHeightRight);
                j--;
            }
            if (maxHeightLeft > left) trap += maxHeightLeft - left;
            if (maxHeightRight > right) trap += maxHeightRight - right;
        }
        return trap;
    }

    public static int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) {
            return 0;
        }
        int profit = 0;
        int buy = prices[0];
        for (int i = 1; i < prices.length; i++) {
            int averageProfit = prices[i] - buy;
            if (averageProfit > profit) profit = averageProfit;
            else buy += Math.min(buy, prices[i]);
        }

        return profit;
    }

    public static int lengthOfLongestSubstring(String s) {
        if (s == null) {
            return 0;
        }

        int left = 0;
        int maxLength = 0;
        HashSet<Character> uniqueChars = new HashSet<>();

        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);

            while (uniqueChars.contains(currentChar)) {
                uniqueChars.remove(s.charAt(left));
                left++;
            }

            uniqueChars.add(currentChar);
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }

    public static int characterReplacement(String s, int k) {
        if (s == null) {
            return 0;
        }

        int left = 0;
        int maxFrequency = 0;
        int maxLength = k;
        HashMap<Character, Integer> charCount = new HashMap<>();
        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);
            charCount.put(currentChar, charCount.getOrDefault(currentChar, 0) + 1);
            maxFrequency = Math.max(maxFrequency, charCount.get(currentChar));
            int windowLength = right - left + 1;
            while (windowLength - maxFrequency > k) {
                char charAtLeft = s.charAt(left);
                charCount.put(charAtLeft, charCount.get(charAtLeft) - 1);
                left++;
                windowLength = right - left + 1;
            }
            maxLength = Math.max(maxLength, windowLength);
        }
        return maxLength;
    }

    public static boolean checkInclusion(String s1, String s2) {
        if (s1 == null || s2 == null || s1.length() > s2.length()) return false;

        HashMap<Character, Integer> sOneCharacters = new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            sOneCharacters.put(s1.charAt(i), sOneCharacters.getOrDefault(s1.charAt(i), 0) + 1);
        }

        int left = 0;
        HashMap<Character, Integer> charCount = new HashMap<>();
        for (int right = 0; right < s2.length(); right++) {
            char character = s2.charAt(right);
            charCount.put(character, charCount.getOrDefault(character, 0) + 1);


            if (right - left + 1 > s1.length()) {
                char charAtLeft = s2.charAt(left);
                charCount.put(charAtLeft, charCount.get(charAtLeft) - 1);
                if (charCount.get(charAtLeft) == 0) {
                    charCount.remove(charAtLeft);
                }
                left++;
            }
            if (right - left + 1 == s1.length() && sOneCharacters.equals(charCount)) return true;

        }
        return false;
    }

    public static boolean isValid(String s) {
        if (s == null) return false;
        if (s.isBlank()) return true;

        HashMap<Character, Character> bracketsMap = new HashMap<>();
        bracketsMap.put(')', '(');
        bracketsMap.put('}', '{');
        bracketsMap.put(']', '[');

        Stack<Character> isValid = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (isValid.isEmpty()) {
                isValid.add(s.charAt(i));
                continue;
            }
            if (isValid.lastElement() == bracketsMap.get(s.charAt(i))) {
                isValid.pop();
            } else {
                isValid.add(s.charAt(i));
            }
        }

        return isValid.isEmpty();
    }

    public static String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];
        int i = 1;
        while (i < strs.length) {
            if (strs[i].startsWith(prefix)) {
                i++;
            } else {
                prefix = prefix.substring(0, prefix.length() - 1);
                i = 1;
            }
        }
        return prefix;
    }

    public static Utils.ListNode mergeTwoLists(Utils.ListNode list1, Utils.ListNode list2) {
        if (list1 == null) return list2;
        if (list2 == null) return list1;
        Utils.ListNode finalSortedList = new Utils.ListNode();
        Utils.ListNode lastNext = new Utils.ListNode();

        while (list1 != null || list2 != null) {
            if (list1 == null) {
                lastNext.next = new Utils.ListNode(list2.val);
                list2 = list2.next;
                if (finalSortedList.next == null) finalSortedList = lastNext.next;
                lastNext = lastNext.next;
                continue;
            }
            if (list2 == null) {
                lastNext.next = new Utils.ListNode(list1.val);
                list1 = list1.next;
                if (finalSortedList.next == null) finalSortedList = lastNext.next;
                lastNext = lastNext.next;
                continue;
            }
            if (list1.val > list2.val) {
                lastNext.next = new Utils.ListNode(list2.val);
                list2 = list2.next;
                if (finalSortedList.next == null) finalSortedList = lastNext.next;
                lastNext = lastNext.next;

            } else {
                lastNext.next = new Utils.ListNode(list1.val);
                list1 = list1.next;
                if (finalSortedList.next == null) finalSortedList = lastNext.next;
                lastNext = lastNext.next;
            }
        }
        return finalSortedList;
    }

    public static int removeDuplicates(int[] nums) {
        if (nums == null) return 0;
        ArrayList<Integer> countWithoutDuplicate = new ArrayList<>();
        countWithoutDuplicate.add(nums[0]);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) continue;
            countWithoutDuplicate.add(nums[i]);
        }


        for (int i = 0; i < countWithoutDuplicate.size(); i++) {
            nums[i] = countWithoutDuplicate.get(i);
        }

        return countWithoutDuplicate.size();
    }

    public static int removeElement(int[] nums, int val) {
        if (nums == null) return 0;
        ArrayList<Integer> addNoneVal = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) addNoneVal.add(nums[i]);
        }
        for (int i = 0; i < addNoneVal.size(); i++) {
            nums[i] = addNoneVal.get(i);
        }

        return nums.length;
    }

    public static int strStr(String haystack, String needle) {
        if (haystack == null) return -1;
        if (needle == null) return 0;
        int m = haystack.length();
        int n = needle.length();
        for (int i = 0; i <= m - n; i++) {
            if (haystack.substring(i, i + n).equals(needle))
                return i;
        }
        return -1;
    }

    public static int searchInsert(int[] nums, int target) {
        if (nums == null) return 0;
        int i = 0;
        int j = nums.length - 1;
        while (i < j) {
            if (nums[(i + j) / 2] == target) return (i + j) / 2;
            if (nums[(i + j) / 2] > target) {
                j--;
            } else {
                i++;
            }
        }
        if (nums[i] > target) return i - 1;
        else return i + 1;
    }

    public static int lengthOfLastWord(String s) {
        if (s == null) return 0;
        if (s.length() == 1 && s.charAt(0) != ' ') return 1;
        int lastWorldLength = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ') {
                if (lastWorldLength > 0) break;
                continue;
            } else {
                lastWorldLength++;
            }
        }
        return lastWorldLength;
    }

    public static int[] plusOne(int[] digits) {
        if (digits == null) return new int[0];
        int[] newPlusOne = new int[digits.length + 1];
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i] = digits[i] + 1;
                return digits;
            }
            digits[i] = 0;
        }
        newPlusOne[0] = 1;
        for (int i = 1; i < newPlusOne.length; i++) {
            newPlusOne[i] = 0;
        }
        return newPlusOne;
    }

    public static String addBinary(String a, String b) {
        if (a == null && b == null) return "0";
        if (a == null) return b;
        if (b == null) return a;

        StringBuilder binaryNewValue = new StringBuilder();
        int lengthA = a.length() - 1;
        int lengthB = b.length() - 1;
        char carry = '0';

        while (lengthA >= 0 || lengthB >= 0) {
            int bitA = (lengthA >= 0) ? a.charAt(lengthA) - '0' : 0;
            int bitB = (lengthB >= 0) ? b.charAt(lengthB) - '0' : 0;
            int sum = bitA + bitB + (carry - '0');

            binaryNewValue.append(sum % 2);
            carry = (sum / 2) == 1 ? '1' : '0';

            lengthA--;
            lengthB--;
        }

        if (carry == '1') binaryNewValue.append('1');


        binaryNewValue.reverse();
        return binaryNewValue.toString();
    }

    public static int mySqrt(int x) {
        return (int) Math.sqrt(x);
    }

    public static int climbStairs(int n) {
        if (n == 0) return 1;
        if (n == 1) return 1;

        int prev1 = 1;
        int prev2 = 1;

        for (int i = 2; i <= n; i++) {
            int current = prev1 + prev2;
            prev2 = prev1;
            prev1 = current;
        }

        return prev1;
    }

    public static Utils.ListNode deleteDuplicates(Utils.ListNode head) {
        if (head == null) return null;
        Utils.ListNode finalSortedList = new Utils.ListNode(head.val);
        Utils.ListNode lastNext = finalSortedList;
        head = head.next;

        while (head != null) {
            if (finalSortedList.val != head.val) {
                lastNext.next = new Utils.ListNode(head.val);
                head = head.next;
                if (finalSortedList.next == null) finalSortedList = lastNext.next;
                lastNext = lastNext.next;
            } else head = head.next;
            System.out.println(finalSortedList.val);
        }

        return finalSortedList;
    }

    public static String minWindow(String s, String t) {
        if (s == null) return t;
        if (t == null) return "";
        if (t.length() > s.length()) return "";

        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (Character character : t.toCharArray()) {
            hashMap.put(character, hashMap.getOrDefault(character, 0) + 1);
        }

        int left = 0;
        int formed = 0;
        int required = hashMap.size();
        int minLength = Integer.MAX_VALUE;
        int minLeft = 0;

        HashMap<Character, Integer> charCount = new HashMap<>();
        for (int right = 0; right < s.length(); right++) {
            char charAtRight = s.charAt(right);
            charCount.put(charAtRight, charCount.getOrDefault(charAtRight, 0) + 1);
            if (hashMap.containsKey(charAtRight) && charCount.get(charAtRight).intValue() == hashMap.get(charAtRight).intValue())
                formed++;
            while (formed == required) {
                int windowLength = right - left + 1;
                if (windowLength < minLength) {
                    minLength = windowLength;
                    minLeft = left;
                }
                char charAtLeft = s.charAt(left);
                if (charCount.containsKey(charAtLeft)) {
                    charCount.put(charAtLeft, charCount.get(charAtLeft) - 1);
                    if (hashMap.containsKey(charAtLeft) && charCount.get(charAtLeft).intValue() < hashMap.get(charAtLeft).intValue())
                        formed--;
                    if (charCount.get(charAtLeft) == 0) charCount.remove(charAtLeft);
                }
                left++;
            }
        }

        return minLength == Integer.MAX_VALUE ? "" : s.substring(minLeft, minLeft + minLength);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        if (n == 0) return;
        if (m == 0) {
            System.arraycopy(nums2, 0, nums1, 0, nums2.length);
            return;
        }

        int p1 = m - 1;
        int p2 = n - 1;
        int p = m + n - 1;

        while (p1 >= 0 && p2 >= 0) {
            if (nums1[p1] >= nums2[p2]) {
                nums1[p] = nums1[p1];
                p1--;
            } else {
                nums1[p] = nums2[p2];
                p2--;
            }
            p--;
        }

        while (p2 >= 0) {
            nums1[p] = nums2[p2];
            p2--;
            p--;
        }
    }

    public static List<Integer> inorderTraversal(Utils.TreeNode root) {
        if (root == null) return Collections.emptyList();
        if (root.val == 1 && root.right == null && root.left == null) return List.of(1);
        List<Integer> inOrderList = new ArrayList<>();
        Utils.TreeNode left = root.left;
        Utils.TreeNode right = root.right;
        Utils.TreeNode pointer = root;
        while (root != null) {
            pointer = left;
            if (left == null) {
                pointer = right;
                if (right == null) {
                    inOrderList.add(root.val);
                    break;
                } else {
                    right = right.right;
                }
            } else {
                left = left.left;
            }
        }
        return inOrderList;
    }

    public static int evalRPN(String[] tokens) {
        if (tokens == null) return 0;
        HashSet<String> operatorsSet = new HashSet<>();
        operatorsSet.add("+");
        operatorsSet.add("-");
        operatorsSet.add("*");
        operatorsSet.add("/");

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < tokens.length; i++) {
            if (!operatorsSet.contains(tokens[i])) {
                stack.push(Integer.valueOf(tokens[i]));
            } else {
                int firstNum = stack.pop();
                int secondNum = stack.pop();
               int updatedVal = 0;
                switch (tokens[i]) {
                    case "+" -> {
                        updatedVal =  firstNum + secondNum;
                        break;
                    }
                    case "-" -> {
                        updatedVal = secondNum - firstNum;
                        break;
                    }
                    case "*" -> {
                        updatedVal = firstNum * secondNum;
                        break;
                    }
                    case "/" -> {
                        updatedVal = firstNum / secondNum;
                        break;
                    }
                };
                stack.push(updatedVal);
            }
        }
        return stack.peek();
    }
}