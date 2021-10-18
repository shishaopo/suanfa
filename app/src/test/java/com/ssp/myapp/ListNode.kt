package com.ssp.myapp

/**
 * @author       ShiShaoPo
 * @time         2021/9/1
 * @description
 */
class ListNode(var `val`: Int, var next: ListNode? = null) {
    override fun toString(): String {
        return "$`val` -> ${next.toString()}"
    }
}

class TreeNode(var `val`: Int, var left: TreeNode? = null, var right: TreeNode? = null) {
    override fun toString(): String {
        val leftStr = if (left != null) {
            ",left = ${left.toString()}"
        } else {
            ""
        }
        val rightStr = if (right != null) {
            ",right = ${right.toString()}"
        } else {
            ""
        }
        return "(${`val`}${leftStr}${rightStr})"
    }
}