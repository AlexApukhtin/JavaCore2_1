package org.example.DZ2;

public class MyArrayDataException extends RuntimeException{


    private static String MESSAGE = "Ошибка в %s-ой строке";
    private int i;

    public MyArrayDataException(int i, int j) {
        super(String.format(MESSAGE, i));
    }

    public MyArrayDataException(String message, Throwable cause) {
        super(message, cause);
    }

    public int getI() {
        return i;
    }
}
