package Defination;

import java.util.ArrayList;

public class Person {
    private String First;
    private String LastName;
    private ArrayList<String> list;
    private String email;

    public Person(String first, String last, ArrayList<String> list, String email) {
        First = first;
        LastName = last;
        this.list = list;
        this.email = email;
    }


    public String getFirst() {
        return First;
    }

    public void setFirst(String first) {
        First = first;
    }

    public String getLast() {
        return LastName;
    }

    public void setLast(String last) {
        LastName = last;
    }

    public ArrayList<String> getList() {
        return list;
    }

    public void setList(ArrayList<String> list) {
        this.list = list;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


}


