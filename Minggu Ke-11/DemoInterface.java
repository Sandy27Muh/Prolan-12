interface AlatMusik {
	
   void mainkan();
   void setelNada();
   String ambilNama();
}

 class AlatMusikPetik implements AlatMusik {	
    protected String nama;
	
    public void mainkan() {
        System.out.println(ambilNama() + " dimainkan dengan cara petik");
    }
	
    public void setelNada() {
        System.out.println("Setel nada pada " + ambilNama());	
    }
	
    public String ambilNama() {
        return nama;
    }
 }

 class AlatMusikTiup implements AlatMusik {	
    protected String nama;
	
    public void mainkan() {
        System.out.println(ambilNama() + " dimainkan dengan cara tiup");
    }
	
    public void setelNada() {
        System.out.println("Setel nada pada " + ambilNama());	
    }
	
    public String ambilNama() {
        return nama;
    }
 }

 class AlatMusikPukul implements AlatMusik {	
    protected String nama;
	
    public void mainkan() {
        System.out.println(ambilNama() + " dimainkan dengan cara pukul");
    }
	
    public void setelNada() {
        System.out.println("Setel nada pada " + ambilNama());	
    }
	
    public String ambilNama() {
        return nama;
    }
 }

 class Gitar extends AlatMusikPetik {
    Gitar(String nama) {
    this.nama = nama;
    }
 }

 class Bass extends AlatMusikPetik {
    Bass(String nama) {
    this.nama = nama;
    }
 }

 class DemoInterface {	
    public static void main(String[] args) {  	
    AlatMusikPetik gitar, bass;
    gitar = new Gitar("Gitar");
    bass = new Bass("Bass");
    gitar.mainkan();
    gitar.setelNada();
    System.out.println();
    bass.mainkan();
    bass.setelNada();  	
    }	
 }
