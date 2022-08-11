import java.util.Scanner;

public class ExceptionDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째숫자 : ");
		int first = sc.nextInt();
		System.out.print("두번째숫자 : ");
		int second = sc.nextInt();
		
		//예외처리
		try {	//exception 발생할 가능성 있는 코드를 try로 묶음
		System.out.printf("%d / %d = %d\n", first, second, first/second);
		}catch(NullPointerException ex) {
			System.out.println("NullPointerException");
		}catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println("ArrayIndexOutOfBoundsException");
		}catch(RuntimeException ex) {	//자식은 부모로 형변환이 된다 -> ArithmeticException의 부모인 RuntimeeException을 넣어줘도됨
			System.out.println("내가 잡았음");
		}
//		catch(ArithmeticException ex) {	//try가 던진 exception과 타입이 일치해야함 -> 일치하지 않으면 못잡음
//			System.out.println("내가 잡았음");
//		}
		
		/*
		 * Multiple Catch Block : 여러개의 Exception Type을 열거하는 방법
		 *  - 주의점 : 위아래 순서가 있다. 위쪽은 자식 exception, 아래쪽은 부모 exception(부모가 위에 있으면 자식들 있을 필요가 없음)
		 */
	}	
}
