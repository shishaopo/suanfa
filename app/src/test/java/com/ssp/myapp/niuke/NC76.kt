package com.ssp.myapp.niuke

import java.util.*

/**
 * @author       ShiShaoPo
 * @time         2021/10/16
 * @description
 */
fun main() {

}

class Solution {
   private val stack1: Stack<Int> = Stack<Int>()
   private val stack2: Stack<Int> = Stack<Int>()
    fun push(node: Int) {
        stack1.push(node)
    }
    fun pop(): Int {
        if(stack2.empty()){
            while (stack1.isNotEmpty()){
                stack2.push(stack1.pop())
            }
        }
        return stack2.pop()
    }
}