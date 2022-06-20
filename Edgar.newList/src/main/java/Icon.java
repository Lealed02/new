import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.*;

import javax.swing.*;

public class Icon extends JButton {
	public Icon() {
		this.setOpaque(true);
        this.setBackground(new Color(60, 140, 140));
        //this.setPreferredSize(new JButton().getPreferredSize());
        
        
        this.setFocusable(false);
        this.setRolloverEnabled(false);
        
        ImageIcon game = new ImageIcon("game.png");
     
        this.setPreferredSize(new Dimension(game.getIconHeight(), game.getIconWidth()));
        this.setIcon(game);
       
      
	}
}
