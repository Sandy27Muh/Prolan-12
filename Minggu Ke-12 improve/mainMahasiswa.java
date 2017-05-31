package mahasiswa;

public class mainMahasiswa{
    public static void main (String[] args) {
            Mahasiswa<String> snd = new Mahasiswa<>();
            snd.setJurusan("String");
            snd.setMatkul("String");
            snd.setNama("String");
            snd.setNim("String");
            snd.setNilai("Integer");
            snd.setJurusan ("Teknik Informatika");
            snd.setMatkul ("Prolan");
            snd.setNama ("Muh Nur Sanjaya");
            snd.setNim ("10115271");
            snd.setNilai("70");
            System.out.println ("Jurusan    : "+snd.getJursan());
            System.out.println ("MataKuliah : "+snd.getMatkul());
            System.out.println ("Nama       : "+snd.getNama());
            System.out.println ("Nim        : "+snd.getNim());
            System.out.println ("Nilai      : "+snd.getNilai());
            System.out.println ("Mahasiswa Bernama Muh Nur Sanjaya Dengan Nim 10115271 memiliki nilai akhir 70 dan dinyatakan Lulus");
    }
}
 