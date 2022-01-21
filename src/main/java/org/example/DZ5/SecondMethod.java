package org.example.DZ5;

import java.util.Arrays;

public class SecondMethod {
    public static void main(String[] args) {
        arrayMT();
    }

    private static void arrayMT(){
        int num = 10_000_000;
        float[] arr = new float[num];
        Arrays.fill(arr,1.0f);
        long startTime = System.currentTimeMillis();
        float[] value1= Arrays.copyOfRange(arr, 0, arr.length/2 );
        float[] value2= Arrays.copyOfRange(arr, arr.length/2, arr.length);
        final Mass mass1 = new Mass(value1);
        final Mass mass2 = new Mass(value2);
        mass1.start();
        mass2.start();

        try {
            mass1.join();
            mass2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        int size = mass1.getArrayLength() + mass2.getArrayLength();
        //ArrayList<Float> fl = new ArrayList(Arrays.asList(mass1.getList(), mass2.getList()));
        //Float[][] array = fl.toArray(new Float[0][0]);
        //System.out.println(Arrays.toString(array));
        float[] finalArr = new float[size];
        System.arraycopy(mass1.getArray(), 0, finalArr, 0, size/2);
        System.arraycopy(mass2.getArray(), 0, finalArr, size/2, size/2);
        System.out.println("One thread time "+ (System.currentTimeMillis() - startTime));
    }
}

class Mass extends Thread{

    final float[] array;
    // ArrayList<Float> list = new ArrayList<>();

    Mass(float[] array){
        this.array = array;
    }

    public int getArrayLength(){
        return array.length;
    }

    public float[] getArray() {
        return array;
    }

    // public ArrayList<Float> getList() {
    //     return list;
    // }

    @Override
    public void run() {
        for (int i = 0; i < array.length; i++) {
            array[i] = (float) (array[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            //list.add(array[i]);
        }
    }
}
