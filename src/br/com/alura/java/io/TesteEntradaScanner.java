package br.com.alura.java.io;

import java.io.File;
import java.util.Locale;
import java.util.Scanner;

public class TesteEntradaScanner {

	public static void main(String[] args) throws Exception {

		Scanner scanner = new Scanner(new File("tabela.csv"));

		while (scanner.hasNextLine()) {
			String linha1 = scanner.nextLine();

			Scanner linhaScanner = new Scanner(linha1);
			linhaScanner.useLocale(Locale.US);
			linhaScanner.useDelimiter(",");
			String nome = linhaScanner.next();
			int idade = linhaScanner.nextInt();
			String sexo = linhaScanner.next();
			String profissao = linhaScanner.next();
			double saldo = linhaScanner.nextDouble();

			System.out.format(new Locale("pt", "br"), "%s - %02d - %s, %s: %.2f%n", nome, idade, sexo, profissao, saldo);

			linhaScanner.close();
		}

		scanner.close();
	}

}
