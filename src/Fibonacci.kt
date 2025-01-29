class Fibonacci {

    fun solution(n: Int) {
        val memo = mutableMapOf<Int, Int>()
    }

    // o(n + 1000) 0<n<10
    // tic tac toe -> 9 elements -> O(9) -> still they try to optimize

    fun buildString(n: Int): String {
        var string = ""

        repeat(n) { i ->
            string += i.toChar()
        }
        //O(10^2)--> Time Complexity --> Considering how many times it's repeated
        //O(N) --> Space Complexity
        return string
    }

    fun solve(n: Int): Int {
        if (n <= 0) return 0
        if (n == 1) return 1

        return solve(n - 1) + solve(n - 2)
        //O(n) --> Space Complexity
        //Call Stack --> in Any compiler
    }

    fun memoize(n: Int, dp: MutableMap<Int, Int>): Int {
        if(dp[n] != null) return dp[n] ?: 0

        val result = if (n <= 0) 0
        else if (n == 1) 1
        else solve(n - 1) + solve(n - 2)

        return result
        //O(2n)  --> Space Complexity
    }

    fun tabulate(n: Int): Int {
        //[0, 1, 1, 2, 3, 5, 8...]
        val dp = mutableMapOf<Int, Int>()
        dp[0] = 0
        dp[1] = 1

        for(i in 2..n) {
            dp[i] = dp[i - 1]!! + dp[i - 2]!!
        }
        //O(n)  --> Space Complexity
        return dp[n]!!
    }

    fun tabulateOptimized(n: Int): Int {
        var previous = 0
        var current = 1
        var result = 0

        repeat(n - 2) {
            result = previous + current
            previous = current
            current = result
        }
       //O(1) --> Space Complexity
        return result
    }
}