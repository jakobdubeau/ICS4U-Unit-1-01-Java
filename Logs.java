  /**
  * The log program takes log length and gives you the amount of logs that can fit in a truck
  *
  *  @author Jakob
  *  @version 1.0
  *  @since 2020-11-22
  *   Class Logs
  */

import java.util.Scanner;

/**
*  The logs program tells you how many logs a truck can carry depending on the log size o 1m, .5m or .25m.
*
*  A log weighs 20kg/m and the truck can carry 1100kg
*
*/

final class Logs {

    /**
    * Prevents instantiation.
    *
    *  @throws IllegalStateException
    *
    */

    private Logs() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * Starting function.
    *
    * @param args No args will be used
    *
    */

    /**
    *  Density of logs in kg/m
    */

    public static final double DENSITY = 20.0;

    /**
    * Max truck load
    */

    public static final double TRUCK_LOAD = 1100;

    public static void main(final String[] args) {
        //variables
        final double numLogs;

        final Scanner myObj = new Scanner(System.in);
        //get user input

        System.out.println("Enter log length (0.25, .0 or 1): ");
        //stores float in length

        final float length = myObj.nextFloat();
        //num of logs calculator

        numLogs = (TRUCK_LOAD / length) / DENSITY
        

        System.out.println("The truck will be able to take " + TRUCK_LOAD "logs that are " + length "meter(s) in length.")
        System.out.println("\nDone")
        }
}
















