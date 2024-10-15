import java.util.*;
public class CountSort 
{
    public static void countSort(int arr[] , int n) {
        
    if(n <= 1) return ; //Return if array size is lesser than equal to 1
    
    int maxElement = Integer.MIN_VALUE , idx = 0;
    
    // Finding the largest element in the array
    for(int i  = 0 ; i < n ; i++) {
        maxElement = Math.max(maxElement , arr[i]);
    }
    // Frequency array of largest + 1 size
    int countArr[] = new int[maxElement + 1];
    
    // Storing the Frequency
    for(int i = 0 ; i < n ; i++) {
          countArr[arr[i]]++;
    }
    // Traverse through array 
    for(int i = 0 ; i < countArr.length ; i++) {
         int frequency = countArr[i];
        //  Add every element whose frequency is greater than 0
         while(frequency > 0) {
             arr[idx++] = i;
             frequency--;
         }
       }
    }
    
    public static void countSort2(int arr[] , int n) {
        
    if(n <= 1) return ; //Return if array size is lesser than equal to 1
    
    int maxElement = Integer.MIN_VALUE , idx = 0;
    HashMap<Integer , Integer> hm = new HashMap<>();
    
     // Finding the largest element in the array
    for(int i = 0 ; i < n ; i++) {
        maxElement = Math.max(maxElement , arr[i]);
    }
    
    // Frequency array of largest + 1 size
    for(int i = 0 ; i < n ; i++) {
        hm.put(arr[i] , hm.getOrDefault(arr[i] , 0) + 1);
    }
    
     // Storing the Frequency
    for(int i = 0 ; i <= maxElement ; i++) {
        //  Adding all elements whose frequency is greater than 0
         int frequency = (hm.containsKey(i)) ? hm.get(i) : 0;
         while(frequency > 0) {
             arr[idx++] = i;
             frequency--;
         }
      }
    }
	public static void main(String[] args) {
    int arr[] = {8,4,0,1,4,12,9,7};  // Count sort can be used only when array contains non negative elements
    int n = arr.length;
    
    System.out.println("Array Before Sorting");
    for(int i : arr) System.out.print(i + " ");
    
    countSort(arr , n); 
    
    
    countSort2(arr , n); 
    
    System.out.println("\nArray After Sorting");
    for(int i : arr) System.out.print(i + " ");
	}
}             
/*
   First, we find the largest element in the array, then create a count array of size (largest element + 1) to store the frequency of each element.
   
   Then we traverse the count array and for each index `i` with a frequency > 0,
   we place `i` in the original array based on its frequency.

   This algorithm works best when the range of input elements is small or bounded.

   Approach 1:
   - Time Complexity: O(n) for iterating through the array + O(maxElement) for counting frequencies
   - Space Complexity: O(maxElement), where maxElement is the largest value in the array

   Approach 2:
   - Time Complexity: O(n) for iterating through the array + O(maxElement) for storing frequencies in HashMap
   - Space Complexity: O(n) due to the HashMap storing frequency of each element
*/

