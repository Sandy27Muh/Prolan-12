public class Main {
   public <T> GenAlatmusic Informasi (T Info) {
       return (GenAlatmusic) Info;
   }
   
 public static void main(String[] args) {
   Main mn = new Main();
   
   mn.Informasi(new GenAlatmusic<>()).NamaPembeli("Muh Nur Sanjaya");
   mn.Informasi(new GenAlatmusic<>()).Gitar("Accoustic Yamaha",2000000);
   mn.Informasi(new GenAlatmusic<>()).Bass("Ibanez Bass",3500000);
   }
}
