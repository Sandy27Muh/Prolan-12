package mahasiswa;

public class Mahasiswa {
    private String Jurusan;
    private String Matkul;
    private String Nama;
    private String Nim;
    
    public void setJurusan (String newValue) {
        Jurusan = newValue;
    }
    
    public void setMatkul (String newValue) {
        Matkul = newValue;
    }
    
    public void setNama (String newValue) {
        Nama = newValue;
    }
    
    public void setNim (String newValue) {
        Nim = newValue;
    }
    
    public String getJurusan () {
        return Jurusan;
    }
    
    public String getMatkul () {
        return Matkul;
    }
    
    public String getNama () {
        return Nama;
    }
    
    public String getNim () {
        return Nim;
    }   

    public String getJursan() {
        return Jurusan;
    }
 
}
