package t1alg2;

import java.util.ArrayList;

public class GerenciadorRetangulos {
	private static ArrayList<Retangulo> retangulos;

	public GerenciadorRetangulos() {
		retangulos = new ArrayList<>();
	}

	public static void adicionarRetangulo(Retangulo a) {
		retangulos.add(a);
	}

	public static ArrayList<Retangulo> listartodas() {

		return retangulos;

	}

}
