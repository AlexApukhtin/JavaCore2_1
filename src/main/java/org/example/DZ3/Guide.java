package org.example.DZ3;

import java.util.*;

public class Guide {

    public static void main(String[] args) {
        String surn = "Громова";
        System.out.println(addPeople());
        System.out.println(People.getPeople(surn));
    }

    protected static ArrayList<People> addPeople() {
        ArrayList<People> people = new ArrayList<>(Arrays.asList(
                new People("8-903-220-39-12", "Политова"),
                new People("8-916-705-75-66", "Громова"),
                new People("8-925-146-75-46", "Вахрулина"),
                new People("8-909-512-45-80", "Политова")
        ));
        return people;
    }
}
