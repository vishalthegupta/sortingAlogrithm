public class MergeSort {
    public static void merge(int arr[], int low, int high) { // Function to merge two halves of array
        int mid = (low + high) / 2;

        int len1 = mid - low + 1; // size of the first array
        int len2 = high - mid; // size of the second array

        int idx = low, leftIndex = 0, rightIndex = 0;

        int leftArr[] = new int[len1];
        int rightArray[] = new int[len2];

        // initializing the first half
        for (int i = low; i <= mid; i++) {
            leftArr[leftIndex++] = arr[i];
        }
        // initializing the second half
        for (int i = mid + 1; i <= high; i++) {
            rightArray[rightIndex++] = arr[i];
        }

        leftIndex = 0;
        rightIndex = 0;

        // Merge two halves in sorted order by comparing
        while (leftIndex < len1 && rightIndex < len2) {
            if (leftArr[leftIndex] < rightArray[rightIndex]) {
                arr[idx++] = leftArr[leftIndex++];
            } else {
                arr[idx++] = rightArray[rightIndex++];
            }
        }
        // if leftIndex < len1 - this will execute when rightIndex == len2 i.e. the
        // second half will exhaust
        while (leftIndex < len1) {
            arr[idx++] = leftArr[leftIndex++];
        }
        // if rightIndex < len2 - this will execute when leftIndex == len1 i.e. the
        // first half will exhaust
        while (rightIndex < len2) {
            arr[idx++] = rightArray[rightIndex++];
        }
    }

    public static void mergeSort(int arr[], int low, int high) {
        if (low < high) { // if low == high it means array is of one size and one size array is always
                          // sorted so return

            int mid = (low + high) / 2; // Find the middle of array
            mergeSort(arr, low, mid); // Sort the first half
            mergeSort(arr, mid + 1, high); // Sort the second half
            merge(arr, low, high); // Merge both sorted halves
        }
        return;
    }

    public static void main(String[] args) {
        int arr[] = { 5, 7, 2, 1, -6, 2, 4 };
        int n = arr.length;

        System.out.println("Array Before Sorting");
        for (int i : arr)
            System.out.print(i + " ");

        mergeSort(arr, 0, n - 1);


        System.out.println("\nArray After Sorting");
        for (int i : arr)
            System.out.print(i + " ");
    }
}
/*  
    The algorithm follows the Divide and Conquer approach.
    The array is recursively divided into two halves until each subarray has only one element,
    as arrays of size 1 are trivially sorted.
    Then, the algorithm merges the sorted subarrays back together by comparing their elements
    and placing them in sorted order, ensuring the final array is sorted.

    Time Complexity:
    - Best, Average, and Worst Case: O(n log n)
    Merge Sort performs consistently in O(n log n) time in all cases,
    as it divides the array into halves and performs linear work to merge them back.

    Space Complexity:
    - O(n) due to the space required for the temporary arrays used during merging
      and the space required for the recursive function calls (recursive stack space).
*/
