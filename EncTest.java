package utilTest;

public class EncTest {
	/*��ȣȭ�� HI...
	 * ��ȣȭ�� Jk00"Inxf"vq"oggv"{qw##
	 */
		public String encrypt(String msg) {
			String dap="";
			
			for(int i=0;i<msg.length();i++) {
				if(msg.charAt(i)==' ' ) {
		 		dap+=msg.charAt(i);
				}
				else {
					dap+=(char)(msg.charAt(i)+2);   
				}
			}
			return dap;
		}
		
		public String decrypt(String str1) {
			String dap="";
			
			for(int i=0;i<str1.length();i++) {
				if(str1.charAt(i)==' ' ) {
		 		dap+=str1.charAt(i);
				}
				else {
					dap+=(char)(str1.charAt(i)-2);   
				}
			}
			return dap;
		}
		
		
		
		public static void main(String[] args) {
		
		
		EncTest enc=new EncTest();
		String msg="Hi.. Glad to meet you!!";
		System.out.println("��ȣȭ ��"+msg);
		String str1=enc.encrypt(msg);//�ѹ��ڿ� 2�� ���ϱ�
		System.out.println("��ȣȭ ��"+str1);
		System.out.println("���� ��"+enc.decrypt(str1));//��ȣȭ �Ȱſ� �� -2
		 	
			
			}
		
		}
