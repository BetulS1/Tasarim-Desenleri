package ym_odev;

/* T�m alt sistemlerin karma��kl��� tek bir sar�c� s�n�f�nda kaps�llenir ve bu basit bir aray�zd�r.*/

interface SubsystemTwoWrapper {

	public void primeTheDirective();
	
	/* T�m s�n�flar taraf�ndan kullan�lan metot s�n�flar� sarmalamay� ve s�n�rland�rmay� sa�lar.
	 * T�m s�n�flar SubsystemTwoWrapper facade kullan�rlar (yani daha y�ksek seviyeli soyutlama). */
}
