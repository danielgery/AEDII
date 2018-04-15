package t1alg2;

import java.util.ArrayList;

public class GerenciadorQuadrados {
	
		private static ArrayList<Quadrados> quadrados;
			
			public GerenciadorQuadrados() {
				quadrados = new ArrayList<>();
			}
			public void adicionarQuadrado(Quadrados a) {
				quadrados.add(a);
			}
			public void setCor(int i,String a) {
				Quadrados q = new Quadrados(quadrados.get(i).getposicao(),a);
				quadrados.set(i, q);
			}
			public static ArrayList<Quadrados> listartodas() {
				
				return quadrados;
				
				
				}
			public static void criaQuadrados() {
				String Nome = "";
				int a=0;
				int xmaior=0;
				int xmenor=0;
				int ymaior=0;
				int ymenor=0;
				int tamanhox=0;
				int tamanhoy=0;
				GerenciadorQuadrados g1 = new GerenciadorQuadrados(); 
			    
			    
				
				for (int i=0;i<GerenciadorRetangulos.listartodas().size();i++) {
					a=0;
					xmenor= (GerenciadorRetangulos.listartodas().get(i).getx1())+1;
					ymenor= (GerenciadorRetangulos.listartodas().get(i).gety1())+1;
					xmaior= (GerenciadorRetangulos.listartodas().get(i).getx2());
					ymaior= (GerenciadorRetangulos.listartodas().get(i).gety2());
					tamanhox=(xmaior-xmenor)+1;
					tamanhoy=(ymaior-ymenor)+1;
					for (int j=0;j<tamanhox;j++) {
						for(int k=0;k<tamanhoy;k++) {
							Nome=(""+(xmenor+j))+"-"+(""+(ymenor+k));
							a=0;
							for (int l=0;l<quadrados.size();l++) {
								if(Nome.equals(quadrados.get(l).getposicao())) {
									
									g1.setCor(l, GerenciadorRetangulos.listartodas().get(i).getcor());
									a=1;
									break;
									
								}
								
								}
							if (a==0) {
								Quadrados q2 = new Quadrados(Nome,GerenciadorRetangulos.listartodas().get(i).getcor());
								
								g1.adicionarQuadrado(q2);
							}
						
						}
						
					}
					
				}
			
			}
			public static void contaCores() {
				int aux=0;
				int verdeclaro=0;
				int vermelho=0;
				int azulclaro=0;
				int amarelo=0;
				int verdeescuro=0;
				int marrom=0;
				int azulescuro=0;
				int cinza=0;
				int dourado=0;
				int violeta=0;
				int preto=0;
				int laranja=0;
				for (int i=0; i<quadrados.size();i++) {
					
					if(quadrados.get(i).getcor().equals("verde-claro")) {
						verdeclaro=verdeclaro+1;
					}
					if(quadrados.get(i).getcor().equals("vermelho")) {
						vermelho=vermelho+1;
					}
					if(quadrados.get(i).getcor().equals("azul-claro")) {
						azulclaro=azulclaro+1;
					}
					if(quadrados.get(i).getcor().equals("amarelo")) {
						amarelo=amarelo+1;
					}
					if(quadrados.get(i).getcor().equals("verde-escuro")) {
						verdeescuro=verdeescuro+1;
					}
					if(quadrados.get(i).getcor().equals("marrom")) {
						marrom=marrom+1;
					}
					if(quadrados.get(i).getcor().equals("azul-escuro")) {
						azulescuro=azulescuro+1;
					}
					if(quadrados.get(i).getcor().equals("cinza")) {
						cinza=cinza+1;
					}
					if(quadrados.get(i).getcor().equals("dourado")) {
						dourado=dourado+1;
					}
					if(quadrados.get(i).getcor().equals("violeta")) {
						violeta=violeta+1;
					}
					if(quadrados.get(i).getcor().equals("preto")) {
						preto=preto+1;
					}
					if(quadrados.get(i).getcor().equals("laranja")) {
						laranja=laranja+1;
					}
				}
				aux = verdeclaro;
				if (aux>0) {
					System.out.println(aux+" unidades serão pintadas de verde-claro");
				}
				aux = vermelho;
				if (aux>0) {
					System.out.println(aux+" unidades serão pintadas de vermelho");
				}
				aux = azulclaro;
				if (aux>0) {
					System.out.println(aux+" unidades serão pintadas de azul-claro");
				}
				aux = amarelo;
				if (aux>0) {
					System.out.println(aux+" unidades serão pintadas de amarelo");
				}
				aux = verdeescuro;
				if (aux>0) {
					System.out.println(aux+" unidades serão pintadas de verde-escuro");
				}
				aux = marrom;
				if (aux>0) {
					System.out.println(aux+" unidades serão pintadas de marrom");
				}
				aux = azulescuro;
				if (aux>0) {
					System.out.println(aux+" unidades serão pintadas de azul-escuro");
				}
				aux = cinza;
				if (aux>0) {
					System.out.println(aux+" unidades serão pintadas de cinza");
				}
				aux = dourado;
				if (aux>0) {
					System.out.println(aux+" unidades serão pintadas de dourado");
				}
				aux = violeta;
				if (aux>0) {
					System.out.println(aux+" unidades serão pintadas de violeta");
				}
				aux = preto;
				if (aux>0) {
					System.out.println(aux+" unidades serão pintadas de preto");
				}
				aux = laranja;
				if (aux>0) {
					System.out.println(aux+" unidades serão pintadas de laranja");
				}
			}
}
