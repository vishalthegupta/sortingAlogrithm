public class QuickSort
{
    public static int partition(int arr[] , int low , int high) {
    int pivot = arr[low];   // Select the first element as pivot
    int i = low , j = high;
    
    while(i < j) { 
        while(arr[i] <= pivot && i < high) i++;   // Find element that is greater than pivot from left of array
        while(arr[j] > pivot && j > low) j--;   // Find element that is lesser than pivot from right of array
        
        if(i < j) {   // Swap greater element from left with smaller element from right
          int temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;
        }
    }
    // After coming out of loop the position of j is correct position of pivot so swap them
    int temp = arr[j];
    arr[j] = arr[low];
    arr[low] = temp;
    
    return j;  // return the correct index of pivot
    }
    public static void quickSort(int arr[]  , int low , int high) {
        
    if(low >= high)    // if low == high it means size of array is 1 so it is already sorted that's why return 
          return ;

        int partitionIndex = partition(arr , low , high);  // Select one element and place it at its correct index
        
        quickSort(arr , low , partitionIndex  - 1);   // All the elements to the left of partitionIndex will be smaller 
        
        quickSort(arr , partitionIndex + 1 , high);   // All the elements to the right of partitionIndex will be greater 
       
        // every call sets 1 elements to its right place and thus the array becomes sorted
    
    return;
    }
	public static void main(String[] args) {
	int arr[] = {6,8,2,4,-5,12,3,8};
	int n = arr.length;
	
	System.out.println("Array Before Sorting : ");
	for(int i : arr) System.out.print(i + " ");
	
	quickSort(arr , 0 , n - 1);
	
	System.out.println("\nArray After Sorting : ");
	for(int i : arr) System.out.print(i + " ");

	}
}

/*  The algorithm follows the Divide and Conquer paradigm.
    We choose a pivot element and partition the array such that all elements less than the pivot
    are on its left, and all elements greater than the pivot are on its right. The pivot is then
    placed in its correct sorted position. The same process is applied recursively to the subarrays
    on the left and right of the pivot, continuing until the base case (arrays of size 1 or 0) is reached.
    
    Time Complexity:
     Average Case: O(n log n)  When the pivot divides the array into reasonably balanced partitions.
     Worst Case: O(n ^ 2)  For sorted Arrays
    
    Space Complexity:
  O(log n) on average  Due to the recursive stack space in the case of well-balanced pivots.
     O(n) in the worst case  When the pivot selection is poor and the recursion goes as deep as the array size.
*/
     