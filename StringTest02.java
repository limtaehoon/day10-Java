package utilTest;

public class StringTest02 {

	public static void main(String[] args) {
		String str="안녕하세요  Hello 지금은 자바공부중!!";
		System.out.println("str길이"+str.length());//문자
		System.out.println("H위치"+str.indexOf('H'));//위치 
		System.out.println("H위치"+str.indexOf("Hello"));
		System.out.println("4번째문자"+str.charAt(4));
		String tmp="열심히 합시다";
		System.out.println("srt과 tmp연결"+str+tmp);
		System.out.println("srt과 tmp연결"+str.concat(tmp));
		int value=7;
		System.out.println("srt과 tmp연결"+str+value);
		//concat
	//	System.out.println("srt+value연결"+str.concat(value));
		String s=String.valueOf(value);
		System.out.println("srt+value연결"+str.concat(s));
		System.out.println("tmp+value연결"
		+tmp.concat(String.valueOf(value)));
		String msg="abcdefg";
		System.out.println(msg.toUpperCase());
		System.out.println(msg.toUpperCase().toLowerCase().toLowerCase());
		String[]arr= str.split(" ");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		System.out.println(arr.length);
	}

}
