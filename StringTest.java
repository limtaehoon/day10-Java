package utilTest;

import java.awt.SystemColor;

import javax.sql.rowset.spi.SyncFactory;

public class StringTest {
	public static void main(String[] args) {//equals ���� 
				String str="�ȳ�";
				String str1="�ȳ�";
				String tmp=new String("�ȳ�");
	
	if(str==str1) {
		System.out.println("�ּҰ���");
	}
	else {
		System.out.println("�ٸ���");
	}
	if(str==tmp) {
		System.out.println("�ּҰ���");
	}
	else {
		System.out.println("�ٸ���");
	}
	if(str.equals(str1)) {
		System.out.println("���배��");
	}	
		else {
			System.out.println("����ٸ���");
		}
	if(str.equals(tmp)) {
		System.out.println("���배��");
	}
	else {
		System.out.println("����ٸ���");
	}
	str=str+str1;//String Ŭ������ ����Ŭ����=(��������Ұ�) <=>����Ŭ���� (String Build, String Buffer)
	if(str==str1) {
		System.out.println("�ּҰ���");
	}
	else {
		System.out.println("�ּҴٸ���");
	}
}	
	
	}
	
			
		
		
		
		
		
		
		
		
		
		
		
		