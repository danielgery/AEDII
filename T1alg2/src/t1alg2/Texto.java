package t1alg2;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.Scanner;

public class Texto {

	private static HashSet<String> verdeclaro;
	private static HashSet<String> vermelho;
	private static HashSet<String> azulclaro;
	private static HashSet<String> amarelo;
	private static HashSet<String> verdeescuro;
	private static HashSet<String> marrom;
	private static HashSet<String> azulescuro;
	private static HashSet<String> cinza;
	private static HashSet<String> dourado;
	private static HashSet<String> violeta;
	private static HashSet<String> preto;
	private static HashSet<String> laranja;

	public static void carregaTestes(String arquivo) {

		verdeclaro = new HashSet<String>();
		vermelho = new HashSet<String>();
		azulclaro = new HashSet<String>();
		amarelo = new HashSet<String>();
		verdeescuro = new HashSet<String>();
		marrom = new HashSet<String>();
		azulescuro = new HashSet<String>();
		cinza = new HashSet<String>();
		dourado = new HashSet<String>();
		violeta = new HashSet<String>();
		preto = new HashSet<String>();
		laranja = new HashSet<String>();

		Path path = Paths.get(arquivo);

		Retangulos r;
		GerenciadorRetangulos g1 = new GerenciadorRetangulos();
		try (BufferedReader br = Files.newBufferedReader(path, Charset.defaultCharset())) {
			System.out.println("Lendo arquivo");
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
				// ArrayList<String> quadrados = new ArrayList<>();
				HashSet<String> quadrados = new HashSet<>();
				// quantidade
				int quant = (x2 - x1) * (y2 - y1);

				// nomeando quadrados pela posição
				for (int i = 0; i < (x2 - x1); i++) {// linha
					for (int j = 0; j < (y2 - y1); j++) {// coluna
						quadrados.add(Integer.toString(x1 + i) + "," + Integer.toString(y1 + j) + ","
								+ Integer.toString(x1 + i + 1) + "," + Integer.toString(y1 + j + 1));

					}
				}

				removerQuadrados(cor, quadrados);

				// r = new Retangulos(x1, y1, x2, y2, cor);
				// g1.adicionarRetangulo(r);

			}
			System.out.println("verde-claro:  " + verdeclaro.size());
			System.out.println("vermelho:     " + vermelho.size());
			System.out.println("azul-claro:   " + azulclaro.size());
			System.out.println("amarelo:      " + amarelo.size());
			System.out.println("verde-escuro: " + verdeescuro.size());
			System.out.println("marrom:       " + marrom.size());
			System.out.println("azul-escuro:  " + azulescuro.size());
			System.out.println("cinza:        " + cinza.size());
			System.out.println("dourado:      " + dourado.size());
			System.out.println("violeta:      " + violeta.size());
			System.out.println("preto:        " + preto.size());
			System.out.println("laranja:      " + laranja.size());

		} catch (IOException x) {
			System.out.println("Arquivo não encontrado!");

		}
	}

	public static void removerQuadrados(String cor, HashSet<String> quadrados) {
		if (cor.equals("verde-claro")) {
			verdeclaro.addAll(quadrados);

			vermelho.removeAll(quadrados);
			azulclaro.removeAll(quadrados);
			amarelo.removeAll(quadrados);
			verdeescuro.removeAll(quadrados);
			marrom.removeAll(quadrados);
			azulescuro.removeAll(quadrados);
			cinza.removeAll(quadrados);
			dourado.removeAll(quadrados);
			violeta.removeAll(quadrados);
			preto.removeAll(quadrados);
			laranja.removeAll(quadrados);

		}
		if (cor.equals("vermelho")) {
			vermelho.addAll(quadrados);
			verdeclaro.removeAll(quadrados);

			azulclaro.removeAll(quadrados);
			amarelo.removeAll(quadrados);
			verdeescuro.removeAll(quadrados);
			marrom.removeAll(quadrados);
			azulescuro.removeAll(quadrados);
			cinza.removeAll(quadrados);
			dourado.removeAll(quadrados);
			violeta.removeAll(quadrados);
			preto.removeAll(quadrados);
			laranja.removeAll(quadrados);

		}
		if (cor.equals("azul-claro")) {
			azulclaro.addAll(quadrados);
			verdeclaro.removeAll(quadrados);
			vermelho.removeAll(quadrados);

			amarelo.removeAll(quadrados);
			verdeescuro.removeAll(quadrados);
			marrom.removeAll(quadrados);
			azulescuro.removeAll(quadrados);
			cinza.removeAll(quadrados);
			dourado.removeAll(quadrados);
			violeta.removeAll(quadrados);
			preto.removeAll(quadrados);
			laranja.removeAll(quadrados);

		}
		if (cor.equals("amarelo")) {
			amarelo.addAll(quadrados);
			verdeclaro.removeAll(quadrados);
			vermelho.removeAll(quadrados);
			azulclaro.removeAll(quadrados);

			verdeescuro.removeAll(quadrados);
			marrom.removeAll(quadrados);
			azulescuro.removeAll(quadrados);
			cinza.removeAll(quadrados);
			dourado.removeAll(quadrados);
			violeta.removeAll(quadrados);
			preto.removeAll(quadrados);
			laranja.removeAll(quadrados);

		}
		if (cor.equals("verde-escuro")) {
			verdeescuro.addAll(quadrados);
			verdeclaro.removeAll(quadrados);
			vermelho.removeAll(quadrados);
			azulclaro.removeAll(quadrados);
			amarelo.removeAll(quadrados);

			marrom.removeAll(quadrados);
			azulescuro.removeAll(quadrados);
			cinza.removeAll(quadrados);
			dourado.removeAll(quadrados);
			violeta.removeAll(quadrados);
			preto.removeAll(quadrados);
			laranja.removeAll(quadrados);

		}
		if (cor.equals("marrom")) {
			marrom.addAll(quadrados);
			verdeclaro.removeAll(quadrados);
			vermelho.removeAll(quadrados);
			azulclaro.removeAll(quadrados);
			amarelo.removeAll(quadrados);
			verdeescuro.removeAll(quadrados);

			azulescuro.removeAll(quadrados);
			cinza.removeAll(quadrados);
			dourado.removeAll(quadrados);
			violeta.removeAll(quadrados);
			preto.removeAll(quadrados);
			laranja.removeAll(quadrados);

		}
		if (cor.equals("azul-escuro")) {
			azulescuro.addAll(quadrados);
			verdeclaro.removeAll(quadrados);
			vermelho.removeAll(quadrados);
			azulclaro.removeAll(quadrados);
			amarelo.removeAll(quadrados);
			verdeescuro.removeAll(quadrados);
			marrom.removeAll(quadrados);

			cinza.removeAll(quadrados);
			dourado.removeAll(quadrados);
			violeta.removeAll(quadrados);
			preto.removeAll(quadrados);
			laranja.removeAll(quadrados);

		}
		if (cor.equals("cinza")) {
			cinza.addAll(quadrados);
			verdeclaro.removeAll(quadrados);
			vermelho.removeAll(quadrados);
			azulclaro.removeAll(quadrados);
			amarelo.removeAll(quadrados);
			verdeescuro.removeAll(quadrados);
			marrom.removeAll(quadrados);
			azulescuro.removeAll(quadrados);

			dourado.removeAll(quadrados);
			violeta.removeAll(quadrados);
			preto.removeAll(quadrados);
			laranja.removeAll(quadrados);

		}
		if (cor.equals("dourado")) {
			dourado.addAll(quadrados);
			verdeclaro.removeAll(quadrados);
			vermelho.removeAll(quadrados);
			azulclaro.removeAll(quadrados);
			amarelo.removeAll(quadrados);
			verdeescuro.removeAll(quadrados);
			marrom.removeAll(quadrados);
			azulescuro.removeAll(quadrados);
			cinza.removeAll(quadrados);

			violeta.removeAll(quadrados);
			preto.removeAll(quadrados);
			laranja.removeAll(quadrados);

		}
		if (cor.equals("violeta")) {
			violeta.addAll(quadrados);
			verdeclaro.removeAll(quadrados);
			vermelho.removeAll(quadrados);
			azulclaro.removeAll(quadrados);
			amarelo.removeAll(quadrados);
			verdeescuro.removeAll(quadrados);
			marrom.removeAll(quadrados);
			azulescuro.removeAll(quadrados);
			cinza.removeAll(quadrados);
			dourado.removeAll(quadrados);

			preto.removeAll(quadrados);
			laranja.removeAll(quadrados);

		}
		if (cor.equals("preto")) {
			preto.addAll(quadrados);
			verdeclaro.removeAll(quadrados);
			vermelho.removeAll(quadrados);
			azulclaro.removeAll(quadrados);
			amarelo.removeAll(quadrados);
			verdeescuro.removeAll(quadrados);
			marrom.removeAll(quadrados);
			azulescuro.removeAll(quadrados);
			cinza.removeAll(quadrados);
			dourado.removeAll(quadrados);
			violeta.removeAll(quadrados);

			laranja.removeAll(quadrados);

		}
		if (cor.equals("laranja")) {
			laranja.addAll(quadrados);
			verdeclaro.removeAll(quadrados);
			vermelho.removeAll(quadrados);
			azulclaro.removeAll(quadrados);
			amarelo.removeAll(quadrados);
			verdeescuro.removeAll(quadrados);
			marrom.removeAll(quadrados);
			azulescuro.removeAll(quadrados);
			cinza.removeAll(quadrados);
			dourado.removeAll(quadrados);
			violeta.removeAll(quadrados);
			preto.removeAll(quadrados);

		}
	}
}
