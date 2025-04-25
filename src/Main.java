import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] numbers = generate(1, 99, 1000);
        mergeSort(numbers, 0, numbers.length - 1);
        display(numbers);
        System.out.println();
        System.out.println(Arrays.toString(generate(0, 10, 10)));
    }

    public static int[] generate(int low, int high, int size) {
        Random rand = new Random();
        int[] resultStore = new int[size];
        for (int i = 0; i < size; i++) {
            resultStore[i] = rand.nextInt(high - low + 1) + low;
        }
        return resultStore;
    }

    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }
    // l have created a new merge function for more readability and mantain clean code
    private static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        System.arraycopy(arr, left, leftArray, 0, n1);
        System.arraycopy(arr, mid + 1, rightArray, 0, n2);

        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                arr[k++] = leftArray[i++];
            } else {
                arr[k++] = rightArray[j++];
            }
        }

        while (i < n1) {
            arr[k++] = leftArray[i++];
        }

        while (j < n2) {
            arr[k++] = rightArray[j++];
        }
    }

    public static void display(int[] arr) {
        for (int x : arr) {
            System.out.print(x + "\t");
        }
    }
}
