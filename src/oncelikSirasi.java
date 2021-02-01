
public class oncelikSirasi {
	
	public void Insan(int yas[]) {
		
		 int n = yas.length;
		 
	        for (int i = n / 2 - 1; i >= 0; i--)
	            heap(yas, n, i);
	 
	        
	        for (int i = n - 1; i > 0; i--) {
	            
	            int temp = yas[0];
	            yas[0] = yas[i];
	            yas[i] = temp;
	 
	           
	            heap(yas, i, 0);
	        }
	
	}
	    
    void heap(int yas[], int n, int i) {
        int largest = i; 
        int l = 2 * i + 1; 
        int r = 2 * i + 2; 
 
        
        if (l < n && yas[l] > yas[largest])
            largest = l;
 
        
        if (r < n && yas[r] > yas[largest])
            largest = r;
 
       
        if (largest != i) {
            int swap = yas[i];
            yas[i] = yas[largest];
            yas[largest] = swap;
 
           
            heap(yas, n, largest);
        }
    }
 
    
    static void printArray(int yas[]) {
        int n = yas.length;
        for (int i = 0; i < n; ++i) {
            System.out.print(yas[i] + " ");    
        }
        System.out.println("\n" + (n) + ". HASTANIN ÖNCELİĞİ VARDIR..");
        System.out.println();
    }
 
   
  

}
