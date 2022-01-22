package org.example.DZ5;

import java.util.Arrays;

public class FirstMethod {
    public static void main(String[] args) {
        array();
    }

    private static void array(){
        int length = 10_000_000;
        float[] arr = new float[length];
        Arrays.fill(arr, 1.0f);
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        System.out.println("One thread time "+ (System.currentTimeMillis() - startTime)+ " ms.");
    }
}
