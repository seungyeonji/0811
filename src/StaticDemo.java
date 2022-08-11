/**
 * 
 * <font color='red' size='5'>Static 용법 4가지</font>
 * <ol>
 *    <li><b>static variable</b> : 참조없이 클래스의 이름으로 접근하기 위한 공유변수</li>
 *    <li><b>static method</b> : 참조없이 클래스의 이름으로 메소드에 접근하기 위해서</li>
 *    <li><b>static initialization block</b> : static 변수와 상수의 초기화</li>
 *    <li><b>static class</b> </li>
 * </ol>
 * @author User
 * @version 1.0
 * @since 2022-08-11
 * 
 */
public class StaticDemo {
	/**
	 * Member Variable
	 */
	private String name;	//member variable
	private final double PI;	//member constant
	private static int age; 	//static variable
	private static final boolean FLAG;   //static constant
	
	
	//initialization block
	{
		this.name = "한지민";	//멤버변수 초기화
		System.out.println("나는 생성자보다 먼저 호출되는데, 다시는 재호출할 수 없다");
	}
	
	public StaticDemo() {	//Constructor
		this.PI = 3.141596; 	//멤버상수 초기화
		System.out.println("나는 생성자");
	}
	
	//static initialization block : static변수와 static상수 초기화 -> 가장 먼저 메모리에 올라감
	static{
		age = 26;	//static 변수 초기화
		FLAG = true; 	 //static 상수 초기화
		System.out.println("나는 static 초기화 블록이다, 항상 제일 먼저 메모리에 올라온다");
	}
	
	
	/**
	 * Program의 시작점
	 * @param args : String Array
	 * @return Nothing
	 * @see https://www.naver.com
	 */
	public static void main(String[] args) {
		System.out.println("나이 = " + age);
		System.out.println("FLAG = " + FLAG);
		StaticDemo sd = new StaticDemo();	//new 써줘야 호출됨
		System.out.println("이름 = " + sd.name);
		System.out.println("PI = " + sd.PI);
	}
}
