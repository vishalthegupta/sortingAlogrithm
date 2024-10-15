Sorting Algorithms
Overview
This repository contains implementations of six popular sorting algorithms. Sorting algorithms are fundamental tools in computer science used to order data in a specific way—most commonly in ascending or descending order. The algorithms in this project demonstrate a range of approaches and efficiency levels, from simple algorithms to more advanced ones.

The following algorithms are included:

Bubble Sort
Selection Sort
Insertion Sort
Merge Sort
Quick Sort
Counting Sort

Each algorithm is implemented in Java, and they can be run independently to sort a given array of integers.

Algorithms Included
1. Bubble Sort
Bubble Sort repeatedly steps through the list, compares adjacent elements, and swaps them if they are in the wrong order. This process is repeated until the list is sorted.

Time Complexity:
Best Case: O(n) (Already sorted array)
Average Case: O(n²)
Worst Case: O(n²)
2. Selection Sort
Selection Sort repeatedly finds the smallest (or largest) element from the unsorted part of the array and swaps it with the first unsorted element. It continues this process until the array is sorted.

Time Complexity:
Best Case: O(n²)
Average Case: O(n²)
Worst Case: O(n²)
3. Insertion Sort
Insertion Sort builds the sorted array one element at a time. It picks elements from the unsorted part of the array and places them at the correct position in the sorted part.

Time Complexity:
Best Case: O(n) (Already sorted array)
Average Case: O(n²)
Worst Case: O(n²)
4. Merge Sort
Merge Sort is a divide and conquer algorithm. It divides the array into two halves, recursively sorts each half, and then merges the sorted halves.

Time Complexity:
Best Case: O(n log n)
Average Case: O(n log n)
Worst Case: O(n log n)
5. Quick Sort
Quick Sort is also a divide and conquer algorithm. It selects a "pivot" element, partitions the array such that elements less than the pivot come before it and elements greater come after, and then recursively sorts the subarrays.

Time Complexity:
Best Case: O(n log n)
Average Case: O(n log n)
Worst Case: O(n²) (when pivot is poorly chosen)
6. Counting Sort
Counting Sort is a non-comparative sorting algorithm that counts the number of occurrences of each element and uses this count to place each element in its correct position in the sorted array.

Time Complexity:
Best Case: O(n + k)
Average Case: O(n + k)
Worst Case: O(n + k)
Where n is the number of elements and k is the range of the input.

Features
Implementations of popular sorting algorithms in Java.
Easy-to-understand code with comments explaining each algorithm.
Input and output examples provided to demonstrate how each algorithm works.
Can be run independently or modified to test different input arrays.


Here’s an example of how the algorithms work with an array:

Input:
int[] arr = { 64, 25, 12, 22, 11 };

Output (for Bubble Sort):

Sorted array: [11, 12, 22, 25, 64]

Contributions are welcome! If you'd like to improve this project, feel free to fork the repository, create a branch, and submit a pull request.

Some ideas for contributions:

Add more sorting algorithms.
Add improvements to existing algorithms.
Provide more detailed explanations or diagrams.
