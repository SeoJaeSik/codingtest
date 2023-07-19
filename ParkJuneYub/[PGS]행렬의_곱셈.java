import java.lang.reflect.Array;
걸린 시간 : 15분
레벨 : LV2

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
    	
    	// 행렬의 결과값은 곱하는 2찬원 배열의 가운데 값입니다. 예) 2*3 3*4 = 2*4
    	int[][] arr = new int[arr1.length][arr2[0].length];
    	
    	// 곱셈 값은 더해줘야합니다. 결과값의 모든 곳을 돕니다. 예)2*4
    	for(int i = 0; i < arr.length; i++) {
    		for(int j = 0; j < arr[i].length; j++) {
    			arr[i][j] = 0;
    			
    			// k는 가운데 값입니다. 예) 2*3 3*4 에서 3을 의미함
    			for(int k = 0; k < arr1[i].length; k++) {
    				arr[i][j] += arr1[i][k]*arr2[k][j];
    			}
    			
    		}
    	}
    	
        return arr;

    }
}