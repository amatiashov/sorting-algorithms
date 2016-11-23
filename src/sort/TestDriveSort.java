package sort;


/**
 * Created by artem on 23/11/2016.
 */
public class TestDriveSort {

    private int arrayLength = 10000;
    private int maxValueInArray = 100;

    public static void main(String... args){
        TestDriveSort testDriveSort = new TestDriveSort();
        testDriveSort.testDrive();
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        testDriveSort.arrayLength = 10000;
        testDriveSort.testDrive();
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        testDriveSort.arrayLength = 100000;
        testDriveSort.testDrive();
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        testDriveSort.arrayLength = 1000000;
        testDriveSort.testDrive();
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        testDriveSort.arrayLength = 10000000;
        testDriveSort.testDrive();
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        testDriveSort.arrayLength = 100000000;
        testDriveSort.testDrive();
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        testDriveSort.arrayLength = 1000000000;
        testDriveSort.testDrive();
    }

    private void testDrive(){
        System.out.println("Размер массива: " + arrayLength);
        System.out.println("Максимальный элемент : " + maxValueInArray);
        System.out.println("------------------------------");

        Integer[] array1 = new Integer[arrayLength];
        Integer[] array2 = new Integer[arrayLength];
        Integer[] array3 = new Integer[arrayLength];
        Integer[] array4 = new Integer[arrayLength];

        BubbleSort bubbleSort = new BubbleSort();
        QuickSort quickSort = new QuickSort();
        MergeSort mergeSort = new MergeSort();

        for (int i = 0; i < arrayLength; i++) {
            int value =  (int) (Math.random() * maxValueInArray);
            array1[i] = value;
            array2[i] = value;
            array3[i] = value;
            array4[i] = value;
        }
        long start, stop, result;
        boolean hasError;


        // testDrive MergeSort
        start = System.currentTimeMillis();
        mergeSort.sort(array1);
        stop = System.currentTimeMillis();
        result = stop-start;
        hasError = false;
        for (int i = 0; i < arrayLength-1; i++)
            if (array1[i] > array1[i+1]) {
                hasError = true;
                break;
            }
        System.out.println("MergeSort");
        if (!hasError){
            System.out.println("Время работы :" + result + "ms");
        }
        else{
            System.out.println("Алгоритм отработал с ошибкой");
        }
        System.out.println("======================================");


        // testDrive QuickSort
        start = System.currentTimeMillis();
        quickSort.sort(array2);
        stop = System.currentTimeMillis();
        result = stop-start;
        hasError = false;
        for (int i = 0; i < arrayLength-1; i++)
            if (array1[i] > array2[i+1]) {
                hasError = true;
                break;
            }
        System.out.println("QuickSort");
        if (!hasError){
            System.out.println("Время работы :" + result + "ms");
        }
        else{
            System.out.println("Алгоритм отработал с ошибкой");
        }
        System.out.println("======================================");


        // testDrive BubbleSort
        start = System.currentTimeMillis();
        bubbleSort.sort(array3);
        stop = System.currentTimeMillis();
        result = stop-start;
        hasError = false;
        for (int i = 0; i < arrayLength-1; i++)
            if (array1[i] > array3[i+1]) {
                hasError = true;
                break;
            }
        System.out.println("BubbleSort");
        if (!hasError){
            System.out.println("Время работы :" + result + "ms");
        }
        else{
            System.out.println("Алгоритм отработал с ошибкой");
        }
        System.out.println("======================================");
    }
}
