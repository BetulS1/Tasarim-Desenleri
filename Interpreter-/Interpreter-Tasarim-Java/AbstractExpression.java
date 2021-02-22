package ym_final_odev;

/* AbstractExpression, Context sýnýfýný parametre olarak alan bir Interpreter yöntemidir.
 * Bu interfce ana bileþen kýsmýný oluþturan ögelerden biridir. 
 * Ýçerisinde kendisini implements eden sýnýflarýn override etmesi zorunlu olan solve() metodu bulunur. 
 * Bu metot Context sýnýfýna ait deðiþken contex parametresinin içerir.
 */

public interface AbstractExpression {
	void Interpreter(Context context);
}
