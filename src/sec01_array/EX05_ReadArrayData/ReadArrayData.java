package sec01_array.EX05_ReadArrayData;

import java.util.Arrays;

public class ReadArrayData {
	public static void main(String[] args) {
		
		int[] array = new int[] {3, 4, 5, 6, 7};
		
		//#1. 배열의 길이 구하기
		System.out.println(array.length); //5
		System.out.println();
		
		//#2. 출력하기 1:
		System.out.println(array[0]);
		System.out.println(array[1]);
		System.out.println(array[2]);
		System.out.println(array[3]);
		System.out.println(array[4]);
		System.out.println();
		
		//#3. 출력하기 2:
		for(int i=0; i<array.length; i++)
			System.out.println(array[i]);
		System.out.println();
		
		//#4. 출력하기 3:
		//for(꺼낸 하나의 원소를 저장할 수 있는 변수:집합객체) {} for each 구문
		for(int k : array) {
			System.out.println(k);
		}
		
		//#5. 출력하기 4 :
		System.out.println(Arrays.toString(array));
		
		
	}
}













