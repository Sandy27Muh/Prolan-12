`public class Sandy extends Mahasiswa {

    @Override
    void kuliah() {
        System.out.println("Anda boleh tidak hadir kuliah maksimal 3x dalam semester per satu mata kuliah !!! "); 
    }

    @Override
    void lulus() {
        System.out.println("Anda lulus jika IPK diatas 2.00 ... "); 
    }

    @Override
    void tidaklulus() {
        System.out.println("Anda tidak lulus jika ada nilai grade 'E' diatas 3 mata kuliah !!!"); 
    }
    
}
