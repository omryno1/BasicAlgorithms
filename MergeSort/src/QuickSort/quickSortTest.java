package QuickSort;

public class quickSortTest {

	public void run(int[] arr, int s, int e){
		if (s < e){
			int q = partition(arr, s, e);
			run(arr, s, q);
			run(arr, q+1, e);
		}
	}
	
	public int partition(int[] arr, int s, int e){
		
		int pivot = arr[s];
		int i = s;
		int j = e;
		
		while (i < j) {
			while (arr[j] > pivot){
				j--;
			}
			
			while (arr[i] < pivot){
				i++;
			}
			
			if (i<j){
				//swap
				int k = arr[i];
				arr[i] = arr[j];
				arr[j] = k;
				i++;
				j--;
			}
		}
		return j;
	}
}
