package sec02_string.EX01_CreateStringObject;

/*String 객체 생성의 두 가지 방법*/

public class CreateStringObject {
	public static void main(String[] args) {
		
		//#1. String 객체 생성 1
		String str1 = new String("안녕");
		System.out.println(str1);
		
		//#2. String 객체 생성 2
		String str2 = "안녕하세요";
		System.out.println(str2);
	}
}
