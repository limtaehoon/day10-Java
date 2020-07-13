package utilTest;

import java.util.Calendar;

public class CalenderTest {
	public static void  printClaendar(String msg,Calendar cal) {
	//년,월,일
	int year=cal.get(Calendar.YEAR);
	int month=cal.get(Calendar.MONTH)+1;
	int day=cal.get(Calendar.DAY_OF_MONTH);
	System.out.println(year+"/"+month+"/"+day);
	System.out.println(cal.get(Calendar.DAY_OF_MONTH));
	int d=cal.get(Calendar.DAY_OF_WEEK);
	String yul="";
	
	switch (d) {
	case 1:yul="일";break;
	case 2:yul="월";break;	
	case 3:yul="화";break;
	case 4:yul="수";break;
	case 5:yul="목";break;
	case Calendar.FRIDAY:yul="금";break;//직접 요일 넣어도됨
	case 7:yul="토";break;
	}
	//배열
	String[]arr= {"일","월","화","수","목","금","토"};
	System.out.println("배열요일:"+arr[cal.get(Calendar.DAY_OF_WEEK)-1]);
	System.out.println("swich 요일:"+yul);
	System.out.println("요일:"+yul);
	System.out.println(cal.get(Calendar.SATURDAY));
	int ampm=cal.get(Calendar.AM_PM);
	String ampmStr="";
	/*if(ampm==Calendar.AM) {
		ampmStr="오젼";
	}else {
		ampmStr="오후";
	}*/	
	int h=cal.get(Calendar.HOUR);
	int hourofDay=cal.get(Calendar.HOUR_OF_DAY);
	int m=cal.get(Calendar.MINUTE);
	int s=cal.get(Calendar.SECOND);
	System.out.println("현:"+h+":"+m+":"+s);
	System.out.println("현:"+hourofDay+":"+m+":"+s);
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar now=Calendar.getInstance();
		CalenderTest.printClaendar("현재",now);
		now.set(1993,8,14);
		CalenderTest.printClaendar("someday",now );
	
		
	
	}
	

}
