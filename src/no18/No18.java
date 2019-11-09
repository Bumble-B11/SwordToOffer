package no18;

import data.TreeNode;
import utils.BinaryTreeUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by bumblebee on 2019/11/9.
 * 输入两棵二叉树A和B，判断B是不是A的子结构
 */
public class No18 {

    public static void main(String[] args) {
        TreeNode rootA = BinaryTreeUtils.createBinaryTreeByArray(
                new Integer[]{8, 8, 7, 9, 2, null, null, null, null, 4, 7}, 0);

        TreeNode rootB = BinaryTreeUtils.createBinaryTreeByArray(
                new Integer[]{8, 9, 2}, 0);

        System.out.println(new No18().hasSubTree(rootA, rootB));

    }

    private boolean hasSubTree(TreeNode n1, TreeNode n2) {
        if (n1 == null || n2 == null) {
            return false;
        }
        List<TreeNode> rootList = new ArrayList<>();
        BinaryTreeUtils.preOrderTraversal(n1, root -> {
            if (root.val.equals(n2.val)) {
                rootList.add(root);
            }
        });

        for (TreeNode root : rootList) {
            if (containsBinaryTree(root, n2)) {
                return true;
            }
        }
        return false;
    }

    /**
     * @param n1 第一棵二叉树的根节点
     * @param n2 第二棵二叉树的根节点
     * @return 以n1、n2为根节点的两棵二叉树，是否有第一棵子树包含第二棵子树
     * */
    private boolean containsBinaryTree(TreeNode n1, TreeNode n2) {
        if (n2 == null) {
            return true;
        }
        if (n1 == null) {
            return false;
        }

        if (!n1.val.equals(n2.val)) {
            return false;
        }

        return containsBinaryTree(n1.left, n2.left) && containsBinaryTree(n1.right, n2.right);
    }
}
