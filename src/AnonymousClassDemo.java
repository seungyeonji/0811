
public class AnonymousClassDemo {
	public static void main(String[] args) {
		Demo d = new Demo() {	//익명 객체->상속받지 않고 display() 를 재정의하고 싶을 때 익명클래스 사용(local class의 변형)
			@Override
			public void display() {
				System.out.println("나는 재정의된 메소드");
			}
			public void print() {		//새로운 기능을 추가할 수는 없다 -> 호출못함
				System.out.println("나는 새로운 메소드");
			}
		};	//세미콜론 까먹으면 안됨!!!!
		d.display();
//		d.print(); 	//오류남 -> 재정의하려는 클래스의 멤버가 아니기 때문에(정의되어 있지 않아서)
	}
}

class Demo{
	public void display() {
		System.out.println("나는 원형 메소드");
	}
}
