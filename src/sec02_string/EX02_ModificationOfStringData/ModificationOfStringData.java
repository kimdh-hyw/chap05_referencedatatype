package sec02_string.EX02_ModificationOfStringData;

/*String 객체의 문자열 수정 및 다른 참조자료형과의 비교*/

import java.util.Arrays;

public class ModificationOfStringData {
	public static void main(String[] args) {		
		//#1. 문자열 수정 (객체내의 내용변경 불가 --> 새로운 객체 생성)
		String str1 = new String("안녕");
		String str2 = str1;
		
		str1="안녕하세요";
		
		System.out.println(str1); //안녕하세요
		System.out.println(str2); //안녕
		
		//@배열 참조자료형
		int[] array1 = new int[] {3,4,5};
		int[] array2 = array1;
		array1[0]=6;
		array1[1]=7;
		array1[2]=8;
		
		System.out.println(Arrays.toString(array1)); //[6, 7, 8]
		System.out.println(Arrays.toString(array2)); //[6, 7, 8]
	}
}
