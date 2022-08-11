
public class AnonymousClassDemo1 {
	public static void main(String[] args) {
		//member method, member class니까 둘다 주소 필요
		AnonymousClassDemo1 acd = new AnonymousClassDemo1();
//		acd.exec(acd.new MyPlus());
//		acd.exec(acd.new MyMultiple()); 
		
		acd.exec(new MyInterface() {	//익명클래스는 MyInterface 자식을 안만들고, 기존의 MyInterface를 재정의
			@Override
			public int calculate(int a, int b) {
				return a+b;
			}
		});
		acd.exec(new MyInterface() {
			@Override
			public int calculate(int a, int b) {
				return a-b;
			}
		});
		acd.exec(new MyInterface() {
			@Override
			public int calculate(int a, int b) {
				return a*b;
			}
		});
		acd.exec(new MyInterface() {
			@Override
			public int calculate(int a, int b) {
				return a/b;
			}
		});
	}
	
	void exec(MyInterface mi) {	//member method
		int result = mi.calculate(5, 9);
		System.out.println("Result = " + result);
	}
	
//	class MyMultiple implements MyInterface{		//이름이 있으니까 익명클래스 x
//		@Override
//		public int calculate(int front, int back) {
//			return front*back;
//		}
//	}
//	
//	class MyPlus implements MyInterface{		//member class
//		@Override
//		public int calculate(int front, int back) {
//			return front+back;
//		}
//	}
	
}

@FunctionalInterface	//앞으로 람다로 쓸수도 있는 인터페이스
interface MyInterface{
	int calculate(int front, int back);
}