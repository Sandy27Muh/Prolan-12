public class bass extends onmusik {
  public void tampilkan(){
     double stok =9;
     String garansi="No Warranty";
     String kategori="Klasik Musik-tm100tfb";
     onmusik m = new onmusik();
     m.inputData("Ibanez Bass TMB100", "Coklat", "Elektrik Bass",9900000);
     m.tampilkandata();
     System.out.println("banyak nya stok:"+stok);
     System.out.println("Tipe garansi :"+garansi);
     System.out.println("Kategori Model :"+kategori);   
  }    
}