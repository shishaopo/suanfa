package com.ssp.myapp.niuke

/**
 * @author       ShiShaoPo
 * @time         2021/10/17
 * @description
 */
fun main() {
    val array = intArrayOf(1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5)
    val result = search(array, 4)
    println(result)
}

/**
 * [1,2,2,3,3,3,4,4,4,4,5,5,5,5,5]
 * 如果目标值存在返回最小下标，否则返回 -1
 * @param nums 有序int整型数组
 * @param target 目标值：int整型
 * @return 如果[nums]中包含[target]返回最小角标，否则返回-1
 */
fun search(nums: IntArray, target: Int): Int {
    var start = 0
    var end = nums.size - 1
    var index = -1
    while (start <= end) {
        val mid = (start + end).shr(1)
        val midValue = nums[mid]
        when {
            midValue == target -> {
                index = mid
                end = mid - 1
            }
            midValue < target -> {
                start = mid + 1
            }
            else -> {
                end = mid - 1
            }
        }
    }
    return index
}

