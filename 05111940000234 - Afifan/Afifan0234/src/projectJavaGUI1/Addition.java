package projectJavaGUI1;
import javax.swing.JOptionPane;

public class Addition {
	
	public static void main(String[] args) {	
		String firstNumber =
				JOptionPane.showInputDialog("Enter tinggi segitga (int)");
		
		String secondNumber =
				JOptionPane.showInputDialog("Enter lebar sgitiga (int)");
		
		Segitiga segi3 = new Segitiga(Float.parseFloat(firstNumber),Float.parseFloat(secondNumber));
		
		JOptionPane.showMessageDialog(null, "Luas Segitiga tersebut adalah =" + segi3.getLuas() + 
				" Keliling Sgitiganya adalah =" + segi3.getKeliling() ,
				"Hasil Operasi Luas dan Keliing", JOptionPane.PLAIN_MESSAGE);	
	}
}
