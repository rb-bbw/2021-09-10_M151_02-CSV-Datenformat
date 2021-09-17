package ch.bbw;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static ArrayList<Championship> lines = new ArrayList<>();

    public static void main(String[] args) {
        readFile();
        task2_2_1();
    }

    private static void readFile() {
        File path = new File("resources/realtime.csv");
        try {
            Scanner f = new Scanner(path);
            f.nextLine(); // skip column names

            while (f.hasNextLine()) {
                String data = f.nextLine(); // auto-skips empty lines (b.c. it skips line delims)
                lines.add(new Championship(data.split(";")));
            }
            f.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void task2_2_1(){
        for(Championship line: lines){
            if(line.getMonth() == 11){
                if(line.getDay() >= 19 && line.getDay() <= 25){
                    System.out.println("\""+line.event_title +"\" in "+ line.city);
                }
            }
        }
    }
}
