package com.ssp.myapp

/**
 * @author       ShiShaoPo
 * @time         2021/8/31
 * @description
 */
fun main() {
    "4/2+3-(8+3)*4"
    val array = intArrayOf(1, 2, 1)
    val result = maxArea(array)
    println(result)
}

fun maxArea(height: IntArray): Int {
    var maxArea = 0
    var leftIndex = 0
    var rightIndex = height.size - 1
    while (leftIndex < rightIndex) {
        val leftValue = height[leftIndex]
        val rightValue = height[rightIndex]
        val area = Math.min(leftValue, rightValue) * (rightIndex - leftIndex)
        maxArea = Math.max(maxArea, area)
        if (leftValue < rightValue) {
            leftIndex++
        } else {
            rightIndex--
        }
    }
    return maxArea
}