package ru.sbergraduate;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            File file = new File("e:/base.csv");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()){
                String [] split = scanner.nextLine().split(";",6);
                String model = String.format("City{name='%s', region='%s', district='%s', population=%s, foundation='%s'}",
                        split[1], split[2], split[3], split[4], split[5]);
                System.out.println(model);

            }
            scanner.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}