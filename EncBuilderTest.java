package utilTest;

public class EncBuilderTest {
	private StringBuilder encrypt(String msg) {
		StringBuilder sb=new StringBuilder();
		
		
		
		for(int i=0;i<msg.length();i++) {
			if(msg.charAt(i)==' ' ) {//공백일때는 
	 		sb.append(msg.charAt(i));//sb 를 썻기때문에 append를 써야됨
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
			System.out.println("암호화 전"+msg);
			String str1=enc.encrypt(msg).toString();//한문자에 2씩 더하기
			System.out.println("암호화 후"+str1);
			//System.out.println("복구 후"+enc.decrypt(str1));//암호화 된거에 다 -2
			 	
	
		}
	
	}
