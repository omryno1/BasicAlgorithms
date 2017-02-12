package MegeSort;

import java.util.Vector;

public class mergeSortTest {

	public void merge_sort (int[] arr, int s, int e){
		if (s < e){
			int q = (int)Math.floor((s + e) / 2);
			merge_sort(arr, s, q);
			merge_sort(arr, q+1, e);
			merge(arr, s, q, e);
		}
	}
	
	public void merge(int[] arr, int s, int q, int e){
		
		int sHalf = (q - s) + 1;
		int eHalf = (e - q);
		
		Vector<Integer> sArr = new Vector<>();
		Vector<Integer> eArr = new Vector<>();
		
		int i,j;
		
		for (i = 0; i < sHalf; i++) {
			sArr.add(arr[s + i]);
		}
		
		sArr.add(1000);
		
		for (j = 0 ; j < eHalf ; j++ ){
			eArr.add(arr[q + j + 1]);
		}
		
		eArr.add(1000);
		
		i=0;
		j=0;
		
		for (int k = s	; k <= e; k++) {
			if (sArr.elementAt(i) <= eArr.elementAt(j)){
				arr[k] = sArr.elementAt(i);
				i++;	
			}else{
				arr[k] = eArr.elementAt(j);
				j++;
			}
			
		}
	}
	
}
