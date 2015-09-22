/*
* Jonas Boudreau
* CSM10J Lab04
*/

import java.util.*;
import java.io.*;

public class Lab04 {
    
        public static double computeMean(Scanner inFile) {
        int fileData, counter = 0;
        double total = 0, mean = 0;
        while(inFile.hasNextInt())
        {
           fileData = inFile.nextInt();
           total += fileData;
           counter++;
        }
        inFile.close();
        return mean = (total / counter);
    }
    
    public static double computeStandardDeviation(Scanner inFile, double mean) 
    throws FileNotFoundException {
        int fileData, counter = 0;
        double squared = 0, stdDev = 0;
        inFile = new Scanner(new FileReader("input.txt"));

        while(inFile.hasNextInt())
        {
            fileData = inFile.nextInt();
            squared += Math.pow((fileData - mean), 2);
            counter++;
        }
        inFile.close();
        return stdDev = Math.sqrt(squared / counter);
    }
    
    public static void main(String[] args) throws FileNotFoundException {
        
    Scanner inFile;
    inFile = new Scanner(new FileReader("input.txt"));
    int fileData;
    double mean, stdDev;
    
    System.out.print("Input: ");
    while(inFile.hasNextInt())
        { 
           fileData = inFile.nextInt();
           System.out.print(fileData + " ");
        }
    inFile.close();
    inFile = new Scanner(new FileReader("input.txt"));
    
    stdDev = computeStandardDeviation(inFile, mean = computeMean(inFile));
    
    System.out.printf("%nMean: %.2f", mean);
    System.out.printf("%nStdDev: %.2f%n", stdDev);
    }
}
