package utilTest;

import java.awt.SystemColor;

import javax.sql.rowset.spi.SyncFactory;

public class StringTest {
	public static void main(String[] args) {//equals 내용 
				String str="안녕";
				String str1="안녕";
				String tmp=new String("안녕");
	
	if(str==str1) {
		System.out.println("주소같다");
	}
	else {
		System.out.println("다르다");
	}
	if(str==tmp) {
		System.out.println("주소같다");
	}
	else {
		System.out.println("다르다");
	}
	if(str.equals(str1)) {
		System.out.println("내용같다");
	}	
		else {
			System.out.println("내용다르다");
		}
	if(str.equals(tmp)) {
		System.out.println("내용같다");
	}
	else {
		System.out.println("내용다르다");
	}
	str=str+str1;//String 클래스는 정적클래스=(내용수정불가) <=>동적클래스 (String Build, String Buffer)
	if(str==str1) {
		System.out.println("주소같다");
	}
	else {
		System.out.println("주소다르다");
	}
}	
	
	}
	
			
		
		
		
		
		
		
		
		
		
		
		
		