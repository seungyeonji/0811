import java.util.Vector;

public class ListDemo1 {
	public static void main(String[] args) {
		Vector<String> vector = new Vector<String>(5,3);
		System.out.print(vector.capacity() + ", ");
		System.out.println(vector.size());
		vector.add("한지민");
		System.out.print(vector.capacity() + ", "); 	//용량은 안변함
		System.out.println(vector.size());	//size는 증가
		vector.add("한지민");
		System.out.print(vector.capacity() + ", "); 	//용량은 안변함
		System.out.println(vector.size());	//size는 증가
		vector.add("한지민");
		System.out.print(vector.capacity() + ", "); 	//용량은 안변함
		System.out.println(vector.size());	//size는 증가
		vector.add("한지민");
		System.out.print(vector.capacity() + ", "); 	//용량은 안변함
		System.out.println(vector.size());	//size는 증가vector.add("한지민");
		vector.add("한지민");
		System.out.print(vector.capacity() + ", "); 	//용량은 안변함
		System.out.println(vector.size());	//size는 증가
		vector.add("한지민");
		System.out.print(vector.capacity() + ", "); 	//용량은 안변함
		System.out.println(vector.size());	//size는 증가
	}
}
