package QuickSort;

public class QuickSort {
	
	public void runQuickSort(int[] arr, int s, int e){
		
		if (s < e){
			int q = partition(arr, s, e);
			runQuickSort(arr, s, q);
			runQuickSort(arr, q+1, e);
		}
		
	}
	
	public int partition(int[] arr, int s, int e){

		int pivot = arr[s];
		int i = s - 1;
		int j = e + 1;

		while (i < j){
			
			do {
				j--;
			} while (arr[j] > pivot);
			
			do {
				i++;
			} while (arr[i] < pivot);
			

			if (i < j){
				//Performing a swap 
				int k = arr[i];
				arr[i] = arr[j];
				arr[j] = k;
			}
		}
		return j;
	}
}
