package utils;

import data.BinaryTreeNode;

/**
 * Created by bumblebee on 2019/11/9.
 */
public class BinaryTreeUtils {

    public static BinaryTreeNode createBinaryTreeByArray(Integer[] array, int index) {
        if (array == null || index >= array.length) {
            return null;
        }

        if (array[index] == null) {
            return null;
        }

        BinaryTreeNode root = new BinaryTreeNode(array[index]);
        root.left = createBinaryTreeByArray(array, index * 2 + 1);
        root.right = createBinaryTreeByArray(array, index * 2 + 2);

        return root;
    }

    public static void preOrderTraversal(BinaryTreeNode root, TraversalCallback callback) {
        if (root == null) {
            return;
        }

        if (callback != null) {
            callback.onTraversal(root);
        }
        preOrderTraversal(root.left, callback);
        preOrderTraversal(root.right, callback);
    }

    public static void inOrderTraversal(BinaryTreeNode root, TraversalCallback callback) {
        if (root == null) {
            return;
        }

        inOrderTraversal(root.left, callback);
        if (callback != null) {
            callback.onTraversal(root);
        }
        inOrderTraversal(root.right, callback);
    }

    public static void postOrderTraversal(BinaryTreeNode root, TraversalCallback callback) {
        if (root == null) {
            return;
        }

        postOrderTraversal(root.left, callback);
        postOrderTraversal(root.right, callback);
        if (callback != null) {
            callback.onTraversal(root);
        }
    }

    /*只有两棵二叉树完全相同才会返回true，否则返回false*/
    public static boolean isSameBinaryTree(BinaryTreeNode n1, BinaryTreeNode n2) {
        if (n1 == null && n2 == null) {
            return true;
        }
        if (n1 == null || n2 == null) {
            return false;
        }

        if (!n1.val.equals(n2.val)) {
            return false;
        }

        return isSameBinaryTree(n1.left, n2.left) && isSameBinaryTree(n1.right, n2.right);
    }

    public interface TraversalCallback {
        void onTraversal(BinaryTreeNode root);
    }
}
