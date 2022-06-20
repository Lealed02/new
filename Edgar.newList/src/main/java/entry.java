import java.awt.*;
import java.awt.event.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.*;

public class entry {
	private final JFrame frame = new JFrame();
	private final JPanel content = new JPanel();
	private final JPanel side = new JPanel();
	private JButton button = new JButton();
	private Dimension bSize = new Dimension(50,50);
	private JMenuBar menuBar = new JMenuBar();
	private Icon icons[] = new Icon[5];
	
	public entry() {
		
		createGUI();
		showUI();
	}
	
	public void showUI() {
		 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setPreferredSize(null);
        //add
      
        //Display the window.
        frame.pack();
        frame.setVisible(true);
	}
	
	public void createGUI() {
		
		button.setPreferredSize(bSize);
		add();
		
		side.setPreferredSize(new Dimension(200, 1500));
		
		content.setLayout(new GridLayout(0,2));
		content.setPreferredSize(new Dimension(400,1500));
		content.setBackground(Color.RED);
		content.revalidate();
		setupMenu();
		
		
		frame.addComponentListener(new ComponentAdapter( ) {
			  public void componentResized(ComponentEvent ev) {
				  Resize();
			  }
			});
		
		frame.add(side, BorderLayout.WEST);
		frame.add(menuBar, BorderLayout.NORTH);
		frame.add(content, BorderLayout.CENTER);
		
	}
	
	public void Resize() {
		
		for (int i = 0; i < 5; i++) {
			
			int w = icons[i].getWidth();
			int h = icons[i].getHeight();
			ImageIcon imageIcon = new ImageIcon(new ImageIcon("game.png").getImage().getScaledInstance(w, h, Image.SCALE_DEFAULT));
			
			icons[i].setIcon(imageIcon);
		}
		
		
	}
	

	
	public void setupMenu() {
		 JMenu menuStart= new JMenu("Start");
		 JMenu menuEdit= new JMenu("Edit");
		 JMenu menuWindow= new JMenu("Window");
		 JMenu menuHelp= new JMenu("help");
		 
		 menuBar.add(menuStart);
		    menuBar.add(menuEdit);
		    menuBar.add(menuWindow);
		    menuBar.add(menuHelp);
	}
	
	public void add() {
		int i = 0;
		int m = 5;
		
		for (i = 0; i<m; i++) {
			//content.add(new JButton());
			icons[i] = new Icon();
			content.add(icons[i]);
		}
	}
	public static void main (String[] args) {
		new entry();
	}
}
