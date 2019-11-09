package no19;

import data.TreeNode;
import utils.BinaryTreeUtils;

/**
 * Created by bumblebee on 2019/11/9.
 * 求二叉树的镜像
 */
public class No19 {

    public static void main(String[] args) {
        TreeNode root = BinaryTreeUtils.createBinaryTreeByArray(
                new Integer[]{4, 2, 7, 1, 3, 6, 9}
        );

        root = new No19().invertTree(root);
        BinaryTreeUtils.preOrderTraversal(root, node -> System.out.println(node.val));
    }

    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }

        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        invertTree(root.left);
        invertTree(root.right);

        return root;
    }


}
