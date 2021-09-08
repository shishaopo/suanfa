package com.ssp.myapp

/**
 * @author       ShiShaoPo
 * @time         2021/8/29
 * @description
 */
fun main() {
    println(lengthOfLongestSubstring("abcabcbb"))
}

/**
 * 给定一个字符串 s ，请你找出其中不含有重复字符的 最长子串 的长度。
 * abcabcbb
 * bbbbb
 * pwwkew
 */
private fun lengthOfLongestSubstring(s: String?): Int {
    var maxLength = 0
    val hashSet = HashSet<Char>()
    var leftIndex = 0
    s?.forEachIndexed { index, c ->
        if (hashSet.contains(c)) {
            maxLength = maxLength.coerceAtLeast(index - leftIndex)
            do {
                hashSet.remove(s[leftIndex])
                leftIndex++
            } while (hashSet.contains(c))
        }
        hashSet.add(c)
    }
    maxLength = maxLength.coerceAtLeast((s?.length ?: 0) - leftIndex)
    return maxLength
}