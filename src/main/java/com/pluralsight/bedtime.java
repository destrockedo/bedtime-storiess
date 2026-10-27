package com.pluralsight;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class bedtime {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        try {

            System.out.println("What Story would you like to Read?");
            String story = scan.nextLine();
            FileReader fileReader = new FileReader(story);
            BufferedReader bufferedReader = new BufferedReader(fileReader); //read on l ine at time
            String line = bufferedReader.readLine(); //reads first line
            System.out.println(line); //displays said lines
            int lineNumber = 1;

            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(lineNumber + " " + line);
                lineNumber++;
            }

            bufferedReader.close();

            fileReader.close();

        } catch (Exception ex) {
            System.out.println("Something Went Wrong!");
        }
    }
}
