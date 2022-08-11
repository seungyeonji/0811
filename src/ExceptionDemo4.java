import java.util.Scanner;

public class ExceptionDemo4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("국어 점수 : ");
		int kor = sc.nextInt();
		System.out.print("수학 점수 : ");
		int math = sc.nextInt();
		
		try {
			Student chulsu = new Student(kor, math);
			System.out.println(chulsu);
		} catch (KoreanException e) {
			System.out.println(e.getMessage());
		} catch (MathException e) {
			System.out.println(e.getMessage());
		}
		
		
		
//		try {
//		Student chulsu = new Student(100);
//		System.out.println(chulsu);
//		}catch(KoreanException ex) {
//			System.out.println(ex.getMessage());	//오류위치 말고 메세지"만" 보여줌
//		}
	}
}

class Student{
	private int kor, math;

	public Student(int kor, int math) throws KoreanException, MathException{		//constructor
		if(kor>=0 && kor<=100) this.kor = kor;
		else throw new KoreanException("국어점수는 0부터 100점까지입니다");
		if(math >=0 && math<=100)	this.math = math;
		else throw new MathException("수학점수는 0부터 100점까지입니다");
	}

	@Override
	public String toString() {
		return String.format("Student [kor=%s, math=%s]", kor, math);
	}
	
	
	

//	public Student(int kor) throws KoreanException {	//constructor
//		if(kor>=0 && kor<=100) this.kor = kor;
//		else throw new KoreanException("국어 점수는 0부터 100점까지여야 합니다");	//user에게 메세지 보여줌
//		this.kor = kor;
//	}
//
//	@Override
//	public String toString() {
//		return String.format("Student [kor=%s]", kor);
//	}
}