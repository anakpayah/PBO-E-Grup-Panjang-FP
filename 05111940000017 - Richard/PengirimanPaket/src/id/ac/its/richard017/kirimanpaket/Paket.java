package id.ac.its.richard017.kirimanpaket;

public abstract class Paket {
	private double beratPaket;
	private double biayaPerKg;
	Customer pengirim = new Customer();
	Customer penerima = new Customer();

	public Paket()
	{
		this.beratPaket = 0;
		this.biayaPerKg = 0;
	}
	
	public Paket(double beratPaket, double biayaPerKg, Customer pengirim, Customer penerima) 
	{
		this.beratPaket = beratPaket;
		this.biayaPerKg = biayaPerKg;
		this.pengirim = pengirim;
		this.penerima = penerima;
	}



	//Getter Setter
	
				public double getBeratPaket() {
					return beratPaket;
				}
			
			
			
				public void setBeratPaket(double beratPaket) {
					this.beratPaket = beratPaket;
				}
			
			
			
				public double getBiayaPerKg() {
					return biayaPerKg;
				}
			
			
			
				public void setBiayaPerKg(double biayaPerKg) {
					this.biayaPerKg = biayaPerKg;
				}
				
	//End of Getter Setter
				
	public double hitungBiaya()
	{
		return beratPaket * biayaPerKg;
	}	

	public void print()
	{
		System.out.printf("Berat Paket : %f Biaya Total : %f Pengirim : %s Penerima : %s\n",beratPaket,hitungBiaya(),pengirim.getNama(), penerima.getNama());
	}
	
}
