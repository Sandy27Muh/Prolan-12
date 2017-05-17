package Encapsyulation;

import mahasiswa.Mahasiswa;

public class main{
    public static void main (String[] args) {
            Mahasiswa snd = new Mahasiswa();
            snd.setJurusan ("Teknik Informatika");
            snd.setMatkul ("Prolan");
            snd.setNama ("Muh Nur Sanjaya");
            snd.setNim ("10115271");
            System.out.println ("Jurusan    : "+snd.getJursan());
            System.out.println ("MataKuliah : "+snd.getMatkul());
            System.out.println ("Nama       : "+snd.getNama());
            System.out.println ("Nim        : "+snd.getNim());
    }
}