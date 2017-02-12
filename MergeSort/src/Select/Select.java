package Select;

public class Select {

	public int runSelect(int[] arr, int s, int e, int i){
		if (s == e){
			return arr[s];
		}else{
			int q = partition(arr, s, e);
			//Finding the position of the pivot in the array (right or left)
			int k = q-s+1;
			if (k < i){
				return runSelect(arr, q+1, e, i-k);
			}else return runSelect(arr, s, q, i);
		}
	}

	public int partition(int[] arr,int s, int e){

		int pivot = arr[s];
		int i = s - 1;
		int j = e + 1;

		while (i<j){

			do {
				j--;
			} while (arr[j] > pivot);

			do {
				i++;
			} while (arr[i] < pivot);

			if (i<j){
				//swap
				int k = arr[i];
				arr[i] = arr[j];
				arr[j] = k;
			}
		}
		return j;
	}
}
