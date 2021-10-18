package com.ssp.myapp

/**
 * @author       ShiShaoPo
 * @time         2021/9/20
 * @description
 */
fun main() {
    val arr = intArrayOf(0,1,0,3,12)
    val result = moveZeroes(arr)
}

/**
 * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。

示例:
输入: [0,1,0,3,12]
输出: [1,3,12,0,0]

zeroIndex = 2
normalIndex = 4
输入: [1,0,3,0,12]
输出: [1,3,0,0,12]

说明:
必须在原数组上操作，不能拷贝额外的数组。
尽量减少操作次数。
 */
fun moveZeroes(nums: IntArray): Unit {
    var zeroIndex = 0
    var normalIndex = 0
    val length = nums.size
    while (normalIndex < length && zeroIndex < length) {
        if (nums[zeroIndex] != 0) {
            zeroIndex++
            continue
        }
        if (nums[normalIndex] != 0 && normalIndex > zeroIndex) {
            val temp = nums[normalIndex]
            nums[normalIndex] = nums[zeroIndex]
            nums[zeroIndex] = temp
        }
        normalIndex++
    }
    println(nums.contentToString())
}