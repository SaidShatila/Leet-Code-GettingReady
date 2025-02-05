
/******************************************************************************

 Online Java Compiler.
 Code, Compile, Run and Debug java program online.
 Write your code in this editor and press "Run" button to execute it.
 *******************************************************************************/

import java.util.*;

public class LeetCode {
    public static void main(String[] args) {
        TestCase[] testCases = {
                new TestCase(
                        "",
                        "",
                        true
                ),
                new TestCase(
                        "aaacccbbbbbbbbbbccccacccaaaaaa",
                        "aaaaaaaaaabbbbbbbbbbcccccccccc",
                        true
                ),
                new TestCase(
                        "a",
                        "b",
                        false
                ),
                new TestCase(
                        "dear",
                        "read",
                        true
                ),

        };

        IntersectionTestCaseClass[] arrayOfIntersectionClass = {
                new IntersectionTestCaseClass<>(
                        new ArrayList<>(Arrays.asList(1, 2, 3, 3, 4)),
                        new ArrayList<>(Arrays.asList(3, 5, 3, 2)),
                        new ArrayList<>(Arrays.asList(2, 3))
                ),
                new IntersectionTestCaseClass<>(
                        new ArrayList<>(Arrays.asList("a", "b", "c", "d", "e")),
                        new ArrayList<>(Arrays.asList("d", "c", "b", "f")),
                        new ArrayList<>(Arrays.asList("d", "c", "b"))
                )
        };

        FirstUniqueTestCase[] firstUniqueTestCase = {
                new FirstUniqueTestCase<>(
                        new ArrayList<>(Arrays.asList("a", "b", "c", "e")),
                        "a"
                ),
                new FirstUniqueTestCase<>(
                        new ArrayList<>(Arrays.asList("f", "b", "c", "e")),
                        "f"
                ),
                new FirstUniqueTestCase<>(
                        new ArrayList<>(Arrays.asList("a", "a")),
                        null
                )
        };


//        for (TestCase testCase : testCases) {
//            System.out.println("Excpected = " + testCase.result + " Got " + isAnagram(testCase.a, testCase.b));
//        }

//        for (IntersectionTestCaseClass ofIntersectionClass : arrayOfIntersectionClass) {
//            System.out.println("Excpected = " + Arrays.toString(new ArrayList[]{ofIntersectionClass.expectedResult}) + " Got " + Arrays.toString(new ArrayList[]{intersect(ofIntersectionClass.arrayA, ofIntersectionClass.arrayB)}));
//        }

        for (FirstUniqueTestCase uniqueTestCase : firstUniqueTestCase) {
            System.out.println("Excpected = " + uniqueTestCase.expected + " Got " + firstUniqueItem(uniqueTestCase.input));
        }
    }

    public static class TestCase {
        public String a;
        public String b;
        public boolean result;

        TestCase(
                String a, String b, boolean result
        ) {
            this.a = a;
            this.b = b;
            this.result = result;
        }
    }

    public static class IntersectionTestCaseClass<T> {
        public ArrayList<T> arrayA;
        public ArrayList<T> arrayB;
        public ArrayList<T> expectedResult;

        IntersectionTestCaseClass(
                ArrayList<T> arrayA,
                ArrayList<T> arrayB,
                ArrayList<T> expectedResult
        ) {
            this.arrayA = arrayA;
            this.arrayB = arrayB;
            this.expectedResult = expectedResult;
        }
    }

    public static class FirstUniqueTestCase<T> {
        ArrayList<T> input;
        T expected;

        FirstUniqueTestCase(
                ArrayList<T> input,
                T expected
        ) {
            this.input = input;
            this.expected = expected;
        }
    }

    public static boolean isAnagram(String a, String b) {
        if (a.length() != b.length()) return false;

        HashMap<Character, Integer> countOfChar = new HashMap();

        for (int i = 0; i < a.length(); i++) {
            countOfChar.put(a.charAt(i), countOfChar.getOrDefault(a.charAt(i), 0) + 1);
        }

        for (int i = 0; i < b.length(); i++) {
            if (!countOfChar.containsKey(b.charAt(i))) {
                return false;
            }
            int count = countOfChar.get(b.charAt(i)) - 1;
            if (count < 0) {
                return false;
            }
            countOfChar.put(b.charAt(i), count);
        }
        return true;
    }

    public static <T> ArrayList<T> intersect(
            ArrayList<T> arrayA,
            ArrayList<T> arrayB
    ) {
        // A array of int 1,2,3,3,4 | B array of int 3,5,3,2
        if (arrayA == null || arrayB == null || arrayA.isEmpty() || arrayB.isEmpty()) return new ArrayList<>();

        HashSet<T> setOfVal = new HashSet<>(arrayA);
        HashSet<T> intersectionList = new HashSet<>();
        for (T b : arrayB) {
            if (setOfVal.contains(b)) {
                intersectionList.add(b);
            }
        }

        return new ArrayList<>(intersectionList);
    }

    public static <T> T firstUniqueItem(ArrayList<T> input) {
        //abcabcd
        if (input == null || input.isEmpty()) return null;

//        LinkedHashMap<T, Integer> uniqueItemMap = new LinkedHashMap<>(); //can be used to preserve order
        HashMap<T, Integer> uniqueItemMap = new HashMap<>();

        for (T item : input) {
            uniqueItemMap.put(item, uniqueItemMap.getOrDefault(item, 0) + 1);
        }

        for (T item : input) {
            if (uniqueItemMap.get(item) == 1) return item;
        }
        return null;
    }
}

