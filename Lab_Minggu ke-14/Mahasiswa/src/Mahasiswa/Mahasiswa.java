package mahasiswa;

public class Mahasiswa <T> {
    private T Jurusan;
    private T Matkul;
    private T Nama;
    private T Nim;
    private T Nilai;
    T value;
    
    public void setJurusan (T newValue) {
        Jurusan = newValue;
    }
    
    public void setMatkul (T newValue) {
        Matkul = newValue;
    }
    
    public void setNama (T newValue) {
        Nama = newValue;
    }
    
    public void setNim (T newValue) {
        Nim = newValue;
    }
    
    public void setNilai (T newValue) {
        Nilai = newValue;
    }
    
    public T getJurusan () {
        return Jurusan;
    }
    
    public T getMatkul () {
        return Matkul;
    }
    
    public T getNama () {
        return Nama;
    }
    
    public T getNim () {
        return Nim;
    }  
    
     public T getNilai () {
        return Nilai;
    }

    public T getJursan() {
        return Jurusan;
    }
 
}
