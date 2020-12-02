package id.ac.its.richard017.kirimanpaket;

public class PaketStandar extends Paket{
	private final double biayaStandar;
	


	public PaketStandar() {
		super();
		biayaStandar = 0;
	}


	public PaketStandar(double beratPaket, double biayaPerKg, Customer pengirim, Customer penerima, double biayaStandar) {
		super(beratPaket, biayaPerKg, pengirim, penerima);
		this.biayaStandar = biayaStandar;
	}

	
	public double getBiayaStandar() {
		return biayaStandar;
	}


	public double hitungBiaya()
	{
		return (getBeratPaket() * getBiayaPerKg()) + biayaStandar;
	}
}
