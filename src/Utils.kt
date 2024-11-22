fun Char.operatorPriority(): Int {
    return when (this) {
        '^' -> 3
        '*', '/' -> 2
        '+', '-' -> 1
        else -> 0
    }
}