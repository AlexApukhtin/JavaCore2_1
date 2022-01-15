package org.example;

import java.util.*;

public class Guide {

    public static void main(String[] args) {

        String surn = "Громова";
        ArrayList<People> people = new ArrayList<>(Arrays.asList(
                new People("8-903-220-39-12", "Политова"),
                new People(" 8-916-705-75-66", "Громова"),
                new People("8-925-146-75-46", "Вахрулина"),
                new People("8-909-512-45-80", "Политова")
        ));

        people.add(new People("8-495-368-75-52", "Жук"));

        Iterator<People> iter = people.iterator();
        while (iter.hasNext()) {
            String surname = iter.next().getSurname();
            if (surn.equals(surname) == false) {
                iter.remove();
            }
        }

        System.out.println(people);
    }
}
