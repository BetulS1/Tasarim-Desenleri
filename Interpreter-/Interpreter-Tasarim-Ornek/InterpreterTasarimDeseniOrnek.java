package ym_final_odev_orn;

/* InterpreterTasarimOrnek, bir girdi ifadesini alan ve Toplama, Cikarma, Carpma, Bolme Expression sýnýflarýný kullanarak deðerlendiren aritmetik ifade pareridir.
 * Bu sýnýf degerlendir metodu ile aritmetik ifade ayrýþtýrýcýsý sýnýfýdýr. 
 * Ýçinde iki adet metot bulunur: isOperatorString metodu string veriyi kontrol eder ayrýþtýrýr operatör ise true tam sayý ise false boolean veri döndürür.
 *GetOperatorIsleyici metodu ise girilen operatör verisine uygun sýnýfa sol ve sað yaprak düðümünü göndererek iþlem yapar geriye Expression verisi döndürür.
 * Bir ifadenin Girdi gösteriminde iþleç operatörden sonra gelir.
 * Örnek olarak (1 2 + ) (1 + 2) Girdi gösterimidir. Ýlk önce string ifadede sayýsal ifadeleri ayrýþtýrýr ardýndan operatör verisini son olarak operatör sýnýfýnda iþlemi gerçekleþtirir ve sonucu ekrana yazar.
 * Girdi verisi bir stack (yýðýn) içinde tutulur ve aðacýn düðümlerine eklenir.
 * Stack tanýmlamak için java.util.Stack kütüphanesini import ettik
 */

import java.util.Stack;

public class InterpreterTasarimDeseniOrnek {
	public static void main(String [] args) {
		
	 Stack stack = new Stack();
	 String Girdi = "6 8 * 5 + 11 - 7 /"; // (6 * 8 + 5 - 11)/7
	 
	 String[] IslemListe = Girdi.split(" ");
	 
	 for (String s : IslemListe) {
	     if (isOperatorString(s))
	     {
			  Expression sagOp = (Expression)stack.pop();
			  Expression solOp = (Expression)stack.pop();
			  Expression operator = getOperatorIsleyici(s, solOp, sagOp);
			  int result = operator.degerlendir();
			  stack.push(new TamSayi(result));
	     } 
	     else 
	     {
			  Expression sayi = new TamSayi(s);
			  stack.push(sayi);
	     }
	 }
	 
	 System.out.println("Islem: "+Girdi);
	 System.out.println("Islem Sonucu: "+((Expression)stack.pop()).degerlendir());
  } 
	 
    public static boolean isOperatorString(String str) 
    {
		 if (str.equals("+") || str.equals("-") || str.equals("*") || str.equals("/"))
		     return true;
		 else
	         return false;
    }
	  
    public static Expression getOperatorIsleyici(String str, Expression sol, Expression sag) 
    {
		 switch (str) 
		 {
		     case "+":
		    	 return new Ekleme(sol, sag);
		     case "-":
		    	 return new Cikarma(sol, sag);
		     case "*":
		    	 return new Carpma(sol, sag);
		     case "/":
		    	 return new Bolme(sol, sag);
		     default:
		    	 return null;
		  }
	 }
}