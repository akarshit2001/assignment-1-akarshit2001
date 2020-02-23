package Defination;

import adt.UseAdt;

public class linkedlist<E> implements UseAdt<E> {

    @Override
    public void add(Person item) {

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
