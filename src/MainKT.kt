fun main() {
    println(majorityElement(intArrayOf(3,3,4)))
}

fun singleNumber(nums: IntArray): Int {
    val count: HashMap<Int, Int> = hashMapOf()
    nums.forEach {
        if (count.contains(it)) count[it] = count.getOrDefault(it, 0 + 1) +1 else
            count[it] = count.getOrDefault(it, 0) +1
    }

    return count.filter { it.value == 1 }.keys.first()
}

fun majorityElement(nums: IntArray): Int {
    val count: HashMap<Int, Int> = hashMapOf()
        nums.forEach {
            count[it] = count.getOrDefault(it, 0 ) +1
        }

    return count.maxBy { it.value }.key
}


