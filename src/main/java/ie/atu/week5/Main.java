package ie.atu.week5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] MyArray = new int[10];
        for (int i = 0; i != 10; i++){
            MyArray[i] = ((i + 1) * 100);
            System.out.println("Element at index " + i + ": " + MyArray[i]);
        }

        Scanner input = new Scanner(System.in);

        try{
            System.out.println("Enter a number: ");
            MyArray[10] = input.nextInt();
        } catch (Exception e){
            System.out.println("Im afraid i cant let you do that.");
        }




    }
}