import sorting.BubbleSort;

public class MainClass {

    static int[] sampleArray = {43, 12, -12, 5, 0, 12312, 41, -5};

    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();
        int[] sortedArray = bubbleSort.sort(sampleArray);
        Printer.printArray(sortedArray);
    }
}
