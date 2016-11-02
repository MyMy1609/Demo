/**
 * 
 */
package GitDemo;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * @author US
 *
 */
public class GuiDemo extends JFrame {
	public GuiDemo(){
		setSize(300,300);
		setLayout(new FlowLayout());
		for(int i=0;i<=20;i++){
			add(new JButton("B"+i));
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GuiDemo m=new GuiDemo();
		m.setDefaultCloseOperation(EXIT_ON_CLOSE);
		m.setVisible(true);
	}

}
