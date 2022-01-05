package org.example.DZ2;

public class MyArrayDataException extends RuntimeException{


    private static String MESSAGE = "В массиве есть элемент типа String. Его координаты: i=%s; j=%d";
    private int i;

    public MyArrayDataException(int i, int j) {
        super(String.format(MESSAGE, i, j));
    }

    public MyArrayDataException(String message, Throwable cause) {
        super(message, cause);
    }
//
    public int getI() {
        return i;
    }
}
