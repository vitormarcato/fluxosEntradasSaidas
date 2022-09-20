package br.com.alura.java.io;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class TesteSaida {

	public static void main(String[] args) throws IOException {
		
		OutputStream fis = new FileOutputStream("migrants2.txt");
		OutputStreamWriter osw = new OutputStreamWriter(fis);
		BufferedWriter bw = new BufferedWriter(osw);
		
		bw.write("The migrants will be housed in dormitory-style spaces at JBCC, with separate spaces");
		bw.newLine();
		bw.newLine();
		bw.newLine();		
		bw.write("outra linha para teste");
			
		bw.close();
	}

}
 