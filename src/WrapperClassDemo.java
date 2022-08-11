
public class WrapperClassDemo {
	public static void main(String[] args) {
		//Until JDK 1.4
//		int age = 26; 	//stack(지역변수는 stack에 올라옴)
//		Integer in = new Integer(age);	//boxing, wrapping
//		int su = in.intValue();	//unboxing, unwrapping
//		System.out.println("su = " + su);
		
		//Since JDK 1.5
		Integer in = 26 + 5;	//Integer in = new Integer(26+5); -> autoboxing
		int su = in + 100;		//in.intValue() + 100
		System.out.println("su = " + su);
	}
}
