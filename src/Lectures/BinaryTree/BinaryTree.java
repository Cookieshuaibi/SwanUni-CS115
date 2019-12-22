package Lectures.BinaryTree;

/**
 * BinaryTree
 */
public class BinaryTree<T> {
    private TreeNode<T> root;

    public TreeNode<T> getRoot() {
        return root;
    }

    public void setRoot(TreeNode<T> root) {
        this.root = root;
    }

    public void printPreOrderTraversal() {
        this.printPreOrderTraversal(this.getRoot());
    }

    public void printPreOrderTraversal(TreeNode<T> node) {
        System.out.println(node.getElement());
        this.printPreOrderTraversal(node.getLeft());
        this.printPreOrderTraversal(node.getRight());
    }

    public void printInOrderTraversal() {
        this.printInOrderTraversal(this.getRoot());
    }

    public void printInOrderTraversal(TreeNode<T> node) {
        this.printInOrderTraversal(node.getLeft());
        System.out.println(node.getElement());
        this.printInOrderTraversal(node.getRight());
    }

    public void printPostOrderTraversal() {
        this.printPostOrderTraversal(this.getRoot());
    }

    public void printPostOrderTraversal(TreeNode<T> node) {
        this.printPostOrderTraversal(node.getLeft());
        this.printPostOrderTraversal(node.getRight());
        System.out.println(node.getElement());
    }

    public void insert(TreeNode<T> node) {
        throw Exception();
    }
}