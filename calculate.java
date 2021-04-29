package exam;
import java.util.logging.*;
import java.util.Scanner;
public class calculate {
//kg7, 7 kiloluk sabun sayisini iceren degiskendir.
//kg2, 2 kiloluk sabun sayisini iceren degiskendir.
//hedef, kac kg kargo istendigi ile ilgili bir degiskendir.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Logger logger_clc= Logger.getLogger(calculate.class.getName());
			Scanner scanner = new Scanner(System.in);
		
		System.out.println("7 kiloluk sabun sayisini giriniz:");
		int kg7=scanner.nextInt(); // kullanicidan deger alma isi.
		System.out.println("2 kiloluk sabun sayisini giriniz:");
		int kg2 = scanner.nextInt();
		System.out.println("Kac kg kargo istediginizi yaziniz:");
		int hedef = scanner.nextInt(); 
		
		try {
		int res=	Sabun.prepareCargoPacket(kg7,kg2,hedef);
		if(res>1)
	System.out.println(hedef+ "kg hedef icin," +res+ " adet 2kglik sabun gerekir.");
		else if (res==-1)
			System.out.println(hedef+ "kg hedef icin, 2kg'lik sabun kargolamak mumkun olmayacaktir.");
		
		else if (kg2%2==1 && kg7==0 && kg2!=0)
			System.out.println(hedef+ "kg hedef icin, 2kg'lik "+ kg2 + " adet sabun gerekir." );
		else if (res==0 && kg7%7==1) // eger 2 ile bolunemeyen 7'nin kati bir deger varsa, 2 kglik sabunlara ayrilmasi mumkun degildir.
			System.out.println(hedef+ "kg hedef icin, 2kg'lik sabun kargolamak mumkun olmayacaktir.");	
		else if (res==-2) // toplam sabun sayisi hedef kargodan azsa, prepareCargoPAcket metodu -2 doner.
			System.out.println("Toplam sabun sayisi, hedef kargodan az oldugundan bu kargo mumkun degildir.");
		else
			System.out.println("exceptional case.");
		}
	catch(Exception e) {
		 logger_clc.log(Level.SEVERE, "Error in function call", e);
	}
		logger_clc.info("Log is created for exception detection");
	}

}
