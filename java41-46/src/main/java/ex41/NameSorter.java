package ex41;

//imports
import java.util.*;
import java.io.*;

public class NameSorter {

//make a function to read in the data from input.txt
    public static void readNames(Scanner input, ArrayList<String> names) {

        //read every line in the file
        while (input.hasNextLine())
        {
            names.add(input.nextLine());
        }
    }//end methode read names


    //function for outputting the names
    public static void outputNames(ArrayList<String> names) throws IOException {

        // creating a FileWriter
        FileWriter output = new FileWriter("exercise41_output.txt");

        //header of the output file
        output.write("Total of " + names.size() + " names\n");
        output.write("--------------------\n");

        // writing names to file
        for (String i : names)
        {
            output.write(i + "\n");
        }

        // closing the output
        output.close();

    }//end output names methode

    //main
    public static void main(String[] args) throws FileNotFoundException {

        // scanner for input file
        Scanner inputFile = new Scanner(new File("exercise41_input.txt"));

        //ArrayList for storing the names
        ArrayList<String> names = new ArrayList<String>();

        //call read names to look at input file
        readNames(inputFile, names);

        //sort the names
        Collections.sort(names, String.CASE_INSENSITIVE_ORDER);

        // closing the scanner
        inputFile.close();

        //write to output file but check in case of failure
        try {
            outputNames(names);
        }

        // if output fails
        catch (Exception e)
        {
            System.out.println(e);
        }
    }//end main

}//end class name sorter


