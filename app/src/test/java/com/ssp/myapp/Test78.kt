package com.ssp.myapp

/**
 * @Description:
 * @Author:         ShiShaoPo
 * @CreateDate:     2021/9/13 4:52 下午
 */
fun main() {
    val result = subsets(intArrayOf(1,2,3,4))
    println(result.joinToString())
}

/**
 * 给你一个整数数组 nums ，数组中的元素 互不相同 。返回该数组所有可能的子集（幂集）。
解集 不能 包含重复的子集。你可以按 任意顺序 返回解集。

示例 1：
输入：nums = [1,2,3]
输出：[[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]

示例 2：
输入：nums = [0]
输出：[[],[0]]
 */
fun subsets(nums: IntArray): List<List<Int>> {
    val bitN = (1 shl nums.size) - 1
    val result = ArrayList<ArrayList<Int>>()
    for (i in (0..bitN)) {
        val currentList = ArrayList<Int>()
        var bitNumber = i
        var shlCount = 0
        while (bitNumber > 0) {
            if (bitNumber and 1 == 1) {
                currentList.add(nums[shlCount])
            }
            shlCount++
            bitNumber = i shr shlCount
        }
        result.add(currentList)
    }
    return result
}