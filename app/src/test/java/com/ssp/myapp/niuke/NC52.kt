package com.ssp.myapp.niuke

import java.util.*

/**
 * @Description:
 * @Author:         ShiShaoPo
 * @CreateDate:     2021/10/25 11:57 上午
 */
fun main() {

}

/**
 *
 * @param s string字符串
 * @return bool布尔型
 */
fun isValid(s: String?): Boolean {
    if (s.isNullOrEmpty()) {
        return false
    }
    val stack = LinkedList<Char>()
    for (c in s) {
        if (c == '(' || c == '[' || c == '{') {
            stack.push(c)
            continue
        }
        if (stack.isEmpty()) {
            return false
        }
        val top = stack.pop()
        if (top == '(' && c != ')') {
            return false
        }
        if (top == '[' && c != ']') {
            return false
        }
        if (top == '{' && c != '}') {
            return false
        }
    }
    return stack.isEmpty()
}