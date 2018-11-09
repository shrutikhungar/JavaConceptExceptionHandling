import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class userInputException {
	static String name;
	public static void main(String[] args) {
		InputStreamReader isObj=new InputStreamReader(System.in);
		BufferedReader brObj=new BufferedReader(isObj);
		try {
			name=brObj.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Welcome "+name);
	}
}
