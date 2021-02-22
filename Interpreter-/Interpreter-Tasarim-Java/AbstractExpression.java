package ym_final_odev;

/* AbstractExpression, Context s�n�f�n� parametre olarak alan bir Interpreter y�ntemidir.
 * Bu interfce ana bile�en k�sm�n� olu�turan �gelerden biridir. 
 * ��erisinde kendisini implements eden s�n�flar�n override etmesi zorunlu olan solve() metodu bulunur. 
 * Bu metot Context s�n�f�na ait de�i�ken contex parametresinin i�erir.
 */

public interface AbstractExpression {
	void Interpreter(Context context);
}
