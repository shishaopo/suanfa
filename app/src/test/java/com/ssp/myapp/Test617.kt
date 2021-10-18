package com.ssp.myapp

/**
 * @author       ShiShaoPo
 * @time         2021/9/16
 * @description
 */
fun main() {
    val node1 = TreeNode(1, TreeNode(3, TreeNode(5)), TreeNode(2))
    val node2 = TreeNode(2, TreeNode(1,right = TreeNode(4)), TreeNode(3,right = TreeNode(7)))
    println(node1.toString())
    println(node2.toString())
    val result = mergeTrees(node1,node2)
    println(result.toString())
}

/**
 * 输入:
Tree 1                     Tree 2
1                         2
/ \                       / \
3   2                     1   3
/                           \   \
5                             4   7
输出:
合并后的树:
3
/ \
4   5
/ \   \
5   4   7

 */
fun mergeTrees(root1: TreeNode?, root2: TreeNode?): TreeNode? {
    if (root1 == null && root2 == null) {
        return null
    }
    val v1 = root1?.`val` ?: 0
    val v2 = root2?.`val` ?: 0
    val resultNode = TreeNode(v1 + v2)
    resultNode.left = mergeTrees(root1?.left,root2?.left)
    resultNode.right = mergeTrees(root1?.right,root2?.right)
    return resultNode
}