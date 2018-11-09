
public class TryCatch {
	public static void main(String[] args) {
		try {
			int i=9/0;
		}
		catch(ArithmeticException e){
			//System.out.println("catching ArithmeticException in catch");
			e.printStackTrace();
			e.getMessage();
		}
		System.out.println("program is not getting terminated");
	}
}

