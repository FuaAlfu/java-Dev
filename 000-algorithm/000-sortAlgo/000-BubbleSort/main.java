
//package main
public class main {

    public static void main(String[] args) {

        int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };

        // int lastUnsortedIndex = intArray.length-1;
        // System.out.println(lastUnsortedIndex); Run: 6!

        for (int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {

            // System.out.println(lastUnsortedIndex); Run: --> 654321
            for (int i = 0; i < lastUnsortedIndex; i++) {
                // System.out.println(i);Run:012345..01234..0123..012..01..0
                if (intArray[i] > intArray[i + 1]) {
                    swap(intArray, i, i + 1);
                }
            }

        }
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }

    public static void swap(int[] array, int i, int j) {
        if (i == j) {
            return; // Stop sequences
        }
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}