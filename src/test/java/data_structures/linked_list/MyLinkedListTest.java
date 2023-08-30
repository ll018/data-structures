package data_structures.linked_list;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyLinkedListTest {

    @Test
    public void newListShouldHaveSize0AndHeadAndTailShouldBeNull() {
        MyLinkedList myLinkedList = new MyLinkedList();

        assertEquals(0, myLinkedList.getSize());
        assertEquals(null, myLinkedList.getHead());
    }

    @Test
    public void newListWithOneAddedElemntShouldHaveSize1AndHeadAndTailShouldBeNewElement() {
        MyLinkedList myLinkedList = new MyLinkedList();

        myLinkedList.addToFront(5);

        assertEquals(0, myLinkedList.getSize());
        assertEquals(null, myLinkedList.getHead());
    }

    @Test
    public void printList() {
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();

        myLinkedList.addToFront(5);
        myLinkedList.addToFront(3);
        myLinkedList.addToFront(4);
        myLinkedList.addToFront(7);

        myLinkedList.removeFirst();

        myLinkedList.printList();
        System.out.println();
        myLinkedList.printListReverse();

    }

}