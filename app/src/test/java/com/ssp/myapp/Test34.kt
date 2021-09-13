package com.ssp.myapp

/**
 * @author       ShiShaoPo
 * @time         2021/9/6
 * @description
 */
fun main() {
    val intArray = intArrayOf(5,7,7,8,8,10)
    val result = searchRange(intArray, 6)
    println(result.contentToString())
}

/**
 * 给定一个按照升序排列的整数数组 nums，和一个目标值 target。找出给定目标值在数组中的开始位置和结束位置。
如果数组中不存在目标值 target，返回 [-1, -1]。
进阶：
你可以设计并实现时间复杂度为 O(log n) 的算法解决此问题吗？

示例 1：
输入：nums = [5,7,7,8,8,10], target = 8
输出：[3,4]

示例 2：
输入：nums = [5,7,7,8,8,10], target = 6
输出：[-1,-1]

示例 3：
输入：nums = [], target = 0
输出：[-1,-1]
 */
fun searchRange(nums: IntArray, target: Int): IntArray {
    val result = IntArray(2) { -1 }
    search(nums, 0, nums.size, target, result)
    return result
}

private fun search(nums: IntArray, start: Int, end: Int, target: Int, result: IntArray) {
    if (end < start) {
        return
    }
    if (start == end) {
        if (nums[start] == target) {
            if (result[0] == -1) {
                result[0] = start
            } else if (start < result[0]) {
                result[0] = start
            }
            if (start > result[1]) {
                result[1] = start
            }
        }
        return
    }
    val mid = start + (end - start) / 2
    when {
        nums[mid] > target -> {
            search(nums, start, mid, target, result)
        }
        nums[mid] < target -> {
            search(nums, mid + 1, end, target, result)
        }
        else -> {
            if (result[0] == -1) {
                result[0] = mid
            } else if (mid < result[0]) {
                result[0] = mid
            }
            if (mid > result[1]) {
                result[1] = mid
            }
            search(nums, start, mid, target, result)
            search(nums, mid + 1, end, target, result)
        }
    }
}

