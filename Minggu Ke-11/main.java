public class main {
	
 public static void main (String [] args){
	 System.out.println();
     System.out.println("==== INFORMASI BARANG ======");
     System.out.println();
     System.out.println("Gitar");

     gitar h = new gitar();
     h.tampilkan();
     h.stok();
	 h.garansi();
	 h.kategori();


     System.out.println("\nBass");
         bass t = new bass();
         t.tampilkan();

         bayar obj;
	     diskon pp = new diskon(5,3);
         superdiskon bs = new superdiskon(5);
         penawaran st = new penawaran(4, 3);
    
         obj = pp;
	     System.out.println();
	     System.out.println("==== INFORMASI DISKON ======");
	     System.out.println();
         System.out.println("Diskon Yang Di Dapatkan (%) : " + obj.luas());
         System.out.println();
    
         obj = bs;
         System.out.println("Diskon Yang Di Dapatkan (%) : " + obj.luas());
         System.out.println();
    
         obj = st;
         System.out.println("Diskon Tambahan(%) : " + obj.luas());
         System.out.println();   
 }
}