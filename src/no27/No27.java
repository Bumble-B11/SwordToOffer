package no27;

import data.TreeNode;
import utils.BinaryTreeUtils;

/**
 * Created by bumblebee on 2019/11/10.
 * 将二叉搜索树转化为排序的双向链表
 */
public class No27 {

    private TreeNode mLastInList;

    public static void main(String[] args) {
        TreeNode root = BinaryTreeUtils.createBinaryTreeByArray(
                new Integer[]{10, 6, 14, 4, 8, 12, 16}
        );

        new No27().convert(root);
        while (root.left != null) {
            root = root.left;
        }
        System.out.println(root.val);
    }

    private void convert(TreeNode root) {
        if (root == null) {
            return;
        }

        convert(root.left);
        root.left = mLastInList;

        if (mLastInList != null) {
            mLastInList.right = root;
        }
        mLastInList = root;
        convert(root.right);
    }
}
