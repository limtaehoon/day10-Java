package utilTest;

import java.util.Scanner;

public class StringTest04 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("�Է�");
		String str=sc.nextLine();
		//������ ���� ��ŭ�ݺ�
		for(int i=0;i<str.length();i++) {
		/*1ù���ڱ��ϱ�
		 * 2�ι�°���� ������ ���ϱ� 
		 * 2+1�ϱ�
		 */
			//String first=str.substring(0,1);  
			//�̰Ŵ�� char ���·� ��� �ȴ�
			char first=str.charAt(0);
			String second=str.substring(1);
		
		str=second+first;
		System.out.println(str);
		}
	}
}
