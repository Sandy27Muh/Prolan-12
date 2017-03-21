public class Pegawai extends Data 
    {
    String NIP;
    
    public Pegawai(String Nama,String Alamat,int Umur,String NIP)
	    {
        super(Nama,Alamat,Umur);
        this.NIP = NIP;
        }
    
    public String getNIP()
	    {
        return NIP;
        }
    
    public void setNIP(String NIP)
	    {
        this.NIP = NIP;
        }
    
    public void dataPegawai()
	    {
        System.out.println("Data Pegawai");
		System.out.println("================================================");
        System.out.println("NIP    = " + getNIP());
        System.out.println("Nama   = " + getNama());
        System.out.println("Alamat = " + getAlamat());
        System.out.println("Umur   = " + getUmur());
		System.out.println("================================================");
        }
    
    public static void main(String[] args)
	    {
	    System.out.println("================================================");
        Pegawai pgw = new Pegawai("Budi Susanto", "Majalengka", "32", "198503302003121002");
        pgw.dataPegawai();
		System.out.println("================================================");
        }
}