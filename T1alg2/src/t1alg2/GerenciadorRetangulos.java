package t1alg2;

import java.util.ArrayList;



public  class GerenciadorRetangulos {
private static ArrayList<Retangulos> retangulos;
	
	public  GerenciadorRetangulos() {
		retangulos = new ArrayList<>();
	}
	public static void adicionarRetangulo(Retangulos a) {
		retangulos.add(a);
	}
	public static ArrayList<Retangulos> listartodas() {
		
		return retangulos;
		
		
		}
	
}
