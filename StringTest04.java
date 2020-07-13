package utilTest;

import java.util.Scanner;

public class StringTest04 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("입력");
		String str=sc.nextLine();
		//문장의 길이 만큼반복
		for(int i=0;i<str.length();i++) {
		/*1첫글자구하기
		 * 2두번째부터 끝까지 구하기 
		 * 2+1하기
		 */
			//String first=str.substring(0,1);  
			//이거대신 char 형태로 적어도 된다
			char first=str.charAt(0);
			String second=str.substring(1);
		
		str=second+first;
		System.out.println(str);
		}
	}
}
