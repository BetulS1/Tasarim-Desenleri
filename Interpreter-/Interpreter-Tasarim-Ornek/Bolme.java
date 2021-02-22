package ym_final_odev_orn;

public class Bolme implements Expression{
	private Expression solIslem;
	private Expression sagIslem;
	
	public Bolme(Expression solIslem, Expression sagIslem) {
		this.solIslem=solIslem;
		this.sagIslem=sagIslem;
	}
	
	@Override
	public int degerlendir() {
		return solIslem.degerlendir() / sagIslem.degerlendir();

	}
}
