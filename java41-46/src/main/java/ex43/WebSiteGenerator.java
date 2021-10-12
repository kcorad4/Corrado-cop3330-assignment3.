package ex43;

//imports
import java.util.*;
import java.io.*;
import java.util.Scanner;

public class WebSiteGenerator {

    //main methode
    public static void main(String[] args)
    {
        //scanner
        Scanner SC = new Scanner(System.in);

        //declare variables
        String currentPath, author, siteName;
        char js = 'N';
        char css = 'N';

        //get values from user
        System.out.print("Site name: ");
        siteName = SC.nextLine();
        System.out.print("Author: ");
        author = SC.nextLine();
        System.out.print("Do you want a folder for JavaScript? ");
        js = SC.next().charAt(0);
        System.out.print("Do you want a folder for CSS? ");
        css = SC.next().charAt(0);
        currentPath = System.getProperty("user.dir");
        currentPath += "\\"+siteName;

        File website = new File(currentPath);
        boolean websiteCreated = website.mkdir();

        if(websiteCreated)
        {
            System.out.println("Created " + currentPath);
            try
            {
                //put together website
                FileWriter skeletonWriter = new FileWriter(new File(currentPath+"\\index.html"));
                skeletonWriter.write("<!DOCTYPE html>\n<html lang=\"en\">\n<head>\n");
                skeletonWriter.write("\t<meta author=\""+author+"\">\n");
                skeletonWriter.write("\t<title>"+siteName+"</title>\n");
                skeletonWriter.write("</head>\n<body>\n\n</body>\n</html>");
                skeletonWriter.close();
                System.out.println("Created " + currentPath+"\\index.html");

                //for making javascript
                if(js == 'y' || js == 'Y')
                {
                    File jsFolder = new File(currentPath+"\\js");
                    boolean jsCreated = jsFolder.mkdir();

                    if(jsCreated)
                    {
                        System.out.println("Created " + jsFolder+"\\");
                    }
                    else
                    {
                        System.out.println("Js folder not created!!");
                    }
                }

                //for making ccs
                if(css == 'y' || css == 'Y')
                {
                    File cssFolder = new File(currentPath+"\\css");
                    boolean cssCreated = cssFolder.mkdir();
                    if(cssCreated)
                    {
                        System.out.println("Created " + cssFolder+"\\");
                    }
                    else
                    {
                        System.out.println("CSS folder not created!!");
                    }
                }
            }
            //catch for fail
            catch(IOException e)
            {
                System.out.println("index.html not created as required!!");
            }
        }
        else
        {
            System.out.println("Website folder not created!!");
        }
        SC.close();
    }

}//end class
