package projectJavaGUI1;

public class Segitiga {
	private float tinggi,lebar;
	
	public Segitiga() {
		this.setLebar(this.setTinggi(0));
	}
	
	public Segitiga(float tinggi, float lebar) {
		this.setLebar(lebar);
		this.setTinggi(tinggi) ;
	}

	public float getLebar() {
		return lebar;
	}

	public void setLebar(float lebar) {
		this.lebar = lebar;
	}

	public float getTinggi() {
		return tinggi;
	}

	public float setTinggi(float tinggi) {
		this.tinggi = tinggi;
		return tinggi;
	}
	
	public float getLuas() {
		return lebar * tinggi * 0.5f;
	}
	
	public float getKeliling() {
		return (float) (lebar + (2*(Math.sqrt((Math.pow(tinggi,2)+Math.pow(0.5*lebar,2))))));
	}
	
}
