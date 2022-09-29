import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.io.*;

public class Ejercicio1 {

	public static void main(String[] args) throws IOException {
//		String izena = System.console().readLine();

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String izena=reader.readLine();
		System.out.println("Kaixo " + izena);
	}
}
