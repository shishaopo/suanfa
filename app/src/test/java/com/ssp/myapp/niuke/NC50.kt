package com.ssp.myapp.niuke

import com.ssp.myapp.ListNode

/**
 * @Description:
 * @Author:         ShiShaoPo
 * @CreateDate:     2021/10/22 11:45 上午
 */
fun main() {
    val a = String("abc".toCharArray())
    val b = String("abc".toCharArray())
    println(a === b)
    println(a.intern() === b.intern())
}

/**
 * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
 *
 * @param head ListNode类
 * @param k int整型
 * @return ListNode类
 */
fun reverseKGroup(head: ListNode?, k: Int): ListNode? {
    var current: ListNode? = head
    var pre: ListNode? = null
    while (current != null) {

    }
    return null
}