import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.io.*;

public class Opcional3 {

	static float sum(float x, float y) {
		/*Programa que dado dos números enteros muestre la suma en pantalla*/
		return(x + y);
		}	
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		float[] numeros = new float[10];
		
		float suma = 0;
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = Float.parseFloat(reader.readLine());
			suma = sum(suma, numeros[i]);
		}
		
		System.out.println("la suma es " + suma);
		
	}
}
