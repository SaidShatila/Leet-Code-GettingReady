fun Char.operatorPriority(): Int {
    return when (this) {
        '^' -> 3
        '*', '/' -> 2
        '+', '-' -> 1
        else -> 0
    }
}



class ListNode(var `val`: Int) {
    var next: ListNode? = null
    constructor(`val`: Int, next: ListNode?) : this(`val`) {
        this.next = next
    }
}