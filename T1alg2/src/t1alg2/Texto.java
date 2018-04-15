package t1alg2;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Texto {

	private static HashSet<String> azulclaro;

	public static void carregaTestes() {

		azulclaro = new HashSet<String>();

		Path path2 = Paths.get("meu teste");

		Retangulos r;
		GerenciadorRetangulos g1 = new GerenciadorRetangulos();
		try (BufferedReader br = Files.newBufferedReader(path2, Charset.defaultCharset())) {

			String linha = null;
			String header = br.readLine(); // pula cabeçalho
			while ((linha = br.readLine()) != null) {
				Scanner scanner = new Scanner(linha);
				Scanner sc = scanner.useDelimiter(" ");

				int x1 = Integer.parseInt(sc.next());
				int y1 = Integer.parseInt(sc.next());
				int x2 = Integer.parseInt(sc.next());
				int y2 = Integer.parseInt(sc.next());
				String cor = sc.next().trim();

				// Ver os quadrados e nomina-los
				ArrayList<String> quadrados = new ArrayList<>();

				// quantidade
				int quant = (x2 - x1) * (y2 - y1);

				// nomeando quadrados pela posição
				for (int i = 0; i < (x2 - x1); i++) {// linha
					for (int j = 0; j < (y2 - y1); j++) {// coluna
						quadrados.add(Integer.toString(x1 + i) + "," + Integer.toString(y1 + j) + ","
								+ Integer.toString(x1 + i + 1) + "," + Integer.toString(y1 + j + 1));

					}
				}

				if (cor.equals("azul-claro")) {
					azulclaro.addAll(quadrados);
				}
				r = new Retangulos(x1, y1, x2, y2, cor);
				g1.adicionarRetangulo(r);

			}

		} catch (IOException x) {

		}
	}
}
