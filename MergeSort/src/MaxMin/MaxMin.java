package MaxMin;


public class MaxMin {
	
	int min;
	int max;
	
	

	public MaxMin findMaxMin (int[] arr,int s, int e){
		
		MaxMin maxMin = new MaxMin();
		
		if (s == e){
			maxMin.max = arr[s];
			maxMin.min = arr[e];		
			return maxMin; 
			
		}else{
			int q = (int) Math.floor((s + e)/2);
			MaxMin leftResult = findMaxMin(arr, s, q);
			MaxMin rightResult = findMaxMin(arr, q+1, e);
			
			if (leftResult.max >= rightResult.max){
				maxMin.max = leftResult.max;
			}else maxMin.max = rightResult.max;
			
			if (leftResult.min <= rightResult.min){
				maxMin.min = leftResult.min;
			}else maxMin.min = rightResult.min;
			
			return maxMin;
		}
			
	}
	
	public int getMin() {
		return min;
	}

	public int getMax() {
		return max;
	}
}
