import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.io.*;

public class opcional2 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		float[] numeros=new float[10];
		
		float max = 0;
		for(int i=0; i < numeros.length; i++) {
			numeros[i] = Float.parseFloat(reader.readLine());
			max = Math.max(max, numeros[i]);	
		}
		
		System.out.println("el maximo es " + max);
	}
	
}
