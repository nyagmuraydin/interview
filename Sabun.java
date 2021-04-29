package exam;
import java.util.logging.*;
public class Sabun {

	public Sabun(int kg7, int kg2) {
	Sabun grup = new Sabun(kg7,kg2);
	}	
	/*prepareCargoPacket metodu, 7 kglik ve 2kglik agirliktan olusan sabunlari,
	7kglik paketlere oncelik verilecek sekilde, 2 kg'lik kac adet sabun gerektigini dondurur.
	Bu method, kg7 (kac adet 7 kiloluk sabun oldugu), kg2 (kac adet 2 kiloluk sabun oldugu) ve
	hedef (ne kadar kglik bir kargo paketi istendigi) degiskenlerini kullanir.
	*/
	public static int prepareCargoPacket(int kg7,int kg2, int hedef) {
		Logger logger = Logger.getLogger(Sabun.class.getName());
		int result = 1; 
	float toplam_sabun= (7*kg7)+(2*kg2); // toplam_sabun degiskeni, toplam sabun sayisini verir.
	try {
        if (toplam_sabun < hedef)
        	result=-2; // toplam sabun sayisi, hedef kargodan azsa, -2 dondur.
        else { // toplam sabun sayisi hedefe esit veya hedeften buyukse, asagidaki
        	//islemleri yap.
      
        	int mod7= hedef%7; //mod7 degiskeni, hedef kargonun 7 ile bolumunden kalani temsil eder.
        	if( mod7%2==0)
        		result = mod7/2;
        	if(mod7%2!=0)
        		result = -1; //eger hedef kargo paketi, 7 ile bolundukten sonra,
        	//2nin kati bir deger degilse (2kglik paketler mumkun degilse), -1 dondur.
        }
	}
	catch(Exception e) {
		 logger.log(Level.SEVERE, "Error doing calculations", e);
	}

return result;
	}
}
