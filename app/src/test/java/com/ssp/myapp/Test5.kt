package com.ssp.myapp

/**
 * @author       ShiShaoPo
 * @time         2021/8/30
 * @description
 */
fun main() {

}

private fun isTwoN(num: Int): Boolean {
    if (num == 0) {
        return true
    }
    val result = (num - 1) and (num + 1) - 1
    return result == num
}

/**
 * 0000 0000 0000 1010
 * 0000 0000 0000 1001
 * 给你一个字符串 s，找到 s 中最长的回文子串。

示例 1：
输入：s = "babad"
输出："bab"
解释："aba" 同样是符合题意的答案。

示例 2：
输入：s = "cbbd"
输出："bb"

示例 3：
输入：s = "a"
输出："a"

示例 4：
输入：s = "ac"
输出："a"
 */
fun longestPalindrome(s: String): String {
    val maxList = StringBuilder()
    val currentList = StringBuilder()
    s.forEachIndexed { index, c ->
        if (currentList.isEmpty()) {
            currentList.append(c)
            return@forEachIndexed
        }

        val currentSize = currentList.length

        currentList.append(c)
        if (isPalindrome(currentList)) {
            maxList.clear()
            maxList.append(currentList)
        } else {
            currentList.deleteCharAt(0)
        }
    }
    return maxList.toString()
}

private fun isPalindrome(list: StringBuilder): Boolean {
    val total = list.length - 1
    list.forEachIndexed { index, c ->
        val elseIndex = total - index
        if (elseIndex <= index) {
            return true
        }
        if (c != list[elseIndex]) {
            return false
        }
    }
    return false
}