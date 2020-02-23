package adt;

import Defination.Person;

public interface UseAdt<E> {
        void add(Person item);

        int search(String item);

        void print();

        boolean remove(int index);

        void show();

}

}
