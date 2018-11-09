import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderFullLineException {
	static FileReader frObj;
	static String line;
	public static void main(String[] args) throws IOException{
		frObj = new FileReader("C:\\temp.txt");
		BufferedReader brObj=new BufferedReader(frObj);
		while ((line=brObj.readLine()) != null) {
				System.out.print(line);
			}
		}
}	

