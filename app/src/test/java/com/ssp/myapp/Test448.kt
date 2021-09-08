package com.ssp.myapp

/**
 * @author       ShiShaoPo
 * @time         2021/9/3
 * @description
 */
fun main() {
    val array = intArrayOf(1, 1)
    val result = findDisappearedNumbers(array)
    println(result.toString())
}

/**
 * 给你一个含 n 个整数的数组 nums ，其中 nums[i] 在区间 [1, n] 内。请你找出所有在 [1, n] 范围内但没有出现在 nums 中的数字，并以数组的形式返回结果。

示例 1：
输入：nums = [4,3,2,7,8,2,3,1]
输出：[5,6]

示例 2：
输入：nums = [1,1]
输出：[2]
 */
fun findDisappearedNumbers(nums: IntArray): List<Int> {
    val n = nums.size
    nums.forEachIndexed { index, i ->
        val value = (i-1) % n
        nums[value] += n
    }
    val list = arrayListOf<Int>()
    nums.forEachIndexed { index, i ->
        if (i <= n) {
            list.add(index + 1)
        }
    }
    return list
}