package projectJavaGUI2;

import java.awt.FlowLayout; // specifies how components are arranged
import javax.swing.JFrame; // provides basic window features
import javax.swing.JLabel; // displays text and images
import javax.swing.SwingConstants; // common constants used with Swing
import javax.swing.ImageIcon;
import java.awt.Image;

public class LabelFrame extends JFrame {
	
	private final JLabel label1; // JLabel with just text
	private final JLabel label2; // JLabel constructed with text and icon
	private final JLabel label3; // JLabel with added text and icon
	
	public LabelFrame() {
		super("Project Java GUI 12.5");
		setLayout(new FlowLayout());
		
		label1 = new JLabel("Kartu Mahasiswa",SwingConstants.CENTER);
		label1.setToolTipText("This is label1");
		add(label1);
		
		ImageIcon gambar = new ImageIcon(getClass().getResource( "PhotoProfil.jpg"));
		gambar = new ImageIcon(gambar.getImage().getScaledInstance(200, 280, Image.SCALE_DEFAULT));
		
		
	
		label3 = new JLabel(); // JLabel constructor no arguments
		label3.setText("Afifan Syafaqi Yahya");
		label3.setIcon(gambar); // add icon to JLabel
		label3.setHorizontalTextPosition(SwingConstants.CENTER);
		label3.setVerticalTextPosition(SwingConstants.BOTTOM);
		label3.setToolTipText("This is label3");
		add(label3);
		
		label2 = new JLabel("05111940000234",
		SwingConstants.CENTER);
		label2.setToolTipText("This is label2");	
		add(label2);
		
	}
		
}
