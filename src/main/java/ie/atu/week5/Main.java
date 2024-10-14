package ie.atu.week5;

public class Main {
    public static void main(String[] args) {
        int[] MyArray = new int[10];
        for (int i = 0; i != 10; i++){
            MyArray[i] = ((i + 1) * 100);
            System.out.println("Element at index " + i + ": " + MyArray[i]);
        }
    }
}