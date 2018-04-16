package t1alg2;

public class Retangulo {

	private int x1;
	private int y1;
	private int x2;
	private int y2;
	private String cor;

	public Retangulo(int x1, int y1, int x2, int y2, String cor) {
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
		this.cor = cor;
	}

	public int getx1() {
		return x1;
	}

	public int gety1() {
		return y1;
	}

	public int getx2() {
		return x2;
	}

	public int gety2() {
		return y2;
	}

	public String getcor() {
		return cor;
	}
	
	public int quantidadeQuadrados() {
		return diferencaX() * diferencaY();
	}
	
	public int diferencaX() {
		return x2 - x1;
	}
	
	public int diferencaY() {
		return y2 - y1;
	}

	@Override
	public String toString() {
		return "Retangulo [x1=" + x1 + ", y1=" + y1 + ", x2=" + x2 + ", y2=" + y2 + ", cor=" + cor + "]\n";
	}

}
