
public class Cizge2 {
	
	class kenar{
		String secim, hedef;
	}
	
	int koseler, kenarlar;
	
	kenar[] kenar;

	
	Cizge2(int koseler, int kenarlar){
		this.koseler = koseler;
		this.kenarlar = kenarlar;
		
		kenar = new kenar[kenarlar];
		for(int i=0; i<kenarlar; i++) {
			kenar[i] = new kenar();
		}
	}

}
