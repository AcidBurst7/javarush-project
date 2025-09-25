package com.javarush.task.pro.task15.task1506;

import java.io.File;
import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/* 
Фейсконтроль
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        //C:\Users\varak\javarush\3449488\javarush-project\src\com\javarush\task\pro\task15\task1506\file.txt
        try(Scanner scanner = new Scanner(System.in))
        {
            List<String> lines = Files.readAllLines(Paths.get(scanner.nextLine()));
            lines.forEach(str -> {
                char[] chars = str.toCharArray();
                for (char ch : chars) {
                    if (ch != ' ' && ch != '.' && ch != ',') {
                        System.out.print(ch);
                    }
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

