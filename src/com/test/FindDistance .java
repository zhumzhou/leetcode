package com.test;


import java.util.LinkedList;

class FindDistance {
    //共同祖先
    public TreeNode getPar(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root == p || root == q) {
            return root;
        }
        TreeNode left = getPar(root.left, p, q);
        TreeNode right = getPar(root.right, p, q);
        if (left != null && right != null) {
            return root;
        }
        return left == null ? right : left;
    }
    static boolean visited = false;
    public void getDisToPar(TreeNode root, TreeNode p, LinkedList<Integer> stack) {
        if (root == null) {
            return;
        }
        stack.push(root.val);
        if (!visited && root == p) {
            visited = true;
            return;
        }
        if (!visited) {
            getDisToPar(root.left, p, stack);
        }
        if (!visited) {
            getDisToPar(root.right, p, stack);
        }
        if (!visited) {
            stack.pop();
        }
        return;
    }
    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);
        TreeNode node6 = new TreeNode(6);
        TreeNode node7 = new TreeNode(7);
        TreeNode node8 = new TreeNode(8);
        node1.left = node2;
        node1.right = node3;
        node2.left = node4;
        node3.left = node5;
        node3.right = node6;
        node4.right = node7;
        node6.left = node8;
        FindDistance findDistance = new FindDistance();
        TreeNode par = findDistance.getPar(node1, node3, node7);
        LinkedList<Integer> stack1 = new LinkedList<>();
        LinkedList<Integer> stack2 = new LinkedList<>();
        findDistance.getDisToPar(par, node3, stack1);
        visited = false;
        findDistance.getDisToPar(par, node7, stack2);
        System.out.println(stack1.size() + stack2.size() - 2);
    }
}
class TreeNode {
    TreeNode left;
    TreeNode right;
    int val;

    public TreeNode(int val) {
        this.val = val;
    }
}
