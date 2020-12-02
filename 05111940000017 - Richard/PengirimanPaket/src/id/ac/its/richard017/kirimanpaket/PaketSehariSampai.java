package id.ac.its.richard017.kirimanpaket;

public class PaketSehariSampai extends Paket{
	private double biayaTambahanPerKg;
	
	
	public PaketSehariSampai() {
		super();
		biayaTambahanPerKg = 0;
	}


	public PaketSehariSampai(double beratPaket, double biayaPerKg, Customer pengirim, Customer penerima, double biayaTambahanPerKg) {
		super(beratPaket, biayaPerKg, pengirim, penerima);
		this.biayaTambahanPerKg = biayaTambahanPerKg;
	}
	
	//Getter and Setter

				public double getBiayaTambahanPerKg() {
					return biayaTambahanPerKg;
				}
			
			
				public void setBiayaTambahanPerKg(double biayaTambahanPerKg) {
					this.biayaTambahanPerKg = biayaTambahanPerKg;
				}

	//End of Getter and Setter
				
				
	public double hitungBiaya()
	{
		return getBeratPaket() * (getBiayaPerKg()+biayaTambahanPerKg);
	}
}
