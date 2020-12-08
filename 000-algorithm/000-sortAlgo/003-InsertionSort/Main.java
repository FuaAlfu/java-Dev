public class Main {

    public static void main(String[] args) {

        int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };

        // started by 1.. because element zero is already sorted.
        for (int firstUnsortedIndex = 1; firstUnsortedIndex < intArray.length; firstUnsortedIndex++) {

            int newElement = intArray[firstUnsortedIndex];

            int i;

            for (i = firstUnsortedIndex; i > 0 && intArray[i - 1] > newElement; i--) {
                // System.out.println(i);
                // {2: 20, "-15,35", 7, 55, 1, -22}
                // {1: "-15,20", 35, 7, 55, 1, -22}
                // {5: -15, 20, 35, 7, "1,55", -22}
                // {4: -15, 20, 35, "1,7" 55, -22}
                // {6: -15, 20, 35, 1, 7, "-22, 55"}
                // {5: -15, 20, 35, 1, "-22, 7", 55}
                // {4: -15, 20, 35, "-22, 1", 7, 55}
                // {3: -15, 20, "-22, 35", 1, 7, 55}
                // {2: -15, "-22, 20", 35, 1, 7, 55}
                // {1: "-22, -15", 20, 35, 1, 7, 55}

                // swap
                intArray[i] = intArray[i - 1];
            }
            // swap again
            intArray[i] = newElement;
        }

        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }

}
