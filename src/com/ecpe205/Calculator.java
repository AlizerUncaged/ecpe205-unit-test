// git:
// https://github.com/AlizerUncaged/ecpe205-unit-test
package com.ecpe205;

public class Calculator {
    public double sum(double a, double b) {
        return a + b;
    }

    public boolean isEven(int value) {
        return value % 2 == 0;
    }

    public boolean isOdd(int value) {
        return value % 2 == 1;
    }

    public double exponent(double x, int y) {
        double result = 1.0;

        for (int i = 0; i < y; i++) {
            result *= x;
        }

        return result;
    }


    public int factorial(int n) {
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        return result;
    }

    public boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public void shellSort(int[] array) {
        int n = array.length;

        // Start with a large gap and reduce it
        for (int gap = n / 2; gap > 0; gap /= 2) {
            // Perform insertion sort for the current gap
            for (int i = gap; i < n; i++) {
                int temp = array[i];
                int j = i;

                // Shift elements that are greater than temp to the right
                while (j >= gap && array[j - gap] > temp) {
                    array[j] = array[j - gap];
                    j -= gap;
                }

                array[j] = temp;
            }
        }
    }


    public void displayValues(int[] values) {
        for (int i : values) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public boolean isSortedInAscending(int[] values) {
        for (int i = 0; i < values.length - 1; i++) {
            if (values[i] > values[i + 1]) {
                return false;
            }
        }

        return true;

    }
}
