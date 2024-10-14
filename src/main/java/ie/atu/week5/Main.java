package ie.atu.week5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] MyArray = new int[10];
        int x = 0;
        for (int i : MyArray){ //"Enhanced" for loop. Ends up with more code in this case. Only doing this because you asked me to
            i = ((x + 1) * 100);
            x++;
            System.out.println("Element at index " + x + ": " + i);
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