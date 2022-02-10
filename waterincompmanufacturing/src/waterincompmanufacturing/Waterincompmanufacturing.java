/*
 * Haris Zubair
 * Febuary 9 2022
 * Waterincompmanufacturing.java
 * This programs asks you how many computer/monitor combos you have, once you type your answer it will calculator how much water was used to make those computers and monitors
 */
package waterincompmanufacturing;

import java.util.Scanner; 

public class Waterincompmanufacturing {

    public static void main(String[] args) {
        
        Scanner keyedInput = new Scanner(System.in);
        
        //Variables and constants are stated
        final double WATER_USED = 1.5;
        double waterWasted;
        int combos; 
        
        //What user will see 
        System.out.println("Hello, please enter how many computer/monitor combos you have at home here:");
        combos = keyedInput.nextInt();
        
        //Calculations to get water used
        waterWasted = combos * WATER_USED;
        
        System.out.println("Good job! You have wasted "+waterWasted+" tones of water!");
        
     
        
     
    }
    
}
