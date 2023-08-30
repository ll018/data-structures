package data_structures.linked_list;

import java.util.Objects;
import java.util.Optional;


// Often best when you want to add and remove stuff in the front of the list
// When list grows it doesn't resize since the memory is distributed
// Extra overhead because we have to store extra field
// Not good if we want to random access data
// but good if you want to load lots of data into the list and only are
// interested in what's at the beginning
public class MyLinkedList<T> {
    private LLNode head;
    private int size;

    public MyLinkedList() {
        size = 0;
    }

    public void addToFront(T value) {
        var newNode = new LLNode<>(value);
        newNode.setNext(head);
        head = newNode;

        size++;
    }

    public Optional<Object> removeFirst() {
        if (isEmpty()) {
            return Optional.empty();
        }

        var firstItem = head;
        head = firstItem.getNext();
        size--;

        return Optional.of(firstItem.getValue());
    }

    public void printList() {
        var current = head;

        while (current != null) {
            System.out.println(current);
            current = current.getNext();
        }
    }

    public boolean isEmpty() {
        return head == null;
    }


    public void printListReverse() {
        printNode(head);
    }

    private void printNode(LLNode LLNode) {
        if(LLNode.getNext() != null) {
            printNode(LLNode.getNext());
        }
        System.out.println(LLNode);
    }

    public LLNode getHead() {
        return head;
    }

    public void setHead(LLNode head) {
        this.head = head;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyLinkedList that = (MyLinkedList) o;
        return size == that.size && Objects.equals(head, that.head);
    }

    @Override
    public int hashCode() {
        return Objects.hash(head, size);
    }

    @Override
    public String toString() {
        return "MyLinkedList{" +
                "head=" + head +
                ", size=" + size +
                '}';
    }
}
