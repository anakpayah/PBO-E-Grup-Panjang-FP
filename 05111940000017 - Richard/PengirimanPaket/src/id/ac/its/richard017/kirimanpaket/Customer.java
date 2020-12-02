package id.ac.its.richard017.kirimanpaket;

public class Customer {
	private String nama;
	private String alamat;
	private String kota;
	private String provinsi;
	private String kodePos;
	
	public Customer() {
		super();
		this.nama = "Unnamed";
		this.alamat = "Unknown";
		this.kota = "Unknown";
		this.provinsi = "Unknown";
		this.kodePos ="Unknown";
	}
	public Customer(String nama, String alamat, String kota, String provinsi, String kodePos) {
		super();
		this.nama = nama;
		this.alamat = alamat;
		this.kota = kota;
		this.provinsi = provinsi;
		this.kodePos = kodePos;
	}
	
	//Getter and Setter
	
				public String getNama() {
					return nama;
				}
				public void setNama(String nama) {
					this.nama = nama;
				}
				public String getAlamat() {
					return alamat;
				}
				public void setAlamat(String alamat) {
					this.alamat = alamat;
				}
				public String getKota() {
					return kota;
				}
				public void setKota(String kota) {
					this.kota = kota;
				}
				public String getProvinsi() {
					return provinsi;
				}
				public void setProvinsi(String provinsi) {
					this.provinsi = provinsi;
				}
				public String getKodePos() {
					return kodePos;
				}
				public void setKodePos(String kodePos) {
					this.kodePos = kodePos;
				}
				
	//End of Getter and Setter
	
	
}
