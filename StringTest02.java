package utilTest;

public class StringTest02 {

	public static void main(String[] args) {
		String str="�ȳ��ϼ���  Hello ������ �ڹٰ�����!!";
		System.out.println("str����"+str.length());//����
		System.out.println("H��ġ"+str.indexOf('H'));//��ġ 
		System.out.println("H��ġ"+str.indexOf("Hello"));
		System.out.println("4��°����"+str.charAt(4));
		String tmp="������ �սô�";
		System.out.println("srt�� tmp����"+str+tmp);
		System.out.println("srt�� tmp����"+str.concat(tmp));
		int value=7;
		System.out.println("srt�� tmp����"+str+value);
		//concat
	//	System.out.println("srt+value����"+str.concat(value));
		String s=String.valueOf(value);
		System.out.println("srt+value����"+str.concat(s));
		System.out.println("tmp+value����"
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
