package t1alg2;

public class Cor {

	public enum Color {
		verdeclaro, vermelho, azulclaro, amarelo, verdeescuro, marrom, azulescuro, cinza, dourado, violeta, preto, laranja
	};

	private Color color;

	public Cor(String cor) {
		if (cor.equals("verdeclaro"))
			this.color = Color.verdeclaro;
		else if (cor.equals("vermelho"))
			this.color = Color.vermelho;
		else if (cor.equals("azulclaro"))
			this.color = Color.azulclaro;
		else if (cor.equals("amarelo"))
			this.color = Color.amarelo;
		else if (cor.equals("verdeescuro"))
			this.color = Color.verdeescuro;
		else if (cor.equals("marrom"))
			this.color = Color.marrom;
		else if (cor.equals("azulescuro"))
			this.color = Color.azulescuro;
		else if (cor.equals("cinza"))
			this.color = Color.cinza;
		else if (cor.equals("dourado"))
			this.color = Color.dourado;
		else if (cor.equals("violeta"))
			this.color = Color.violeta;
		else if (cor.equals("preto"))
			this.color = Color.preto;
		else if (cor.equals("laranja"))
			this.color = Color.laranja;
	}
	
	public String cor() {
		return color.toString();
	}
	
	public void setCor(String newCor) {
		if (newCor.equals("verdeclaro"))
			this.color = Color.verdeclaro;
		else if (newCor.equals("vermelho"))
			this.color = Color.vermelho;
		else if (newCor.equals("azulclaro"))
			this.color = Color.azulclaro;
		else if (newCor.equals("amarelo"))
			this.color = Color.amarelo;
		else if (newCor.equals("verdeescuro"))
			this.color = Color.verdeescuro;
		else if (newCor.equals("marrom"))
			this.color = Color.marrom;
		else if (newCor.equals("azulescuro"))
			this.color = Color.azulescuro;
		else if (newCor.equals("cinza"))
			this.color = Color.cinza;
		else if (newCor.equals("dourado"))
			this.color = Color.dourado;
		else if (newCor.equals("violeta"))
			this.color = Color.violeta;
		else if (newCor.equals("preto"))
			this.color = Color.preto;
		else if (newCor.equals("laranja"))
			this.color = Color.laranja;
	}

}
