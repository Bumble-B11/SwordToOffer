# No41
#### 题目描述
输入一个正数序列s，打印所有和为k的连续子序列
#### 输入、输出示例
> input: array = [1, 2, 3, 4, 5, 6, 7, 8], k = 15
> output: [1, 2, 3, 4, 5]
          [4, 5, 6]
          [7, 8]

#### 解题思路
使用一个队列来保存当前参与计算的数字。
遍历数组，如果当前队列里的数字和比k小，则入队下一个数字，并计算新的sum。
如果当前队列里的sum比k大，则出队第一个数字，计算新的sum
如果sum和k相等，则作为一种子序列，并出队第一个数字。

当数组遍历完后，队列里可能仍有剩余元素，则需要继续循环，直到队列为空或者sum小于k。
循环的过程中不断判断sum是否等于k，不等于则出队一个数字，计算新的sum