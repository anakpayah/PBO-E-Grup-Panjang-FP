package id.ac.its.syafiq089;

import java.awt.FlowLayout;
import java.awt.Image;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;


public class LabelFrame extends JFrame {
	private final JLabel label1;
	private final JLabel label2;
	private final JLabel label3;
	private final JLabel label4;
	
	public LabelFrame() {
		super("Kartu Mahasiswa ITS");
		setLayout(new FlowLayout());
		
		label1 = new JLabel("Kartu Mahasiswa ITS", SwingConstants.CENTER);
		label1.setToolTipText("Always use Kartu Mahasiswa ITS in a good purpose");
		add(label1);
		
		ImageIcon profile = new ImageIcon(getClass().getResource("NanoDev.png"));
		profile = new ImageIcon(profile.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT));
		
		label2 = new JLabel(profile, SwingConstants.CENTER);
		label2.setToolTipText("Your photo is outstanding, please stay at home");
		add(label2);
		
		label3 = new JLabel("Ahmad Syafiq Aqil Wafi", SwingConstants.CENTER);
		label3.setToolTipText("Your FullName Identity");
		add(label3);
		
		label4 = new JLabel("05111940000089", SwingConstants.CENTER);
		label4.setToolTipText("Your NRP Identity");
		add(label4);
	}
}
