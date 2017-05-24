public class onmusik {
	
  private String merek;
  private String warna;
  private int harga;
  private String tipealat;

    public String gettipealat() {
        return tipealat;
    }

    public void settipealat(String tipealat) {
        this.tipealat = tipealat;
    }

    public int getharga() {
        return harga;
    }

    public void setharga (int harga) {
        this.harga = harga;
    }

    public String getMerek() {
        return merek;
    }

    public void setMerek(String merek) {
        this.merek = merek;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }
 
    public void stok(){
        System.out.print("Banyaknya Stok Barang: ");
    }
    public void garansi(){
        System.out.print("Tipe Garansi Alat Musik: ");
    }
    public void kategori(){
        System.out.print("Kategori Model: ");
    }
   
    public void tampilkandata(){
	    System.out.println("merek Alat Musik :"+getMerek());
        System.out.println("warna Alat Musik :"+getWarna());
        System.out.println("Harga :"+getharga());
        System.out.println("Tipe Alat Musik :"+gettipealat());         
    }

    public void inputData(String m,String w,String j,int jp){
        setMerek(m);
        setWarna(w);
        settipealat(j);
        setharga(jp);  
    }
}