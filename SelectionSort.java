public class SelectionSort
{
    public static void selectionSort(int arr[] , int n) {
    
    for(int i = 0 ; i < n - 1; i++) {  // In every iteration find ith minimum value and store it at ith index
        
        int minIdx = i;   
        
        for(int j = i + 1; j < n ; j++) {
            
             if(arr[minIdx] > arr[j]) {   // finding the index of minimum value
                minIdx = j;
             }
        }
        // swap ith minimum element with the first element of unsorted Array  
        int temp = arr[i];
        arr[i] = arr[minIdx];
        arr[minIdx] = temp;
        }
    }
	public static void main(String[] args) {
	int arr[] = {6,8,2,4,-5,12,3,8};
	int n = arr.length;
	
	System.out.println("Array Before Sorting : ");
	for(int i : arr) System.out.print(i + " ");
	
	selectionSort(arr , n);
	
	System.out.println("\nArray After Sorting : ");
	for(int i : arr) System.out.print(i + " ");
	
	}  
	/*
   The algorithm repeatedly finds the minimum element from the unsorted portion of the array
   and places it in its correct position in the sorted portion. This process is repeated for each index from 0 to n-1.
   After n-1 iterations, the array will be fully sorted.
   
   Time Complexity:
    O(n²) in the Best, Average, and Worst Case.
    Selection Sort always performs O(n²) comparisons, regardless of the array's initial state.
   
   Space Complexity:
    O(1)  Selection Sort is an in-place sorting algorithm, requiring no additional space apart from a few variables.
*/

} 
