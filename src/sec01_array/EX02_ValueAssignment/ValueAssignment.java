package sec01_array.EX02_ValueAssignment;

public class ValueAssignment {
	public static void main(String[] args) {
		
		//#1. 배열의 원소값 대입 방법 1
		int[] array1 = new int[3];
		array1[0]=3;
		array1[1]=4;
		array1[2]=5;		
		System.out.println(array1[0]+ " "+ array1[1]+ " " + array1[2]);
		
		int[] array2;
		array2 = new int[3];
		array2[0]=3;
		array2[1]=4;
		array2[2]=5;		
		System.out.println(array2[0]+ " "+ array2[1]+ " " + array2[2]);
		
		//#2. 배열의 원소값 대입 방법 2
		int[] array3 = new int[] {3, 4, 5};
		System.out.println(array3[0]+ " "+ array3[1]+ " " + array3[2]);
		
		int[] array4;
		array4 = new int[] {3, 4, 5};
		System.out.println(array4[0]+ " "+ array4[1]+ " " + array4[2]);
		
		//#3. 배열의 원소값 대입 방법 3
		int[] array5 = {3, 4, 5};
		System.out.println(array5[0]+ " "+ array5[1]+ " " + array5[2]);
		
//		int[] array6;
//		array6 = {3, 4, 5}; // 불가능
//		System.out.println(array6[0]+ " "+ array6[1]+ " " + array6[2]);
		
		
	}
}





