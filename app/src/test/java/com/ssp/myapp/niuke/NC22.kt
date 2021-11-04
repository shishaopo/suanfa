package com.ssp.myapp.niuke

/**
 * @Description:
 * @Author:         ShiShaoPo
 * @CreateDate:     2021/10/18 4:49 下午
 */
fun main() {
    val a = intArrayOf(1, 5, 6, 0, 0, 0)
    val b = intArrayOf(2, 3, 4)
    merge(a, 3, b, 3)
}


fun merge(A: IntArray, m: Int, B: IntArray, n: Int) {
    var leftIndex = m - 1
    var rightIndex = n - 1
    var currentIndex = m + n - 1
    while (currentIndex >= 0) {
        var leftValue = Int.MIN_VALUE
        if (leftIndex >= 0) {
            leftValue = A[leftIndex]
        }
        var rightValue = Int.MIN_VALUE
        if (rightIndex >= 0) {
            rightValue = B[rightIndex]
        }
        A[currentIndex] = if (leftValue > rightValue) {
            leftIndex--
            leftValue
        } else {
            rightIndex--
            rightValue
        }
        currentIndex--
    }
    println(A.contentToString())
}