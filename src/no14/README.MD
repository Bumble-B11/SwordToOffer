No14
将数组中的数分为两部分，所有奇数在前半部分，所有偶数在后半部分

> Example1
> Input: 1, 2, 3, 4, 5, 6, 7, 8, 9 
> Output: 1, 9, 3, 7, 5, 6, 4, 8, 2
>
>
解题思路：
对时间复杂度有要求，肯定不能从头向后遍历数组，发现奇数后想第一个偶数前面插入。
有两种方案
1. 开辟一个新数组，和老数组等长。一个指针指向新数组的头部，一个指针指向新数组的尾部。
遍历老数组
- 如果是奇数，则使用头部指针赋值，并向后移动头部指针；
- 如果是偶数，则使用尾部指针赋值，并向前移动尾部指针；
这种方案时间复杂度为O(n), 空间复杂度为O(n)

2. 对老数组使用头尾两个指针。头指针总是指向第一个偶数，尾指针总是指向最后一个奇数，然后将其交换，
循环此过程直到头指针与尾指针相遇

需要注意的点是，每一次交换前一定要判断头尾指针的顺序，如果在循环体内移动指针，可能头指针已经走到了尾指针后面。
这种方案时间复杂度为O(n), 空间复杂度为O(1)，空间上比第一种方案好