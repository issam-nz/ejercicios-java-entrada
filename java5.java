import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.io.*;

public class teclado {

	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		float num1 = Float.parseFloat(reader.readLine());
		float num2 = Float.parseFloat(reader.readLine());
		
		System.out.println(Math.max(num1, num2));
		// método2
		//if (num1 > num2)
		//	System.out.println("el maximo es: "+ num1);
		//else
		//	System.out.println("el maximo es: "+ num2);


	}

}
