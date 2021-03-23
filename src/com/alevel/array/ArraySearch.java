package com.alevel.array;

import java.util.Random;

public class ArraySearch {
    public static void main(String[] args) {
        int [] arr = new int[8];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10);
            System.out.print(arr[i]);
        }
        System.out.println();
        int difElem=0;
        for (int i = 0; i < arr.length; i++) {
            int currentElem=arr[i];
            boolean doubleNotFond=true;
            for (int j = 0; j < i; j++)
                if (arr[j]==currentElem)
                    doubleNotFond=false;
            if (doubleNotFond)
                difElem++;
        }
        System.out.println("Different elems: "+difElem);
    }
}
