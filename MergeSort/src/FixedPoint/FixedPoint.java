package FixedPoint;

public class FixedPoint {

	// Sorted Array, the algorithm needs to fine if there is a cell which arr[i] = i
	
	public int findFixedPoint(int[] arr, int s, int e){
		
		int q = (int)Math.floor((s + e)/2);
		
		if (arr[q] == q){
			return q;
		}else if (q == 0){
			return 0;
		}else if (arr[q] > q){
				return findFixedPoint(arr, s, q-1);
			}else return findFixedPoint(arr, q+1, e);
	}

}
