package sort;

/**
 * Created by Artyom Matyashov <smart7797@gmail.com> on 21/11/2016.
 */
public interface Sorter {
    /**
     * Метод выполняет сортрировку массива - Integer[]
     * Сортировка может выполняться следующими алгоритмами:
     *      - BubbleSort
     *      - QuickSort
     *      - MergeSort
     *      - ShellSort
     *
     * @param array     неотсартированный входной массив массив
     *
     */
    void sort(Integer[] array);
}
