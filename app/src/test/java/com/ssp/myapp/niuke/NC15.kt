package com.ssp.myapp.niuke

import com.ssp.myapp.TreeNode
import java.util.*
import kotlin.collections.ArrayList

/**
 * @Description:
 * @Author:         ShiShaoPo
 * @CreateDate:     2021/10/18 11:29 上午
 */
fun main() {

}

/**
 * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
 *
 * @param root TreeNode类
 * @return int整型二维数组
 */
fun levelOrder(root: TreeNode?): ArrayList<ArrayList<Int>> {
    val result = ArrayList<ArrayList<Int>>()
    val queue: Queue<TreeNode> = LinkedList<TreeNode>()
    if (root != null) {
        queue.offer(root)
    }
    while (queue.isNotEmpty()) {
        val currentLevelCount = queue.size
        val currentLevelList = ArrayList<Int>()
        for (i in (0 until currentLevelCount)) {
            val node = queue.poll()!!
            currentLevelList.add(node.`val`)
            if (node.left != null) {
                queue.offer(node.left)
            }
            if (node.right != null) {
                queue.offer(node.right)
            }
        }
        result.add(currentLevelList)
    }
    return result
}