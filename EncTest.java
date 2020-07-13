package utilTest;

public class EncTest {
	/*암호화전 HI...
	 * 암호화후 Jk00"Inxf"vq"oggv"{qw##
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
		System.out.println("암호화 전"+msg);
		String str1=enc.encrypt(msg);//한문자에 2씩 더하기
		System.out.println("암호화 후"+str1);
		System.out.println("복구 후"+enc.decrypt(str1));//암호화 된거에 다 -2
		 	
			
			}
		
		}
