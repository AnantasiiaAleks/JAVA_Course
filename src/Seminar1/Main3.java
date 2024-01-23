/*
Задание №3
Дан массив nums = [3,2,5,3] и число val = 3.
Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива.
Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного, а остальные - равны ему.
 */

package Seminar1;

import java.util.Arrays;

public class Main3 {
    public static void main(String[] args) {
        int[] nums = {3, 2, 5, 3};
        int val = 3;
        int[] sorted_array = sort(nums, val);
        System.out.println(Arrays.toString(sorted_array));
    }
    static int[] sort(int[] array, int value) {
        int[]sort_arr = new int[array.length];
        Arrays.fill(sort_arr, value);
        for (int i = 0, j = 0; i < sort_arr.length; i++) {
            if (array[i] != value) {
                sort_arr[j++] = array[i];
            }
        }
        return sort_arr;
    }
}
