package Lectures.PriorityQueue;

/**
 * Node
 */
public class PriorityQueueNode<T> {
    private int priority;
    private T element;
    private PriorityQueueNode<T> left;
    private PriorityQueueNode<T> right;

    public PriorityQueueNode(int priority) {
        
    }

    private int getPriority() {
        return this.priority;
    }

    private void setPriority(int priority) {
        this.priority = priority;
    }

    public T getElement() {
        return element;
    }

    public void setElement(T element) {
        this.element = element;
    }

    public PriorityQueueNode<T> getLeft() {
        return left;
    }

    public void setLeft(PriorityQueueNode<T> left) {
        this.left = left;
    }

    public PriorityQueueNode<T> getRight() {
        return this.right;
    }

    public void setRight(PriorityQueueNode<T> right) {
        this.right = right;
    }
}