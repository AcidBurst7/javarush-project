package com.javarush.task.pro.task15.task1504;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

/*
Перепутанные байты
*/

public class Solution {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in);
            var inputStream = Files.newInputStream(Paths.get(sc.nextLine()));
            var outStream = Files.newOutputStream(Paths.get(sc.nextLine()))) {
            byte[] inputBytes = inputStream.readAllBytes();
            byte[] outputBytes = new byte[inputBytes.length];
            for (int i = 0; i < inputBytes.length; i += 2) {
                if (i < inputBytes.length - 1) {
                    outputBytes[i] = inputBytes[i + 1];
                    outputBytes[i + 1] = inputBytes[i];
                } else {
                    outputBytes[i] = inputBytes[i];
                }
            }
            outStream.write(outputBytes);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

