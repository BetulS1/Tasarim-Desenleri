package ym_final_odev_orn;
/* Expression interface tek bir gövdesiz 'degerlendir()' metoduna sahiptir.
 * Expression interface'i, metodu tüm ifadelerin eþit olarak iþlenmesini saðlayan ortak metottur.
 * Bu sýnýftan implements edilen tüm alt sýnýflar bu metodu override etmelidir.
 */

public interface Expression {
	public int degerlendir(); 
}
