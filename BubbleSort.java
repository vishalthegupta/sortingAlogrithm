public class BubbleSort {
    
    public static void bubbleSort(int arr[], int n) {
        // loop to ensure that all elements are placed in correct order
        for (int i = 0; i < n - 1; i++) {
            boolean flag = false; // to check if swaps occurred

            // Inner loop to compare adjacent elements and swap if needed
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swapping of two elements
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = true; // Mark that a swap has occurred
                }
            }

            // If no swaps were made, the array is already sorted
            if (flag == false)
                break;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 5, 7, 2, 1, -6, 2, 4 };
        int n = arr.length;

        System.out.println("Array Before Sorting:");
        for (int i : arr)
            System.out.print(i + " ");


        // Perform bubble sort
        bubbleSort(arr, n);

        System.out.println("\nArray After Sorting:");
        for (int i : arr)
            System.out.print(i + " ");
    }
}
/*
    The algorithm bubbles the largest element to the end of the array in each iteration.

    If no swaps occur during an iteration, the array is already sorted, so we break the loop early.

    Time Complexity:
    O(n^2) in the average and worst cases (due to nested loops)
    O(n) in the best case (when the array is already sorted, with no swaps)

    Space Complexity: O(1) - No additional space is used, only the input array is modified in place.

 */