package org.example.DZ3;

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

    public String getPhone() {
        return phone;
    }
}
