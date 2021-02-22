package ym_final_odev_orn;

/* TamSayi s�n�f� Expression interfacesini implements eder uygular.
 * Tam say� temsil eden integer t�r�nde private (s�n�f d���ndan eri�ilemeyen) sayi �zelli�ine(property) sahiptir.
 * Degerlendir metodu i�inde, say�sal de�eri d�nd�r�r return eder.
 * Aritmetik ifade (expression) a�ac�nda TerminalExpressions olarak bilinir ve yaprak d���mlerini temsil eder.
 * TamSayi metodunu polymorphism yolu ile string (karakter dizisi) verisini parseInt() metodu ile �nteger t�r�ne d�n��t�rerek return eder.
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
