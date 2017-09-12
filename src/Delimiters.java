/**
 * Name : Ali Demir
 * Date : September 12th 2017
 * Email : gsalidemir@gmail.com
 * Purpose : Using Delimiter Function
 *
 *
 *
 */

import java.util.Scanner;


public class Delimiters {

    public static void main(String [] args) {
        int num1, num2, num3, num4, num5, num6, num7, num8, num9, num10, average;
        Scanner keyboard1 = new Scanner(System.in);//Declare new Scanner
        keyboard1.useDelimiter(","); // use comma as delimiter
        System.out.println("Now Enter 10 numbers delimited by comma):");
        num1 = keyboard1.nextInt();
        num2 = keyboard1.nextInt();
        num3 = keyboard1.nextInt();
        num4 = keyboard1.nextInt();
        num5 = keyboard1.nextInt();
        num6 = keyboard1.nextInt();
        num7 = keyboard1.nextInt();
        num8 = keyboard1.nextInt();
        num9 = keyboard1.nextInt();
        num10 = keyboard1.nextInt();
        average = (num1 + num2 + num3 + num4 + num5 + num6 + num7 + num8 + num9 + num10)/ 10;//Define the average of 10 numbers


        System.out.print("The average of \"" + num1 + "\"");//
        System.out.print(",\"" + num2 + "\"");
        System.out.print(",\"" + num3 + "\"");
        System.out.print(",\"" + num4 + "\"");
        System.out.print(",\"" + num5 + "\"");
        System.out.print(",\"" + num6 + "\"");
        System.out.print(",\"" + num7 + "\"");
        System.out.print(",\"" + num8 + "\"");
        System.out.print(",\"" + num9 + "\"");
        System.out.print(",\"" + num10 +"\"" + " is " + "\t"+ average);
        keyboard1.close();
    }
}
