package id.ac.its.syafiq089;

import java.awt.FlowLayout;
import java.awt.Image;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.Icon;
import javax.swing.ImageIcon;


public class LabelFrame extends JFrame {
	private final JLabel label1;
	private final JLabel label2;
	private final JLabel label3;
	private final JLabel label4;
	
	public LabelFrame() {
		super("Testing JLabel");
		setLayout(new FlowLayout());
		
		label1 = new JLabel("Kartu Mahasiswa ITS", SwingConstants.CENTER);
		label1.setToolTipText("This is label1");
		add(label1);
		
		ImageIcon profile = new ImageIcon(getClass().getResource("NanoDev.png"));
		profile = new ImageIcon(profile.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT));
		
		label2 = new JLabel(profile, SwingConstants.CENTER);
		label2.setToolTipText("This is label2");
		add(label2);
		
//		label3 = new JLabel();
//		label3.setText("Label with icon and text at bottom");
//		label3.setIcon(profile);
//		label3.setHorizontalTextPosition(SwingConstants.CENTER);
//		label3.setVerticalTextPosition(SwingConstants.BOTTOM);
//		label3.setToolTipText("This is label3");
//		label3.setToolTipText("This is label2");
//		add(label3);
		
		label3 = new JLabel("Ahmad Syafiq Aqil Wafi", SwingConstants.CENTER);
		label3.setToolTipText("This is label3");
		add(label3);
		
		label4 = new JLabel("05111940000089", SwingConstants.CENTER);
		label4.setToolTipText("This is label4");
		add(label4);
	}
}
