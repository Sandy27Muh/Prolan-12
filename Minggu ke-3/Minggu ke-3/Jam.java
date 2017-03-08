class Jam {
    int hh,mm,dd;
	int jam,menit,detik;
	
      public Jam () {
      }

      public Jam(int hh,int mm,int dd) {
          this.hh = hh;
          this.mm = mm;
          this.dd = dd;
      }
	  
      public int getHh () {
          return hh;
      }

      public void setHh (int hh) {
          this.hh = hh;
      }

      public int getMm () {
          return mm;
      }

      public void setMm (int mm) {
          this.mm = mm;
      }

      public int getDd () {
          return dd;
      }

      public void setDd (int dd) {
          this.dd = dd;
      }
	  

      int ConvertJamToMenit (int jam) {
          int menit;
          menit = 1 * 60;
          return menit ;
      }

      int ConvertJamToDetik (int jam) {
          int detik;
          detik = 1 * 3600;
          return detik ;
    }

      int ConvertMenitToDetik (int menit) {
          int detik;
          detik = 1 * 60;
          return detik ;
      }
	  
	  int convertJamToDetik (int jam) {
          int detik;
          detik = 1 * 3600;
          return detik ;
    }
	  
	  int convertMenitToDetik (int menit) {
          int detik;
          detik = 1 * 60;
          return detik ;
      }

      int ConvertDetikToMenit (int detik) {
          double menit;
          menit = 1 / 60;
          return detik ;
      }
    }
	
class W7
{
    public static void main (String[] args)
	{
         Jam waktu = new Jam () ;

         System.out.println (waktu.ConvertJamToDetik(10));
         System.out.println (waktu.ConvertJamToMenit(10));
         System.out.println (waktu.ConvertMenitToDetik(10));
         System.out.println (waktu.ConvertDetikToMenit(10));
     }
 }
