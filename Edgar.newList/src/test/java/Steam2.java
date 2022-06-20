import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Steam2 extends JPanel  {

	private JFrame frame = new JFrame();
	private JPanel focus = new JPanel();
	private JPanel sideBar = new JPanel();
	
	private Icon[] icon = new Icon[10];
	private JMenuBar HMenuBar = new JMenuBar();
	private JMenuBar LMenuBar = new JMenuBar();
	private Dimension minSize = new Dimension(1000,600);
	
	public void setupBorders() {
		BorderLayout std = new BorderLayout();
		
		focus.setBorder(BorderFactory.createEmptyBorder());
		
		sideBar.setBorder(BorderFactory.createEmptyBorder());
		LMenuBar.setBorder(BorderFactory.createRaisedBevelBorder());
		HMenuBar.setBorder(BorderFactory.createEmptyBorder());
		

		
	}
	
	
	
public void createGUI() {
		
	setupLMenu();
	setupHMenu();
	setupSide();
	setupFocus();
	setupBorders();
	
	frame.add(focus, BorderLayout.CENTER);
	frame.add(sideBar, BorderLayout.WEST);
	frame.add(HMenuBar, BorderLayout.NORTH);
	frame.setJMenuBar(LMenuBar);
	
	frame.setMinimumSize(minSize);

	}




	


	public void setupSide() {
		
		@SuppressWarnings("unused")
		Dimension size = new Dimension(250, 75);
		iHome = new ImageIcon(new ImageIcon("home.png").getImage().getScaledInstance(210, 32, Image.SCALE_DEFAULT));
		
		FlowLayout fl = new FlowLayout(FlowLayout.LEADING);
		
        		
		JPanel top = new JPanel();
		top.setLayout(new BorderLayout());
		JPanel homePanel = new JPanel();
		JPanel search = new JPanel();
		
		//top.setMinimumSize(size);
		//top.setPreferredSize(size);
		homePanel.setLayout(fl);
		homePanel.setBackground(new Color(29,39,52,255));
		
		JLabel hme = new JLabel();
		hme.setIcon(iHome);
		
		JLabel collections = new JLabel();
		collections.setIcon(iCollections);
		
		
		
		
       
		homePanel.add(hme);
		homePanel.add(collections);
		
		Button button = new Button("Hi");
		button.setUI(new StyledButtonUI());
		search.add(button);
		
		search.setBackground(new Color(36,40,47,255));
		
		top.add(homePanel, BorderLayout.NORTH);
		top.add(search, BorderLayout.CENTER);
		
   
		
		//BoxLayout sBox = new BoxLayout(sideBar, BoxLayout.Y_AXIS);
		BorderLayout sBdr = new BorderLayout();
		sideBar.setLayout(sBdr);
		sideBar.add(top, BorderLayout.NORTH);
		
		sideBar.setBackground(new Color(36,40,47,255));
		//sideBar.setBorder(BorderFactory.createRaisedBevelBorder());
		
		
	}
	
	
	public void setupFocus() {
		focus.setBackground(new Color(56,60,75,255));
	//	focus.setBorder(BorderFactory.createRaisedBevelBorder());
	}
	
	public void setupLMenu() {
		JMenu steam= new JMenu("<html><font color='white'>Steam</font></html>");
		JMenu view= new JMenu("<html><font color='white'>View</font></html>");
		JMenu friends = new JMenu("<html><font color='white'>Friends</font></html>");
		
		
		
		LMenuBar.add(steam);
		LMenuBar.add(view);
		LMenuBar.add(friends);
		
		LMenuBar.setForeground(Color.WHITE);
		
		LMenuBar.setBackground(new Color(29,39,52,255));
	//	LMenuBar.setBorder(BorderFactory.createRaisedBevelBorder());
	}

	public void setupHMenu() {
		
		
		
		 Font big = new Font("FF Din OT Bold", Font.PLAIN, 20);
		
		
		 JMenu menuStart= new JMenu("<html><font color='white'>STORE</font></html>");
		 JMenu menuEdit= new JMenu("<html><font color='white'>LIBRARY</font></html>");
		 JMenu menuWindow= new JMenu("<html><font color='white'>COMMUNITY</font></html>");
		 JMenu menuHelp= new JMenu("<html><font color='white'>PUT THE BUTTER...</font></html>");
		 JMenu menuBack = new JMenu();
		 JMenu menuFront = new JMenu();
		 
		 menuEdit.setFont(big);
		 menuStart.setFont(big);
		 menuWindow.setFont(big);
		 menuHelp.setFont(big);
		 
		 
		 menuBack.setIcon(ALeft);
		 menuFront.setIcon(ARight);
		 
		 
		 	HMenuBar.add(menuBack);
		 	HMenuBar.add(menuFront);
		    HMenuBar.add(menuStart);
		    HMenuBar.add(menuEdit);
		    HMenuBar.add(menuWindow);
		    HMenuBar.add(menuHelp);
		    
		    
		    HMenuBar.setBackground(new Color(29,39,52,255));
		    HMenuBar.setBorder(BorderFactory.createRaisedBevelBorder());
		    
		    
	}
	
	
	
	public void display() {
	     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        //frame.setPreferredSize(null);
	        //add
	      
	        //Display the window.
	        frame.pack();
	        frame.setVisible(true);
	        
	        System.out.println();
	       
	}
	
	public Steam2() {
		
		createGUI();
		display();
		
	}
	
	public static void main(String[] args) { 
		
		new Steam2();
	}
	
	
	


	private ImageIcon ALeft = new ImageIcon("left.png");
	private ImageIcon ARight = new ImageIcon("right.png");
	private ImageIcon iHome = new ImageIcon("home.png");
	private ImageIcon iSort = new ImageIcon("sort.png");
	private ImageIcon iReady = new ImageIcon("ready.png");
	private ImageIcon iCollections = new ImageIcon("collections.png");
}


