

public class HashTable {
	
	   private final int SIZE = 11;  //Hash tablosu olu�turulurken al�nan uzunlu�un asal say� olmas�na dikkat edilir.

	    int[] table = new int[SIZE];

	    private int Hash(int key) {
	        return key % SIZE;  //Hash fonskiyonumuzun key adreslerini i�in girilen de�erlerin modunu al�r�z.
	    }

	    void add(int key, int yas) {
	        int hash = Hash(key);
	        if (table[hash] != 0) {
	            hash++;
	            if (hash >= SIZE) {
	                hash = 0;
	            }
	        }
	        table[Hash(key)] = yas; // Tabloya veri ekleme.
	    }

	    private int get(int key) {
	        return table[Hash(key)];
	    }

	    void print() {
	        for (int i = 0; i <SIZE; i++) {
	            System.out.println(i+"."+ table[i] + " ");
	        }
	    }

	    

}
