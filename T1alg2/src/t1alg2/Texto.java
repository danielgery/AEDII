package t1alg2;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
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
		ArrayList<Retangulo> retangulos = new ArrayList<Retangulo>();

		Path path = Paths.get(arquivo);

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
				retangulos.add(new Retangulo(x1, y1, x2, y2, cor));

			}
		} catch (IOException x) {
			System.out.println("Arquivo não encontrado!");
		}
		//Se a lista for de pequenas proporçoes, usa o método Um
		if (retangulos.size() < 10000) {
			boolean muitoGrande = false;
			for (int i = 0; i < retangulos.size(); i++) {
				System.out.println(i + 1);
				if (retangulos.get(i).quantidadeQuadrados() > 1000) {
					muitoGrande = true;
					break;

				}
			}
			System.out.println(muitoGrande);
			if (!muitoGrande)
				metodoUm(retangulos);
		}
		else {
			metodoDois(retangulos);
		}

	}

	private static void metodoDois(ArrayList<Retangulo> retangulos) {
		// TODO Auto-generated method stub
		
	}

	private static void metodoUm(ArrayList<Retangulo> retangulos) {
		for (int k = 0; k < retangulos.size(); k++) {
			System.out.println("retangulo " + k);

			// Ver os quadrados e nomina-los

			HashSet<String> quadrados = new HashSet<>();

			// nomeando quadrados pela posição
			for (int i = 0; i < retangulos.get(k).diferencaX(); i++) {// linha
				for (int j = 0; j < retangulos.get(k).diferencaY(); j++) {// coluna
					quadrados.add(Integer.toString(retangulos.get(k).getx1() + i) + ","
							+ Integer.toString(retangulos.get(k).gety1() + j) + ","
							+ Integer.toString(retangulos.get(k).getx1() + i + 1) + ","
							+ Integer.toString(retangulos.get(k).gety1() + j + 1));

				}
			}

			removerQuadrados(retangulos.get(k).getcor(), quadrados);

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
