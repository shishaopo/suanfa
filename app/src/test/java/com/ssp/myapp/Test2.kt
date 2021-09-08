package com.ssp.myapp

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
fun main() {
    val node1 = ListNode(2, ListNode(4, ListNode(3)))
    val node2 = ListNode(5, ListNode(6, ListNode(4)))
    val result = addTwoNumbers(node1, node2)
    println(result)
}

/**
 * 给你两个 非空 的链表，表示两个非负的整数。它们每位数字都是按照 逆序 的方式存储的，并且每个节点只能存储 一位 数字。
请你将两个数相加，并以相同形式返回一个表示和的链表。
你可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 */
private fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
    var currentNode1 = l1
    var currentNode2 = l2
    var extraValue = 0

    var headNode: ListNode? = null
    var preNode: ListNode? = null
    while (currentNode1 != null || currentNode2 != null) {
        val value1 = currentNode1?.`val` ?: 0
        val value2 = currentNode2?.`val` ?: 0
        var sum = value1 + value2 + extraValue
        if (sum >= 10) {
            extraValue = 1
            sum %= 10
        } else {
            extraValue = 0
        }
        val currentNode = ListNode(sum)
        if (headNode == null) {
            headNode = currentNode
        } else {
            preNode?.next = currentNode
        }
        preNode = currentNode

        currentNode1 = currentNode1?.next
        currentNode2 = currentNode2?.next
    }
    if(extraValue>0){
        val currentNode = ListNode(extraValue)
        preNode?.next = currentNode
    }
    return headNode
}

//class ListNode(var `val`: Int, var next: ListNode? = null) {
//    override fun toString(): String {
//        return "$`val` -> ${next.toString()}"
//    }
//}