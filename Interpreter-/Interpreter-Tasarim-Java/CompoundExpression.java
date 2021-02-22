package ym_final_odev;

/* Bu s�n�f AbstarctExpression interface s�n�f�n� implemets eder.
 * CompoundExpression s�n�f� bir composite(bile�ik) ifadesidir.
 */

public class CompoundExpression implements AbstractExpression {

	@Override
	public void Interpreter(Context context) {
		// Interface ile gelen metodu override ederek yorumlamay� sa�lar�z.
		// bu metodlar� kullanarak ��kt� �retilir ve kullan�c�ya yorulanm�� �ekilde ��kt� �retilir.
		System.out.println("Metod CompoundExpression.Interpreter() olarak kullan�ld�.");
	}
}
