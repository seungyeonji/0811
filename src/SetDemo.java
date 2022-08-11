import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
	public static void main(String[] args) {
		Set<String> hashSet = new HashSet<String>();
		Set<String> treeSet = new TreeSet<String>();
		String [] array = {"박지민", "홍지민", "박지민", "한지민", "한지민", "이지민"};
		for(String str:array) {
			hashSet.add(str);
			treeSet.add(str);
		}
//		System.out.println(hashSet.size()); 	//4 -> 6개 중 중복빼고
		System.out.println(hashSet); 	//중복빼고 저장
		System.out.println(treeSet);	//중복 제거하고 sorting해서 저장
	}
}
