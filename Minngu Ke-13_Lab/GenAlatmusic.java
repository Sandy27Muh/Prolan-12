public class GenAlatmusic <A> {
    
    public void NamaPembeli(String namaPembeli) {
        System.out.println("Nama Pembeli          : " +namaPembeli);
    }
    public <T,N> void Gitar (T namaGitar, N hargaGitar) {
        System.out.println("Nama  Gitar          : " +namaGitar);
        System.out.println("Harga Gitar           : " +hargaGitar);
    }
    public <T,N> void Bass (T namaBass, N hargaBass) {
        System.out.println("Nama Bass           : " +namaBass);
        System.out.println("Harga Bass          : " +hargaBass);
    }
    public static void main (String[] args) {
        GenAlatmusic snd = new GenAlatmusic();
        GenAlatmusic<String>  nm  = new GenAlatmusic<>();
        GenAlatmusic<Integer> hrg = new GenAlatmusic<>();
        
        snd.NamaPembeli("Muh Nur Sanjaya");
        nm.Gitar("Accoustic Yamaha",2000000);
        hrg.Bass("Ibanez Bass",3500000); 
    }
}