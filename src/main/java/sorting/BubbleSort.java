package sorting;

public class BubbleSort {

    public int[] sort(int[] array) {
        int lastIndex = array.length - 1;
        for (int indexLastSorted = 0; indexLastSorted < lastIndex; indexLastSorted++) {
            for (int i = lastIndex; i > indexLastSorted; i--) {
                int element = array[i];
                int nextElement = array[i - 1];
                if (nextElement > element) {
                    swap(array, i, i -1);
                }
            }
        }
        return array;
    }

    private void swap(int[] array, int firstIndex, int secondIndex) {
        int temp = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = temp;
    }
}