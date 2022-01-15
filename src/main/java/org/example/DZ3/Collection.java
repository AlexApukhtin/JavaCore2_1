package org.example.DZ3;

import java.util.ArrayList;
import java.util.LinkedList;

public class Collection {

    public static void main(String[] args) {
        int count=0;
        LinkedList<String> month = new LinkedList<>();
        ArrayList<Integer> value = new ArrayList<>();
        String[] str = {"January", "February", "March", "April", "May", "June", "July", "August", "October", "August", "November", "December", "February", "October", "August"};

        for (int i = 0; i < str.length; i++) {
            month.add(str[i]);
            count++;
            value.add(1);
            for ( int j = 0; j < i; j++) {
                if(str[j].equals(str[i])==true){
                    count--;
                    if(value.get(j)>1 ){
                        count++;
                    }else {
                        month.removeLast();
                    }
                    value.set(j,value.get(j)+1);
                }
            }
        }

        for (int j = 0; j < month.size(); j++) {
            if(month.get(j).equals(str[j])==false){
                value.set(j,1);
                //value.remove(j);
            }
            System.out.println("Слово " + month.get(j)+ " встречается "+ value.get(j)+ " раз.");
        }
        System.out.println(month);
        System.out.println("Кол-во уникальных слов = "+ count);
        System.out.println(value);
    }
}
