package org.example.DZ1;

public class Main {

    public static void main(String[] args) {

        Player[] players = {
                new Human(),
                new Robot(),
                new Cat()
        };

        Action[] actions ={
                new Human(),
                new Robot(),
                new Cat()
        };

        for( Player player : players){
            //for (Action action : actions) {
            if (player.jump() > player.getHeightJump()) {
                System.out.println("Препятствие преодолено");
                if (player.run() > player.getLengthTreadMill()) {
                    System.out.println("Препятствие преодолено");
                } else {
                    System.out.println("Дистанция длинее");
                    //continue;
                }
            } else {
                System.out.println("Стена выше. Падение!!!");
                continue;
            }
            //}
        }
    }
}

