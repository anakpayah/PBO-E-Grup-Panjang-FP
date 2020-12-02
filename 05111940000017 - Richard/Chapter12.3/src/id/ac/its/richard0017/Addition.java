package id.ac.its.richard0017;

import javax.swing.JOptionPane;
public class Addition {

	public static void main(String[] args) {
		
		String panjangBangun = JOptionPane.showInputDialog("Masukkan Panjang Persegi Panjang");
		String lebarBangun =JOptionPane.showInputDialog("Masukkan Lebar Persegi Panjang");
		
		int panjang = Integer.parseInt(panjangBangun);
		int lebar = Integer.parseInt(lebarBangun);
		
		int luas = (panjang*lebar);
		int keliling = 2*(panjang+lebar);
		
		JOptionPane.showMessageDialog(null, "Luasnya adalah : " + luas,
				"Luas Bangun", JOptionPane.PLAIN_MESSAGE);
		JOptionPane.showMessageDialog(null, "Kelilingnya adalah : " + keliling,
				"Keliling Bangun", JOptionPane.PLAIN_MESSAGE);
	}

}
