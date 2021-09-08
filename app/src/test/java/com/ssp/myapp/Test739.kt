package com.ssp.myapp

import java.util.*

/**
 * @author       ShiShaoPo
 * @time         2021/9/5
 * @description
 */
fun main() {

}

/**
 * 请根据每日 气温 列表 temperatures，请计算在每一天需要等几天才会有更高的温度。如果气温在这之后都不会升高，请在该位置用0 来代替。

示例 1:
输入: temperatures = [73,74,75,71,69,72,76,73]
输出:[1,1,4,2,1,1,0,0]

示例 2:
输入: temperatures = [30,40,50,60]
输出:[1,1,1,0]

示例 3:
输入: temperatures = [30,60,90]
输出: [1,1,0]

提示：
1 <=temperatures.length <= 105
30 <=temperatures[i]<= 100

示例 1:
输入: temperatures = [75,71,69,72,76,73]
输出:[4,2,1,1,0,0]

result = [4,2,1,1,0,0]
stack = [76,73]
 */
fun dailyTemperatures(temperatures: IntArray): IntArray {
    val result = IntArray(temperatures.size)
    val indexStack = LinkedList<Int>()
    temperatures.forEachIndexed { index, i ->
        while (indexStack.isNotEmpty() && i > temperatures[indexStack.element()]) {
            val top = indexStack.pop()
            result[top] = index - top
        }
        indexStack.push(index)
    }
    return result
}