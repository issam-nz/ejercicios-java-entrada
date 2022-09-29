import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.io.*;

public class opcional1 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		float num1 = Float.parseFloat(reader.readLine());
		float num2 = Float.parseFloat(reader.readLine());
		float num3 = Float.parseFloat(reader.readLine());
		float num4 = Float.parseFloat(reader.readLine());
		float num5 = Float.parseFloat(reader.readLine());
		float num6 = Float.parseFloat(reader.readLine());
		float num7 = Float.parseFloat(reader.readLine());
		float num8 = Float.parseFloat(reader.readLine());
		float num9 = Float.parseFloat(reader.readLine());
		float num10 = Float.parseFloat(reader.readLine());
		
		int positivos = 0;
		
		if (num1 > 0) 
			positivos += 1;
		
		if (num2 > 0) 
			positivos += 1;
		
		if (num3 > 0) 
			positivos += 1;
		
		if (num4 > 0) 
			positivos += 1;

		if (num5 > 0) 
			positivos += 1;

		if (num6 > 0) 
			positivos += 1;

		if (num7 > 0) 
			positivos += 1;

		if (num8 > 0) 
			positivos += 1;

		if (num9 > 0) 
			positivos += 1;

		if (num10 > 0) 
			positivos += 1;
		
		
		System.out.println("la cantidad de positivos recibidos es " + positivos);

	}


}
