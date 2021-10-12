package ex45;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Writefile {

    // instance variable
    private Writefile writer;
    private int count_Modification;
    private ArrayList<String> list;

    // constructor
    public Writefile(String name, ArrayList<String> list) throws IOException
    {

        // initialize variables
        writer = new Writefile("C:\\Users\\Kyle\\Documents\\JAVA\\Work3330\\java41-46"+name);
        this.list = list;

    }

    // write into file
    public void Writefile() throws IOException {

        // using for loop till size of list
        for(int i=0;i<list.size();i++)
        {
            String temp = list.get(i);
            String str = "utilize";

            int index = 0;

            // count the modifications
            while (true)
            {
                index = temp.indexOf(str, index);
                if (index != -1)
                {
                    count_Modification ++;
                    index += str.length();
                }
                else {
                    break;
                }
            }

            // modification
            temp = temp.replaceAll("utilize", "use");

            // and write into file
            writer.write(temp+"\n");


        }

        // close the writer object
        writer.close();

    }


    // method that returns the count of modifications
    public int getModification()
    {
        return count_Modification;
    }

}
