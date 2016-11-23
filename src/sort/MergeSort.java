package sort;

/**
 * Created by artem on 23/11/2016.
 */
public class MergeSort implements Sorter{

    private Integer[] array;
    private Integer[] helper;

    @Override
    public void sort(Integer[] array) {

        this.array = array;
        this.helper = new Integer[array.length];
        mergeSort(0, array.length-1);

    }

    private void mergeSort(int leftBorder, int rightBorder){
        if (leftBorder < rightBorder){
            int middle = leftBorder + (rightBorder-leftBorder)/2;

            mergeSort(leftBorder, middle);
            mergeSort(middle+1, rightBorder);

            merge(leftBorder, middle, rightBorder);
        }
    }

    private void merge(int leftBorder, int middle, int rightBorder ){
        for (int i = leftBorder; i <= rightBorder; i++){
            helper[i] = array[i];
        }
        int i = leftBorder;
        int j = middle+1;
        int k = leftBorder;

        while (i <= middle && j <= rightBorder){
            if (helper[i] >= helper[j]){
                array[k] = helper[j];
                j++;
            }
            else{
                array[k] = helper[i];
                i++;
            }
            k++;
        }
        while (i <= middle) {
            array[k] = helper[i];
            k++;
            i++;
        }
    }
}
