
public class Insan {
	
	String isim, soyisim;
	String kanGrubu;
	int kimlikNumarasi;
	int yas;
	char Rh;
	Boolean bagýscý_mi;
	Boolean kanAlýcý_mi;
	Boolean HIV_mi;
	Boolean Hepatit_mi;
	
	public Insan(String isim,String soyisim, String kanGrubu, int kimlikNumarasi,int yas, char Rh, Boolean bagýscý_mi, Boolean kanAlýcý_mi, Boolean Hepatit_mi, Boolean HIV_mi) {
		this.isim=isim;
		this.soyisim=soyisim;
		this.kanGrubu=kanGrubu;
		this.kimlikNumarasi=kimlikNumarasi;
		this.yas=yas;
		this.Rh=Rh;
		this.bagýscý_mi=bagýscý_mi;
		this.kanAlýcý_mi=kanAlýcý_mi;
		this.Hepatit_mi=Hepatit_mi;
		this.HIV_mi=HIV_mi;
	
		/*if(bagýscý_mi == true && kanAlýcý_mi == true) {
			System.out.println("HASTA HEM ALICI HEM BAÐIÞÇI OLAMAZ.");
		}
		
		if(bagýscý_mi == true) {
			if(Hepatit_mi == true) {
					System.out.println("KAN VEREMEZ AMA KAN ALABÝLÝR");
			}
			if(HIV_mi == true) {
				System.out.println("KAN VEREMEZ AMA KAN ALABÝLÝR");
			}
		}
		
		
		if(kanGrubu == "00" && Rh == '+') {
			System.out.println("Bu hastaya 0Rh- veya ORh+ kan grubuna sahip bireyler kan verebilir.");
		}
		else if(kanGrubu == "00" && Rh == '-') {
			System.out.println("Bu hastaya 0Rh- kan grubuna sahip birey kan verebilir.");
		}
		else if(kanGrubu == "B0" && Rh == '-') {
			System.out.println("Bu hastaya 0Rh- veya B0- kan grubuna sahip insan kan verebilir.");
		}
		else if(kanGrubu == "B0" && Rh == '+') {
			System.out.println("Bu hastaya 0Rh- , 0Rh+, B0Rh+, B0Rh- kan grubuna sahip insan kan verebilir.");
		}
		else if(kanGrubu == "A0" && Rh == '-') {
			System.out.println("Bu hastaya A0Rh- veya A0Rh+ kan grubuna sahip insan kan verebilir.");
		}
		else if(kanGrubu == "A0" && Rh == '+') {
			System.out.println("Bu hastaya 0Rh- , 0Rh+, A0Rh+, A0Rh- kan grubuna sahip insan kan verebilir.");
		}
		else if(kanGrubu == "AB" && Rh == '-') {
			System.out.println("Bu hastaya 0Rh- , B0Rh-, ABRh-, A0Rh- kan grubuna sahip insan kan verebilir.");
		}
		else if(kanGrubu == "AB" && Rh == '+') {
			System.out.println("Bu hastaya tüm kan gruplarý sahip insan kan verebilir.");
		} */
	}	
	
	
	@Override
	public String toString() {
		return " [isim=" + isim + ", soyisim=" + soyisim + ", kanGrubu=" + kanGrubu + ", kimlikNumarasi="
				+ kimlikNumarasi + ", yas=" + yas + ", Rh=" + Rh + ", bagýscý_mi=" + bagýscý_mi + ", kanAlýcý_mi="
				+ kanAlýcý_mi + ", Hepatit_mi=" + Hepatit_mi + ", HIV_mi=" + HIV_mi + "]";
	}


	public void print() {
		System.out.println(toString());
	}
	
}
