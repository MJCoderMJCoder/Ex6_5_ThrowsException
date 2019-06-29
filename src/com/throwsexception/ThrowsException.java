package com.throwsexception;
/**
 * 在一个方法中抛出的异常，该方法可以对其处理；也可以不处理，而是把异常向上移交给调用该方法的方法来处理。
 * 若在方法中不处理抛出的隐式异常，该异常隐式上移交给调用该方法的方法，及默认异常处理方式；
 * 若在方法中不处理抛出的显式异常，则必须在定义该方法时使用throws子句作显式异常抛弃声明，否则编译不能通过。
 */
public class ThrowsException {
	
	//若在方法中不处理抛出的隐式异常，该异常隐式上移交给调用该方法的方法，及默认异常处理方式；
	public static int calc(int x) {
		int z = 0;
		z = 110/x;
		return z;
	}

	public static void main(String[] args) {
		int a = 0;
		try {
			a = calc(0);
			System.out.println("a=" + a);
		} catch(ArithmeticException e) {
			
			//getMessage：返回异常抛出原因的字符串
			System.out.println("调用方法calc时发生异常：" + e.getMessage() + "\n"); 
			e.printStackTrace(); //输出调用堆栈跟踪信息
		}
	}

}
