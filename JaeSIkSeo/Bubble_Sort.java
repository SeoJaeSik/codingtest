package a.Algorithm;

// 버블정렬 구현하기
public class Bubble_Sort {
	
	public static void swap(int [] arr, int idx1, int idx2) {
		int idx = arr[idx2];
		arr[idx2] = arr[idx1];
		arr[idx1] = idx;
	}
	
	public static void bubbleSort(int [] arr) {
		
		for (int j=arr.length; j>0; j--) {
			for (int i=0; i<j-1; i++) {
				// 현재인덱스와 다음인덱스를 비교하는 반복문
				if( arr[i] > arr[i+1]) {
					swap(arr, i, i+1);
				}
			}
		}
	}

	public static void main(String[] args) {

		int [] temp = {10, 9, 5, 3, 1, 7, 4, 6};
		
		bubbleSort(temp);
		
		for (int i=0; i<temp.length; i++) {
			System.out.print(temp[i]+" ");
		}
	}

}
