package Defination;

import java.util.ArrayList;
import java.util.Scanner;

public class Operational {
    Person person;
    public void addContact(linkedlist link) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list1 = new ArrayList<>();
        System.out.println("PLease fill the entry carefully");
        System.out.println("Please enter the name of the Person");
        System.out.print("FirstName :");
        String First = sc.next();
        System.out.print("LastName:");
        String Last = sc.next();
        System.out.println("Contact Number");
        list1.add(sc.next());
        while (true) {
            System.out.println("Would you like to add another number :y/n");
            String order = sc.next();
            if (order.equals("y")) {
                list1.add(sc.next());
            } else if (order.equals("n")) {
                break;
            } else {
                System.out.println("Hey ! please enter valid command");
            }
        }
        String email = "";
        while (true) {
            System.out.println("Would you want to add email Id :y/n");

            String order1 = sc.next();

            if (order1.equals("y")) {
                email = sc.nextLine();
            } else if (order1.equals("n")) {
                int p = 1;
                break;
            } else {
                System.out.println("Hey ! please enter valid command");
            }
        }
        link.add(new Person(First, Last, list1, email));
    }

    public void viewCOntact(linkedlist<Person> list) {
        linkedlist<Person> lis = new linkedlist<>();
        //lis = list.sort(list);
        lis.print();

    }

    public void searchContact(String Name, linkedlist list) {

    }

    public void deleteContact(linkedlist linkedlist) {

    }
}
