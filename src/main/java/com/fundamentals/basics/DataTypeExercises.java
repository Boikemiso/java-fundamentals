package com.fundamentals.basics;

import java.util.Scanner;

/**
 * DATA TYPES EXERCISES
 *
 * This module focuses on understanding Java's primitive data types.
 *
 * In Java, there are 8 primitive data types. Each has a specific size, range,
 * and purpose. Understanding when to use each type is fundamental to writing
 * correct, efficient code.
 *
 * The 8 Primitive Types:
 * - byte (8 bits, -128 to 127)
 * - short (16 bits, -32,768 to 32,767)
 * - int (32 bits, -2,147,483,648 to 2,147,483,647)
 * - long (64 bits, very large numbers)
 * - float (32-bit decimal, less precise)
 * - double (64-bit decimal, more precise - DEFAULT for decimals)
 * - boolean (true or false)
 * - char (single character, 16-bit)
 *
 * YOUR TASK: Complete each method below by implementing the code as described
 * in the comments. Make sure your code compiles and passes the unit tests!
 */

public class DataTypeExercises {

    /**
     * Exercise 1: Declare and initialize all 8 primitive data types
     *
     * Create an array of size 8 containing one value of each primitive type.
     * The return type is Object[] because we need to store different types.
     *
     * TODO: Declare variables for each of the 8 primitive types, initialize them
     * with reasonable values, store them in an Object array, and return it.
     *
     * Example values:
     * - byte: a small number like 10
     * - short: a number like 100
     * - int: a number like 1000
     * - long: a large number like 100000L (remember the 'L')
     * - float: a decimal like 3.14f (remember the 'f')
     * - double: a decimal like 2.71
     * - boolean: true or false
     * - char: a character in single quotes like 'A'
     *
     * @return An Object array containing one value of each primitive type
     */
    Object[] declareAllPrimitiveTypes = {((byte) 10), ((short) 100), 1000, 100000L, 3.14f, 2.71, true, 'A'};

//    byte b = 10;
//    short sh = 100;
//    int i = 1000;
//    long l = 100000L;
//    float f = 3.14f;
//    double db = 2.71;
//    boolean bl = true;
//    char ch = 'A';
    //Object method is used to storing a wide variety of different data types
    public Object[] declareAllPrimitiveTypes(){
        return declareAllPrimitiveTypes;
    }

    /**
     * Exercise 2: Get the maximum value for int type
     *
     * Java provides constants for the min and max values of each primitive type.
     * For integers, use: Integer.MAX_VALUE
     *
     * TODO: Return the maximum value an int can hold
     *
     * @return The maximum value for int type
     */
    //Get max value for the int data type using the advanced form of int Integer
    //Integer allows you to manipulate the int data type
    public int getMaxIntValue(){
        return Integer.MAX_VALUE;
    }


    /**
     * Exercise 3: Get the minimum value for int type
     *
     * Similar to MAX_VALUE, use: Integer.MIN_VALUE
     *
     * TODO: Return the minimum value an int can hold
     *
     * @return The minimum value for int type
     */
    //Get min value for the int data type uisng the advanced form of int Integer
    //Integer allows you to manipulate the int data type
    public int getMinIntValue(){
        return Integer.MIN_VALUE;
    }

    /**
     * Exercise 4: Understand byte range
     *
     * A byte can hold values from -128 to 127.
     * This is enough for ages, ASCII characters, or small counts.
     *
     * TODO: Return a byte value. Any value between -128 and 127 is correct.
     *
     * @return A valid byte value
     */
    //This method returns a byte value which is between -128 and 127
    //Anything more or less than its capacities gives an error
    public byte declareByte(){
        return 57;
    }

    /**
     * Exercise 5: Understand short range
     *
     * A short can hold values from -32,768 to 32,767.
     * Useful for storing small numbers more memory-efficiently than int.
     *
     * TODO: Return a short value
     *
     * @return A valid short value
     */
    //This method returns a short value which is any value between
    //-32768 and 32767 this is good for storing small numbers
    public short declareShort(){
        return -14789;
    }
    /**
     * Exercise 6: Understand long type
     *
     * A long can store very large numbers. When writing long literals,
     * you MUST append 'L' or 'l' at the end.
     * Example: 1000000L or 1000000l
     *
     * TODO: Return a large number as a long (e.g., 1 billion or more)
     *
     * @return A long value
     */
    //Limit is 19 digits
    //This method returns a long value which is useful for storing very large numbers
    //always make sure to put an l or L suffix at the end of the value
    public long declareLong(){
        return 4000000000000000000L;
    }

    /**
     * Exercise 7: Understand float type
     *
     * A float holds decimal numbers but with less precision than double.
     * When writing float literals, you MUST append 'f' or 'F' at the end.
     * Example: 3.14f or 3.14F
     *
     * TODO: Return a decimal number as a float
     *
     * @return A float value
     */
    //This method returns a float value and it is less accurate for handling
    //decimals than double.
    //Always make sure the f or F suffix at the end of the value
    public float declareFloat(){
        return 7.18f;
    }

    /**
     * Exercise 8: Understand double type
     *
     * A double holds decimal numbers with high precision.
     * This is the DEFAULT type for decimal literals (3.14 is a double).
     * You DON'T need a suffix for doubles.
     *
     * TODO: Return a decimal number as a double
     *
     * @return A double value
     */
    //Double hold decimal values with good precision and unlike float
    //You don't need a suffix at the end but the d or D suffix is optional
    //If you want to waste time
    public double declareDouble(){
        return 7.18d;
    }
    /**
     * Exercise 9: Understand boolean type
     *
     * A boolean can ONLY be true or false. Nothing else.
     * Used for conditions and control flow.
     *
     * TODO: Return true or false
     *
     * @return A boolean value (true or false)
     */
    //boolean value is used to set conditions and flows
    public boolean declareBoolean(){
        return true;
    }

    /**
     * Exercise 10: Understand char type
     *
     * A char holds a SINGLE character. Use SINGLE quotes: 'A'
     * (Don't confuse with String, which uses double quotes: "A")
     *
     * TODO: Return a character using single quotes
     *
     * @return A char value
     */
    //Unlike string char is limited to storing only one character and to use it the
    //character must be in single quotes
    //If you use double quotes it reads as string and will get an error
    public char declareChar(){
        return 'B';
    }


    /**
     * Exercise 11: Adding two integers
     *
     * Simple arithmetic. Add the two parameters together.
     *
     * TODO: Return the sum of a and b
     *
     * @param a First integer
     * @param b Second integer
     * @return The sum of a and b
     */
    //This is a method used to get the sum of two parameters
    //This method reminded me that parameters cannot be values only variable names
    public int add(int a, int b){
        return a + b;
    }


    /**
     * Exercise 12: Calculate average of three numbers
     *
     * This is tricky! When you divide two ints, you get an int (truncated).
     * Example: 5 / 2 = 2 (not 2.5)
     *
     * To get a decimal result, cast to double FIRST:
     * (double)(a + b + c) / 3
     *
     * TODO: Calculate and return the average as a double
     *
     * @param num1 First number
     * @param num2 Second number
     * @param num3 Third number
     * @return The average as a double
     */
    //This method is used the calculate the average of the sum of three parameters
    //We use double incase the average ends up being a decimal
    public double calculateAverage(int num1, int num2, int num3) {
        return (double)(num1 + num2 + num3)/3 ;
    }

    //Static is shared copy
    //Instance is your unique copies
    //Static fields do not have access instant members
    //Instance members static fields
    public static void main(String[] Args){
        //byte x = 128;
        short y = 32767;


        short ghf = (byte)89;

        byte cks = (short)45;


        int jf = (int)10L;

        //Compile time error happens before it executes
        //Run time error While the program is running

//        Scanner scanner = new Scanner(System.in);
//
//        String input = scanner.nextLine();
//
//       // System.out.println(input)
//
//
//
//        System.out.println();
    }
}