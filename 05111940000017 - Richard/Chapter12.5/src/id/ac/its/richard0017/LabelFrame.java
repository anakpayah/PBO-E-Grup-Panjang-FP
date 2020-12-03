package id.ac.its.richard0017;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class LabelFrame extends JFrame {

		private final JLabel label1;
		private final JLabel label2;
		private final JLabel label3;
		
		public LabelFrame() {
			super("Testing JLabel");
			
			setLayout(new FlowLayout());
			Icon fotosaya = new ImageIcon(getClass().getResource("bug1.png"));
			label1 = new JLabel();
			label1.setText("Inilah Richard Asmarakandi >_<");
			label1.setIcon(fotosaya);
			label1.setHorizontalTextPosition(SwingConstants.CENTER);
			label1.setVerticalTextPosition(SwingConstants.TOP);
			add(label1);
			
			Icon fotolabelnama = new ImageIcon(getClass().getResource("labelnama.png"));
			label2 = new JLabel();
			label2.setText("Richard Asmarakandi");
			label2.setIcon(fotolabelnama);
			label2.setHorizontalTextPosition(SwingConstants.RIGHT);
			label2.setVerticalTextPosition(SwingConstants.CENTER);
			add(label2);
			

			Icon fotolabelnrp = new ImageIcon(getClass().getResource("labelnrp.png"));
			label3 = new JLabel();
			label3.setText("05111940000017        ");
			label3.setIcon(fotolabelnrp);
			label3.setHorizontalTextPosition(SwingConstants.RIGHT);
			label3.setVerticalTextPosition(SwingConstants.CENTER);
			add(label3);
			
//			label2 = new JLabel("                                                        Nama : Richard Asmarakandi                                                        ");
//			add(label2);
//			label3 = new JLabel("NRP : 05111940000017");
//			label3.setVerticalTextPosition(SwingConstants.BOTTOM);
//			add(label3);
			
//			label1 = new JLabel("Ini Adalah Richard");
//			label1.setToolTipText("This is label1");
//			add(label1);
//			
//			Icon bug = new ImageIcon(getClass().getResource("bug1.png"));
//			label2 = new JLabel("Label with text and icon", bug,
//					SwingConstants.LEFT);
//			label2.setToolTipText("This is label2");
//			add(label2);
//
//			label3 = new JLabel();
//			label3.setText("Label with icon and text at bottom");
//			label3.setIcon(bug);
//			label3.setHorizontalTextPosition(SwingConstants.CENTER);
//			label3.setVerticalTextPosition(SwingConstants.BOTTOM);
//			label3.setToolTipText("This is label3");
//			add(label3);	
		}
}
