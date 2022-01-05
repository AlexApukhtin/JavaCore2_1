package org.example.DZ2;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static int iLength = 4;
    private static int jLength = 4;

    public static void main(String[] args) {
        String[][] array = new String[iLength][jLength];
        //getArrayNew(array);
        System.out.println(Arrays.deepToString(getArrayNew(array)));
    }

    public static String[][] getArrayNew(String[][] arrayNew){
        String[][] arrayCopy = Arrays.copyOf(arrayNew, 4);
        getArrayCopy(arrayCopy);
        int sum =0;
        int[][] arrInt = new int[arrayCopy.length][getArrayCopy_I(arrayNew)];
        int count=0;
        for (int i = 0; i < arrInt.length; i++) {
            for (int j = 0; j < arrInt[i].length; j++) {
                do {
                    try{
                        arrInt[i][j] = Integer.parseInt(arrayCopy[i][j]);
                        sum += arrInt[i][j];
                        count++;
                    }catch (NumberFormatException fe){
                        fe.printStackTrace();
                        throw new MyArrayDataException(i,j);
                    }
                }while (count==0);
            }
            if (count==arrInt.length* arrInt[i].length){
                System.out.println("sum= "+ sum);
            }
        }
        return arrayNew;
    }

    public static int getArrayCopy_I(String[][] arr){
        int length = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                length=arr[i].length;
            }
        }
        return length;
    }

    public static String[][] getArrayCopy(String[][] arrayFinal){
        for (int i = 0; i < arrayFinal.length; i++) {

            try{
                if(arrayFinal.length!=iLength || arrayFinal[i].length!=jLength){
                    throw new MyArraySizeException(iLength, jLength);
                }
            }catch (MyArraySizeException se){
                se.printStackTrace();
                System.exit(18);
            }
            for (int j = 0; j < arrayFinal[i].length; j++) {
                Scanner sc = new Scanner(System.in);
                String str = sc.nextLine();
                arrayFinal[i][j]= str;
            }
        }
        return arrayFinal;
    }
}
