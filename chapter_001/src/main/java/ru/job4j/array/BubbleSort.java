package ru.job4j.array;

/**
 * класс BubbleSort сортирует массив целых чисел, используя алгоритм сортировки пузырьком.
 *
 * @author Mayer Sergey.
 * @version 1.0
 * @since 10.04.2016
 */
public class BubbleSort {
    /**
     * @param data
     * @return
     */
    public int[] sort(int[] data) {
        for (int i = 1; i < data.length; i++) {
            for (int index = 0; index < (data.length - 1); index++) {
                if (data[index] > data[index + 1]) {
                    int temp = data[index];
                    data[index] = data[index + 1];
                    data[index + 1] = temp;
                }
            }
        }

        return data;
    }
}
