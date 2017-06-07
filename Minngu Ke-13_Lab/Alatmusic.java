public class Alatmusic {
    public <T> void NamaAlatmusic (T namaAlatmusic) {
        System.out.println("Nama Alatmusic         : " +namaAlatmusic);     
    }
    public <T> void JenisAlatmusic (T jnsAlatmusic) {
        System.out.println("Jenis Alatmusic        : " +jnsAlatmusic);
    }
    public <T> void TahunBuat (T thnBuat) {
        System.out.println("Tahun Buat             : " +thnBuat);
    }
    public <T,N> void Harga (T x , N y) {
        System.out.println("Harga Alatmusic        : " +x);
        System.out.println("Jumlah Stok Alatmusic  : " +y);
    } 
    public static void main (String[] args) {
        Alatmusic info = new Alatmusic();
        
        info.NamaAlatmusic("Gitar");
        info.JenisAlatmusic("Accoustic");
        info.Tahun Buat("2017");
        info.Harga(2000000,60);
        
    } 
    
}
