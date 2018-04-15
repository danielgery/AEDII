package t1alg2;

public class Retangulos {

	private int x1;
	private int y1;
	private int x2;
	private int y2;
	private String cor;

	public Retangulos(int x1, int y1, int x2, int y2, String cor) {
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

	@Override
	public String toString() {
		return "Retangulos [x1=" + x1 + ", y1=" + y1 + ", x2=" + x2 + ", y2=" + y2 + ", cor=" + cor + "]\n";
	}

}
