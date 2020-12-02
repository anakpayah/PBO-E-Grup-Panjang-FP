package id.ac.its.syafiq089;

import javax.swing.JOptionPane;

public class GUITest {

	public static void main(String[] args) {
		String radiusStr = JOptionPane.showInputDialog("Input Circle Radius");
		double radius = Double.parseDouble(radiusStr);
		
		Circle circle = new Circle("White", radius);
		
		JOptionPane.showMessageDialog(null, String.format("The Area of circle with %.2f radius is %.2f", circle.getRadius(), circle.getArea()), "Circle Area Operation Result",JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, String.format("The Perimeter of circle with %.2f radius is %.2f", circle.getRadius(), circle.getPerimeter()), "Circle Perimeter Operation Result",JOptionPane.INFORMATION_MESSAGE);
	}

}
