package org.example.DZ3;

import java.util.ArrayList;
import java.util.Iterator;

public class People {

    protected String surname;
    protected String phone;

    public People(String phone, String surname) {
        this.surname = surname;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "People{" +
                "surname='" + surname + '\'' +
                ", phone='" + phone + '\'' +
                '}'+ '\n';
    }

    public String getSurname() {
        return surname;
    }

    protected static ArrayList<People> getPeople(String surn) {
        int count= 0;
        ArrayList<People> list = new ArrayList<>();
        Iterator<People> iter = Guide.addPeople().iterator();
        while (iter.hasNext()) {
            String surname = iter.next().getSurname();
            if (!surn.equals(surname)) {
                list.add(Guide.addPeople().get(count));
                iter.remove();
            }
            count++;
        }
        return list;
    }
}
