package Stringmethods;

public class MPractice03 {
    /* create a method that takes an array of int sum all the elements from the array
    and return the sum
     */
    int arrsum(int[] arr) {


        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;

    }}
