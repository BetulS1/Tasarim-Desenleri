package ym_final_odev_orn;

/* Ekleme, C�karma, Bolme, ve Carpma s�n�flar� Expression interfacesini implements eder
 *Bu s�n�flar Expression interfaceten override edilen 'degerlendir()' metoduna sahiptir.
 * Bu s�n�flar�n i�erisinde a�a� yap�s�n� temsil etmek i�in sagIslem ve solIslem adlar�nda private Expression tipinde iki adet �zellik (de�i�ken) bulunur.
 * S�n�flar degerlendir metodunu sa� ve sol d���mleri toplama i�lemi(+), ��kartma i�lemi (-), �arpma i�lemi (*) ve b�lme i�lemi (/) yaparak override eder. 
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
