import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.io.*;

public class opcional1 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		float[] numeros=new float[10];
		
		for(int i=0; i < numeros.length; i++) {
			numeros[i] = Float.parseFloat(reader.readLine());
		}
		
		int positivos = 0;
		for(int i=0; i < numeros.length; i++) {
			if (numeros[i] > 0) 
				positivos += 1;
		}
			System.out.println(positivos);
	}

}
