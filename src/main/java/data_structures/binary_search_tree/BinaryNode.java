package data_structures.binary_search_tree;

import data_structures.common.Node;

import java.util.Objects;

public class BinaryNode implements Node<Integer> {
    private final Integer value;
    private BinaryNode left;
    private BinaryNode right;

    public BinaryNode(Integer value) {
        this.value = value;
    }

    @Override
    public Integer getValue() {
        return value;
    }

    public boolean contains(Integer value) {
        if(value.intValue() == this.value.intValue()) {
            return true;
        } else if (value < this.value) {
            if(Objects.isNull(this.left)) {
                return false;
            } else {
                return left.contains(value);
            }
        } else {
            if(Objects.isNull(this.right)) {
                return false;
            } else {
                return right.contains(value);
            }
        }
    }

    public boolean insert(Integer value) {
        if(value.intValue() == this.value.intValue()) {
            return false;
        }
        if(value < this.value) {
            if(Objects.isNull(this.left)) {
                left = new BinaryNode(value);
                return true;
            } else {
                return left.insert(value);
            }
        } else {
            if(Objects.isNull(this.right)) {
                right = new BinaryNode(value);
                return true;
            } else {
               return right.insert(value);
            }
        }
    }

    @Override
    public String toString() {
        return "BinaryNode{" +
                "value=" + value +
                ", left=" + left +
                ", right=" + right +
                '}';
    }
}

