import java.util.Scanner;

;
public class main {

	public static void main(String[] args) {
		
		System.out.println("Insan S�n�f� : 1");
		System.out.println("Oncel�k S�ras� ve Hash Table: 2");
		System.out.println("Kan Gruplar� Aras�ndaki �li�kiyi G�steren Cizge : 3");
		System.out.println("Kan Al�c�lar ve Kan Bag�sc�y� G�steren Cizge : 4");
		System.out.println("Se�im yap�n�z.");
		Scanner s = new Scanner(System.in);
		int secim = s.nextInt();
		
		switch(secim) {
		case 1:
			
			Insan hasta1 = new Insan("birinci", "hasta", "00Rh-",  1111111111, 50, '-' ,false, true,true, true); //kan al�c� 
			hasta1.print();
			
			System.out.println("<--------------->");
			
			Insan hasta2 = new Insan("ikinci", "hasta", "B0Rh-",  222222222, 21, '-' ,true, false, true, true); //kan bag�sc�
			hasta2.print();
			
			System.out.println("<--------------->");
			
			Insan hasta3 = new Insan("ucuncu", "hasta", "ABRh+",  45232356, 65, '+' ,true, false, false, false); //kan bag�sc�
			hasta3.print();
			
			System.out.println("<--------------->");
			
			Insan hasta4 = new Insan("dorduncu", "hasta", "ABRh+",  45465456, 18, '+' ,false, true, true, true); //kan al�c�
			hasta4.print();
			
			System.out.println("<--------------->");
			
			Insan hasta5 = new Insan("besinci", "hasta", "A0Rh+",  15115456, 70, '-' ,true, false, false, false); //kan bag�sc�
			hasta5.print();
			
			System.out.println("<--------------->");
			
			Insan hasta6 = new Insan("altinci", "hasta", "A0Rh-",  404845166, 30, '-' ,false, true, true, false); //kan al�c�
			hasta6.print();
			
			System.out.println("<--------------->");
			
			Insan hasta7 = new Insan("yedinci", "hasta", "ABRh-",  4514986, 28, '-' ,true, true, true, false); 
			hasta7.print();
		break;
		case 2:
			
			int yas[] = {50, 21, 65, 18, 70, 30, 28};
	        int n = yas.length;
	        oncelikSirasi ob = new oncelikSirasi();
	        ob.Insan(yas);
	        for (int i = 0; i < n; ++i) {
	            System.out.print(yas[i] + " ");     
	        } 
	        
	        System.out.println("<-----------------------YASLARIN SIRALANMASI----------------------------------------->");
	        
	        int yas1[] = {65, 50, 21, 18, 70, 30, 28};
			
			HashTable table = new HashTable();
	        table.add(1, yas1[0]);//key onlar�n id'si
	        table.add(5, yas1[1]);
	        table.add(3, yas1[2]);
	        table.add(7, yas1[3]);
	        table.add(9, yas1[4]);
	        table.add(11, yas1[5]);
	        table.add(13, yas1[6]);

	        System.out.println("\nALINAN YAS VER�LER�N� HASH TABLOSUNA YERLE�T�REL�M");
	        table.print();
	        
	    break;
		case 3:
			
			int koseYok = 5 ;
			int kenarYok = 19;
			Cizge cizge = new Cizge(koseYok, kenarYok);
			
			cizge.kenar[0].secim="00Rh-"; //bag�sc�
			cizge.kenar[0].hedef="00Rh-"; //al�c�
			
			cizge.kenar[1].secim="00Rh+";
			cizge.kenar[1].hedef="00Rh+";
			
			cizge.kenar[2].secim="00Rh+";
			cizge.kenar[2].hedef="00Rh-";
			
			cizge.kenar[3].secim="B0Rh-";
			cizge.kenar[3].hedef="00Rh-";
			
			cizge.kenar[4].secim="B0Rh-";
			cizge.kenar[4].hedef="B0Rh-";
			
			cizge.kenar[5].secim="B0Rh+";
			cizge.kenar[5].hedef="00Rh+";
			
			cizge.kenar[6].secim="B0Rh+";
			cizge.kenar[6].hedef="00Rh-";
			
			cizge.kenar[7].secim="B0Rh+";
			cizge.kenar[7].hedef="B0Rh-";
			
			cizge.kenar[8].secim="B0Rh+";
			cizge.kenar[8].hedef="B0Rh+";
			
			cizge.kenar[9].secim="A0Rh-";
			cizge.kenar[9].hedef="A0Rh-";
			
			cizge.kenar[10].secim="A0Rh-";
			cizge.kenar[10].hedef="A0Rh+";
			
			cizge.kenar[11].secim="A0Rh+";
			cizge.kenar[11].hedef="A0Rh-";
			
			cizge.kenar[12].secim="A0Rh+";
			cizge.kenar[12].hedef="A0Rh+";
			
			cizge.kenar[13].secim="A0Rh+";
			cizge.kenar[13].hedef="00Rh-";
			
			cizge.kenar[14].secim="A0Rh+";
			cizge.kenar[14].hedef="00Rh+";
			
			cizge.kenar[15].secim="ABRh-";
			cizge.kenar[15].hedef="00Rh-";
			
			cizge.kenar[16].secim="ABRh-";
			cizge.kenar[16].hedef="A0Rh-";
			
			cizge.kenar[17].secim="ABRh-";
			cizge.kenar[17].hedef="B0Rh-";
			
			cizge.kenar[18].secim="ABRh-";
			cizge.kenar[18].hedef="ABRh-";
			
			cizge.kenar[17].secim="ABRh+";
			cizge.kenar[17].hedef="T�m Kan Gruplar�";
			
			for(int i = 0; i < kenarYok; i++) {
			      System.out.println("KAN ALICININ KAN GRUBU: " + cizge.kenar[i].secim + " <----> " + "BA�I�CININ SAH�P OLMASI GEREKEN KAN GRUBU: " + cizge.kenar[i].hedef);
			    }
	     break;
		case 4:
			
			int koseYok2 = 5 ;
			int kenarYok2 =4;
			Cizge2 cizge2 = new Cizge2(koseYok2, kenarYok2);
			 	
			cizge2.kenar[0].secim="B�R�NC� HASTAMIZ KAN ALICI OLARAK BA�VURMU�TUR. KAN GRUBU: 00Rh-";
			cizge2.kenar[0].hedef="�K�NC� HASTAMIZ KAN BAGISCIDIR. AMA HEPATIT VE HIV HASTASI OLDU�U ICIN KAN BAGISI YAPAMAZ.";
			
			cizge2.kenar[1].secim="�C�NC� HASTAMIZ KAN ALICI OLARAK BA�VURMU�TUR. KAN GRUBU: ABRh+";
			cizge2.kenar[1].hedef="D�RD�NC� HASTAMIZ KAN BAGISCIDIR. KAN GRUBU: ABRh+";
			
			cizge2.kenar[2].secim="BES�NC� HASTAMIZ KAN ALICI OLARAK BA�VURMU�TUR. KAN GRUBU: A0Rh-";
			cizge2.kenar[2].hedef="ALT�NC� HASTAMIZ KAN BAGISCIDIR. KAN GRUBU: A0Rh+";
			
			cizge2.kenar[3].secim="YED�NC� HASTAMIZ HEM KAN ALICI HEM KAN BAGISCI OLARAK BA�VURMU�TUR. B�YLE B�R �EY M�MK�N DE��LD�R.";
			cizge2.kenar[3].hedef="";
			
			for(int i = 0; i < kenarYok2; i++) {
			      System.out.println(  cizge2.kenar[i].secim + " <----> " +   cizge2.kenar[i].hedef);
			    }
		break;	
		default:
			System.out.println("B�YLE B�R SE��M YOKTUR");
		break;
		}
		
	}

}
