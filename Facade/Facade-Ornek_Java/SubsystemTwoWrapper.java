package ym_odev;

/* Tüm alt sistemlerin karmaþýklýðý tek bir sarýcý sýnýfýnda kapsüllenir ve bu basit bir arayüzdür.*/

interface SubsystemTwoWrapper {

	public void primeTheDirective();
	
	/* Tüm sýnýflar tarafýndan kullanýlan metot sýnýflarý sarmalamayý ve sýnýrlandýrmayý saðlar.
	 * Tüm sýnýflar SubsystemTwoWrapper facade kullanýrlar (yani daha yüksek seviyeli soyutlama). */
}
