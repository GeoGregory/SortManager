package com.example.gg.sorters;

import java.util.Arrays;

/**
 * This is a class to sort an array with a Binary Tree sort algorithm, it also returns how long it took.
 * <p>
 *     Implements the @{@link Sortable} interface.
 * </p>
 */

public class BinarySorter implements Sortable {

    private Node rootNode;
    private int count, index;
    private long time;

    /**
     * Gives the user a message confirming which sorter has been chosen along with what the
     * array looks like before sorting. Then uses a private method to sort the array.
     * @param array Input array from @{@link com.example.gg.display.ArrayGen}.
     * @return Gives back a sorted array.
     */
    @Override
    public int[] sort(int[] array) {
        System.out.println("Sorting using the Binary Tree Sorter");
        System.out.println("Before sorting:");
        System.out.println(Arrays.toString(array));
        binarySorter(array[0]);
        addElements(Arrays.copyOfRange(array, 1, array.length));
        time = System.nanoTime();
        return getSortedTreeAsc();
    }

    /**
     * Returns how long the sorter took to sort the algorithm.
     * @return Gives back the time in nanoseconds that the sorting algorithm took to sort the array.
     */
    @Override
    public long timeTaken() {
        return System.nanoTime() - time;
    }

    /**
     * BinarySorter constructor.
     * @param element requires the first int of the array and sets it as the root node.
     */
    public void binarySorter(final int element){
        rootNode = new Node(element);
        count++;
    }

    /**
     * Populates the Binary tree with the rest of the array.
     * @param elements array from @{@link com.example.gg.display.ArrayGen} minus the first int in the list.
     */
    public void addElements(int[] elements) {
        for (int element: elements) {
            addNodeToTree(rootNode, element);
            count++;
        }
    }

    /*
    Uses recursion to go through the Binary Tree and get the value on the far left of the tree,
    the recursion stops when the far left value is found and adds the value to the index position,
    the recursion then continues for all the values to the right of the tree, and their equivalent
    value and position in the array.
     */
    private int traverseBinaryTree(Node node, int[] array, int index) {
        this.index = index;
        if (node != null) {
            index = traverseBinaryTree(node.getLeftChild(), array, index);
            array[index++] = node.getValue();
            index = traverseBinaryTree(node.getRightChild(), array, index);
        }
        return index;
    }

    // Creates a new int array with the length of count, then uses traverseBinaryTree() to get a sorted array
    private int[] getBinaryTree(){
        this.index = 0;
        int[] finalBinaryTree = new int[count];
        traverseBinaryTree(rootNode, finalBinaryTree, index);
        return  finalBinaryTree;
    }

    /**
     * Calls on a private method that uses recursion to go through the Binary Tree.
     * @return Gives back the sorted array.
     */
    public int[] getSortedTreeAsc() {
        return getBinaryTree();
    }

    /*
    Using the node and element arguments, the method gets the value of the current node,
    depending on if the value is lower or higher than the element argument, the method will check
    the appropriate child value, if there is no child value, the element will be added as a node.
     */
    private void addNodeToTree(Node node, int element) {
        if (element <= node.getValue()) {
            if (node.isLeftChildEmpty()) {
                node.setLeftChild(new Node(element));
            } else {
                addNodeToTree(node.getLeftChild(), element);
            }
        } else if (element > node.getValue()) {
            if (node.isRightChildEmpty()) {
                node.setRightChild(new Node(element));
            } else {
                addNodeToTree(node.getRightChild(), element);
            }
        }
    }
}