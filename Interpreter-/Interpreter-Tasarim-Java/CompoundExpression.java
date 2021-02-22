package ym_final_odev;

/* Bu sýnýf AbstarctExpression interface sýnýfýný implemets eder.
 * CompoundExpression sýnýfý bir composite(bileþik) ifadesidir.
 */

public class CompoundExpression implements AbstractExpression {

	@Override
	public void Interpreter(Context context) {
		// Interface ile gelen metodu override ederek yorumlamayý saðlarýz.
		// bu metodlarý kullanarak çýktý üretilir ve kullanýcýya yorulanmýþ þekilde çýktý üretilir.
		System.out.println("Metod CompoundExpression.Interpreter() olarak kullanýldý.");
	}
}
