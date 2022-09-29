import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.io.*;

public class eje6 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		float r = Integer.parseInt(reader.readLine());
		double area = (Math.PI * Math.pow(r, 2));
		
		System.out.println("area : " + String.format("%.2f", area));
	}

}
