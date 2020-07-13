package utilTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test01 {

	public static void main(String[] args) {
		//1부터20사이의 난수 10개를 map에 넣으세요
		//중복된 난수는 허용하지 않는다.
		Map<Integer,Integer> hm=new HashMap<Integer, Integer>();
		for(int i=1;i<11;i++) {
			while(true){
			int value=(int)(Math.random()*20)+1;//+1안하면 0~19
			if(!hm.containsValue(value)) {//==flase 안하고 앞에 !해도됨 같은말
			hm.put(i,value);
			break;
			}
		  }//while
		}//for			
		System.out.println(hm);
	//value 값만 출력
		//for(Integer i:hm.keySet()) {
		//	System.out.println(hm.get(i));
		for(Integer i:hm.values()) {
			System.out.print(i+"\t");
	
	}
			System.out.println();
	//순서대로 배열  
	//sort로 해서 쓰려면 문자이기에  오류뜸 그래서 36번 적기 
	
	List<Integer>list=new ArrayList<Integer>(hm.values());
	Collections.sort(list);
	for(int i:list) {
	//Collections.reverse(list);//reverse 형일때 넣어줌 
		System.out.print(i+"\t");
	}
	System.out.println();//Collections 안에 max,min값구하는것도 있음
	System.out.println("최대값"+Collections.max(list));
	System.out.println("최소값"+Collections.min(list));
	
	
	
	
	
	
	
	
	
	}

}
