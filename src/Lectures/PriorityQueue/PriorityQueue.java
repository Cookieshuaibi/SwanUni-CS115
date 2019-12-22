package Lectures.PriorityQueue;

import java.util.Queue;

/**
 * PriorityQueue
 */
public class PriorityQueue<T> {

    private PriorityQueueNode<T> root;
    private Queue<PriorityQueueNode<T>> nextLevelNodes;

    private PriorityQueueNode<T> getRoot() {
        return this.root;
    }

    private void setRoot(PriorityQueueNode<T> root) {
        this.root = root;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void enqueue(T element) {
        if (this.isEmpty()) {
            this.setRoot(new PriorityQueueNode<>());
        }
    }

    public void dequeue() {

    }

    public T peek() {
        return this.getRoot().getElement();
    }
}