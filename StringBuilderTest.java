package utilTest;

public class StringBuilderTest {

	public static void main(String[] args) {
		String str="String";
		StringBuilder sb=new StringBuilder(str);//StringBuilder sb 뒤에 문자를 더할때 
		System.out.println(sb);
		sb.append("자바");
		System.out.println(sb);
		sb.insert(2,"oracle");
		System.out.println(sb);//storaclering자바
		System.out.println(sb.toString());
		sb.delete(2,5);
		System.out.println(sb);//St  clering자바 
		sb.reverse();//revers 
		System.out.println(sb);
		System.out.println(sb.charAt(3));
		System.out.println(sb.substring(3));
		System.out.println(sb.substring(3,5));//substring 문자열 추출

		
	
	
	}
}
