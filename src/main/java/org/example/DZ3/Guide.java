package org.example.DZ3;

import java.util.*;

public class Guide {

    public static void main(String[] args) {
        String surn = "Громова";
        System.out.println(addPeople());
        System.out.println(getPeople(surn));
    }

    private static ArrayList<People> addPeople() {
        ArrayList<People> people = new ArrayList<>(Arrays.asList(
                new People("8-903-220-39-12", "Политова"),
                new People(" 8-916-705-75-66", "Громова"),
                new People("8-925-146-75-46", "Вахрулина"),
                new People("8-909-512-45-80", "Политова")
        ));
        return people;
    }

    private static ArrayList<People> getPeople(String surn) {
        int count= 0;
        ArrayList<People> list = new ArrayList<>();
        Iterator<People> iter = addPeople().iterator();
        while (iter.hasNext()) {
            String surname = iter.next().getSurname();
            if (!surn.equals(surname)) {
                list.add(addPeople().get(count));
                iter.remove();
            }
            count++;
        }
        return list;
    }
}
