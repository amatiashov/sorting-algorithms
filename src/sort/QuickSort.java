package sort;

/**
 * Created by Artyom Matyashov <smart7797@gmail.com> on 21/11/2016.
 */
public class QuickSort implements Sorter {
    @Override
    public void sort(Integer[] array) {
        int start = 0;
        int end = array.length-1;
        quickSort(array, start, end);
    }
    private void quickSort(Integer[] array, int start, int end){
        if (start >= end)
            return;
        int i = start;
        int j = end;
        int currentIndex = i + (j-i)/2;
        while (i < j) {
            while (i < currentIndex && array[i] <= array[currentIndex])
                i++;
            while (j > currentIndex && array[j] >= array[currentIndex])
                j--;
            if (i < j) {
                int tmp = array[i];
                array[i] = array[j];
                array[j] = tmp;
                if (i == currentIndex)
                    currentIndex = j;
                else if (j == currentIndex)
                    currentIndex = i;
            }
        }
        quickSort(array, start, currentIndex);
        quickSort(array, currentIndex+1, end);
    }
}
