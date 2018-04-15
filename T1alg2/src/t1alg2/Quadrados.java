package t1alg2;

public class Quadrados {

	private String posicao;
	private String cor;

	public Quadrados(String posicao, String cor) {
		this.posicao = posicao;
		this.cor = cor;

	}

	public String getposicao() {
		return posicao;
	}

	public String getcor() {
		return cor;
	}

	@Override
	public String toString() {
		return "Quadrados [posicao=" + posicao + ", cor=" + cor + "]\n";
	}
}
