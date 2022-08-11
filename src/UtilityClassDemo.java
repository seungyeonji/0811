import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/*
 * Java에서 날짜/시간을 처리하는 5가지 방법
 * 1. java.util.Date class
 * 2. java.util.Calendar class
 * 3. java.text.DateFormat class
 * 4. java.text.SimpleDateFormat class
 * 5. printf()
 */
public class UtilityClassDemo {
	public static void main(String[] args) {
		//1 Date class
		Date now = new Date();
		System.out.println(now);
//		System.out.println(now.getTime());	  //1660199999794
//		File file = new File("C:/Temp/sungjuk_utf8.dat");
//		long last = file.lastModified();	//마지막 수정 시간
//		System.out.println(last); 	//1659688049250
//		Date createTime = new Date(last);
//		System.out.println(createTime);
//		Date before = new Date(1660199999794L);
//		System.out.println(before);
		
		
		//2 Calendar class
		//singleton에 의해 만들어진 객체기 때문에 new 못쓰니까 자식으로 만들거나 getinstance로 만들거나
		Calendar today = Calendar.getInstance();
		int year = today.get(Calendar.YEAR);
		int month = today.get(Calendar.MONTH) + 1;
//		int day = today.get(Calendar.DATE);
		int day = today.get(Calendar.DAY_OF_MONTH);	//요일은 day_of_week
		System.out.println(year + "년 " + month + "월 " + day + "일입니다");
		
		//3.DateFormat class
		DateFormat df = DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.FULL, Locale.FRENCH);
		System.out.println(df.format(now));
		
		//4. SimpleDateFormat class
		String pattern = "오늘은 yyyy년 MM월 dd일입니다";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		System.out.println(sdf.format(new Date()));
		
		//5. printf()
		System.out.printf("오늘은 %1$tY년 %1$tm월 %1$td일입니다\n", new Date());
	}
}
