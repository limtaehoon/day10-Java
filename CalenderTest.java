package utilTest;

import java.util.Calendar;

public class CalenderTest {
	public static void  printClaendar(String msg,Calendar cal) {
	//��,��,��
	int year=cal.get(Calendar.YEAR);
	int month=cal.get(Calendar.MONTH)+1;
	int day=cal.get(Calendar.DAY_OF_MONTH);
	System.out.println(year+"/"+month+"/"+day);
	System.out.println(cal.get(Calendar.DAY_OF_MONTH));
	int d=cal.get(Calendar.DAY_OF_WEEK);
	String yul="";
	
	switch (d) {
	case 1:yul="��";break;
	case 2:yul="��";break;	
	case 3:yul="ȭ";break;
	case 4:yul="��";break;
	case 5:yul="��";break;
	case Calendar.FRIDAY:yul="��";break;//���� ���� �־��
	case 7:yul="��";break;
	}
	//�迭
	String[]arr= {"��","��","ȭ","��","��","��","��"};
	System.out.println("�迭����:"+arr[cal.get(Calendar.DAY_OF_WEEK)-1]);
	System.out.println("swich ����:"+yul);
	System.out.println("����:"+yul);
	System.out.println(cal.get(Calendar.SATURDAY));
	int ampm=cal.get(Calendar.AM_PM);
	String ampmStr="";
	/*if(ampm==Calendar.AM) {
		ampmStr="����";
	}else {
		ampmStr="����";
	}*/	
	int h=cal.get(Calendar.HOUR);
	int hourofDay=cal.get(Calendar.HOUR_OF_DAY);
	int m=cal.get(Calendar.MINUTE);
	int s=cal.get(Calendar.SECOND);
	System.out.println("��:"+h+":"+m+":"+s);
	System.out.println("��:"+hourofDay+":"+m+":"+s);
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar now=Calendar.getInstance();
		CalenderTest.printClaendar("����",now);
		now.set(1993,8,14);
		CalenderTest.printClaendar("someday",now );
	
		
	
	}
	

}
