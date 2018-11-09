public class UserDefinedException{
	public static void main(String[] args) {
		try {
			ageCheck(1);
		} catch (InvalidAgeException e) {
			System.out.println("inside catch");
			e.printStackTrace();
		}
	}

	private static void ageCheck(int age) throws InvalidAgeException {
		if (age<=0) {
			throw new InvalidAgeException("Age can not be less than zero.");
		}
		else 
			System.out.println("Correct Age");
	}
}