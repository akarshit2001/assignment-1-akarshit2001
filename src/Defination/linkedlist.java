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
        Node check = head;
        int c = 0;
        while (check != null) {
            if (check.data.getFirst().equals(item)) {
                c++;
            } else if (check == null) {
                int d = 0;

            }
            check = check.next;

        }
        return c;
    }

    @Override
    public void print() {
Node temp = head;
    }

    @Override
    public boolean remove(int index) {
        return false;
    }

    @Override
    public void show() {

    }

    public linkedlist<Person> sort(linkedlist<Person> lis) {
        Node check = head;
        Node index = null;
        int status;
        if (head == null) {
            return lis;
        } else {
            while (check != null) {
                index = check.next;
                while (index != null) {
                    status = check.data.getFirst().compareToIgnoreCase(index.data.getFirst());
                    if (status > 0) {
                        Person temp = check.data;
                        check.data = index.data;
                        index.data = temp;
                        index = index.next;
                    } else {
                        index = index.next;
                    }
                }
                check = check.next;
            }
        }
        return lis;
    }


    @Override
    public void sort() {

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
