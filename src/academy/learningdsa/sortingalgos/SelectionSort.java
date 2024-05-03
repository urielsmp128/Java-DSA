package academy.learningdsa.sortingalgos;

import java.util.Arrays;

public class SelectionSort {

    public static void swap(int[] intArray, int i, int j){
        if(intArray[i] == intArray[j]){
            return;
        }
        int temp = intArray[i];
        intArray[i] = intArray[j];
        intArray[j] = temp;
    }

    public static void main(String[] args) {
        int[] intArray = {20, 35, -15, 7, 55, 1, 0, -22, 2, 100, -1, 3000, -3000};
        for (int lastUnsortedIndex = intArray.length -1; lastUnsortedIndex > 0; lastUnsortedIndex--){
            int largest = 0;
            for (int i = 1; i <= lastUnsortedIndex; i++){
                if( intArray[i] > intArray[largest] ){
                    largest = i;
                }
            }
            swap(intArray, largest, lastUnsortedIndex);
        }

        String sortedArray = Arrays.toString(intArray);
        System.out.println(sortedArray);
    }
}
