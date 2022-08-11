import java.util.Stack;

/*
 * Stack : LIFO(Last Input First Out)
 */
public class ListDemo {
	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		String [] array = {"박지민", "홍지민", "박지민", "한지민", "한지민", "이지민"};
		for(String str:array) {
			stack.push(str);
		}
		
		System.out.println(stack.search("한지민"));	//없으면 -1 출력, 있으면 위에서부터 순서대로 그 번호 출력
		
//		System.out.println(stack.peek());
//		//System.out.println(stack.size());
//		System.out.println(stack.peek());
//		//System.out.println(stack.size());
//		System.out.println(stack.pop());
//		//System.out.println(stack.size());
		
		//pop은 포인터가 가르키는애 출력하고 삭제, peek는 맨위에꺼를 가르킴
		//pop은 안에 뭐가 없으면 오류남 -> empty() 사용
	}
}
