package t1alg2;

import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.Scanner;

public class app {

	public static void main(String[] args) {

		String arquivoSelecionado = selecionarArquivo();
		;
		Texto.carregaTestes(arquivoSelecionado);

	}

	private static String selecionarArquivo() {
		Scanner in = new Scanner(System.in);

		System.out.println("Escreva o nome do arquivo que deseja processar: ");
		System.out.println("Nomes ");
		System.out.println("exemplo");
		System.out.println("teste000100");
		System.out.println("teste000500");
		System.out.println("teste001000");
		System.out.println("teste002000");
		System.out.println("teste005000");
		System.out.println("teste010000");
		System.out.println("teste020000");
		System.out.println("teste050000");
		System.out.println("teste100000");
		System.out.print(": ");

		return in.next();

	}

}
