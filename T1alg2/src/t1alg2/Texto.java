package t1alg2;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

import java.util.ArrayList;

public class Texto {
	

	public static void carregaTestes() {
		

		 Path path2 = Paths.get("meu teste");

		Retangulos r;
		GerenciadorRetangulos g1 = new GerenciadorRetangulos();
		try (BufferedReader br = Files.newBufferedReader(path2, Charset.defaultCharset())) {

			String linha = null;
			String header = br.readLine(); // pula cabeçalho
			while ((linha = br.readLine()) != null) {
				Scanner scanner = new Scanner(linha);
				Scanner sc = scanner.useDelimiter(" ");

				int x1 = Integer.parseInt(sc.next().trim());
				int y1 = Integer.parseInt(sc.next().trim());
				int x2 = Integer.parseInt(sc.next().trim());
				int y2 = Integer.parseInt(sc.next().trim());
				String cor = sc.next().trim();

				r = new Retangulos(x1, y1, x2, y2, cor);
				g1.adicionarRetangulo(r);

			}
		} catch (IOException x) {

		}
	}
}
