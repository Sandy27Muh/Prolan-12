  abstract class bayar {
  abstract public double luas();	
  }

       class diskon extends bayar {
       private double hargaasli;
       private double potongan;
	
       diskon(int p, int l) {
       hargaasli = p;
       potongan = l;
       }
	
       public double luas() {
           System.out.println("Diskon Umum ,Hanya Berlaku Untuk Kode Barang Akhiran ganjil:");
           return (hargaasli * potongan);
       }	
  }

       class superdiskon extends bayar {
       private double hargaasli2;
       superdiskon(int s) {
       hargaasli2 = s;
       }
	
       public double luas() {
           System.out.println("superdiskon hanya berlaku untuk kode barang akhiran 4 dan 6:");
           return (hargaasli2 * hargaasli2);
       }	
  }

       class penawaran extends bayar {
       private double hargaasli3;
       private double diskon1;
	
       penawaran(int a, int t) {
       hargaasli3 = a;
       diskon1 = t;
       }
	
       public double luas() {
           System.out.println("Diskon Tambahan ketika membeli barang yang diskon umum dan Super Diskon:");
           return ((hargaasli3 * diskon1)/2);
       }	
  }
