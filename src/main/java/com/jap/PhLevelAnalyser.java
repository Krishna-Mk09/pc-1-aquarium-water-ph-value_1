package com.jap;

import java.util.Scanner;

/**
 * The class PhLevelAnalyser has a method getPhValueOfWater which takes an integer as input and returns a string
 */
public class PhLevelAnalyser
{
    /**
     * It takes the phLevel as input and returns the status of the aquarium
     */
    public static void main(String[] args) {
        String statusOfAquarium = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter phLevel :");
        int phLevel = scanner.nextInt();
        PhLevelAnalyser phLevelAnalyser = new PhLevelAnalyser();
        String data = phLevelAnalyser.getPhValueOfWater(phLevel);
        System.out.println(data);
    }

    // A method which takes an integer as input and returns a string.
    public String getPhValueOfWater(int phLevel){

    String statusOfAquarium="";
        if (phLevel < 7) {
            statusOfAquarium = "pH value is low, partial water change required";
        } else if (phLevel >= 7 && phLevel <= 8) {
            statusOfAquarium = "pH value is fine";
        } else if(phLevel > 8) {
            statusOfAquarium = "pH value is high, partial water change required";
        }
        return statusOfAquarium;

    }
}
