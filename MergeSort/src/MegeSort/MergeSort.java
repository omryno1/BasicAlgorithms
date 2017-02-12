package MegeSort;

import java.util.Vector;

public class MergeSort {
	
	public void runMergeSort (int[] arr,int start, int end){
		if (start < end) {
			int q = (int) Math.floor((start + end) / 2);
			runMergeSort(arr, start, q);
			runMergeSort(arr, q+1, end);
			merge(arr, start, q, end);  
		}
	}
	
	public int[] merge (int[] arr, int start, int halfPoint, int end){
		
		Vector<Integer> startArr = new Vector<Integer>();
		Vector<Integer> endArr = new Vector<Integer>();
		
		int startHalf = (halfPoint - start) + 1;
		int endHalf = (end - halfPoint);
		
		int i;
		int j;
		
		for (i = 0 ; i < startHalf ; i++) {
			startArr.add(arr[start + i]);
		}
		
		startArr.add(1000);
		
		for (j = 0; j < endHalf; j++) {
			endArr.add(arr[halfPoint + j + 1]);
		}
		
		endArr.add(1000);
		
		i = 0;
		j = 0;
		
		for (int k = start; k <= end; k++) {
			if (startArr.elementAt(i) <= endArr.elementAt(j)){
				arr[k] = startArr.elementAt(i);
				i++;
			}else{
				arr[k] = endArr.elementAt(j);
				j++;
			}		
		}		
		return arr;
	}
	

}
