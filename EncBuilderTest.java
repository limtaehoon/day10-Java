package utilTest;

public class EncBuilderTest {
	private StringBuilder encrypt(String msg) {
		StringBuilder sb=new StringBuilder();
		
		
		
		for(int i=0;i<msg.length();i++) {
			if(msg.charAt(i)==' ' ) {//�����϶��� 
	 		sb.append(msg.charAt(i));//sb �� ���⶧���� append�� ��ߵ�
			}
			else {
				sb.append((char)(msg.charAt(i)-2));   
			}
		}
		
		
		
		return sb;
	}
		public static void main(String[] args) {
			EncTest enc=new EncTest();
			String msg="Hi.. Glad to meet you!!";
			System.out.println("��ȣȭ ��"+msg);
			String str1=enc.encrypt(msg).toString();//�ѹ��ڿ� 2�� ���ϱ�
			System.out.println("��ȣȭ ��"+str1);
			//System.out.println("���� ��"+enc.decrypt(str1));//��ȣȭ �Ȱſ� �� -2
			 	
	
		}
	
	}
