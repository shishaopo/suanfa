package com.ssp.myapp

/**
 * @author       ShiShaoPo
 * @time         2021/9/3
 * @description
 */
fun main() {

}

/**
 *      pre    p1    p2
 */
fun reverseList(head: ListNode?): ListNode? {
    var pre:ListNode?=null
    var current:ListNode?= head
    while (current!=null){
        val nextNode = current?.next
        current?.next = pre
        pre = current
        current = nextNode
    }
    return pre
}