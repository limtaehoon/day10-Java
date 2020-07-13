package utilTest;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapTest02 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		HashMap<String,String>map=new HashMap<String,String>();
		map.put("java","1111");
		map.put("oracel","1234");
		map.put("jsp","abcd");
		System.out.println("아이디 입력");
		String ID =sc.nextLine();
		System.out.println("비밀번호 입력");
		String pwd=sc.nextLine();
		
		
		if(map.containsKey(ID)==false) {//ID가 없음
			System.out.println("존재 x");
		}
		else if(map.get(ID).equals(pwd)==false){//비번오류
			System.out.println("비번일치x");
		}
		else	//둘다 일치
			System.out.println("일치");
			//containsKey 비밀번호 추출
			//equals 형태확일 할때 
	}

}
