package Defination;

import adt.UseAdt;

public class linkedlist<E> implements UseAdt<E> {
    private Node head = null;
    private int size = 0;

    public Node getIndex(int index) {
        Node response = head;
        for (int i = 0; i < index; i++) {
            response = response.getNext();
        }
        return response;
    }

    private void addFirst(Person item) {
        head = new Node(item, head);
        size = size + 1;

    }

    private void addAfter(Node node, Person item) {
        node.next = new Node(item, node.next);
        size = size + 1;
    }

    private void add(int index, Person item) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException(Integer.toString(index));
        } else if (index == 0) {
            addFirst(item);
        } else {
            Node temp = getIndex(index - 1);
            addAfter(temp, item);
        }
    }

    @Override
    public void add(Person item) {
        add(size, item);
    }

    @Override
    public int search(String item) {
        return 0;
    }

    @Override
    public void print() {

    }

    @Override
    public boolean remove(int index) {
        return false;
    }

    @Override
    public void show() {

    }

    private static class Node {
        private Person data;
        private Node next;

        public Node(Person data) {
            this.data = data;
        }

        public Node(Person data, Node next) {
            this.data = data;
            this.next = next;
        }

        public Person getData() {
            return data;
        }

        public Node getNext() {
            return next;
        }
    }
}
