import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExceptionDemo1 {
	public static void main(String[] args) throws FileNotFoundException{	//2) main메소드에서 예외가 발생하니까 메소드 선언할때 해당 exception에 던져주기
//		File file = new File("C:/Temp/sungjuk_utf8.dat");	
//		Scanner sc = new Scanner(file, "utf-8");
		
		//예외처리 1)try/catch 사용(권장)
		//FileNotFoundException은 Runtime exception 자식이 아니니까 checked exception -> try/catch 써야함
//		try {
//			Scanner sc = new Scanner(file, "utf-8");
//		} catch (FileNotFoundException e) {
//			System.out.println("File not Found");
//		}
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자형 글자를 입력하세요 : ");
		String num = sc.nextLine();
		int su = Integer.parseInt(num);
		System.out.printf("su = %d", su);
	}
}
