package org.example.Exceptions;

import java.io.*;
public class Checked {
    // checked at compile time
    // should specify exception using Throws keyword in the method signature or handle the exception in the try catch block
    // Eg: IOException,
    public static void main(String args[]) throws IOException {
        // Reading file from path in local directory
        FileReader file = new FileReader("C:\\test\\a.txt");

        // Creating object as one of ways of taking input
        BufferedReader fileInput = new BufferedReader(file);

        // Printing first 3 lines of file "C:\test\a.txt"
        for (int counter = 0; counter < 3; counter++)
            System.out.println(fileInput.readLine());

        // Closing file connections
        // using close() method
        fileInput.close();
    }
}
