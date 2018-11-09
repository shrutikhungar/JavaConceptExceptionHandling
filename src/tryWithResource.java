import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class tryWithResource {
	public static void main(String[] args) throws IOException 
	{
		try(BufferedReader brObj=new BufferedReader(new InputStreamReader(System.in)))
		{
			String str="";
			str=brObj.readLine();
		}
	}
}
