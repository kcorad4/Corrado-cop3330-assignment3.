package ex42;

//imports
import java.util.*;
import java.io.*;
import java.util.Scanner;

public class Parsing {

    //methode to take information and re format it
    public void printDetails(String filename) {
        try {
            File file = new File(filename);
            Scanner sc = new Scanner(file);

            //keep parsing while still has data
            while (sc.hasNext()) {
                String s = sc.nextLine();
                String[] temp = s.split(",");
                System.out.printf("%-17s%-17s%-17s\n", temp[0], temp[1], temp[2]);
            }

        //throw exception if no file located
        } catch (FileNotFoundException ex) {
            System.out.println("Error: File Not Found!!");
        }
    }//close print details

    //main
    public static void main(String[] args) {

        Parsing emp = new Parsing();
        System.out.printf("%-17s%-17s%-17s\n", "Last", "First", "Salary");
        System.out.println("----------------------------------------");
        emp.printDetails("exercise42_input.txt");
    }//end main

}//end class


