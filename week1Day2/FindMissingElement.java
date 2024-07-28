package week1Day2;

import java.util.Arrays;

public class FindMissingElement {
    public static void main(String[] args) {
        int[] arr = {1, 4, 3, 2, 8, 6, 7};
        System.out.println("Missing Number: " + findMissingElement(arr));
    }

    public static int findMissingElement(int[] arr) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] + 1 != arr[i + 1]) {
                return arr[i] + 1;
            }
        }
        return arr[arr.length - 1] + 1;
    }
}