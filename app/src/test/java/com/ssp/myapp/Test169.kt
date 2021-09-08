package com.ssp.myapp

/**
 * @author       ShiShaoPo
 * @time         2021/9/1
 * @description
 */
fun main() {
    val array = intArrayOf(1,7,2,7,3,7,4,7,5,7,7,7,5)
    val result = majorityElement(array)
    println(result)
}

/**
给定一个大小为 n 的数组，找到其中的多数元素。多数元素是指在数组中出现次数 大于 ⌊ n/2 ⌋ 的元素。
你可以假设数组是非空的，并且给定的数组总是存在多数元素。

示例 1：
输入：[3,2,3]
输出：3

示例 2：
输入：[2,2,1,1,1,2,2]
输出：2
 */
fun majorityElement(nums: IntArray): Int {
    var maj = nums[0]
    var count = 0
    nums.forEachIndexed { index, i ->
        if (i == maj) {
            count++
        } else {
            count--
            if (count == 0) {
                maj = i
                count++
            }
        }

    }
    return maj
}