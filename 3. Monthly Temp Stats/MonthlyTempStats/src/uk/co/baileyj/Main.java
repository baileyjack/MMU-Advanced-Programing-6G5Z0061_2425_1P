package uk.co.baileyj;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String fileName= "weatherdata.csv";
        File file= new File(fileName);

        // Try-Catch for reading the CSV file
        try{
            Scanner inputStream= new Scanner(file);
            while(inputStream.hasNext()){
                String data= inputStream.next();
                String[] values = data.split(",");
                System.out.println(values[1]);
            }
            inputStream.close();

        }catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}