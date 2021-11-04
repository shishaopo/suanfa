package com.ssp.myapp.niuke

/**
 * @Description:
 * @Author:         ShiShaoPo
 * @CreateDate:     2021/10/19 3:50 下午
 */
fun main() {

}

/**
 * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
 * max:3
 *  abbba
 * @param array int整型一维数组
 * @return int整型
 */
fun FindGreatestSumOfSubArray(array: IntArray): Int {
    var max = 0
    for (i in array) {
        max += i
    }
    var left = 0
    var right = array.size - 1
    var currentTotal = max
    while (left < right) {
        val leftValue = array[left]
        val rightValue = array[right]

        val currentValue = if (leftValue < rightValue) {
            left++
            leftValue
        } else {
            right--
            rightValue
        }
        currentTotal -= currentValue
        max = Math.max(currentTotal, max)
    }
    return max
}