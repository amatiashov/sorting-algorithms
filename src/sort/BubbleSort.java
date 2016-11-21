package sort;

/**
 * Created by Artyom Matyashov <smart7797@gmail.com> on 21/11/2016.
 */
public class BubbleSort implements Sorter{
    @Override
    public void sort(Integer[] array) {
        boolean swapHappend = true;

        while (swapHappend){
            swapHappend = false;
            for (int i = 0; i < (array.length-1); i++){
                if (array[i].compareTo(array[i+1]) > 0){
                    int tmp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = tmp;
                    swapHappend = true;
                }
            }
        }
    }
}