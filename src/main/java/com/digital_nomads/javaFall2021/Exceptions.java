package com.digital_nomads.javaFall2021;

public class Exceptions {
    public static void main(String[] args) {

        try {
            int a[] = new int[3];
            System.out.println(a[4]);
        }catch (Exception e){
            System.out.println("GGG");
        }
    }
}
