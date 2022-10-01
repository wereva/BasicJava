package training.arrays.rodionov;

public class SortedArray {
    public int[] getSortedArray(int[] arr) {

        boolean sort = false;
        while (!sort) {
            sort = true;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    sort = false;
                    int buffer = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = buffer;
                }
            }

        }
        return arr;
    }

}
