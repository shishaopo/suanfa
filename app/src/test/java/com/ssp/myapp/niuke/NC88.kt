package com.ssp.myapp.niuke

import kotlin.random.Random

/**
 * @author       ShiShaoPo
 * @time         2021/10/19
 * @description
 */
fun main() {
    val arr = intArrayOf(3,4,2,5,1,6,0,7)
    val result = findKth(arr,8,1)
    println(arr[result])
}

/**
 * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
 *
 * @param a int整型一维数组
 * @param n int整型
 * @param K int整型
 * @return int整型
 */
fun findKth(a: IntArray, n: Int, K: Int): Int {
    val index = fastSort(a,0,n-1,K)
    return a[index]
}

/**
 * [3,4,2,5,1,6,0,7]
 */
private fun fastSort(a: IntArray, start: Int, end: Int, K: Int): Int {
    if (start >= end) {
        return start
    }
    swap(a, Random.nextInt(start, end + 1), end)
    var highStartIndex = start
    var highEndIndex = start + 1
    while (highStartIndex < end && highEndIndex < end) {
        if (a[highStartIndex] < a[end]) {
            highStartIndex++
            continue
        }
        if (highEndIndex < highStartIndex) {
            highEndIndex = highStartIndex + 1
        }
        if (a[highEndIndex] > a[end]) {
            highEndIndex++
            continue
        }
        if (highEndIndex < end) {
            swap(a, highStartIndex, highEndIndex)
        }
    }
    swap(a, highStartIndex, end)
    val pivot = end - highStartIndex + 1
    return when {
        K == pivot -> {
            highStartIndex
        }
        K > pivot -> {
            fastSort(a, start, highStartIndex - 1, K - pivot)
        }
        else -> {
            fastSort(a, highStartIndex + 1, end, K)
        }
    }
}

private fun swap(nums: IntArray, i1: Int, i2: Int) {
    if (i1 == i2) {
        return
    }
    val temp = nums[i1]
    nums[i1] = nums[i2]
    nums[i2] = temp
}