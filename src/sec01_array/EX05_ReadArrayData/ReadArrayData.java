package sec01_array.EX05_ReadArrayData;

/*1차원 배열의 원소값 출력*/

import java.util.Arrays;

public class ReadArrayData {
	public static void main(String[] args) {		
		int[] array = new int[] {3, 4, 5, 6, 7};
		
		//#1. 배열의 길이 구하기
		System.out.println(array.length); //5		
		
		//#2. 출력하기 1:
		System.out.print(array[0]+" ");
		System.out.print(array[1]+" ");
		System.out.print(array[2]+" ");
		System.out.print(array[3]+" ");
		System.out.print(array[4]+" ");
		System.out.println();
		
		//#3. 출력하기 2:
		for(int i=0; i<array.length; i++)
			System.out.print(array[i]+" ");
		System.out.println();
		
		//#4. 출력하기 3:
		//for(꺼낸 하나의 원소를 저장할 수 있는 변수:집합객체) {} for each 구문
		for(int k : array) {
			System.out.print(k+" ");
		}
		System.out.println();
		
		//#5. 출력하기 4 :
		System.out.println(Arrays.toString(array));
	}
}













