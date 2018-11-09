
public class ThrowsKeyword {
	public static void main(String[] args) {
		ThrowsKeyword obj=new ThrowsKeyword();
		obj.calc();
		System.out.println("last statement");
	}
	
	public void calc() throws ArithmeticException {
		try {
			div();	
		}
		catch(Throwable e) {
			System.out.println("Exception thrown by div and handled by calc");
		}
		
	}
	public void div() throws ArithmeticException{
		int i=9/0;
	}
}

