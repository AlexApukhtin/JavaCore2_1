package org.example.DZ2;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String[][] array = new String[4][4];
        //getArrayNew(array);
        System.out.println(Arrays.deepToString(getArrayNew(array)));
    }

    public static String[][] getArrayNew(String[][] arrayNew){
        String[][] arrayCopy = Arrays.copyOf(arrayNew, 4);
        getArrayCopy(arrayCopy, arrayNew.length);
        int sum =0;
        int[][] arrInt = new int[arrayCopy.length][getArrayCopy_I(arrayNew)];
        for (int i = 0; i < arrInt.length; i++) {
            for (int j = 0; j < arrInt[i].length; j++) {
                try{
                    if(arrInt[i][j]- arrInt[i][j]==0) {
                        arrInt[i][j] = Integer.parseInt(arrayCopy[i][j]);
                        sum += arrInt[i][j];
                    }else{
                        throw new MyArrayDataException(i,j);
                    }
                }catch (MyArrayDataException de){
                    de.printStackTrace();
                }
            }
        }
        System.out.println("sum= "+ sum);
        return arrayNew;
    }
//
    public static int getArrayCopy_I(String[][] arr){
        int length = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                length=arr[i].length;
            }
        }
        return length;
    }

    public static String[][] getArrayCopy(String[][] arrayFinal, int length){
        for (int i = 0; i < arrayFinal.length; i++) {

            try{
                if(arrayFinal.length!=length || arrayFinal[i].length!=length){
                    throw new MyArraySizeException(length,length);
                }
            }catch (MyArraySizeException se){
                se.printStackTrace();
            System.exit(15);
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
