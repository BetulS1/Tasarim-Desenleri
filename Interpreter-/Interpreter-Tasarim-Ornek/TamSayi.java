package ym_final_odev_orn;

/* TamSayi sýnýfý Expression interfacesini implements eder uygular.
 * Tam sayý temsil eden integer türünde private (sýnýf dýþýndan eriþilemeyen) sayi özelliðine(property) sahiptir.
 * Degerlendir metodu içinde, sayýsal deðeri döndürür return eder.
 * Aritmetik ifade (expression) aðacýnda TerminalExpressions olarak bilinir ve yaprak düðümlerini temsil eder.
 * TamSayi metodunu polymorphism yolu ile string (karakter dizisi) verisini parseInt() metodu ile ýnteger türüne dönüþtürerek return eder.
 */

public class TamSayi implements Expression {
	
	private int sayi;
	
	public TamSayi(int sayi) {
		this.sayi=sayi;
	}

	public TamSayi(String str) {
		this.sayi=Integer.parseInt(str);
	}
	
	@Override
	public int degerlendir() {
		return sayi;
	}

}
