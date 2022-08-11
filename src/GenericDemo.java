
public class GenericDemo {
	public static void main(String[] args) {
		Car<Integer> car = new Car<Integer>(5);	//Car 클래스에서 value가 int 였을때는 5.5 넣으면 오류남 -> Car는 정수만 받을수있는 한정적인 클래스
		int result = car.getValue();
//		System.out.println(result);
		
		Car<Double> car1 = new Car<Double>(5.5);
		double result1 = car1.getValue();
		
		Car<String> car2 = new Car<String>("Hello");
		String result2 = car2.getValue();
	}
}

class Car<T>{		//<T> : generic -> 모든타입 올수있다는 거를 의미, 근데 collection에서만 씀(T 대신 다른 알파벳(대믄자) 써도됨)
	private T value;	//-> 타입 상관없는 만능클래스 만드려면 int 대신 T
	
	public Car(T value) {
		this.value = value;
	}
	
	public T getValue() {
		return value;
	}
	public void setValue(T value) {
		this.value = value;
	}
}