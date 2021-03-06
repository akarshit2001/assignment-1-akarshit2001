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


    private Person removeAfter(Node node) {
        Person response = null;
        Node temp = node.getNext();
        if (temp != null) {
            node.next = temp.getNext();
            size--;

            response = temp.getData();
        }
        return response;
    }

    private Person removeFirst() {
        Person response = null;
        Node temp = head;
        if (head != null) {
            head = head.getNext();
        }
        if (temp != null) {
            size--;
            response = temp.getData();
        }
        return response;
    }

    public boolean removeAt(int index) {
        Person response = null;
        boolean re = false;
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException(Integer.toString(index));
        } else if (index == 0) {
            response = removeFirst();

            re = true;
        } else {
            Node pr = getIndex(index - 1);
            response = removeAfter(pr);
            re = true;
        }
        return re;
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
        Node reference = head;
        if (reference == null) {
            System.out.println("Sorry! No contact is present.");
        } else {
            System.out.println("---Here are all your contacts---");
            while (reference != null) {
                System.out.println("-------- * -------- * -------- * --------");
                System.out.print("FirstName :" + reference.data.getFirst() + "\n");
                System.out.println("LastName :" + reference.data.getLast());
                if (reference.data.getList().size() > 1) {
                    System.out.print("Contacts Number (s): ");
                    for (int i = 0; i < reference.data.getList().size(); i++) {
                        System.out.print(reference.data.getList().get(i) + (i < reference.data.getList().size() - 1 ? ", " : ""));
                    }

                } else if (reference.data.getList().size() == 1) {
                    System.out.print("Contact Number :" + reference.data.getList().get(0));

                }

                System.out.println(" ");
                if (reference.data.getEmail().size() > 1) {
                    System.out.print("Email ID (s): ");
                    for (int i = 0; i < reference.data.getEmail().size(); i++) {
                        System.out.print(reference.data.getEmail().get(i) + (i < reference.data.getEmail().size() - 1 ? ", " : ""));
                    }

                } else if (reference.data.getEmail().size() == 1) {
                    System.out.print("Email ID  :" + reference.data.getEmail().get(0));

                } else {
                    System.out.println("Email ID : ");
                }
                System.out.print("\n");
                System.out.println("-------- * -------- * -------- * --------");
                reference = reference.next;
            }
        }
    }

    @Override
    public boolean remove(int index) {
        return removeAt(index);

    }

    @Override
    public void show() {
        Node temp = head;
        for (int i = 0; i < size; i++) {
            if (temp != null) {
                String name = temp.data.getFirst() + " " + temp.data.getLast();
                System.out.println(i + 1 + " . " + name);
            } else {
                System.out.println(" No contact found");
            }
            temp = temp.next;
        }
    }


    public void printSearchitem(String name) {
        Node check = head;
        while (check != null) {
            System.out.println("........*.......*.......*.......*");
            if (check.data.getFirst().equals(name)) {
                System.out.print("FirstName :" + check.data.getFirst() + "\n");
                System.out.println("LastName :" + check.data.getLast());
                if (check.data.getList().size() > 1) {
                    System.out.println("Contact Number(s) :");
                    for (int i = 0; i < check.data.getList().size(); i++) {
                        System.out.print(check.data.getList().get(i) + (i < check.data.getList().size() - 1 ? ", " : ""));
                    }

                } else if (check.data.getList().size() == 1) {
                    for (int i = 0; i < check.data.getList().size(); i++) {
                        System.out.print("Contact Number : " + check.data.getList().get(i) + (i < check.data.getList().size() - 1 ? ", " : ""));
                    }
                }
                System.out.println(" ");
                if (check.data.getEmail().size() > 1) {
                    System.out.print("Email ID (s): ");
                    for (int i = 0; i < check.data.getEmail().size(); i++) {
                        System.out.print(check.data.getEmail().get(i) + (i < check.data.getEmail().size() - 1 ? ", " : ""));
                    }

                } else if (check.data.getEmail().size() == 1) {
                    System.out.print("Email ID  :" + check.data.getEmail().get(0));

                } else {
                    System.out.println("Email ID : ");
                }


                System.out.print("\n");

                System.out.println("........*.......*.......*.......*");

            }
            check = check.next;
        }
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



    public static class Node {
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
