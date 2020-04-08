package codegym;

import java.util.Arrays;

public class AlexSelectionSort {
    public static double[] selectionSort(double[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[index]) {
                    index = j;
                }
            }
            double smallerNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
        return arr;
    }

    public static void main(String[] args) {
        double[] arr = {1, 9, 4.5, 6.6, 5.7, -4.5};
        System.out.println("Before Sorting : ");
        System.out.println(Arrays.toString(arr));
        arr = selectionSort(arr);
        System.out.println("===================");
        System.out.println("After Sorting : ");
        System.out.println(Arrays.toString(arr));

    }
}
