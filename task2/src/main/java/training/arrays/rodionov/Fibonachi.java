package training.arrays.rodionov;

import java.util.ArrayList;

public class Fibonachi {

    public Object[] getFibonachi(int min, int max) {

        ArrayList<Integer> intervalMinMax = new ArrayList<>();
        int first = 0;
        int second = 1;

        for (int i = 1; i < max; i++) {
            int bufer = second;
            second = first + second;
            first = bufer;

            if (min < first && max > first) {
                intervalMinMax.add(first);


            }

        }
        return intervalMinMax.toArray();
    }
}

