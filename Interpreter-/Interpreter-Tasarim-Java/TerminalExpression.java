package ym_final_odev;

/* Yorumlama iþlemini sonucunu döndürecek sýnýf TerminalExpression sýnýfýdýr. 
 * AbstractExpression ýnterface sýnýfýný implement eder.
 * Interface içinde yer alan Interpreter() metodunu override eder.
 */
public abstract class TerminalExpression implements AbstractExpression {

	@Override
	public void Interpreter(Context context) {
		// Interface ile gelen metodu override ederek yorumlamayý saðlarýz.
		// bu metodlarý kullanarak çýktý üretilir ve kullanýcýya yorulanmýþ þekilde çýktý üretilir.
		// çýktý yorumlanmýþ biçimde kullanýcýya iletilir.
		System.out.println("Metod TerminalExpression.Interpreter() olarak kullanýldý.");
	}
}
