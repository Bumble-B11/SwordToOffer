# No38
#### 题目描述
求一个数字在排序数组中出现的次数
#### 输入、输出示例
> input: array = [1, 2, 2, 3, 3, 3, 3, 3, 4, 5], k = 3
> output: 5

#### 解题思路
这道题是二分查找法的加强版。看到排序树组就一定要敏感可以用二分法查找。
这里的用法说明二分法不仅可以找到排序数组里某个数的下标，还可以找到
该数字第一次出现的下标和最后一次出现的下标。