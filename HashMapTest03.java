package utilTest;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapTest03 {
	public static void main(String[] args) {
		//1.�ؽ��� map�� ����
		//2�ܾ �Է´�� �ܾ�� �Է� Ƚ�� ����
		//3��ҹ��� ���о��� xġ�� ����
		//4map ���
		
		HashMap<String, Integer> map=new HashMap<String, Integer>();
		Scanner sc= new Scanner(System.in);
		while(true) {
		System.out.println("�ܾ� �Է�..����x");
		String s= sc.nextLine();
		if(s.toLowerCase().equals("x"))break;
		/*if(map.containsKey(s)) {
		//if(map.get(s)!=null){//�ʿ� �ܾ ������ �׼� 1���ϱ�	
			map.put(s,map.get(s)+1);
		}
		else{//�ɿ� �ܾ ������ 
			map.put(s,1);
		 }*/
	   map.put(s,map.get(s)==null?1:map.get(s)+1);
		}
		
		System.out.println(map);
	}
}	
		

