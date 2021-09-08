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