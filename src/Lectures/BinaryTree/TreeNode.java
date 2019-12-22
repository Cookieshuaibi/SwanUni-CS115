package Lectures.BinaryTree;

/**
 * TreeNode
 */
public class TreeNode<T> {
    private T element;
    private TreeNode<T> left;
    private TreeNode<T> right;

    public T getElement() {
        return element;
    }

    public void setElement(T element) {
        this.element = element;
    }

    public TreeNode<T> getLeft() {
        return left;
    }

    public void setLeft(TreeNode<T> left) {
        this.left = left;
    }

    public TreeNode<T> getRight() {
        return this.right;
    }

    public void setRight(TreeNode<T> right) {
        this.right = right;
    }
}