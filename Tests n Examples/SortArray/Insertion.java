public class Insertion implements Sorter {
    private void selectionSort(int[] arr) {
        int j, key;
        for (int i = 1; i < arr.length; i++) {
            key = arr[i];
            j = i - 1;
            while (j >= 0 && arr[j] > key) {
                // System.out.printf("[%d == %d]\n", arr[i], key);
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }

    }

    public int[] sortArray(int[] arr) {
        selectionSort(arr);
        return arr;
    }
}