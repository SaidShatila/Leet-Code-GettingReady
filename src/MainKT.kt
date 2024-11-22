import java.util.Stack
import kotlin.math.pow

fun main() {
//    println(majorityElement(intArrayOf(3, 3, 4)))
//    println(isPalindrome("A man, a plan, a canal: Panama"))
//    println(isIsomorphic("badc", "baba"))
//    println(mergeAlternately("badc", "baba"))
//    println(reverse(120))
    println(infixToPostFix("a+b*(c^d-e)"))

}

fun singleNumber(nums: IntArray): Int {
    val count: HashMap<Int, Int> = hashMapOf()
    nums.forEach {
        if (count.contains(it)) count[it] = count.getOrDefault(it, 0 + 1) + 1 else
            count[it] = count.getOrDefault(it, 0) + 1
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
                while (stackOperator.isNotEmpty()&& char.operatorPriority() <= stackOperator.peek().operatorPriority()) {
                    ans.append(stackOperator.peek())
                    stackOperator.pop()
                }
                stackOperator.push(char)
            }
        }
        i++
    }

    while (stackOperator.isNotEmpty()){
        ans.append(stackOperator.pop())
    }
    return ans.toString()
}




