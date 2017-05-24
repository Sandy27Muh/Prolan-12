public class gitar extends onmusik {
	        
	@Override
    public void stok(){
        super.stok();
        System.out.println("3");
   
    }
  	@Override
    public void garansi(){
        super.garansi();
        System.out.println("Bergarasi 3 Tahun");
   
    }
  	@Override
    public void kategori(){
        super.kategori();
        System.out.println("Nada Musik-NM0028");
   
    }
    public void tampilkan(){
        onmusik m = new onmusik();
        m.inputData("Yamaha Gitar ", "Hitam", "Gitar Acoustik",400000);
        m.tampilkandata();
    }    
}