/**
 * OOPSBannerApp
 * UC4: Render OOPS as Banner using String Array and Loop
 *
 * This program prints the "OOPS" banner using a String array
 * and an enhanced for loop to eliminate print statements.
 *
 * @author Naveen Kumar
 * @version 4.0
 */

package org.example;

import java.util.Arrays;

public class StringArrayBanner {
    public static void main(String[] args) {

        String[] oopBanner = {
                String.join(" ","     ****      "  + "     ****      " + " *******     " + "   *****     "),
        String.join(" ","   ***  ***    "  + "   ***  ***    " + " ***   ***   " + "***     ***  "),
        String.join(" "," ***      ***  "  + " ***      ***  " + " ***    ***  " + " ***      "),
        String.join(" ","***        *** "  + "***        *** " + " ***   ***   " + "    ***    "),
        String.join(" "," ***      ***  "  + " ***      ***  " + " *******     " + "       *** "),
        String.join(" ","   ***  ***    "  + "   ***  ***    " + " ***         " + "***     ***  "),
        String.join(" ","     ****      "  + "     ****      " + " ***         " + "   *****    "),
    };

//        oopBanner[0] = String.join(" ", "*******", "*******", "*******", "*******");

//        Arrays.stream(oopBanner).map()

        for(String banner : oopBanner){
            System.out.println(banner);
        }
    }
}