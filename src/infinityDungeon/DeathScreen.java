package infinityDungeon;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class DeathScreen extends JFrame implements ActionListener 
{


	
	
		
		JLabel Death = new JLabel ("Death");
		Font bigFont = new Font("Arial", Font.BOLD, 30);
		
	
	
		public DeathScreen()
		{
		setLayout(new BorderLayout());
		Death.setHorizontalAlignment(JLabel.CENTER);
	    Death.setVerticalAlignment(JLabel.CENTER);
		add(Death);
		JLabel Death = new JLabel ("Death");
		Font bigFont = new Font("Arial", Font.BOLD, 30);

		
		
		
		setSize(400, 350);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
		public static void dispRoom() 
		{
			
			
			DeathScreen DS = new DeathScreen();
			DS.setLocationRelativeTo(null);
			DS.setVisible(true);

		}
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
		}
}
