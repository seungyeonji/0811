/*
 * Checked Exception
 *  1) 반드시 try-catch
 *  2) 메소드의 선언부에 throws mathException
 */
public class MathException extends Exception{	//부모가 Exception이니까 Checked Exception
	public MathException(String msg) {	//Constructor
		super(msg);
	}
}
