import kotlin.Pair;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 6, 5, 3};
        int[] numsDuplicateSorted = {1, 1, 2, 2, 3, 3, 4, 5, 5, 5, 6, 6, 7, 8, 8};
        int[] numsSorted = {2, 3, 4};
        int[] numsKExcept = {1, 2, 4, 6};
        int[] threeSumsArray = {-1, 0, 1, 2, -1, -4};
        int[] numsSortedTobe = {9, 1, 4, 7, 3, -1, 0, 5, 8, -1, 6}; //0,3,2,5,4,6,1,1
        int[] heights = {1, 7, 2, 5, 4, 7, 3, 6};
        int[] height = {0, 2, 0, 3, 1, 0, 1, 3, 2, 1};
        int[] prices = {7, 1, 5, 3, 6, 4};
        int[] dailyTempValues = {73, 74, 75, 71, 69, 72, 76, 73};
        int[] sorted = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[][] matrix = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        int[] nums1 = {2, 0};
        int[] bananas = {25, 10, 23, 4};
        int[] rotatedSorted = {4, 5, 6, 7};
        int[] rotatedSortedTwo = {5, 1, 2, 3, 4};
        int[] rotatedSortedThree = {3, 4, 5, 1, 2};
        int[] peakElementArray = {3, 4, 3, 2, 1};
        int[] findDuplicate = {4, 3, 1, 4, 2};
        int[] nums1Median = {2,2,4,4};
        int[] nums2Median = {2,2,2,4,4};
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
        String[] tempOperators = {"1", "2", "+", "3", "*", "4", "-"};
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
//        System.out.println(inorderTraversal(root));
//        System.out.println(evalRPN(tempOperators));
//        System.out.println(Arrays.toString(dailyTemperatures(dailyTempValues)));
//        System.out.println(Arrays.toString(carFleet()));
//        System.out.println(search(new int[]{-1, 0, 5}, -1));
//        System.out.println(countAndSay(5));
//        System.out.println(findMaximumTask(new int[]{1, 2, 2, 1, 3, 1, 3}, 2));
//        System.out.println(recursiveBinarySearch(sorted, 10, 0, sorted.length - 1));
//        System.out.println(searchMatrix(matrix, 2));
//        System.out.println(lowerBound(sorted, 6, sorted.length));
//        System.out.println(upperBound(sorted, 2, sorted.length));
//        System.out.println(Arrays.toString(firstandlastoccurence(numsDuplicateSorted, 5)));
//        System.out.println(Arrays.toString(firstAndLastOccurence(numsDuplicateSorted, 5)));
//        System.out.println(minEatingSpeed(bananas, 4));
//        System.out.println(findMin(rotatedSorted));
//        System.out.println(search(rotatedSortedTwo, 1));
//        System.out.println(findHowMuchArrayBeenRotated(rotatedSortedThree));
//        System.out.println(singleNonDuplicate(numsDuplicateSorted));
//        System.out.println(findPeakElement(peakElementArray));
//        System.out.println(findSqrt(36));
//        System.out.println(findDuplicate(findDuplicate));
        System.out.println(findMedianSortedArrays(nums1Median,nums2Median));

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
            if (haystack.substring(i, i + n).equals(needle)) return i;
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
                        updatedVal = firstNum + secondNum;
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
                }
                ;
                stack.push(updatedVal);
            }
        }
        return stack.peek();
    }

    public static int[] maxSlidingWindow(int[] nums, int k) {
        if (nums == null || k <= 0) {
            return new int[0];
        }
        int left;
        Deque<Integer> deque = new ArrayDeque<>();
        int[] result = new int[nums.length - k + 1];
        int resultIndex = 0;
        for (int right = 0; right < nums.length; right++) {
            left = right - k + 1;
            if (!deque.isEmpty() && deque.peekFirst() < left) {
                deque.removeFirst();
            }
            while (!deque.isEmpty() && nums[deque.getLast()] <= nums[right]) {
                deque.removeLast();
            }
            deque.addLast(right);
            if (right >= k - 1 && !deque.isEmpty()) result[resultIndex++] = nums[deque.getFirst()];

        }
        return result;
    }

    public static List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        backTrack(result, new StringBuilder(), 0, 0, n);
        return result;
    }

    public static void backTrack(List<String> answer, StringBuilder oneAnswer, int open, int close, int n) {
        if (open == n && close == n) {
            answer.add(oneAnswer.toString());
            return;
        }
        if (open < n) {
            oneAnswer.append('(');
            backTrack(answer, oneAnswer, open + 1, close, n);
            oneAnswer.deleteCharAt(oneAnswer.length() - 1);
        }
        if (close < open) {
            oneAnswer.append(')');
            backTrack(answer, oneAnswer, open, close + 1, n);
            oneAnswer.deleteCharAt(oneAnswer.length() - 1);
        }
    }


    public static int[] dailyTemperatures(int[] temperatures) {
        if (temperatures.length == 0 || temperatures.length == 1) return null;
        ArrayList<Integer> result = new ArrayList<>();
        Stack<Integer> tempStack = new Stack<>();
        int countDays = 0;
        int right;
        for (int i = 0; i <= temperatures.length - 1; i++) {
            int value = temperatures[i];
            right = i;
            if (tempStack.isEmpty()) {
                tempStack.push(value);
                while (tempStack.peek() >= temperatures[right] && right < temperatures.length - 1) {
                    right++;
                    countDays++;
                }
                if (tempStack.peek() < temperatures[right]) {
                    result.add(countDays);
                    countDays = 0;
                    tempStack.pop();
                } else {
                    result.add(0);
                    countDays = 0;
                    if (!tempStack.isEmpty()) tempStack.pop();

                }
            }
        }
        int[] finalR = new int[result.size()];

        for (int i = 0; i < result.size(); i++) {
            finalR[i] = result.get(i);
        }
        return finalR;

        /**
         *
         * OPTIMIZED
         int[] result = new int[temperatures.length];
         Deque<Integer> stack = new ArrayDeque<>();

         for (int i = 0; i < temperatures.length; i++) {
         while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
         int index = stack.pop();
         result[index] = i - index;
         }
         stack.push(i);
         }

         return result;
         *
         * **/
    }

    public static int carFleet(int target, int[] position, int[] speed) {
        int n = position.length;
        if (n == 0) return 0;
        int[][] pair = new int[n][2];
        for (int i = 0; i < n; i++) {
            pair[i][0] = position[i];
            pair[i][1] = speed[i];
        }
        Arrays.sort(pair, (a, b) -> Integer.compare(b[0], a[0]));
        Stack<Double> stack = new Stack<>();
        for (int[] p : pair) {
            stack.push((double) (target - p[0]) / p[1]);
            if (stack.size() >= 2 && stack.peek() <= stack.get(stack.size() - 2)) {
                stack.pop();
            }
        }
        return stack.size();
    }

    public static int largestRectangleArea(int[] heights) {
        if (heights == null || heights.length == 0) return 0;
        int maxArea = 0;
        Stack<Integer> maxAreaStack = new Stack<>();
        for (int i = 0; i <= heights.length; i++) {
            int height = (i == heights.length) ? 0 : heights[i];
            while (!maxAreaStack.isEmpty() && height < heights[maxAreaStack.peek()]) {
                int poppedValue = maxAreaStack.pop();
                int poppedValueHeight = heights[poppedValue];
                int width;
                if (!maxAreaStack.isEmpty()) {
                    width = i - maxAreaStack.peek() - 1;
                } else {
                    width = i;
                }
                int area = poppedValueHeight * width;
                maxArea = Math.max(maxArea, area);
            }
            maxAreaStack.push(i);
        }
        return maxArea;
    }

    public static int binarySearch(int[] nums, int target) {
        if (nums == null || nums.length == 0) return -1;
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) return mid;
            if (nums[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return -1;
    }


    public static int recursiveBinarySearch(int[] nums, int target, int low, int high) {
        if (nums == null || nums.length == 0 || low > high) return -1;
        int mid = (low + high) / 2;
        if (nums[mid] == target) return mid;
        if (nums[mid] > target) return recursiveBinarySearch(nums, target, low, mid - 1);
        return recursiveBinarySearch(nums, target, mid + 1, high);
    }

    public int[] searchRange(int[] nums, int target) {
        if (nums.length == 0 || target == -1) return new int[]{-1, -1};
        if (nums.length == 1 && target == nums[0]) return new int[]{0, 0};
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int x = nums[left];
            int y = nums[right];
            if (x == target && y == target) return new int[]{left, right};
            if (x != target) left++;
            if (y != target) right--;
        }
        return new int[]{-1, -1};
    }

    public static String countAndSay(int n) {
        if (n == 1) return "1";
        String previousTerm = countAndSay(n - 1);
        StringBuilder currentTerm = new StringBuilder();

        int count = 1;
        char currentChar = previousTerm.charAt(0);

        for (int i = 1; i < previousTerm.length(); i++) {
            if (previousTerm.charAt(i) == currentChar) {
                count++;
            } else {
                currentTerm.append(count).append(currentChar);
                count = 1;
                currentChar = previousTerm.charAt(i);
            }
        }

        currentTerm.append(count).append(currentChar);
        return currentTerm.toString();
    }

//    public static int findMaximumTask(int[] task, int m) {
//      //NEEDS TO BE SOLVED
//    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) return false;
        int m = matrix.length;    // Number of rows
        int n = matrix[0].length;
        int low = 0;
        int high = m * n - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int row = mid / n;
            int col = mid % n;
            if (matrix[row][col] == target) {
                return true;
            } else if (matrix[row][col] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return false;
    }

    public static int lowerBound(int[] arr, int target, int l) {
        if (arr == null || l == 0) return l;
        int answer = l;
        int low = 0;
        int high = l - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] >= target) {
                answer = mid;
                high = mid - 1;
            } else low = mid + 1;
        }
        return answer;
    }


    public static int upperBound(int[] arr, int target, int l) {
        if (arr == null || l == 0) return l;
        int answer = l;
        int low = 0;
        int high = l - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] > target) {
                answer = mid;
                high = mid - 1;
            } else low = mid + 1;
        }
        return answer;
    }

    public static int searchInsertedPosition(int[] arr, int target, int l) {
        if (arr == null || l == 0) return l;
        int answer = 0;
        int low = 0;
        int high = l - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] >= target) {
                answer = mid;
                high = mid - 1;
            } else low = mid + 1;
        }
        return answer;
    }

    public static int floorAndCeil(int[] arr, int target, int l) {
        if (arr == null || l == 0) return -1;
        int answer = -1;
        int low = 0;
        int high = l - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] <= mid) {
                answer = arr[mid];
                low = mid + 1;
            } else high = mid - 1;
        }
        return answer;
    }

    public static int[] firstandlastoccurence(int[] arr, int target) {
        if (arr == null) return new int[]{};
        int[] answer = {-1, -1};
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            if (answer[0] != -1 && answer[1] != -1) return answer;
            if (arr[low] == target) answer[0] = low;
            if (arr[high] == target) answer[1] = high;
            if (answer[0] == -1) low++;
            if (answer[1] == -1) high--;
        }
        return answer;
    }

    //using lower bound and upper bound recursivley
    public static int[] firstAndLastOccurence(int[] arr, int target) {
        int lb = lowerBound(arr, target, arr.length);
        if (lb == arr.length || arr[lb] != target) return new int[]{-1, -1};
        return new int[]{lb, upperBound(arr, target, arr.length) - 1};
    }

    //another way to solve last nad first occurence recursivley

    public static int lastOccurence(int[] arr, int target, int size) {
        if (arr == null) return -1;
        int low = 0;
        int high = size - 1;
        int last = -1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == target) {
                last = mid;
                low = mid + 1;
            } else if (arr[mid] < target) low = mid + 1;
            else high = mid - 1;

        }
        return last;
    }


    public static int firstOccurence(int[] arr, int target, int size) {
        if (arr == null) return -1;
        int low = 0;
        int high = size - 1;
        int first = -1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == target) {
                first = mid;
                high = mid - 1;
            } else if (arr[mid] < target) low = mid + 1;
            else high = mid - 1;

        }
        return first;
    }

    public static int[] firstandLastOccurence(int[] arr, int target, int size) {
        int firstOcc = firstOccurence(arr, target, size);
        if (firstOcc == -1) return new int[]{-1, -1};
        int lastOcc = lastOccurence(arr, target, size);
        return new int[]{firstOcc, lastOcc};
    }

    public static int countOccurence(int[] arr, int target, int size) {
        int[] ans = firstandLastOccurence(arr, target, size);
        if (ans[0] == -1) return 0;
        return ans[1] - ans[0] + 1;
    }

    public static int minEatingSpeed(int[] piles, int h) {
        int maxValue = Arrays.stream(piles).max().getAsInt();
        int minimum = 1;
        while (minimum < maxValue) {
            int mid = minimum + (maxValue - minimum) / 2;
            long hours = 0;
            for (int pile : piles) {
                hours += Math.ceil((double) pile / mid);
            }
            if (hours <= h) {
                maxValue = mid;
            } else minimum = mid + 1;
        }
        return minimum;
    }

    public static int search(ArrayList<Integer> arr, int n, int k) {
        int low = 0, high = n - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr.get(mid) == k)
                return mid;

            if (arr.get(low) <= arr.get(mid)) {
                if (arr.get(low) <= k && k <= arr.get(mid)) high = mid - 1;
                else low = mid + 1;
            } else {
                if (arr.get(mid) <= k && k <= arr.get(high)) low = mid + 1;
                else high = mid - 1;
            }
        }
        return -1;
    }

    public static boolean searchInARotatedSortedArrayII(int[] arr, int k) {
        int n = arr.length;
        int low = 0, high = n - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == k) return true;
            if (arr[low] == arr[mid] && arr[mid] == arr[high]) {
                low = low + 1;
                high = high - 1;
                continue;
            }
            if (arr[low] <= arr[mid]) {
                if (arr[low] <= k && k <= arr[mid]) high = mid - 1;
                else low = mid + 1;
            } else {
                if (arr[mid] <= k && k <= arr[high]) low = mid + 1;
                else high = mid - 1;
            }
        }
        return false;
    }

    public static int findMin(int[] nums) {
        if (nums == null) return -1;
        int low = 0;
        int high = nums.length - 1;
        int ans = Integer.MAX_VALUE;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[low] <= nums[mid]) {
                ans = Math.min(ans, nums[low]);
                low = mid + 1;
            } else {
                ans = Math.min(ans, nums[mid]);
                high = mid - 1;
            }
        }

        return ans;
    }

    public static int findHowMuchArrayBeenRotated(int[] nums) {
        if (nums == null) return -1;
        int low = 0;
        int high = nums.length - 1;
        int count = Integer.MAX_VALUE;
        int index = 0;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[low] <= nums[mid]) {
                int previousCount = count;
                count = Math.min(count, nums[low]);
                if (previousCount != count) index = low;
                low = mid + 1;
            } else {
                int previousCount = count;
                count = Math.min(count, nums[mid]);
                if (previousCount != count) index = mid;
                high = mid - 1;
            }
        }

        return index - 1;
    }


    public static int search(int[] nums, int target) {
        int n = nums.length;
        int low = 0, high = n - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] == target) return mid;
            if (nums[low] == target) return low;
            if (nums[high] == target) return high;
            if (nums[mid] >= nums[low]) {
                if (nums[mid] >= target && target >= nums[low]) {
                    high = mid - 1;
                } else low = mid + 1;
            } else {
                if (nums[mid] <= target && target <= nums[high]) {
                    low = mid + 1;
                } else high = mid - 1;
            }
        }
        return -1;
    }

    public static int singleNonDuplicate(int[] nums) {
        if (nums == null) return -1;
        if (nums.length == 1) return nums[0];
        if (nums[0] != nums[1]) return nums[0];
        if (nums[nums.length - 1] != nums[nums.length - 2]) return nums[nums.length - 1];
        int low = 1;
        int high = nums.length - 2;
        int answer = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] != nums[mid - 1] && nums[mid] != nums[mid + 1]) return nums[mid];
            if ((mid % 2 == 1 && nums[mid - 1] == nums[mid]) || mid % 2 == 0 && nums[mid] == nums[mid + 1]) {
                low = mid + 1;
            } else high = mid - 1;
        }
        return answer;
    }

    public static int findPeakElement(int[] nums) {
        if (nums == null) return 0;
        if (nums.length == 1) return 0;
        if (nums[0] > nums[1]) return 0;
        if (nums[nums.length - 1] > nums[nums.length - 2]) return nums.length - 1;
        if (nums.length == 2) if (nums[0] > nums[1]) return 0;
        else return 1;
        int low = 1;
        int high = nums.length - 2;
        int answer = -1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid - 1] < nums[mid] && nums[mid] > nums[mid + 1]) {
                if (nums[mid] > answer) {
                    answer = nums[mid];
                    return mid;
                }
            }
            if (nums[mid] > nums[mid + 1]) {
                high = mid - 1;
            } else low = mid + 1;

        }
        return 0;
    }

    private static int findSqrt(int n) {
        if (n == 1 || n == 2 || n == 3) return 1;
        int low = 1;
        int high = n;
        int answer = 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (mid * mid <= n) {
                answer = mid;
                low = mid + 1;
            } else high = mid - 1;
        }

        return answer;
    }

    public static int findDuplicate(int[] nums) {
        if (nums == null) return -1;
        if (nums.length == 1) return nums[0];
        if (nums[0] == nums[1]) return nums[0];
        if (nums[nums.length - 1] == nums[nums.length - 2]) return nums[nums.length - 1];
        if (nums[0] == nums[nums.length - 1]) return nums[0];
        int low = 1;
        int high = nums.length - 1;
        while (low < high) {
            int mid = (low + high) / 2;
            int countSmaller = 0;
            for (int n : nums) {
                if (n <= mid) countSmaller++;
            }
            if (countSmaller > mid) high = mid;
            else low = mid + 1;
        }
        return low;
    }

    public static int findNthRoot(int m, int n) {
        int low = 0;
        int high = m;
        int answer = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (Math.pow(mid, n) == m) return mid;
            if (Math.pow(mid, n) > m) high = mid - 1;
            else low = mid + 1;
        }

        return answer;
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (nums1 == null && nums2 == null) return -1.0;
        if (nums1 == null || nums1.length == 0) {
            if (nums2.length % 2 == 1) return (double) nums2[nums2.length / 2];
            else return (double) (nums2[nums2.length / 2 - 1] + nums2[nums2.length / 2]) / 2;
        }

        if (nums2 == null || nums2.length == 0) {
            if (nums1.length % 2 == 1) return (double) nums1[nums1.length / 2];
            else return (double) (nums1[nums1.length / 2 - 1] + nums1[nums1.length / 2]) / 2;
        }
        if (nums1.length == 1 && nums2.length == 1) return (double) (nums1[0] + nums2[0]) / 2;
        if (nums1.length == 2 && nums2.length == 1) {
            if (nums2[0] < nums1[0] && nums2[0] < nums1[1]) {
                return (double) Math.min((nums1[0] + nums1[1]) / 2.0, nums2[0]);
            } else {
                return (double) Math.min(nums1[1], nums2[0]);
            }
        }

        if (nums1.length == 1 && nums2.length == 2) {
            if (nums1[0] < nums2[0] && nums1[0] < nums2[1]) {
                return (double) Math.min(nums1[0], (nums2[0] + nums2[1]) / 2.0);
            } else {
                return (double) Math.min(nums1[0], nums2[1]);
            }
        }
        int low1 = 0;
        int high1 = nums1.length - 1;
        int low2 = 0;
        int high2 = nums2.length - 1;
        boolean isOdd1 = nums1.length % 2 == 1;
        boolean isOdd2 = nums2.length % 2 == 1;
        if (nums1[high1] > nums2[low2] && nums1[high1] != 0) {
            return (double) (nums1[high1] + nums2[low2]) / 2;
        }
        double mid1 = (double) (nums1[low1] + nums1[high1]) / 2;
        double mid2 = (double) (nums2[low2] + nums2[high2]) / 2;
        if (isOdd1) mid1 = nums1[nums1.length / 2];
        else if (isOdd2) mid2 = nums2[nums2.length / 2];
        if (mid1 == 0.0) return mid2;
        else if (mid2 == 0.0) return mid1;
        if (mid1 == 0.0 && mid2 == 0.0) return 0.0;
        return (double) (mid1 + mid2) / 2;
    }
}