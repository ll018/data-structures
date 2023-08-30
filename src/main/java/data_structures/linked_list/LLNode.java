package data_structures.linked_list;

import data_structures.common.Node;

import java.util.Objects;

class LLNode<T> implements Node<T> {

    private LLNode next;
    private T value;

    public LLNode(T value) {
        this.value = value;
    }

    public LLNode getNext() {
        return next;
    }

    public void setNext(LLNode next) {
        this.next = next;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LLNode<?> LLNode = (LLNode<?>) o;
        return Objects.equals(next, LLNode.next) && Objects.equals(value, LLNode.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(next, value);
    }

    @Override
    public String toString() {
        return value.toString();
    }
}
