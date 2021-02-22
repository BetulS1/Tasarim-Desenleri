package ym_final_odev_orn;

/* InterpreterTasarimOrnek, bir girdi ifadesini alan ve Toplama, Cikarma, Carpma, Bolme Expression s�n�flar�n� kullanarak de�erlendiren aritmetik ifade pareridir.
 * Bu s�n�f degerlendir metodu ile aritmetik ifade ayr��t�r�c�s� s�n�f�d�r. 
 * ��inde iki adet metot bulunur: isOperatorString metodu string veriyi kontrol eder ayr��t�r�r operat�r ise true tam say� ise false boolean veri d�nd�r�r.
 *GetOperatorIsleyici metodu ise girilen operat�r verisine uygun s�n�fa sol ve sa� yaprak d���m�n� g�ndererek i�lem yapar geriye Expression verisi d�nd�r�r.
 * Bir ifadenin Girdi g�steriminde i�le� operat�rden sonra gelir.
 * �rnek olarak (1 2 + ) (1 + 2) Girdi g�sterimidir. �lk �nce string ifadede say�sal ifadeleri ayr��t�r�r ard�ndan operat�r verisini son olarak operat�r s�n�f�nda i�lemi ger�ekle�tirir ve sonucu ekrana yazar.
 * Girdi verisi bir stack (y���n) i�inde tutulur ve a�ac�n d���mlerine eklenir.
 * Stack tan�mlamak i�in java.util.Stack k�t�phanesini import ettik
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