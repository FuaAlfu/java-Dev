//create a gap to choose and compare

public class Main {
    public static void main(String[] args) {
        int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };

        // shell sorting by the loop
        // length = 7,.. 7 / 2 = 3.5.. and 0.5 doesn't count so , int gap = 3
        for (int gap = intArray.length / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < intArray.length; i++) {
                int newElment = intArray[i];

                int j = i;
                while (j >= gap && intArray[j - gap] > newElment) {
                    intArray[j] = intArray[j - gap];
                    j -= gap;
                }
                intArray[j] = newElment;
            }
        }

        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }

    }
}