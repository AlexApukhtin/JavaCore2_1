package org.example.DZ2;

public class MyArraySizeException extends RuntimeException{

    private static String MESSAGE = "Неправильная длина массива. Введите iLength=%s; jLength=%d. Проверьте длину массива arrayNew.";
    private int i;

    public MyArraySizeException(int i, int j) {
        super(String.format(MESSAGE, i, j));
    }

    public MyArraySizeException(String message, Throwable cause) {
        super(message, cause);
    }

    public int getI() {
        return i;
    }
}
