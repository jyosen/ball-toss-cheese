import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Panel;

import javax.swing.JFrame;
import javax.swing.JOptionPane;



/**
 * 
 * @author Zayd Moosajee, Jyotishka Sen, Ram Krishna
 *
 */
public class TossViewer 
{
	public static final String PIKL = "Pickle Man";
	public static final String TTN = "Turtonne";
	public static final String CMN = "C-Moon";
	public static final String WFL = "Waffle King";

	public static void main(String[] args)
	{
		
		JFrame frame = new JFrame("Ball_Toss");
		
		frame.setLayout(new FlowLayout());
		
		Button pickle = new Button(PIKL);
		Button turtle = new Button(TTN);
		Button moon = new Button(CMN);
		Button king = new Button(WFL;
		
		class ThrowerListener implements ActionListener
		{
			public void actionPerformed(ActionEvent event)
			{
				Thrower throw = new Thrower(event.getActionCommand());
			}	
		}	
		
		frame.setBounds(400, 400, 800, 600);
		
		JOptionPane pane = new JOptionPane("Choose a character");
		
		frame.add(pane);
		
		frame.add(pickle,0);
		frame.add(turtle,1);
		frame.add(moon,2);
		frame.add(king,3);
		
		
	
		
		frame.setVisible(true);
	}
	
	
	
	
	
}
