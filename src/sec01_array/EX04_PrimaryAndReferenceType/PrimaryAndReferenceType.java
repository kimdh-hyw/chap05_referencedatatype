package sec01_array.EX04_PrimaryAndReferenceType;

/*기본자료형 vs. 참조자료형의 특징 비교*/

public class PrimaryAndReferenceType {
	public static void main(String[] args) {		
		//#1. 기본자료형의 대입연산 (stack 값 복사)
		int value1 = 3;
		int value2 = value1;
		value2 = 7;
		System.out.println(value1); //3
		System.out.println(value2); //7
		System.out.println();
		
		//#2. 참조자료형의 대입연산 (stack 값 복사)
		int[] array1 = new int[] {3, 4, 5};
		int[] array2 = array1;
		array2[0]=7;
		System.out.println(array1[0]); //7
		System.out.println(array2[0]); //7		
	}
}

