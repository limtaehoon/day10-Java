package utilTest;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapTest03 {
	public static void main(String[] args) {
		//1.해쉬앱 map을 생성
		//2단어를 입력답아 단어와 입력 횟수 저장
		//3대소문자 구분없이 x치면 종료
		//4map 출력
		
		HashMap<String, Integer> map=new HashMap<String, Integer>();
		Scanner sc= new Scanner(System.in);
		while(true) {
		System.out.println("단어 입력..종료x");
		String s= sc.nextLine();
		if(s.toLowerCase().equals("x"))break;
		/*if(map.containsKey(s)) {
		//if(map.get(s)!=null){//맵에 단어가 있으면 그수 1더하기	
			map.put(s,map.get(s)+1);
		}
		else{//맴에 단어가 없으면 
			map.put(s,1);
		 }*/
	   map.put(s,map.get(s)==null?1:map.get(s)+1);
		}
		
		System.out.println(map);
	}
}	
		

