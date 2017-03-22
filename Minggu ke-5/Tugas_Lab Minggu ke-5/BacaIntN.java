import java.util.Scanner;
class BacaIntN{

	public static void main(String[] args) 
	{
		int N;
		int Nilai;;
		int i;
		int min=100;
		int max=0;
		char pilih;
		
		MaxMin tes = new MaxMin();
		Scanner input = new Scanner (System.in);
		System.out.println("\t\t===================================================");
		System.out.println("\t\t===================================================");
		System.out.println("\t\t! Membaca nilai Integer dari data Sebanyak N buah !");
		System.out.println("\t\t===================================================");
		System.out.println("\t\t***************************************************\n\n\n");
		System.out.print("Masukan jumlah data yang akan dicari angka min dan max = ");
        N = input.nextInt();
		System.out.println("\nKeterangan pilihan :\nPilih : A = Untuk mencari nilai Min.\nPilih : B = Untuk mencari nilai Max.\n");
		System.out.print("Masukan Pilihan A atau B (harus huruf kapital) = ");
        pilih = input.next().charAt(0);
		for (i=1;i<=N;i++){		
			System.out.print("Masukan Nilai angka ke : "+ i +"         = ");
            Nilai = input.nextInt();
			if (pilih =='A'){
				min=tes.pilihanA(Nilai,min);
			}
			if (pilih == 'B'){
				max=tes.pilihanB(Nilai,max);
			}

			}
		System.out.println("\n\n===================================");
		System.out.println("|           Hasil Input Angka     |");
		System.out.println("===================================");
		System.out.println("Banyak data yang diinput = " + N);
		if (pilih== 'A'){
			System.out.println("Nilai minimum angka yang diinput             = " + min);
		} else {
			System.out.println("Nilai maximum angka yang diinput            = " + max);
		}
		System.out.println("----------------------------------|");
	}
}

class MaxMin{
	int pilihanA(int x, int y){
		if(x<y){
			y=x;
			return y;
		}
		return y;
	}
	
	int pilihanB(int x, int y){
		if(x>y){
			y=x;
			return y;
		}
		return y;
	}
}