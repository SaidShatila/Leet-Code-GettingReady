import java.util.Stack
import kotlin.math.*

fun main() {
    val l1 = ListNode(2, ListNode(4, ListNode(3, null)))
    val l2 = ListNode(5, ListNode(6, ListNode(4, null)))
//    println(majorityElement(intArrayOf(3, 3, 4)))
//    println(isPalindrome("A man, a plan, a canal: Panama"))
//    println(isIsomorphic("badc", "baba"))
//    println(mergeAlternately("badc", "baba"))
//    println(reverse(120))
//    println(infixToPostFix("a+b*(c^d-e)"))
//    println(dayOfYear("2019-01-09"))
//    println(printList(addTwoNumbers(l1, l2)))
//    println(convert("PAYPALISHIRING", 3))
//    println(myAtoi("0-1"))
//    println(smallestDivisor(intArrayOf(19), 5))
//    println(shipWithinDays(intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 5))
    println(findKthPositive(intArrayOf(1, 2), 1))
}

fun singleNumber(nums: IntArray): Int {
    val count: HashMap<Int, Int> = hashMapOf()
    nums.forEach {
        if (count.contains(it)) count[it] = count.getOrDefault(it, 0 + 1) + 1 else count[it] =
            count.getOrDefault(it, 0) + 1
    }

    return count.filter { it.value == 1 }.keys.first()
}

fun majorityElement(nums: IntArray): Int {
    val count: HashMap<Int, Int> = hashMapOf()
    nums.forEach {
        count[it] = count.getOrDefault(it, 0) + 1
    }

    return count.maxBy { it.value }.key
}

fun isPalindrome(s: String): Boolean {
    val re = Regex("[^A-Za-z0-9]")
    val newS = s.replace(re, "").lowercase()
    var left = 0
    var right = newS.length - 1

    while (left < right) {
        if (newS[left] == newS[right]) {
            left++
            right--
            continue
        } else return false
    }
    return true
}

fun isIsomorphic(s: String, t: String): Boolean {
    if (s == null || t == null) return false
    if (s.length != t.length) return false
    val hashMap = hashMapOf<Char, Char>();
    val hashMapTwo = hashMapOf<Char, Char>();
    for (i in s.indices) {
        hashMap[s[i]] = hashMap.getOrDefault(s[i], t[i])
        hashMapTwo[t[i]] = hashMapTwo.getOrDefault(t[i], s[i])
        if (hashMap[s[i]] != t[i]) return false
        if (hashMapTwo[t[i]] != s[i]) return false
    }
    return true
    /**Optimized Solution**/
//    if (s.length != t.length) return false
//
//    val mapST = hashMapOf<Char, Char>()
//    val usedChars = mutableSetOf<Char>()
//
//    for (i in s.indices) {
//        val charS = s[i]
//        val charT = t[i]
//
//        if (mapST.containsKey(charS)) {
//            // If s[i] is already mapped, check if it maps to the correct character
//            if (mapST[charS] != charT) {
//                return false
//            }
//        } else {
//            // If s[i] is not mapped, ensure t[i] is not already used
//            if (charT in usedChars) {
//                return false
//            }
//            // Create the mapping and mark t[i] as used
//            mapST[charS] = charT
//            usedChars.add(charT)
//        }
//    }
//
//    return true
}

fun mergeAlternately(word1: String, word2: String): String {
    if (word1.isEmpty() && word2.isEmpty()) return ""
    if (word1.isEmpty()) return word2
    if (word2.isEmpty()) return word1
    var left = 0
    var right = 0
    val newString: StringBuilder = StringBuilder()
    while (left < word1.length && right < word2.length) {
        newString.append(word1[left])
        newString.append(word2[right])
        left++
        right++
    }

    while (left < word1.length) {
        newString.append(word1[left])
        left++
    }

    while (right < word2.length) {
        newString.append(word2[right])
        right++
    }

    return newString.toString()
}


fun reverse(x: Int): Int {
    var input = x
    var result = 0

    while (input != 0) {
        val digit = input % 10
        input /= 10
        if (result > Int.MAX_VALUE / 10 || (result == Int.MAX_VALUE / 10 && digit > 7)) return 0
        if (result < Int.MIN_VALUE / 10 || (result == Int.MIN_VALUE / 10 && digit < -8)) return 0
        result = result * 10 + digit
    }

    return result
}


fun infixToPostFix(s: String): String {
    var i = 0
    val stackOperator = Stack<Char>()
    val ans = StringBuilder()
    while (i < s.length - 1) {
        when (val char = s[i]) {
            in 'A'..'Z', in 'a'..'z', in '0'..'9' -> {
                ans.append(char)
            }

            '(' -> stackOperator.push(char)
            ')' -> {
                while (stackOperator.isEmpty() && stackOperator.peek() != ')') {
                    ans.append(stackOperator.peek())
                    stackOperator.pop()
                }
                stackOperator.pop()
            }

            else -> {
                while (stackOperator.isNotEmpty() && char.operatorPriority() <= stackOperator.peek()
                        .operatorPriority()
                ) {
                    ans.append(stackOperator.peek())
                    stackOperator.pop()
                }
                stackOperator.push(char)
            }
        }
        i++
    }

    while (stackOperator.isNotEmpty()) {
        ans.append(stackOperator.pop())
    }
    return ans.toString()
}


fun dayOfYear(date: String): Int {
    val setOfDaysInMonth = listOf(
        31, date.checkIfLeapYear(), 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
    )
    var dayOfTheYear = 0;

    val month = date.substring(5, 7).toInt()
    val day = date.substring(8, 10).toInt()

    for (i in 0 until month - 1) {
        dayOfTheYear += setOfDaysInMonth[i]
    }


    return dayOfTheYear + day;
}

fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
    if (l1 == null && l2 == null) return null
    if (l1 == null && l2 != null) return l2
    if (l1 != null && l2 == null) return l1
    if ((l1?.next == null && l1?.`val` == 0) && (l2?.next == null && l2?.`val` == 0)) return ListNode(0)
    val dummy = ListNode(0)
    var addedList: ListNode? = dummy
    var carryOn = 0
    var nextOne = l1
    var nextTwo = l2
    while (nextOne != null || nextTwo != null || carryOn != 0) {
        val sum = (nextOne?.`val` ?: 0) + (nextTwo?.`val` ?: 0) + carryOn
        if (sum > 9) {
            carryOn = sum - 10
            addedList?.next = ListNode(carryOn)
            carryOn = 1
        } else {
            addedList?.next = ListNode(sum)
            carryOn = 0
        }
        addedList = addedList?.next
        nextOne = nextOne?.next
        nextTwo = nextTwo?.next
    }
    return dummy.next
}

fun printList(node: ListNode?) {
    var current = node
    while (current != null) {
        print("${current.`val`} -> ")
        current = current.next
    }
    println("null")
}

fun String.checkIfLeapYear(): Int {
    val year = this.substring(0, 4).toInt()
    return if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) 29 else 28
}


fun convert(s: String, numRows: Int): String {
    if (numRows == 1 || numRows == 0 || s.length == 1) return s
    val rows = MutableList(numRows) { StringBuilder() }
    var currentRow = 0
    var direction = 1
    s.forEach { char ->
        rows[currentRow].append(char)
        if (currentRow == numRows - 1) {
            direction = -1
        } else if (currentRow == 0) direction = 1

        currentRow += direction
    }
    val result = StringBuilder()
    for (row in rows) {
        result.append(row)
    }
    return result.toString()
}

fun myAtoi(s: String): Int {
    if (s.isEmpty()) return 0
    var index = 0
    val n = s.length
    while (index < n && s[index] == ' ') {
        index++
    }
    if (index == n) return 0
    var sign = 1
    if (s[index] == '+' || s[index] == '-') {
        if (s[index] == '-') sign = -1
        index++
    }
    var result = 0
    while (index < n) {
        val currentChar = s[index]
        if (currentChar < '0' || currentChar > '9') break
        val digit = currentChar - '0'
        if (result > (Int.MAX_VALUE - digit) / 10) return if (sign == 1) Int.MAX_VALUE else Int.MIN_VALUE
        result = result * 10 + digit
        index++
    }
    return result * sign
}


fun smallestDivisor(nums: IntArray, threshold: Int): Int {
    if (threshold == 0 || nums.isEmpty()) return -1;
    var low = 1
    var high = nums.max()
    var answer = high;
    while (low <= high) {
        var mid = (low + high) / 2
        val summation = nums.sumOf {
            println("$it = ${(it.ceilDiv(mid))}")
            it.ceilDiv(mid)
        }
        if (summation <= threshold) {
            answer = mid;
        } else {
            low = mid + 1;
        }
        high = mid - 1;
    }
    return answer;
}

fun shipWithinDays(weights: IntArray, days: Int): Int {
    if (days == 0 || weights.isEmpty()) return -1;
    val summation = weights.sum()
    var low = weights.max()
    var high = summation
    while (low <= high) {
        val mid = (low + high) / 2
        if (minCap(weights, mid) <= days) {
            high = mid - 1

        } else low = mid + 1
    }
    return low
}

fun minCap(weights: IntArray, cap: Int): Int {
    var days = 1
    var load = 0
    weights.forEach {
        if (load + it > cap) {
            days += 1
            load = it
        } else load += it
    }
    return days;
}

fun findKthPositive(arr: IntArray, k: Int): Int {
    if (arr.isEmpty() || k == -1) return -1
    var low = 0
    var high = arr.size - 1
    while (low <= high) {
        val mid = (low + high) / 2
        val missing = arr[mid] - (mid + 1)
        if (missing < k) {
            low = mid + 1
        } else {
            high = mid - 1
        }

    }
    return high + 1 + k
}

fun minCowDistMax(arr: IntArray, cows: Int): Int {
    arr.sort()
    var low = 0
    var high = arr[arr.size - 1] - arr[0]
    var ans = 0
    while (low <= high) {
        val mid = (low + high) / 2
        if (canWePlaceCow(
                arr, mid, cows
            )
        ) {
            ans = mid
            low = mid + 1
        } else high = mid - 1
    }
    return ans
}

fun canWePlaceCow(arr: IntArray, mid: Int, cows: Int): Boolean {
    var countCows = 1
    var last = arr[0]
    for (i in 1..<arr.size) {
        if (arr[i] - last >= mid) {
            countCows++
            last = arr[i]
        }
        if (countCows >= cows) return true
    }
    return false
}

fun Int.ceilDiv(other: Int): Int {
    return this.floorDiv(other) + this.rem(other).sign.absoluteValue
}

