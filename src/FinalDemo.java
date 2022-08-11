/**
 * 
 * <h1>Final 용법 3가지</h1>
 * <ul>
 * 		<li><b>Final Variable</b> : 자바의 상수</li>
 * 		<li><b>Final Method</b> : Override의 금지</li>
 * 		<li><b>Final Class</b> : 상속의 금지</li>
 * </ul>
 * 
 * @author User
 * @version 1.1
 * @since 2022-08-11
 * 
 */
public class FinalDemo extends Super{
	private final double PI = Math.PI;		//Member Constant
	private static final boolean FLAG = true; 		//Static Constant
	
	public static void main(String[] args) {
		final String NAME = "한지민";	//Local Constant
//		NAME = "박지민";	//오류남 -> 한번 초기화되면 값을 바꿀수 없다
	}

	
//	public final void display() {	//오류남 -> final 메소드니까 override 못함 -> 부모의 display 메소드를 그대로 써야함
//		System.out.println("나는 자식의 메소드");
//	}
	
	@Override	//abstract인 부모클래스의 abstract메소드 재정의
	public void print() {
		System.out.println("나는 자식의 메소드");
	}
}

abstract class Super{		//abstract 메소드 하나라도 가지면 그 클래스도 abstract
	public final void display() {	//final 메소드로 lock을 건다 -> 자식이 재정의 못함
		System.out.println("나는 부모의 메소드");
	}
	public abstract void print();		//자식이 무조건 재정의하게 만드려면 부모를 abstract으로 선언
}
//abstract과 final 키워드는 같이 사옹할 수 없다(abstract은 자식이 무조건 재정의해야하고, final은 재정의를 금지하니까)


//final class Parent{	//class가 final 이면 그 안의 메소드는 모두 final -> 상속안됨
//	public void display() {
//		System.out.println("나는 부모의 메소드");
//	}
//}
