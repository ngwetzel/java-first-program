package com.h2;

/**
 * Hello world!
 *
 */
public class App 
{


    public static void main( String[] args)
    {
       String[] creditsAsString = args[0].split(",");
       String[] debitsAsString = args[1].split(",");

       float[] credits = new float[creditsAsString.length];
        float[] debits = new float[debitsAsString.length];
       for (int i = 0; i < creditsAsString.length; i++) {
           credits[i] = Float.parseFloat(creditsAsString[i]);
       }

        for (int i = 0; i < debitsAsString.length; i++) {
            debits[i] = Float.parseFloat(debitsAsString[i]);
        }
        System.out.println("sup");




    }

    public static int doubleTheNumber(int number) {
        return number*2;
    }

    private static int add(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        return sum;
    }



}
