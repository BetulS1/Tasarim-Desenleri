package ym_final_odev;

/* Yorumlama i�lemini sonucunu d�nd�recek s�n�f TerminalExpression s�n�f�d�r. 
 * AbstractExpression �nterface s�n�f�n� implement eder.
 * Interface i�inde yer alan Interpreter() metodunu override eder.
 */
public abstract class TerminalExpression implements AbstractExpression {

	@Override
	public void Interpreter(Context context) {
		// Interface ile gelen metodu override ederek yorumlamay� sa�lar�z.
		// bu metodlar� kullanarak ��kt� �retilir ve kullan�c�ya yorulanm�� �ekilde ��kt� �retilir.
		// ��kt� yorumlanm�� bi�imde kullan�c�ya iletilir.
		System.out.println("Metod TerminalExpression.Interpreter() olarak kullan�ld�.");
	}
}
