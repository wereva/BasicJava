package training.arrays.rodionov;

import java.util.Random;

public class CreateArray {
    public  int[] createRandomArray(int length) {
        Random r = new Random();
        int[] arr = new int[length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(20);
        }
        return arr;
    }
}
