package sort;

public class SwapCountMS {
	static long countInversions(int[] arr) {
		int swaps;
		int[] temp = new int[arr.length];
		swaps = mergeSort(arr,temp, 0,arr.length-1);
		return swaps;
	}

	private static int mergeSort(int[] arr, int[] temp, int leftEnd, int rightEnd) {
		int swaps = 0;
		if(leftEnd>=rightEnd) {
			return swaps;
		}
		for(int i=leftEnd;i<=rightEnd;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		System.out.println("leftEnd "+ leftEnd + " mid " + ((leftEnd+rightEnd)/2-1));
		int mid = ((leftEnd+rightEnd)/2);
		int  left =  mergeSort(arr, temp, leftEnd,mid);
		int right = mergeSort(arr, temp, mid+1,rightEnd);
		int index = leftEnd;
		int leftIndex = leftEnd;
		int rightIndex = mid+1;
		while(leftIndex <= mid && rightIndex<= rightEnd ) {
			if(arr[leftIndex]> arr[rightIndex]) {
				temp[index]=arr[rightIndex];
				rightIndex++;
				swaps++;
			}else {
				temp[index]=arr[leftIndex];
				leftIndex++;
			}
			index++;
		}
		System.arraycopy(arr, leftIndex, temp, index, (leftEnd+rightEnd)/2 - leftIndex +1);
		System.arraycopy(arr, rightIndex, temp, index, rightEnd-rightIndex+1);
		System.arraycopy(temp, leftEnd, arr, leftEnd, rightEnd-leftEnd+1);
		return (swaps+left+right);
	}
	public static void main(String[] args) {
		int[] arr = {2,1,3,1,2};
		long result = countInversions(arr);
		System.out.println("\n\n"+result);
	}
}
