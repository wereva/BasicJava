package training;

import java.util.Arrays;
import java.util.Random;

/*
 * Needs to implement method getReversedArray using just only for construction.
 */
public class ReversedArray {

    private static final int DEFAULT_ARRAY_SIZE = 10;
    private static final int MAX_INT_VALUE = 1000;

    public static void main(String[] args) {
        int[] arr = getArrayWithRandomDigits();
        System.out.println("given array");
        System.out.println(Arrays.toString(arr));

        arr = getReversedArray(arr);

        System.out.println("reversed array");
        System.out.println(Arrays.toString(arr));
    }

    private static int[] getArrayWithRandomDigits() {
        int[] arr = new int[DEFAULT_ARRAY_SIZE];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Random().nextInt(MAX_INT_VALUE);
        }
        return arr;
    }

    //Todo add your implementation
    private static int[] getReversedArray(int[] arr) {
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[arr.length - 1 - i];
        }
        return result;
    }
}
