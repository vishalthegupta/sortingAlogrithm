public class InsertionSort
{
    public static void insertionSort(int arr[] , int n) {
    for(int i = 0 ; i < n ; i++) {  // iterate through the array
        int j = i;
        while(j > 0) {  // for every j where arr[j] > arr[i] swap them
            if(arr[j] < arr[j - 1]) {
                 int temp = arr[j];
                 arr[j] = arr[j - 1];
                 arr[j - 1] = temp;
            }
            j--;
        }
    }
    }
	public static void main(String[] args) {
    int arr[] = {6,8,2,4,-5,12,3,8};
	int n = arr.length;
	
	System.out.println("Array Before Sorting : ");
	for(int i : arr) System.out.print(i + " ");
	
	insertionSort(arr , n);
	
	System.out.println("\nArray After Sorting : ");
	for(int i : arr) System.out.print(i + " ");

	}
}
/*
  The algorithm aims to place one element at its right index in every iteration
  It does so by comparing all values that come on left side of an element and
  swaps the two elements when arr[j] > arr[i] 
  
  Time Complexiy - O(n ^ 2) - For any element at index i we traverse from i - 1 to 0 and in the worst case for element at n - 1 index there will n - 2 iterations

  Space Complexity - O(1) - As no extra space is used apart from a constant amount for the temporary variable `temp`.
 */