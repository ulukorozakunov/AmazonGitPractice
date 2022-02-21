package com.digital_nomads.javaFall2021;
import java.io.FileWriter;
import java.io.IOException;

public class Demo11 {
    public static void main(String[] args) {

        try {
            FileWriter myWriter = new FileWriter("filename.txt");
            myWriter.write("Files in Java might be tricky, but it is fun enough!");
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }finally {
            System.out.println("Finally is ");
        }

        int a [] = new int[4];
//        System.out.println(Demo11.test());
    }

    public static boolean test (int b []) throws Exception{
        int a [] = new int [b.length];
        return false;
    }
}
