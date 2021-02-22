package ym_final_odev_orn;

/* Ekleme, Cýkarma, Bolme, ve Carpma sýnýflarý Expression interfacesini implements eder
 *Bu sýnýflar Expression interfaceten override edilen 'degerlendir()' metoduna sahiptir.
 * Bu sýnýflarýn içerisinde aðaç yapýsýný temsil etmek için sagIslem ve solIslem adlarýnda private Expression tipinde iki adet özellik (deðiþken) bulunur.
 * Sýnýflar degerlendir metodunu sað ve sol düðümleri toplama iþlemi(+), çýkartma iþlemi (-), çarpma iþlemi (*) ve bölme iþlemi (/) yaparak override eder. 
 */

public class Ekleme implements Expression {
	private Expression solIslem;
	private Expression sagIslem; 
	
	public Ekleme(Expression solIslem, Expression sagIslem) {
		this.solIslem=solIslem;
		this.sagIslem=sagIslem;
	}

	@Override
	public int degerlendir() {
		return solIslem.degerlendir() + sagIslem.degerlendir();
	}
}
