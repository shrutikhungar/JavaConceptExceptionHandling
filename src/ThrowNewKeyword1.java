

public class ThrowNewKeyword1{
	public static void main(String[] args) {
		System.out.println("A");
	
		System.out.println("B");
		String exec_flag="N";
		if (exec_flag.equals("N")) {
			try {
				throw new Exception("execution flag No Exception");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
