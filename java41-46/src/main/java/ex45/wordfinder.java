package ex45;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class wordfinder {

    // main method thet throws IOException
    public static void main(String[] args) throws IOException {

        // create a object of Scanner class
        Scanner s = new Scanner(System.in);

        // prompt the name of output file from user
        System.out.print("\nEnter the output file : ");

        String outputfile = s.next();
        // create a object of ReadFile class

        Readfile rf = new Readfile();

        // read file
        rf.Readfile();

        // get the list contains data of file
        ArrayList<String> list = rf.getdata();

        // create a object of WriteFile
//       and passing output file name and list contains data
        Writefile wr = new Writefile(outputfile, list);

        // write file
        wr.Writefile();

        // and print the Number of Modifications on console
        System.out.println("\nThe Number of Modifications are : "+wr.getModification());

    }

}
