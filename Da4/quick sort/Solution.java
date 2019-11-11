import java.util.Random;
class Solution{
	void merge(int arr[], int l, int m, int r) 
    { 
        // Find sizes of two subarrays to be merged 
        int n1 = m - l + 1; 
        int n2 = r - m; 
  
        /* Create temp arrays */
        int L[] = new int [n1]; 
        int R[] = new int [n2]; 
  
        /*Copy data to temp arrays*/
        for (int i=0; i<n1; ++i) 
            L[i] = arr[l + i]; 
        for (int j=0; j<n2; ++j) 
            R[j] = arr[m + 1+ j]; 
  
  
        /* Merge the temp arrays */
  
        // Initial indexes of first and second subarrays 
        int i = 0, j = 0; 
  
        // Initial index of merged subarry array 
        int k = l; 
        while (i < n1 && j < n2) 
        { 
            if (L[i] <= R[j]) 
            { 
                arr[k] = L[i]; 
                i++; 
            } 
            else
            { 
                arr[k] = R[j]; 
                j++; 
            } 
            k++; 
        } 
  
        /* Copy remaining elements of L[] if any */
        while (i < n1) 
        { 
            arr[k] = L[i]; 
            i++; 
            k++; 
        } 
  
        /* Copy remaining elements of R[] if any */
        while (j < n2) 
        { 
            arr[k] = R[j]; 
            j++; 
            k++; 
        } 
    } 
	public static int[] quickSort(int[] arr){
		// StdRandom.shuffle(arr);
		sort(arr, 0, arr.length - 1);
		return arr;
	}
	private static void exch(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
	private static void sort(int[] arr, int lo, int hi) { 
        if (hi <= lo) return;
        int j = partition(arr, lo, hi);
        sort(arr, lo, j-1);
        sort(arr, j+1, hi);
	}
	private static int partition(int[] arr, int lo, int hi) {
        int i = lo;
        int j = hi + 1;
        while (true) {            
            while (arr[++i] < arr[lo]) {
                if (i == hi) break;
            }            
            while (arr[lo] < arr[--j]) {
                if (j == lo) break;      
            }           
            if (i >= j) break;
            exch(arr, i, j);
        }       
        exch(arr, lo, j);        
        return j;
    }
	
	
}
