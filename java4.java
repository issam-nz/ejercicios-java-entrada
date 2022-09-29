import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.io.*;

public class eje4 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		float num1 = Integer.parseInt(reader.readLine());
		float num2 = Integer.parseInt(reader.readLine());
		float resultado = num1 / num2;
		
		System.out.println(resultado);


	}

}
