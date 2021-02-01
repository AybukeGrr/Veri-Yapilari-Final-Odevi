
public class Insan {
	
	String isim, soyisim;
	String kanGrubu;
	int kimlikNumarasi;
	int yas;
	char Rh;
	Boolean bag�sc�_mi;
	Boolean kanAl�c�_mi;
	Boolean HIV_mi;
	Boolean Hepatit_mi;
	
	public Insan(String isim,String soyisim, String kanGrubu, int kimlikNumarasi,int yas, char Rh, Boolean bag�sc�_mi, Boolean kanAl�c�_mi, Boolean Hepatit_mi, Boolean HIV_mi) {
		this.isim=isim;
		this.soyisim=soyisim;
		this.kanGrubu=kanGrubu;
		this.kimlikNumarasi=kimlikNumarasi;
		this.yas=yas;
		this.Rh=Rh;
		this.bag�sc�_mi=bag�sc�_mi;
		this.kanAl�c�_mi=kanAl�c�_mi;
		this.Hepatit_mi=Hepatit_mi;
		this.HIV_mi=HIV_mi;
	
		/*if(bag�sc�_mi == true && kanAl�c�_mi == true) {
			System.out.println("HASTA HEM ALICI HEM BA�I��I OLAMAZ.");
		}
		
		if(bag�sc�_mi == true) {
			if(Hepatit_mi == true) {
					System.out.println("KAN VEREMEZ AMA KAN ALAB�L�R");
			}
			if(HIV_mi == true) {
				System.out.println("KAN VEREMEZ AMA KAN ALAB�L�R");
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
			System.out.println("Bu hastaya t�m kan gruplar� sahip insan kan verebilir.");
		} */
	}	
	
	
	@Override
	public String toString() {
		return " [isim=" + isim + ", soyisim=" + soyisim + ", kanGrubu=" + kanGrubu + ", kimlikNumarasi="
				+ kimlikNumarasi + ", yas=" + yas + ", Rh=" + Rh + ", bag�sc�_mi=" + bag�sc�_mi + ", kanAl�c�_mi="
				+ kanAl�c�_mi + ", Hepatit_mi=" + Hepatit_mi + ", HIV_mi=" + HIV_mi + "]";
	}


	public void print() {
		System.out.println(toString());
	}
	
}
