class Pegawai {
	private String nama="";
	private String alamat="";
	private String nip="";
	
	Pegawai(){
		this.nama="";
		this.alamat="";
}
class Pegawai extends Orang {
	String nip;
	Pegawai (String nama,String alamat, String nip) {
		super(nama,alamat);
		nip = nip;
	}
	void bekerja(){
		System.out.println("bekerja sungguh-sungguh");
	}
}
public class JenisOrang {
	public Static void main (String args[]) {
		Pegawai asep = new Pegawai ("asep","pasteur","10115590");
		asep.bekerja();
		Orang bekerja = new Orang ("Tidak bisa bekerja");
	}
}

