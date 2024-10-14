package ie.atu.week5;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(10);
        for(int i = 0; i != 10; i++){
            arrayList.add((i+1) * 100);
        }
        PrintArray(arrayList);

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a new number: ");
        arrayList.add(input.nextInt());
        PrintArray(arrayList);



    }

    public static void PrintArray( ArrayList<Integer> MyList){
        for(int i = 0; i != MyList.size(); i++){
            System.out.println("Element at " + i + ": " + MyList.get(i));
        }
    }
}