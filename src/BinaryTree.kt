import Utils.TreeNode

class BinaryTree {
    fun inOrder(parent: TreeNode?) {
        parent ?: return
        //L,P,R
        inOrder(parent.left)
        println(parent.`val`)
        inOrder(parent.right)
    }

    fun preOrder(parent: TreeNode?) {
        parent ?: return
        //P,L,R
        println(parent.`val`)
        preOrder(parent.left)
        preOrder(parent.right)
    }

    fun postOrder(parent: TreeNode?) {
        parent ?: return
        //L,R,P
        postOrder(parent.left)
        postOrder(parent.right)
        println(parent.`val`)
    }
}
