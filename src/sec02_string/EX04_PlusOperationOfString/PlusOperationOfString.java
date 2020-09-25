package sec02_string.EX04_PlusOperationOfString;

public class PlusOperationOfString {
	public static void main(String[] args) {
		
		//#1. 문자열 + 문자열
		String str1 = "안녕"+ "하세요"+ "!";
		System.out.println(str1); //안녕하세요!
		
		String str2 = "반갑";
		str2+="습니다";
		str2+="!";
		System.out.println(str2); //반갑습니다!
		System.out.println();
		
		//#2. 문자열 + 기본자료형 // 기본자료형 + 문자열
		String str3 = "안녕"+1; //안녕1;
		String str4 = "안녕"+String.valueOf(1); //안녕1
		String str5 = "안녕"+"1"; //안녕1
		
		System.out.println(str3);//안녕1
		System.out.println(str4);//안녕1
		System.out.println(str5);//안녕1
		System.out.println();
				
		//#3. 문자열과 기본자료형 혼용
		System.out.println(1+"안녕"); //1안녕
		System.out.println(1+"안녕"+2); //1안녕2
		System.out.println("안녕"+1+2); //안녕12
		System.out.println(1+2+"안녕"); //3안녕
	}
}


















