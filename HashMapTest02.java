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
		System.out.println("���̵� �Է�");
		String ID =sc.nextLine();
		System.out.println("��й�ȣ �Է�");
		String pwd=sc.nextLine();
		
		
		if(map.containsKey(ID)==false) {//ID�� ����
			System.out.println("���� x");
		}
		else if(map.get(ID).equals(pwd)==false){//�������
			System.out.println("�����ġx");
		}
		else	//�Ѵ� ��ġ
			System.out.println("��ġ");
			//containsKey ��й�ȣ ����
			//equals ����Ȯ�� �Ҷ� 
	}

}
