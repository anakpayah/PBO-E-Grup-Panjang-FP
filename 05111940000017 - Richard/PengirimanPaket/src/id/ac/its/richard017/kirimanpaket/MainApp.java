package id.ac.its.richard017.kirimanpaket;

public class MainApp {

	public static void main(String[] args) {
		Paket[] pack = new Paket[5];
		Customer pelanggan = new Customer("Richard","Jl. Jalan","Surabaya","Jawa Timur","42215");
		Customer pengirim = new Customer("Husin","Jl. Terbang","Jakarta","Jawa Barat","62215");
		pack[0] = new PaketStandar(50,5000,pelanggan,pengirim,5000);
		pack[1] = new PaketStandar();
		pack[2] = new PaketSehariSampai();
		pack[3] = new PaketSehariSampai();
		pack[4] = new PaketSehariSampai();
		for(int a=0; a<5 ;a++)
		{
			pack[a].print();
		}
	}

}
