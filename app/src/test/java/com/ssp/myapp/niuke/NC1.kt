package com.ssp.myapp.niuke

/**
 * @Description:
 * @Author:         ShiShaoPo
 * @CreateDate:     2021/10/25 2:52 下午
 */
fun main() {

}

/**
 * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
 * 计算两个数之和
 * @param s string字符串 表示第一个整数
 * @param t string字符串 表示第二个整数
 * @return string字符串
 */
fun solve(s: String, t: String): String {
    var i1 = s.length - 1
    var i2 = t.length - 1
    var extra = 0
    var result = ""
    while (i1 >= 0 || i2 >= 0) {
        val int1 = if (i1 >= 0) {
            s[i1] - '0'
        } else {
            0
        }
        val int2 = if (i2 >= 0) {
            t[i2] - '0'
        } else {
            0
        }
        val total = int1 + int2 + extra
        result = (total % 10).toString() + result

        i1--
        i2--
        extra = if (total > 9) {
            1
        } else {
            0
        }
    }
    return result
}