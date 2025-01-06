import kotlin.Pair;

import java.util.*;

public class Utils {


    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }


    class MinStack {
        Stack<Integer> stack;
        Stack<Integer> minStack;

        public MinStack() {
            stack = new Stack<>();
            minStack = new Stack<>();
        }

        public void push(int val) {
            stack.push(val);
            if (minStack.isEmpty() || val <= minStack.peek()) {
                minStack.push(val);
            }
        }

        public void pop() {
            int topValue = stack.pop();
            if (topValue == minStack.peek()) {
                minStack.pop();
            }
        }

        public int top() {
            return stack.peek();
        }

        public int getMin() {
            return minStack.peek();
        }
    }


    class TimeMap {
        private HashMap<String, List<Pair<Integer, String>>> keyStore;

        public TimeMap() {
            keyStore = new HashMap<>();

        }

        public void set(String key, String value, int timestamp) {
            keyStore.computeIfAbsent(key, k -> new ArrayList<>()).add(new Pair<>(timestamp, value));
        }

        public String get(String key, int timestamp) {
            List<Pair<Integer, String>> values = keyStore.getOrDefault(key, new ArrayList<>());
            int left = 0;
            int high = values.size() - 1;
            String result = "";
            while (left <= high) {
                int mid = (left + high) / 2;
                if (values.get(mid).getFirst() <= timestamp) {
                    result = values.get(mid).getSecond();
                    left = mid + 1;
                } else high = mid - 1;
            }
            return result;
        }
    }


}
