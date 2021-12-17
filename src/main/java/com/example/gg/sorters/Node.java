package com.example.gg.sorters;


/**
 * Node class used by @{@link BinarySorter}.
 */
public class Node {
    private final int value;
    private Node leftChild;
    private Node rightChild;


    /**
     * Node constructor.
     * @param value value of the node represented by an int.
     */
    public Node(int value) {
        this.value = value;
    }


    /**
     * Get the value of a node.
     * @return Gives back value of a node.
     */
    public int getValue() {
        return value;
    }

    /**
     * Gets the child on the left of the current node.
     * @return Gives back the left child node.
     */
    public Node getLeftChild() {
        return leftChild;
    }

    /**
     * Sets the child on the left of the current node.
     * @param leftChild requires a node representing the left child.
     */
    public void setLeftChild(Node leftChild) {
        this.leftChild = leftChild;
    }

    /**
     * Gets the child on the right of the current node.
     * @return Gives back the right child node.
     */
    public Node getRightChild() {
        return rightChild;
    }


    /**
     * Sets the child on the right of the current node.
     * @param rightChild requires a node representing the right child.
     */
    public void setRightChild(Node rightChild) {
        this.rightChild = rightChild;
    }


    /**
     * A boolean method to check if there is a left child of a known node.
     * @return true if leftChild is null, false if the node has a left child already.
     */
    public boolean isLeftChildEmpty() {
        if (leftChild == null) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * A boolean method to check if there is a right child of a known node.
     * @return true if rightChild is null, false if the node has a right child already.
     */
    public boolean isRightChildEmpty() {
        if (rightChild == null) {
            return true;
        } else {
            return false;
        }
    }
}
