
public class ExceptionDemo3 {
	public static void main(String[] args) {
		Test t = new Test();
		t.display();
		t = null;		//주소 없애니까
		try {
			t.display();	//NullPointerException 발생
		}catch(NullPointerException ex) {
			System.out.println(ex.getMessage());
			
//			System.out.println(ex); 	//ex.toString() : 객체주소만 쓰면 toString 자동으로 호출
//			ex.printStackTrace();
		}
	}
}

class Test{
	public void display() {
		System.out.println("Hello, World");
	}
}