package training.arrays.rodionov;


import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // TODO demo your all sub-tasks here.
        CreateArray arrey = new CreateArray();
        int[] unsortedArey = arrey.createRandomArray(10);
        System.out.println("Unsorted Arrey\n" + Arrays.toString(unsortedArey));

        SortedArray sortArr = new SortedArray();
        int[] sortedArey = sortArr.getSortedArray(unsortedArey);
        System.out.println("Sorted Arrey\n" + Arrays.toString(sortedArey));

         Fibonachi minMax = new Fibonachi();
         Object[] arrFibo = minMax.getFibonachi(1,100);
         System.out.println("interval min max \n" + Arrays.toString(arrFibo));
    }
}



































































