package com.ssp.myapp.niuke

import java.util.*

/**
 * @Description:
 * @Author:         ShiShaoPo
 * @CreateDate:     2021/10/18 7:38 下午
 */
fun main() {
    sortArray(intArrayOf(5,2,3,1))
}

fun sortArray(nums: IntArray): IntArray {
    fastSort(nums, 0, nums.size - 1)
    return nums
}

fun fastSort(nums: IntArray, start: Int, end: Int) {
    if (start >= end) {
        return
    }
    val pivot = Random().nextInt(end - start + 1) + start
    swap(nums, pivot, end)
    var i = start
    var j = start + 1
    while (i < end && j < end) {
        if (nums[i] < nums[end]) {
            i++
            continue
        }
        if (j < i) {
            j = i + 1
        }
        if (nums[j] > nums[end]) {
            j++
            continue
        }
        if (j < end) {
            swap(nums, i, j)
        }
    }
    swap(nums, i, end)
    fastSort(nums, start, i - 1)
    fastSort(nums, i + 1, end)
}

private fun swap(intArray: IntArray, left: Int, right: Int) {
    if (left == right) {
        return
    }
    val temp = intArray[left]
    intArray[left] = intArray[right]
    intArray[right] = temp
}