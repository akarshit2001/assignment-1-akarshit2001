package Main;

import Defination.Operational;
import Defination.Person;
import Defination.linkedlist;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Operational p = new Operational();
        linkedlist<Person> ls = new linkedlist<Person>();
        boolean status = true;
        while (status) {
            System.out.println("Welcome to Akarshit Contact List App\n");
            System.out.println("Press 1 to add a new contact\n");
            System.out.println("Press 2 to view all contacts\n");
            System.out.println("Press 3 to search for a contact\n");
            System.out.println("Press 4 to delete a contact\n");
            System.out.println("Press 5 to exit program \n");
            System.out.print("Enter the choice: ");
            int option = sc.nextInt();
            switch (option) {
                case 1:
                    p.addContact(ls);
                    break;
                case 2:
                    p.viewCOntact(ls);
                    break;
                case 3:
                    System.out.println("Enter the first name that you want to search:");
                    String s = sc.next();
                    p.searchContact(s, ls);
                    break;
                case 4:
                    p.deleteContact(ls);
                    break;
                case 5:
                    System.out.println("Exiting...and Thank you!");
                    status = false;
                    break;
                default:
                    System.out.println("Enter the valid option");
            }

        }
    }
}
