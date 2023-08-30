package data_structures.binary_search_tree;

import data_structures.common.DataStructure;

import java.util.Objects;

public class BinarySearchTree implements DataStructure<Integer> {

    private BinaryNode root;

    @Override
    public boolean add(final Integer value) {
        Objects.requireNonNull(value, "Value can not be null");

        if(root == null) {
            root = new BinaryNode(value);
            return true;
        } else {
            return root.insert(value);
        }
    }

    public boolean contains(int value) {
        return Objects.nonNull(root) && root.contains(value);
    }

    @Override
    public Integer remove(Integer value) {
        return null;
    }

    @Override
    public Integer lookup(Integer value) {
        return null;
    }

    @Override
    public String toString() {
        return "BinarySearchTree{" +
                "root=" + root +
                '}';
    }
}
