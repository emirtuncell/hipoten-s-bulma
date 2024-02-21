package hipotenüs;

import java.util.Scanner;

public class hipotenüs {
      public static void main(String[] args) {
		
    	  Scanner scan =new Scanner(System.in);
    	  int a,b;//kullanıcıdan kenar uzunlukarını aldım.
    	  double c;
    	  
    	  System.out.println("İLK KENARIN UZUNLUĞU=  ");
    	  a=scan.nextInt();
    	  
    	  System.out.println("İKİNCİ KENARIN UZUNLUPU=  ");
    	  b=scan.nextInt();
    	  
    	  c=(double)Math.sqrt((a*a)+(b*b));//iki kenarın kareleri toplamının karekökünü alarak hipotenüsü buldum.
    	  
    	  System.out.println("HİPOTENÜS=  "+c);//hipotenüsü ekrana yazdırdım.
    	  
    	  
	}
}
