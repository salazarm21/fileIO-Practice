/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

/**
 *
 * @author marina
 */
public class fileiopractice {

    public static void main(String[] args) throws FileNotFoundException {
        File myFile = new File("numbers.txt");
        Scanner fileIO = new Scanner(myFile);

        int fileSize = fileIO.nextInt();
        int[] numbers = new int[fileSize];

        for (int index = 0; index < numbers.length; index++) {
            numbers[index] = fileIO.nextInt();
        }// end for

        System.out.print("[ ");
        for (int index = 0; index < numbers.length; index++) {
            System.out.println(numbers[index] + " ");

        }//end main
        System.out.print("] ");
    }

//for (int index = 0; index < numbers.length; index++) {
            //number[index] = Math.sqrt()number[index];
    

//}

}