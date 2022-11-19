package Otopark;
import java.util.Scanner;

public class otopark {
	public static void main(String[] args) {
		Double odenecekTutar = 0.0;
		int kalinanSure = 0,aracTipi=0;
		Scanner giris = new Scanner(System.in);
		System.out.println("       Araç Tipleri");
		System.out.println("Taksi : 1, Minübüs : 2, Ticari : 3");
		System.out.print("Lütfen Araç Tipini Giriniz : ");
		aracTipi = Integer.parseInt(giris.nextLine());
		System.out.print("Kalınan Süreyi Giriniz : ");
		kalinanSure = Integer.parseInt(giris.nextLine());
		if (kalinanSure > 1)
        {
            for (int i = 1; i <= kalinanSure; i++)
            {
                if (i == 1) {
                    if (aracTipi == 1)odenecekTutar = (double) (i * 5); 	
                    else if (aracTipi == 2)odenecekTutar = (double) (i * 6); 
                    else if (aracTipi == 3)odenecekTutar = i * 6.5; 
                }
                else {
                    kalinanSure -= 1;
                    if (aracTipi == 1)odenecekTutar+= kalinanSure * 5 * 1.20; 
                    else if (aracTipi == 2)odenecekTutar+= kalinanSure * 6 * 1.215; 
                    else if (aracTipi == 3)odenecekTutar+= kalinanSure * 6.5 * 1.25; 
                }
            }
        }
        else {
            if (aracTipi == 1)odenecekTutar = (double) (kalinanSure * 5); 
            else if (aracTipi == 2)odenecekTutar = (double) (kalinanSure * 6); 
            else if (aracTipi == 3)odenecekTutar = (double)kalinanSure * 6.5;    
        }
		System.out.print("Ödemeniz Gereken Tutar : "+odenecekTutar);
	}
}
