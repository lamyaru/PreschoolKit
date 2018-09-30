import javax.swing.JFrame;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.event.*;
import java.io.File;


public class frameA extends JFrame implements ActionListener
{

	help help = new help();
	numbers numbers = new numbers();
	alphabets alphabets = new alphabets();
	colors colors = new colors();
	shapes shapes = new shapes();
	progress progress = new progress();
	AudioClip music;
	public static int scoreN,scoreA, scoreC, scoreS;
	public frameA(){
		 File wavMusic = new File("music1.wav");
		try{music = Applet.newAudioClip(wavMusic.toURL());}
	    catch(Exception e){e.printStackTrace();}
	
		JLabel background = new JLabel(new ImageIcon("newbg(1).png"));
		JButton b1 =new JButton(" ");
    	JButton b2 =new JButton("  ");
    	JButton b3 =new JButton("   ");
    	JButton b4 =new JButton("    ");
    	JButton b5 =new JButton("");
    	JButton b6 =new JButton("     ");
    	JButton b7 =new JButton("      ");
    	JButton b8 =new JButton("       ");
    	
    	b1.setToolTipText("NUMBERS");
    	b2.setToolTipText("ALPHABETS");
    	b3.setToolTipText("COLORS");
    	b4.setToolTipText("SHAPES");
    	b5.setToolTipText("HELP");
    	b6.setToolTipText("PROGRESS IN QUIZES");
    	b7.setToolTipText("MUTE");
    	
    	b1.setBounds(780,320,200,200);
    	b2.setBounds(540,320,200,200);
    	b3.setBounds(280,320,200,200);
    	b4.setBounds(50,320,200,200);
    	b5.setBounds(940,1,55,65);
    	b6.setBounds(0,10,150,50);
    	b7.setBounds(950,70,80,50);
    	b8.setBounds(950,120,80,50);
    
    	b1.setBorderPainted(false);	
    	b2.setBorderPainted(false);
    	b3.setBorderPainted(false);
    	b4.setBorderPainted(false);
    	b5.setBorderPainted(false);
    	b6.setBorderPainted(false);
    	b7.setBorderPainted(false);
    	b8.setBorderPainted(false);
    	
		add(background);
		background.add(b1);
		background.add(b2);
		background.add(b3);
		background.add(b4);
		background.add(b5);
		background.add(b6);
		background.add(b7);
		background.add(b8);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);}
	public void actionPerformed(ActionEvent ae){
		String s = ae.getActionCommand();	

		if(s.equals(" "))
		{numbers.pack();
	    numbers.setLocationRelativeTo(null);
		numbers.setVisible(true);
    	numbers.setSize(500,500);}
		
		else if(s.equals("  "))
		{alphabets.pack();
	    alphabets.setLocationRelativeTo(null);
		alphabets.setVisible(true);
    	alphabets.setSize(500,500);}
		
		else if(s.equals("   "))
		{colors.pack();
		colors.setLocationRelativeTo(null);
		colors.setVisible(true);
    	colors.setSize(500,500);}
		
		else if(s.equals("    "))
		{shapes.pack();
		shapes.setLocationRelativeTo(null);
		shapes.setVisible(true);
    	shapes.setSize(500,500);}
		else if(s.equals(""))
		{help.pack();
	    help.setLocationRelativeTo(null);
		help.setVisible(true);
    	help.setTitle("HELP");
    	help.setSize(400,200);}
		else if(s.equals("     "))
		{progress.pack();
	    progress.setLocationRelativeTo(null);
		progress.setVisible(true);
    	progress.setTitle("My Progress");
    	progress.setSize(600,300);}
		
		else if(s.equals("      "))
		{music.stop();}
		
		else if(s.equals("       "))
		{music.loop();}
		else
			System.exit(0);
			}


//=========================================================	
public class help extends JFrame implements ActionListener {
		
		public help(){
	
		setUndecorated(true);
		ImageIcon image = new ImageIcon("bg2.jpg");
		JLabel l1 = new JLabel("How to Use Preschool Essentials");
		JLabel background = new JLabel(image);
		JButton b1 = new JButton("Got It!");
		
		JTextArea textArea = new JTextArea(4,25);
		textArea.setText("      Click one of the pictures in the bottom to\n"
				+ "              start, they represent:\n\n      SHAPES ,COLORS , ALPHABATICS , NUMBERS");
		textArea.setOpaque(false);
		textArea.setEditable(false);
		
		
		Font sty1 = new Font("Chalkduster",Font.BOLD,20);
		Font sty2 = new Font("Casual",Font.PLAIN,15);
		
		l1.setFont(sty1);
		l1.setBounds(15,15,400,50);
		b1.setBounds(160,140,70,30);
	    textArea.setBounds(20, 60, 350, 60);
	    textArea.setFont(sty2);
	    textArea.setForeground(Color.DARK_GRAY);
	    
		add(background);
		background.add(l1);
		background.add(b1);	
		background.add(textArea);	
	
		b1.addActionListener(this);}
		
	public void actionPerformed(ActionEvent ae)
	{ String s = ae.getActionCommand();	
	  if(s.equals("Got It!"))
	   {help.setVisible(false);}}
	}

//===========================================
public class numbers extends JFrame implements ActionListener {
	learn learn = new learn();
	quiz quiz = new quiz();
	
	JComboBox cb;
	
public numbers(){
	setUndecorated(true);
	JLabel background = new JLabel(new ImageIcon("fbg1.png"));
	JLabel l1 = new JLabel("Numbers");
	JLabel l2 = new JLabel("Choose an Activity:");
	JButton b1 =new JButton("GO!");
	JButton b2 =new JButton("BACK");
	String[] activities = { "------","Learn Numbers","Take a Quiz"};
	cb = new JComboBox(activities);
	cb.setSelectedIndex(0);
	cb.setEditable(false);
	
	Font sty1 = new Font("Chalkduster",Font.BOLD,30);
	Font sty2 = new Font("Casual",Font.PLAIN,20);
	
	l1.setFont(sty1);
	l2.setFont(sty2);
	b1.setFont(sty2);
	b2.setFont(sty2);
	l1.setForeground(Color.WHITE);
	l2.setForeground(Color.WHITE);
	b1.setForeground(Color.WHITE);
	b2.setForeground(Color.DARK_GRAY);
	
	l1.setBounds(180,80,200,50);
	l2.setBounds(80,190,200,50);
	b1.setBounds(70,330,350,50);
	b2.setBounds(100,450,100,50);
	cb.setBounds(130,230,200,70);
	
	b1.setBorderPainted(false);	
	b2.setBorderPainted(false);
	
	b1.setToolTipText("Takes you to the activity you chose");
	b2.setToolTipText("Go back to main menu");
	
	add(background);
	background.add(l1);
	background.add(l2);
	background.add(b1);
	background.add(b2);
	background.add(cb);
	
	b1.addActionListener(this);
	b2.addActionListener(this);
}

public void actionPerformed(ActionEvent ae)
{ String s = ae.getActionCommand();	
  String s2= (String)cb.getSelectedItem();

       
       if(s.equals("BACK"))
       {numbers.setVisible(false);}
     
       else if(s.equals("GO!"))
       {
       if(s2.equals("Learn Numbers"))
       {learn.pack();
   	    learn.setLocationRelativeTo(null);
   		learn.setVisible(true);
   		learn.setTitle("learn");
       	learn.setSize(500,500);  }
       else if(s2.equals("Take a Quiz"))
       {quiz.pack();
    	quiz.setLocationRelativeTo(null);
    	quiz.setVisible(true);
    	quiz.setTitle("quiz");
    	quiz.setSize(1000,500);
    	quiz.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);}
      
       else if(s2.equals("------"))
       {JOptionPane.showMessageDialog(numbers, "Please Select an Activity first","Opps!", JOptionPane.ERROR_MESSAGE); }
       else 
    	   System.exit(0);
       }
    
}
//====
public class learn extends JFrame implements ActionListener {
	 AudioClip sound1,sound2,sound3,sound4,sound5,sound6,sound7,sound8,sound9,sound10;
	public learn(){
	JLabel background = new JLabel(new ImageIcon("bgg.png"));
	JButton b1 = new JButton(" ");
	JButton b2 = new JButton("  ");
	JButton b3 = new JButton("   ");
	JButton b4 = new JButton("    ");
	JButton b5 = new JButton("     ");
	JButton b6 = new JButton("      ");
	JButton b7 = new JButton("       ");
	JButton b8 = new JButton("        ");
	JButton b9 = new JButton("         ");
	JButton b10 =new JButton("          ");
	
	JLabel l1 = new JLabel("One");
	JLabel l2 = new JLabel("Two");
	JLabel l3 = new JLabel("Three");
	JLabel l4 = new JLabel("Four");
	JLabel l5 = new JLabel("Five");
	JLabel l6 = new JLabel("Six");
	JLabel l7 = new JLabel("Seven");
	JLabel l8 = new JLabel("Eight");
	JLabel l9 = new JLabel("Nine");
	JLabel l10 = new JLabel("Ten");
	
	b1.setToolTipText("Plays Number 1 Sound");
	b2.setToolTipText("Plays Number 2 Sound");
	b3.setToolTipText("Plays Number 3 Sound");
	b4.setToolTipText("Plays Number 4 Sound");
	b5.setToolTipText("Plays Number 5 Sound");
	b6.setToolTipText("Plays Number 6 Sound");
	b7.setToolTipText("Plays Number 7 Sound");
	b8.setToolTipText("Plays Number 8 Sound");
	b9.setToolTipText("Plays Number 9 Sound");
	b10.setToolTipText("Plays Number 10 Sound");
	
	Font sty1 = new Font("Chalkduster",Font.BOLD,70);
	l1.setFont(sty1);
	l2.setFont(sty1);
	l3.setFont(sty1);
	l4.setFont(sty1);
	l5.setFont(sty1);
	l6.setFont(sty1);
	l7.setFont(sty1);
	l8.setFont(sty1);
	l9.setFont(sty1);
	l10.setFont(sty1);
	
  JScrollPane pane = new JScrollPane(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
	setPreferredSize(new Dimension(499, 5000));
	
	b1.setBorderPainted(false);
	b2.setBorderPainted(false);
	b3.setBorderPainted(false);
	b4.setBorderPainted(false);
	b5.setBorderPainted(false);
	b6.setBorderPainted(false);
	b7.setBorderPainted(false);
	b8.setBorderPainted(false);
	b9.setBorderPainted(false);
	b10.setBorderPainted(false);
	
	b1.setBounds(200,385, 80, 80);
	b2.setBounds(200,910, 80, 80);
	b3.setBounds(200,1415, 80, 80);
	b4.setBounds(200,1920, 80, 80);
	b5.setBounds(200,2425, 80, 80);
	b6.setBounds(200,2930, 80, 80);
	b7.setBounds(200,3435, 80, 80);
	b8.setBounds(200,3940, 80, 80);
	b9.setBounds(200,4445, 80, 80);
	b10.setBounds(200,4915, 80, 80);
	
	l1.setBounds(180,270,400,80);
	l2.setBounds(170,795,400,80);
	l3.setBounds(150,1300,400,80);
	l4.setBounds(160,1805,400,80);
	l5.setBounds(160,2310,400,80);
	l6.setBounds(190,2815,400,80);
	l7.setBounds(150,3320,400,80);
	l8.setBounds(150,3805,400,90);
	l9.setBounds(160,4325,400,80);
	l10.setBounds(180,4800,400,80);
	
	  add(pane);
     pane.add(background);
	  pane.setViewportView(background);
	  background.add(b1);
	  background.add(b2);
	  background.add(b3);
	  background.add(b4);
	  background.add(b5);
	  background.add(b6);
	  background.add(b7);
	  background.add(b8);
	  background.add(b9);
	  background.add(b10);
	  background.add(l1);
	  background.add(l2);
	  background.add(l3);
	  background.add(l4);
	  background.add(l5);
	  background.add(l6);
	  background.add(l7);
	  background.add(l8);
	  background.add(l9);
	  background.add(l10);
	  
	  b1.addActionListener(this);
	  b2.addActionListener(this);
	  b3.addActionListener(this);
	  b4.addActionListener(this);
	  b5.addActionListener(this);
	  b6.addActionListener(this);
	  b7.addActionListener(this);
	  b8.addActionListener(this);
	  b9.addActionListener(this);
	  b10.addActionListener(this);
	  
	 File wavFile1 = new File("1.wav");
	 File wavFile2 = new File("2.wav");
     File wavFile3 = new File("3.wav");
     File wavFile4 = new File("4.wav");
	 File wavFile5 = new File("5.wav");
     File wavFile6 = new File("6.wav");
     File wavFile7 = new File("7.wav");
	 File wavFile8 = new File("8.wav");
     File wavFile9 = new File("9.wav");
     File wavFile10 = new File("10.wav");
    
		  try{sound1 = Applet.newAudioClip(wavFile1.toURL());
		      sound2 = Applet.newAudioClip(wavFile2.toURL());
		      sound3 = Applet.newAudioClip(wavFile3.toURL());
		      sound4 = Applet.newAudioClip(wavFile4.toURL());
		      sound5 = Applet.newAudioClip(wavFile5.toURL());
		      sound6 = Applet.newAudioClip(wavFile6.toURL());
		      sound7 = Applet.newAudioClip(wavFile7.toURL());
		      sound8 = Applet.newAudioClip(wavFile8.toURL());
		      sound9 = Applet.newAudioClip(wavFile9.toURL());
		      sound10 = Applet.newAudioClip(wavFile10.toURL());}
		    catch(Exception e){e.printStackTrace();}}
	
	
	      

  
       

	
public void actionPerformed(ActionEvent ae){
		String s = ae.getActionCommand();
		
		if(s.equals(" "))
		{sound1.play();}
		else if(s.equals("  "))
		{sound2.play();}
		else if(s.equals("   "))
		{sound3.play();}
		else if(s.equals("    "))
		{sound4.play();}
		else if(s.equals("     "))
		{sound5.play();}
		else if(s.equals("      "))
		{sound6.play();}
		else if(s.equals("       "))
		{sound7.play();}
		else if(s.equals("        "))
		{sound8.play();}
		else if(s.equals("         "))
		{sound9.play();}
		else if(s.equals("          "))
		{sound10.play();}
		
	}
}

//=====
public class quiz extends JFrame implements ActionListener{
	JTextField t1,t2,t3,t4,t5,t6;
	JTextArea ta2,ta3;
	AudioClip cheer,ops;
	public quiz(){
	JLabel background = new JLabel(new ImageIcon("TAG(1).png"));
	JLabel l1 = new JLabel("Numbers Quiz");
	JLabel l2 = new JLabel("Score");
	JLabel l3 = new JLabel("Enter the number:");
	JTextArea ta1 = new JTextArea("How many apples\nare there?");
    ta2 = new JTextArea();
    ta3 = new JTextArea();
    JButton b1 = new JButton("Submit!");
	JButton b2 = new JButton("Clear");
	t1 = new JTextField(10);
    t2 = new JTextField(10);
	t3 = new JTextField(10);
    t4 = new JTextField(10);
    t5 = new JTextField(10);
	t6 = new JTextField(1);
	
	
	Font sty1 = new Font("Chalkduster",Font.BOLD,30);
	Font sty2 = new Font("Casual",Font.PLAIN,25);
	Font sty3 = new Font("Chalkduster",Font.PLAIN,15);
	Font sty4 = new Font("Casual",Font.PLAIN,35);
	Font sty5 = new Font("Chalkduster",Font.PLAIN,50);
	
	l1.setFont(sty3);
	l2.setFont(sty1);
	b1.setFont(sty4);
	b2.setFont(sty2);
	ta3.setFont(sty5);
	b1.setForeground(Color.WHITE);
	b2.setForeground(Color.WHITE);
	l1.setForeground(Color.WHITE);
	ta3.setForeground(Color.RED);
	
	b1.setBorderPainted(false);	
	b2.setBorderPainted(false);
	ta1.setOpaque(false);
	ta1.setEditable(false);
	ta2.setOpaque(false);
	ta2.setEditable(false);
	ta3.setOpaque(false);
	ta3.setEditable(false);
	
	
	l1.setBounds(290,30,250,50);
	l2.setBounds(850,110,200,50);
	l3.setBounds(280,200,200,30);
	ta1.setBounds(40,200,110,50);
	ta2.setBounds(820,150,200,50);
	ta3.setBounds(850,210,200,50);
	b1.setBounds(790,380,200,50);
	b2.setBounds(750,435,200,50);
	t1.setBounds(190,210,30,30);
	t2.setBounds(435,210,30,30);
	t3.setBounds(570,210,30,30);
	t4.setBounds(180,435,30,30);
	t5.setBounds(470,435,30,30);
	
	
	add(background);
	background.add(l1);
	background.add(l2);
	background.add(l3);
	background.add(ta1);
	background.add(ta2);
	background.add(ta3);
	background.add(b1);
	background.add(b2);
    background.add(t1);
	background.add(t2);
	background.add(t3);
	background.add(t4);
	background.add(t5);

	
	b1.addActionListener(this);
	b2.addActionListener(this);
	
	File wavCheer= new File("c1.wav");
	File wavOps= new File("o1.wav");
	try{
	cheer = Applet.newAudioClip(wavCheer.toURL());
	ops = Applet.newAudioClip(wavOps.toURL());}
    catch(Exception e){e.printStackTrace();}}

	public void actionPerformed(ActionEvent ae){
		    String s = ae.getActionCommand();
		    String ans1 = t1.getText();
			String ans2 = t2.getText();
			String ans3 = t3.getText();
			String ans4 = t4.getText();
			String ans5 = t5.getText();
		
		if(s.equals("Submit!")){
             scoreN=0;
				if(ans1.equals("2")||ans1.equalsIgnoreCase("two"))
			      scoreN++;
			        if(ans2.equals("6")||ans2.equalsIgnoreCase("six"))
			    	scoreN++;
			         if(ans3.equals("2")||ans3.equalsIgnoreCase("two"))
			    	scoreN++;
			           if(ans4.equals("4")||ans4.equalsIgnoreCase("four"))
			    	scoreN++;
			              if(ans5.equals("5")||ans5.equalsIgnoreCase("five"))
			    	scoreN++;
			              
			    
			
			{if(scoreN>=3)
				{ta2.setText("CONGRATULATIONS!!\nyour score is:");
				cheer.play();}
			 if(scoreN<3)
			{ta2.setText("Oh no :(\n try again you can do it\nyour score is:" );
			ops.play();}}
	 StringBuilder sb = new StringBuilder();
	 sb.append(scoreN);
	 String score = sb.toString();
	 ta3.setText(score);}
		
		else if(s.equals("Clear")){
			t1.setText("");
			t2.setText("");
			t3.setText("");
			t4.setText("");
			t5.setText("");
			ta2.setText("");
			ta3.setText("");
			scoreN=0;
		}

 	} 	
}

}
//============================================
public class alphabets extends JFrame implements ActionListener
{
   learn learn = new learn();
   quiz quiz = new quiz();
  
   JComboBox cb;
   
 public alphabets(){
     setUndecorated(true);
     JLabel background = new JLabel(new ImageIcon("alph.png"));
     JLabel l1 = new JLabel("Alphabets");
     JLabel l2 = new JLabel("Choose an Activity:");
     JButton b1 =new JButton("GO!");
     JButton b2 =new JButton("BACK");
     String[] activities = { "------","Learn Alphabets", "Take a Quiz"};


     cb = new JComboBox(activities);
     cb.setSelectedIndex(0);
     cb.setEditable(false);

    Font sty1 = new Font("Chalkduster",Font.BOLD,30);
    Font sty2 = new Font("Casual",Font.PLAIN,20);

     l1.setFont(sty1);
     l2.setFont(sty2);
     b1.setFont(sty2);
     b2.setFont(sty2);
     l1.setForeground(Color.WHITE);
     l2.setForeground(Color.WHITE);
     b1.setForeground(Color.WHITE);
     b2.setForeground(Color.DARK_GRAY);

     l1.setBounds(160,80,200,50);
     l2.setBounds(75,200,200,50);
     b1.setBounds(70,340,350,50);
     b2.setBounds(100,450,100,50);
     cb.setBounds(130,240,200,70);

     b1.setBorderPainted(false);	
     b2.setBorderPainted(false);

     b1.setToolTipText("Takes you to the activity you chose");
     b2.setToolTipText("Go back to main menu");

     add(background);
     background.add(l1);
     background.add(l2);
     background.add(b1);
     background.add(b2);
     background.add(cb);

     b1.addActionListener(this);
     b2.addActionListener(this);
}

public void actionPerformed(ActionEvent ae)

     { String s = ae.getActionCommand();	
       String s2= (String)cb.getSelectedItem();

      if(s.equals("BACK"))
          {alphabets.setVisible(false);}
      
      else if(s.equals("GO!"))
          {
             if(s2.equals("Learn Alphabets"))
                {learn.pack();
	             learn.setLocationRelativeTo(null);
		         learn.setVisible(true);
		         learn.setTitle("learn");
   	            learn.setSize(520,510);  }
             
             else if(s2.equals("Take a Quiz"))
               {quiz.pack();
               	quiz.setLocationRelativeTo(null);
              	quiz.setVisible(true);
	            quiz.setTitle("quiz");
	            quiz.setSize(1000,500);
	            quiz.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);}
             
             
             
            else if(s2.equals("------"))
               {JOptionPane.showMessageDialog(alphabets, "Please Select an Activity first","Opps!", JOptionPane.ERROR_MESSAGE); }
   else 
	   System.exit(0);
   }
}

public class learn extends JFrame implements ActionListener{ 
	 AudioClip sounda,soundb,soundc,soundd,sounde,soundf,soundg,soundh,soundi,soundj,soundk,soundl,soundm,
	 soundn,soundo,soundp,soundq,soundr,sounds,soundt,soundu,soundv,soundw,soundx,soundy,soundz;
	public learn(){
	JLabel background = new JLabel(new ImageIcon("alpha.png"));
	JButton ba = new JButton(" ");
	JButton bb = new JButton("  ");
	JButton bc = new JButton("   ");
	JButton bd = new JButton("    ");
	JButton be = new JButton("     ");
	JButton bf = new JButton("      ");
	JButton bg = new JButton("       ");
	JButton bh = new JButton("        ");
	JButton bi = new JButton("         ");
	JButton bj = new JButton("          ");
	JButton bk = new JButton("           ");
	JButton bl = new JButton("            ");
	JButton bm = new JButton("             ");
	JButton bn = new JButton("              ");
	JButton bo = new JButton("               ");
	JButton bp = new JButton("                ");
	JButton bq = new JButton("                 ");
	JButton br = new JButton("                  ");
	JButton bs = new JButton("                   ");
	JButton bt = new JButton("                    ");
	JButton bu = new JButton("                     ");
	JButton bv = new JButton("                      ");
	JButton bw = new JButton("                       ");
	JButton bx = new JButton("                        ");
	JButton by = new JButton("                         ");
	JButton bz = new JButton("                          ");
	
	JLabel la = new JLabel("Apple");
	JLabel lb = new JLabel("Bee");
	JLabel lc = new JLabel("Cat");
	JLabel ld = new JLabel("Dog");
	JLabel le = new JLabel("Egg");
	JLabel lf = new JLabel("Flower");
	JLabel lg = new JLabel("Grape");
	JLabel lh = new JLabel("Hat");
	JLabel li = new JLabel("Igloo");
	JLabel lj = new JLabel("Juice");
	JLabel lk = new JLabel("King");
	JLabel ll = new JLabel("Lion");
	JLabel lm = new JLabel("Moon");
	JLabel ln = new JLabel("Nose");
	JLabel lo = new JLabel("Owl");
	JLabel lp = new JLabel("Penguin");
	JLabel lq = new JLabel("Queen");
	JLabel lr = new JLabel("Rainbow");
	JLabel ls = new JLabel("Star");
	JLabel lt = new JLabel("Tree");
	JLabel lu = new JLabel("Umbrella");
	JLabel lv = new JLabel("Volcano");
	JLabel lw = new JLabel("Watermelon");
	JLabel lx = new JLabel("X-ray");
	JLabel ly = new JLabel("Yo-yo");
	JLabel lz = new JLabel("Zebra");
	
	ba.setToolTipText("Plays Letter A Sound");
	bb.setToolTipText("Plays Letter B  Sound");
	bc.setToolTipText("Plays Letter C  Sound");
	bd.setToolTipText("Plays Letter D  Sound");
	be.setToolTipText("Plays Letter E Sound");
	bf.setToolTipText("Plays Letter F  Sound");
	bg.setToolTipText("Plays Letter G  Sound");
	bh.setToolTipText("Plays Letter H  Sound");
	bi.setToolTipText("Plays Letter I  Sound");
	bj.setToolTipText("Plays Letter J  Sound");
	bk.setToolTipText("Plays Letter K Sound");
	bl.setToolTipText("Plays Letter L  Sound");
	bm.setToolTipText("Plays Letter M  Sound");
	bn.setToolTipText("Plays Letter N  Sound");
	bo.setToolTipText("Plays Letter O Sound");
	bp.setToolTipText("Plays Letter P  Sound");
	bq.setToolTipText("Plays Letter Q  Sound");
	br.setToolTipText("Plays Letter R  Sound");
	bs.setToolTipText("Plays Letter S  Sound");
	bt.setToolTipText("Plays Letter T  Sound");
	bu.setToolTipText("Plays Letter U  Sound");
	bv.setToolTipText("Plays Letter V  Sound");
	bw.setToolTipText("Plays Letter W  Sound");
	bx.setToolTipText("Plays Letter X  Sound");
	by.setToolTipText("Plays Letter Y  Sound");
	bz.setToolTipText("Plays Letter Z  Sound");

	
	Font sty1 = new Font("Times New Roman",Font.BOLD,120);
	Font sty2 = new Font("Times New Roman",Font.BOLD,100);
	Font sty3 = new Font("Times New Roman",Font.BOLD,90);
	Font sty4 = new Font("Times New Roman",Font.BOLD,70);
	la.setFont(sty1);
	lb.setFont(sty1);
	lc.setFont(sty1);
	ld.setFont(sty1);
	le.setFont(sty1);
	lf.setFont(sty1);
	lg.setFont(sty1);
	lh.setFont(sty1);
	li.setFont(sty1);
	lj.setFont(sty1);
	lk.setFont(sty1);
	ll.setFont(sty1);
	lm.setFont(sty1);
	ln.setFont(sty1);
	lo.setFont(sty1);
	lp.setFont(sty2);
	lq.setFont(sty1);
	lr.setFont(sty2);
	ls.setFont(sty1);
	lt.setFont(sty1);
	lu.setFont(sty3);
	lv.setFont(sty2);
	lw.setFont(sty4);
	lx.setFont(sty1);
	ly.setFont(sty1);
	lz.setFont(sty1);
	
	la.setForeground(Color.DARK_GRAY);
	lb.setForeground(Color.DARK_GRAY);
	lc.setForeground(Color.DARK_GRAY);
	ld.setForeground(Color.DARK_GRAY);
	le.setForeground(Color.DARK_GRAY);
	lf.setForeground(Color.DARK_GRAY);
	lg.setForeground(Color.DARK_GRAY);
	lh.setForeground(Color.DARK_GRAY);
	li.setForeground(Color.DARK_GRAY);
	lj.setForeground(Color.DARK_GRAY);
	lk.setForeground(Color.DARK_GRAY);
	ll.setForeground(Color.DARK_GRAY);
	lm.setForeground(Color.DARK_GRAY);
	ln.setForeground(Color.DARK_GRAY);
	lo.setForeground(Color.DARK_GRAY);
	lp.setForeground(Color.DARK_GRAY);
	lq.setForeground(Color.DARK_GRAY);
	lr.setForeground(Color.DARK_GRAY);
	ls.setForeground(Color.DARK_GRAY);
	lt.setForeground(Color.DARK_GRAY);
	lu.setForeground(Color.DARK_GRAY);
	lv.setForeground(Color.DARK_GRAY);
	lw.setForeground(Color.DARK_GRAY);
	lx.setForeground(Color.DARK_GRAY);
	ly.setForeground(Color.DARK_GRAY);
	lz.setForeground(Color.DARK_GRAY);

	
	
   JScrollPane pane = new JScrollPane(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
	setPreferredSize(new Dimension(499, 13000));
	
	ba.setBorderPainted(false);
	bb.setBorderPainted(false);
	bc.setBorderPainted(false);
	bd.setBorderPainted(false);
	be.setBorderPainted(false);
	bf.setBorderPainted(false);
	bg.setBorderPainted(false);
	bh.setBorderPainted(false);
	bi.setBorderPainted(false);
	bj.setBorderPainted(false);
	bk.setBorderPainted(false);
	bl.setBorderPainted(false);
	bm.setBorderPainted(false);
	bn.setBorderPainted(false);
	bo.setBorderPainted(false);
	bp.setBorderPainted(false);
	bq.setBorderPainted(false);
	br.setBorderPainted(false);
	bs.setBorderPainted(false);
	bt.setBorderPainted(false);
	bu.setBorderPainted(false);
	bv.setBorderPainted(false);
	bw.setBorderPainted(false);
	bx.setBorderPainted(false);
	by.setBorderPainted(false);
	bz.setBorderPainted(false);
	
	
	ba.setBounds(200,340, 120, 120);
	bb.setBounds(200,840, 120, 120);
	bc.setBounds(200,1340, 120, 120);
	bd.setBounds(200,1840, 120, 120);
	be.setBounds(200,2340, 120, 120);
	bf.setBounds(200,2840, 120, 120);
	bg.setBounds(200,3340, 120, 120);
	bh.setBounds(200,3840, 120, 120);
	bi.setBounds(200,4340, 120, 120);
	bj.setBounds(200,4840, 120, 120);
	bk.setBounds(200,5340, 120, 120);
	bl.setBounds(200,5840, 120, 120);
	bm.setBounds(200,6340, 120, 120);
	bn.setBounds(200,6840, 120, 120);
	bo.setBounds(200,7340, 120, 120);
	bp.setBounds(200,7840, 120, 120);
	bq.setBounds(200,8340, 120, 120);
	br.setBounds(200,8840, 120, 120);
	bs.setBounds(200,9340, 120, 120);
	bt.setBounds(200,9840, 120, 120);
	bu.setBounds(200,10340, 120, 120);
	bv.setBounds(200,10840, 120, 120);
	bw.setBounds(200,11340, 120, 120);
	bx.setBounds(200,11840, 120, 120);
	by.setBounds(200,12340, 120, 120);
	bz.setBounds(200,12840, 120, 120);
	
	
	la.setBounds(90,15,400,150);
	lb.setBounds(170,515,400,150);
	lc.setBounds(150,1015,400,150);
	ld.setBounds(130,1490,400,150);
	le.setBounds(150,2015,400,150);
	lf.setBounds(90,2515,400,150);
	lg.setBounds(100,3015,400,150);
	lh.setBounds(140,3515,400,150);
	li.setBounds(140,4015,400,150);
	lj.setBounds(120,4515,400,150);
	lk.setBounds(140,5015,400,150);
	ll.setBounds(150,5515,400,150);
	lm.setBounds(120,6015,400,150);
	ln.setBounds(150,6515,400,150);
	lo.setBounds(150,7015,400,150);
	lp.setBounds(80,7380,400,400);
	lq.setBounds(90,8015,400,150);
	lr.setBounds(80,8380,400,400);
	ls.setBounds(160,9015,400,150);
	lt.setBounds(150,9515,400,150);
	lu.setBounds(50,9800,400,600);
	lv.setBounds(90,10380,400,400);
	lw.setBounds(50,10600,400,1000);
	lx.setBounds(110,11515,400,150);
	ly.setBounds(120,12015,400,150);
	lz.setBounds(120,12515,400,150);
	
	
	  add(pane);
      pane.add(background);
	  pane.setViewportView(background);
	  background.add(ba);
	  background.add(bb);
	  background.add(bc);
	  background.add(bd);
	  background.add(be);
	  background.add(bf);
	  background.add(bg);
	  background.add(bh);
	  background.add(bi);
	  background.add(bj);
	  background.add(bk);
	  background.add(bl);
	  background.add(bm);
	  background.add(bn);
	  background.add(bo);
	  background.add(bp);
	  background.add(bq);
	  background.add(br);
	  background.add(bs);
	  background.add(bt);
	  background.add(bu);
	  background.add(bv);
	  background.add(bw);
	  background.add(bx);
	  background.add(by);
	  background.add(bz);
	  
	  
	  background.add(la);
	  background.add(lb);
	  background.add(lc);
	  background.add(ld);
	  background.add(le);
	  background.add(lf);
	  background.add(lg);
	  background.add(lh);
	  background.add(li);
	  background.add(lj);
	  background.add(lk);
	  background.add(ll);
	  background.add(lm);
	  background.add(ln);
	  background.add(lo);
	  background.add(lp);
	  background.add(lq);
	  background.add(lr);
	  background.add(ls);
	  background.add(lt);
	  background.add(lu);
	  background.add(lv);
	  background.add(lw);
	  background.add(lx);
	  background.add(ly);
	  background.add(lz);
	  
	  ba.addActionListener(this);
	  bb.addActionListener(this);
	  bc.addActionListener(this);
	  bd.addActionListener(this);
	  be.addActionListener(this);
	  bf.addActionListener(this);
	  bg.addActionListener(this);
	  bh.addActionListener(this);
	  bi.addActionListener(this);
	  bj.addActionListener(this);
	  bk.addActionListener(this);
	  bl.addActionListener(this);
	  bm.addActionListener(this);
	  bn.addActionListener(this);
	  bo.addActionListener(this);
	  bp.addActionListener(this);
	  bq.addActionListener(this);
	  br.addActionListener(this);
	  bs.addActionListener(this);
	  bt.addActionListener(this);
	  bu.addActionListener(this);
	  bv.addActionListener(this);
	  bw.addActionListener(this);
	  bx.addActionListener(this);
	  by.addActionListener(this);
	  bz.addActionListener(this);
	  
	  
	  File wavFilea = new File("a.wav");
	  File wavFileb = new File("b.wav");
	  File wavFilec = new File("c.wav");
	  File wavFiled = new File("d.wav");
	  File wavFilee = new File("e.wav");
	  File wavFilef = new File("f.wav");
	  File wavFileg = new File("g.wav");
	  File wavFileh = new File("h.wav");
	  File wavFilei = new File("i.wav");
	  File wavFilej = new File("j.wav");
	  File wavFilek = new File("k.wav");
	  File wavFilel = new File("l.wav");
	  File wavFilem = new File("m.wav");
	  File wavFilen = new File("n.wav");
	  File wavFileo = new File("o.wav");
	  File wavFilep = new File("p.wav");
	  File wavFileq = new File("q.wav");
	  File wavFiler = new File("r.wav");
	  File wavFiles = new File("s.wav");
	  File wavFilet = new File("t.wav");
	  File wavFileu = new File("u.wav");
	  File wavFilev = new File("v.wav");
	  File wavFilew = new File("w.wav");
	  File wavFilex = new File("x.wav");
	  File wavFiley = new File("y.wav");
	  File wavFilez = new File("z.wav");
	  
	 try{
	      sounda = Applet.newAudioClip(wavFilea.toURL());
          soundb = Applet.newAudioClip(wavFileb.toURL());
          soundc = Applet.newAudioClip(wavFilec.toURL());
          soundd = Applet.newAudioClip(wavFiled.toURL());
          sounde = Applet.newAudioClip(wavFilee.toURL());
          soundf = Applet.newAudioClip(wavFilef.toURL());
          soundg = Applet.newAudioClip(wavFileg.toURL());
          soundh = Applet.newAudioClip(wavFileh.toURL());
          soundi = Applet.newAudioClip(wavFilei.toURL());
          soundj = Applet.newAudioClip(wavFilej.toURL());
          soundk = Applet.newAudioClip(wavFilek.toURL());
          soundl = Applet.newAudioClip(wavFilel.toURL());
          soundm = Applet.newAudioClip(wavFilem.toURL());
          soundn = Applet.newAudioClip(wavFilen.toURL());
          soundo = Applet.newAudioClip(wavFileo.toURL());
          soundp = Applet.newAudioClip(wavFilep.toURL());
          soundq = Applet.newAudioClip(wavFileq.toURL());
          soundr = Applet.newAudioClip(wavFiler.toURL());
          sounds = Applet.newAudioClip(wavFiles.toURL());
          soundt = Applet.newAudioClip(wavFilet.toURL());
          soundu = Applet.newAudioClip(wavFileu.toURL());
          soundv = Applet.newAudioClip(wavFilev.toURL());
          soundw = Applet.newAudioClip(wavFilew.toURL());
          soundx = Applet.newAudioClip(wavFilex.toURL());
          soundy = Applet.newAudioClip(wavFiley.toURL());
          soundz = Applet.newAudioClip(wavFilez.toURL());}
          catch(Exception e){e.printStackTrace();}

	}
	
	public void actionPerformed(ActionEvent ae) {
		String s = ae.getActionCommand();
		if(s.equals(" ")){sounda.play();}
		else if(s.equals("  ")){soundb.play();}
		else if(s.equals("   ")){soundc.play();}
		else if(s.equals("    ")){soundd.play();}
		else if(s.equals("     ")){sounde.play();}
		else if(s.equals("      ")){soundf.play();}
		else if(s.equals("       ")){soundg.play();}
		else if(s.equals("        ")){soundh.play();}
		else if(s.equals("         ")){soundi.play();}
		else if(s.equals("          ")){soundj.play();}
		else if(s.equals("           ")){soundk.play();}
		else if(s.equals("            ")){soundl.play();}
		else if(s.equals("             ")){soundm.play();}
		else if(s.equals("              ")){soundn.play();}
		else if(s.equals("               ")){soundo.play();}
		else if(s.equals("                ")){soundp.play();}
		else if(s.equals("                 ")){soundq.play();}
		else if(s.equals("                  ")){soundr.play();}
		else if(s.equals("                   ")){sounds.play();}
		else if(s.equals("                    ")){soundt.play();}
		else if(s.equals("                     ")){soundu.play();}
		else if(s.equals("                      ")){soundv.play();}
		else if(s.equals("                       ")){soundw.play();}
		else if(s.equals("                        ")){soundx.play();}
		else if(s.equals("                         ")){soundy.play();}
		else if(s.equals("                          ")){soundz.play();}
	}

}
	
public class quiz extends JFrame implements ActionListener {
	JTextField t1,t2;
	JTextArea ta1,ta2;
	JComboBox cb1,cb2,cb3;
	AudioClip cheer,ops;
	public quiz(){
	JLabel background = new JLabel(new ImageIcon("TAG1.png"));
	JLabel l1 = new JLabel("Alphabets Quiz");
	JLabel l2 = new JLabel("Score");
	JLabel l3 = new JLabel("Enter the missing letter");
	JLabel l4 = new JLabel("The word starts with letter:");
	JLabel l5 = new JLabel("What animal is this:");
	JLabel l6 = new JLabel("A wrods starts with f:");
	JLabel l7 = new JLabel("Enter the missing letter:");
	JButton b1 = new JButton("Submit!");
	JButton b2 = new JButton("Clear");
    ta1 = new JTextArea();
    ta2 = new JTextArea();
	
	t1 = new JTextField(10);
    t2 = new JTextField(10);
	
    String[] ans1 = { "------","Jj", "Ll", "Ii"};
    String[] ans2 = { "------","Penguin", "Lion", "Owl"};
    String[] ans3 = { "------","Egg", "Flower", "Rainbow"};

    cb1 = new JComboBox(ans1);
    cb2 = new JComboBox(ans2);
    cb3 = new JComboBox(ans3);
    
    cb1.setSelectedIndex(0);
    cb2.setSelectedIndex(0);
    cb3.setSelectedIndex(0);
    
    cb1.setEditable(false);
    cb2.setEditable(false);
    cb3.setEditable(false);
	
	
	Font sty1 = new Font("Chalkduster",Font.BOLD,30);
	Font sty2 = new Font("Casual",Font.PLAIN,25);
	Font sty3 = new Font("Chalkduster",Font.PLAIN,15);
	Font sty4 = new Font("Casual",Font.PLAIN,35);
	Font sty5 = new Font("Chalkduster",Font.PLAIN,50);
	
	l1.setFont(sty3);
	l2.setFont(sty1);
	t1.setFont(sty2);
	t2.setFont(sty2);
	b1.setFont(sty4);
	b2.setFont(sty2);
	ta2.setFont(sty5);
	b1.setForeground(Color.WHITE);
	b2.setForeground(Color.WHITE);
	l1.setForeground(Color.WHITE);
	ta2.setForeground(Color.RED);
	
	b1.setBorderPainted(false);	
	b2.setBorderPainted(false);
	ta1.setOpaque(false);
	ta1.setEditable(false);
	ta2.setOpaque(false);
	ta2.setEditable(false);
	
	
	l1.setBounds(290,30,250,50);
	l2.setBounds(850,110,200,50);
	l3.setBounds(60,190,200,100);
	l4.setBounds(280,120,200,150);
	l5.setBounds(520,120,200,150);
	l6.setBounds(125,330,200,100);
	l7.setBounds(420,370,200,100);
	t1.setBounds(65,150,40,40);
	t2.setBounds(420,350,40,40);
	ta1.setBounds(820,150,200,50);
	ta2.setBounds(850,210,200,50);
	b1.setBounds(790,380,200,50);
	b2.setBounds(750,440,200,50);
	cb1.setBounds(300, 230, 150, 20);
	cb2.setBounds(540, 230, 150, 20);
	cb3.setBounds(140, 400, 150, 20);
	
	add(background);
	background.add(l1);
	background.add(l2);
	background.add(l3);
	background.add(l4);
	background.add(l5);
	background.add(l6);
	background.add(l7);
	background.add(ta1);
	background.add(ta2);
	background.add(b1);
	background.add(b2);
    background.add(t1);
	background.add(t2);
	background.add(cb1);
	background.add(cb2);
	background.add(cb3);
	
	b1.addActionListener(this);
	b2.addActionListener(this);
	
	File wavCheer= new File("c1.wav");
	File wavOps= new File("o1.wav");
	try{
	cheer = Applet.newAudioClip(wavCheer.toURL());
	ops = Applet.newAudioClip(wavOps.toURL());}
    catch(Exception e){e.printStackTrace();}}
	
	public void actionPerformed(ActionEvent ae){
		String s = ae.getActionCommand();
		String s2 = (String) cb1.getSelectedItem();
		String s3 = (String) cb2.getSelectedItem();
		String s4 = (String) cb3.getSelectedItem();
		String ans1 = t1.getText();
		String ans2 = t2.getText();
			
			
		if(s.equals("Submit!")){
		   
				if(s2.equals("Ii"))
			      scoreA++;
			    if(s3.equals("Penguin"))
			    	scoreA++;
			    if(s4.equals("Flower"))
			    	scoreA++;
			    if(ans1.equalsIgnoreCase("c"))
			    	scoreA++;
			    if(ans2.equalsIgnoreCase("a"))
			    	scoreA++;
			
			{if(scoreA>=3)
			{	cheer.play();
			ta1.setText("CONGRATULATIONS!!\nyour score is:");}
			else if(scoreA<3)
			{ops.play();
			ta1.setText("Oh no :(\n try again you can do it\nyour score is:" );}
			}
	 StringBuilder sb = new StringBuilder();
	 sb.append(scoreA);
	 String score = sb.toString();
	 ta2.setText(score);
		}
		else if(s.equals("Clear")){
			cb1.setSelectedIndex(0);
			cb2.setSelectedIndex(0);
			cb3.setSelectedIndex(0);
			t1.setText("");
			t2.setText("");
			ta1.setText("");
			ta2.setText("");
			scoreA=0;
		}
	}}
 }

//==============================================
public class colors extends JFrame implements ActionListener{
	
	JComboBox box1;
learn l=new learn();
quiz q=new quiz();

 
 public colors()
 {

	    setUndecorated(true);
        JLabel background = new JLabel(new ImageIcon("c.png"));
		JLabel l1=new JLabel("  COLORS");
		JLabel l2 = new JLabel("Choose an Activity:");
	    JButton b1 =new JButton("GO!");
	    JButton b2 =new JButton("BACK");
	    
	    
	    
	    String[] box = {"------","Learn Colors","Take a Quiz"};
		
	    box1 = new JComboBox(box);
		box1.setSelectedIndex(0);
		box1.setEditable(false);
	    add(box1);
	 
	    Font sty1 = new Font("Chalkduster",Font.BOLD,30);
	    Font sty2 = new Font("Casual",Font.PLAIN,20);

	     l1.setFont(sty1);
	     l2.setFont(sty2);
	     b1.setFont(sty2);
	     b2.setFont(sty2);
	     l1.setForeground(Color.WHITE);
	     l2.setForeground(Color.WHITE);
	     b1.setForeground(Color.WHITE);
	     b2.setForeground(Color.DARK_GRAY);
	     
	     l1.setBounds(160,80,200,50);
	     l2.setBounds(75,200,200,50);
	     b1.setBounds(70,340,350,50);
	     b2.setBounds(100,450,100,50);
	    box1.setBounds(130,240,200,70);

	     b1.setBorderPainted(false);	
	     b2.setBorderPainted(false);

	     b1.setToolTipText("Takes you to the activity you chose");
	     b2.setToolTipText("Go back to main menu");
	     
	     add(background);
	     background.add(l1);
	     background.add(l2);
	     background.add(b1);
	     background.add(b2);
	     background.add(box1);
	     
	     
	     b1.addActionListener(this);
	     b2.addActionListener(this);
	     box1.addActionListener(this);   
 }
 public void actionPerformed(ActionEvent ae) {
				
				
				String s = ae.getActionCommand();	
			      
				String s2= (String)box1.getSelectedItem();
		 
			    if(s.equals("BACK"))
			          colors.setVisible(false);
			          
			 
		        if(s.equals("GO!"))
		             {
			           if(s2.equals("Learn Colors"))
			           {l.pack();
		                l.setLocationRelativeTo(null);
		               	l.setVisible(true);
			            l.setSize(300,1000); }
			             
		        
		           
		           else if(s2.equals("Take a Quiz"))
		        	    {q.pack();
		             	q.setLocationRelativeTo(null);
		            	q.setVisible(true);
			            q.setTitle("quiz");
			            q.setSize(1000,500);
			            q.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);}
		           
		          
			        
				else if(s2.equals("------"))
		             {
					JOptionPane.showMessageDialog(colors, "Please Select an Activity first","Opps!", JOptionPane.ERROR_MESSAGE);} 
			           }}
	     
	 	
	 public class learn extends JFrame implements ActionListener {
		 JButton bRed,bGreen,bBlue,bYellow,bBlack;
		 AudioClip red,blue,green,yellow,black;
		 public learn(){
		JLabel background = new JLabel(new ImageIcon("colorF.jpg"));
		JScrollPane ss=new JScrollPane(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		setPreferredSize(new Dimension(200,1000));
		bRed = new JButton("");
		bGreen = new JButton(" ");
		bBlue = new JButton("  ");
		bYellow = new JButton("   ");
		bBlack = new JButton("    ");
		bRed.setBounds(125, 190, 70, 70);
		bGreen.setBounds(110, 450, 70, 70);
		bBlue.setBounds(115, 700, 70, 70);
		bYellow.setBounds(110, 960, 70, 70);
		bBlack.setBounds(115, 1220, 70, 70);
		
		bRed.setBorderPainted(false);
		bGreen.setBorderPainted(false);
		bBlue.setBorderPainted(false);
		bYellow.setBorderPainted(false); 
		bBlack.setBorderPainted(false);
		
		add(ss);
		ss.add(background);
		ss.setViewportView(background);
		background.add(bRed);
		background.add(bGreen);
		background.add(bBlue);
		background.add(bYellow);
		background.add(bBlack);
		 
		 bRed.addActionListener(this);
		 bGreen.addActionListener(this);
		 bBlue.addActionListener(this);
		 bYellow.addActionListener(this);
		 bBlack.addActionListener(this);
		 
		    File wavRed= new File("red.wav");
			File wavBlue= new File("blue.wav");
			File wavGreen= new File("green.wav");
			File wavYellow= new File("yellow.wav");
			File wavBlack= new File("black.wav");
			
			try{
			red = Applet.newAudioClip(wavRed.toURL());
			blue = Applet.newAudioClip(wavBlue.toURL());
			green = Applet.newAudioClip(wavGreen.toURL());
			yellow = Applet.newAudioClip(wavYellow.toURL());
			black = Applet.newAudioClip(wavBlack.toURL());}
		    catch(Exception e){e.printStackTrace();}}
		 
	 
	public void actionPerformed(ActionEvent ae) {
	
		String s = ae.getActionCommand();
		 if(s.equals("")){red.play();}
		 if(s.equals(" ")){green.play();}
		 if(s.equals("  ")){blue.play();}
		 if(s.equals("   ")){yellow.play();}
		 if(s.equals("    ")){black.play();}
		
	}}
	 public class quiz extends JFrame implements ActionListener{	
			JRadioButton T1,T2,T3,T4,T5,F1,F2,F3,F4,F5;
			JTextArea ta2,ta3;
			ButtonGroup g1,g2,g3,g4,g5;
			AudioClip cheer,ops;
			
		public quiz(){
				
		   JLabel background = new JLabel(new ImageIcon("colorsQ.jpg"));
		   JLabel l1 = new JLabel("Colors Quiz");
		   JLabel l2 = new JLabel("Score");
		   ButtonGroup bg = new ButtonGroup();
		   T1=new JRadioButton("TRUE");
		   F1=new JRadioButton("X");
		   T2=new JRadioButton("TRUE");
		   F2=new JRadioButton("X");
		   T3=new JRadioButton("TRUE");
		   F3=new JRadioButton("X");
		   T4=new JRadioButton("TRUE");
		   F4=new JRadioButton("X");
		   T5=new JRadioButton("TRUE");
		   F5=new JRadioButton("X");
		   
		   
		   g1=new ButtonGroup();
		   g2=new ButtonGroup();
		   g3=new ButtonGroup();
		   g4=new ButtonGroup();
		   g5=new ButtonGroup();
		   
		   JTextArea ta1 = new JTextArea("select the true shapes");
		   ta2 = new JTextArea();
		   ta3 = new JTextArea();

			
			JButton b1 = new JButton("Submit!");
			JButton b2 = new JButton("Clear");

			
			Font sty1 = new Font("Chalkduster",Font.BOLD,30);
			Font sty2 = new Font("Casual",Font.PLAIN,25);
			Font sty3 = new Font("Chalkduster",Font.PLAIN,15);
			Font sty4 = new Font("Casual",Font.PLAIN,35);
			Font sty5 = new Font("Chalkduster",Font.PLAIN,50);

			
			
			l1.setFont(sty3);
			l2.setFont(sty1);
			b1.setFont(sty4);
			b2.setFont(sty2);
			ta3.setFont(sty5);
			b1.setForeground(Color.WHITE);
			b2.setForeground(Color.WHITE);
			l1.setForeground(Color.WHITE);
			ta3.setForeground(Color.RED);
			
			b1.setBorderPainted(false);	
			b2.setBorderPainted(false);
			ta2.setOpaque(false);
			ta2.setEditable(false);
			ta3.setOpaque(false);
			ta3.setEditable(false);

			
			ta2.setBounds(820,150,200,50);
			ta3.setBounds(850,210,200,50);
			l1.setBounds(290,30,250,50);
			l2.setBounds(850,110,200,50);
			T1.setBounds(60,250,90,40);
			F1.setBounds(150,250,90,40);
			
			T2.setBounds(310,250,90,40);
			F2.setBounds(390,250,90,40);
			
			T3.setBounds(550,250,90,40);
			F3.setBounds(650,250,90,40);
			
			T4.setBounds(250,435,90,40);
			F4.setBounds(150,435,90,40);
			
			T5.setBounds(540,435,90,40);
			F5.setBounds(450,435,90,40);
			
			
			b1.setBounds(790,380,200,50);
			b2.setBounds(750,435,200,50);
			
		   g1.add(T1);
		   g1.add(F1);
		   g2.add(T2);
		   g2.add(F2);
		   g3.add(T3);
		   g3.add(F3);
		   g4.add(T4);
		   g4.add(F4);
		   g5.add(T5);
		   g5.add(F5);

			
			
			add(background);
			background.add(l1);
			background.add(l2);
			background.add(T1);
			background.add(F1);
			background.add(T2);
			background.add(F2);
			background.add(T3);
			background.add(F3);
			background.add(T4);
			background.add(F4);
			background.add(T5);
			background.add(F5);
			background.add(ta2);
			background.add(ta3);
			
			background.add(b1);
			background.add(b2);
		  
			 
			 
		   
			
			b1.addActionListener(this);
			b2.addActionListener(this);

			File wavCheer= new File("c1.wav");
			File wavOps= new File("o1.wav");
			try{
			cheer = Applet.newAudioClip(wavCheer.toURL());
			ops = Applet.newAudioClip(wavOps.toURL());}
		    catch(Exception e){e.printStackTrace();}}
			
			
				
				
					   
					
						
	public void actionPerformed(ActionEvent ae) {
			String s = ae.getActionCommand( );
		   
		if(s.equals("Submit!")){
			if(T1.isSelected())
					scoreC++;
			if(T2.isSelected())
				     scoreC++;
			 if(F3.isSelected())
				     scoreC++;
			 if(T4.isSelected()) 
				     scoreC++;
			if(T5.isSelected())
				     scoreC++;
					
				{if(scoreC>=3)
					{cheer.play();
				ta2.setText("CONGRATULATIONS!!\nyour score is:");}
				else if(scoreC<3)
				{ops.play();
					ta2.setText("Oh no :(\n try again you can do it\nyour score is:" );}}
				
		 StringBuilder sb = new StringBuilder();
		 sb.append(scoreC);
		 String score = sb.toString();
		 ta3.setText(score);}
			
		else if(s.equals("Clear")){
			    g1.clearSelection();
			    g2.clearSelection();
			    g3.clearSelection();
			    g4.clearSelection();
			    g5.clearSelection();
				ta2.setText("");
				ta3.setText("");
				scoreC=0;
			}


}
}

 
}

//===========================================
public class shapes extends JFrame implements ActionListener{
	JComboBox box1;
	 
	 learn l=new learn();
	  quiz q=new quiz();
	 
	  
	
	public shapes()
	{
		setUndecorated(true);
        JLabel background = new JLabel(new ImageIcon("shapes(1) copy.png"));
		JPanel p1=new JPanel();
		JLabel l1=new JLabel("  SHAPES");
		JLabel l2 = new JLabel("Choose an Activity:");
	    JButton b1 =new JButton("GO!");
	    JButton b2 =new JButton("BACK");
	    
		
		
		String[] box = {"------","Learn Shapes","Take a Quiz"};
		
	    box1 = new JComboBox(box);
		box1.setSelectedIndex(0);
		box1.setEditable(false);
	   add(box1);
	 
	    Font sty1 = new Font("Chalkduster",Font.BOLD,30);
	    Font sty2 = new Font("Casual",Font.PLAIN,20);

	     l1.setFont(sty1);
	     l2.setFont(sty2);
	     b1.setFont(sty2);
	     b2.setFont(sty2);
	     l1.setForeground(Color.WHITE);
	     l2.setForeground(Color.WHITE);
	     b1.setForeground(Color.WHITE);
	     b2.setForeground(Color.DARK_GRAY);
	     
	     l1.setBounds(160,80,200,50);
	     l2.setBounds(75,200,200,50);
	     b1.setBounds(70,340,350,50);
	     b2.setBounds(100,450,100,50);
	    box1.setBounds(130,240,200,70);

	     b1.setBorderPainted(false);	
	     b2.setBorderPainted(false);

	     b1.setToolTipText("Takes you to the activity you chose");
	     b2.setToolTipText("Go back to main menu");
	     
	     add(background);
	     background.add(l1);
	     background.add(l2);
	     background.add(b1);
	     background.add(b2);
	     background.add(box1);
	     
	     
	     b1.addActionListener(this);
	     b2.addActionListener(this);
	    
	   
	}

	
public void actionPerformed(ActionEvent ae) {
		
		
		String s = ae.getActionCommand();	
	      
		String s2= (String)box1.getSelectedItem();

	     if(s.equals("BACK"))
	          shapes.setVisible(false);
	        
	     
            if(s.equals("GO!"))
            {
	           if(s2.equals("Learn Shapes"))
                { 
	           l.pack();
               l.setLocationRelativeTo(null);
               l.setVisible(true);
	           l.setSize(300,1000); }
	           
          else if(s2.equals("Take a Quiz"))
       	    {q.pack();
            q.setLocationRelativeTo(null);
           	q.setVisible(true);
	        q.setTitle("quiz");
	        q.setSize(1000,500); 
	        q.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);}
          
		else if(s2.equals("------"))
            {
			JOptionPane.showMessageDialog(shapes, "Please Select an Activity first","Opps!", JOptionPane.ERROR_MESSAGE);} 
	           }	}        
	
public class learn extends JFrame implements ActionListener{
	JButton b1,b2,b3,b4,b5;
	AudioClip sqr,circle,rec,star,tri;
	public learn()
	{
		JLabel background = new JLabel(new ImageIcon("shapesFF.jpg"));
		JScrollPane ss=new JScrollPane(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		setPreferredSize(new Dimension(200,1000));
		
		b1 = new JButton("");
		b2 = new JButton(" ");
		b3 = new JButton("  ");
		b4 = new JButton("   ");
		b5 = new JButton("    ");
		
		b1.setBounds(115, 180, 70, 70);
		b2.setBounds(115, 440, 70, 70);
		b3.setBounds(115, 700, 70, 70);
		b4.setBounds(115, 950, 70, 70);
		b5.setBounds(115, 1220, 70, 70);
		
		b1.setBorderPainted(false);
		b2.setBorderPainted(false);
		b3.setBorderPainted(false);
		b4.setBorderPainted(false); 
		b5.setBorderPainted(false);
		
		add(ss);
		ss.add(background);
		ss.setViewportView(background);
		background.add(b1);
		background.add(b2);
		background.add(b3);
		background.add(b4);
		background.add(b5);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		
		File wavTri= new File("tri.wav");
		File wavSqr= new File("sqr.wav");
		File wavCircle= new File("circle.wav");
		File wavRec= new File("rec1.wav");
		File wavStar= new File("star.wav");
		
		try{
		tri = Applet.newAudioClip(wavTri.toURL());
		sqr = Applet.newAudioClip(wavSqr.toURL());
		circle = Applet.newAudioClip(wavCircle.toURL());
		rec = Applet.newAudioClip(wavRec.toURL());
		star = Applet.newAudioClip(wavStar.toURL());}
	    catch(Exception e){e.printStackTrace();}}

	
	public void actionPerformed(ActionEvent ae) {
		String s = ae.getActionCommand();
		 if(s.equals("")){tri.play();}
		 if(s.equals(" ")){sqr.play();}
		 if(s.equals("  ")){circle.play();}
		 if(s.equals("   ")){rec.play();}
		 if(s.equals("    ")){star.play();}
		
		
	}}
	
public class quiz extends JFrame implements ActionListener{
	JRadioButton T1,T2,T3,T4,T5,F1,F2,F3,F4,F5;
	JTextArea ta2,ta3;
	ButtonGroup g1,g2,g3,g4,g5;
	AudioClip cheer,ops;
	public quiz(){
		
    JLabel background = new JLabel(new ImageIcon("shapeQ.jpg"));
	JLabel l1 = new JLabel("Shapes Quiz");
	JLabel l2 = new JLabel("Score");
   ButtonGroup bg = new ButtonGroup();
   T1=new JRadioButton("TRUE");
   F1=new JRadioButton("FALSE");
   T2=new JRadioButton("TRUE");
   F2=new JRadioButton("FALSE");
   T3=new JRadioButton("TRUE");
   F3=new JRadioButton("FALSE");
   T4=new JRadioButton("TRUE");
   F4=new JRadioButton("FALSE");
   T5=new JRadioButton("TRUE");
   F5=new JRadioButton("FALSE");
   
   
   g1=new ButtonGroup();
   g2=new ButtonGroup();
   g3=new ButtonGroup();
   g4=new ButtonGroup();
   g5=new ButtonGroup();
   
   JTextArea ta1 = new JTextArea("select the true shapes");
   ta2 = new JTextArea();
   ta3 = new JTextArea();

	
	JButton b1 = new JButton("Submit!");
	JButton b2 = new JButton("Clear");

	
	Font sty1 = new Font("Chalkduster",Font.BOLD,30);
	Font sty2 = new Font("Casual",Font.PLAIN,25);
	Font sty3 = new Font("Chalkduster",Font.PLAIN,15);
	Font sty4 = new Font("Casual",Font.PLAIN,35);
	Font sty5 = new Font("Chalkduster",Font.PLAIN,50);

	
	
	l1.setFont(sty3);
	l2.setFont(sty1);
	b1.setFont(sty4);
	b2.setFont(sty2);
	ta3.setFont(sty5);
	b1.setForeground(Color.WHITE);
	b2.setForeground(Color.WHITE);
	l1.setForeground(Color.WHITE);
	ta3.setForeground(Color.RED);
	
	b1.setBorderPainted(false);	
	b2.setBorderPainted(false);
	ta2.setOpaque(false);
	ta2.setEditable(false);
	ta3.setOpaque(false);
	ta3.setEditable(false);

	
	ta2.setBounds(820,150,200,50);
	ta3.setBounds(850,210,200,50);
	l1.setBounds(290,30,250,50);
	l2.setBounds(850,110,200,50);
	T1.setBounds(60,250,90,40);
	F1.setBounds(150,250,90,40);
	
	T2.setBounds(310,250,90,40);
	F2.setBounds(390,250,90,40);
	
	T3.setBounds(550,250,90,40);
	F3.setBounds(650,250,90,40);
	
	T4.setBounds(250,435,90,40);
	F4.setBounds(150,435,90,40);
	
	T5.setBounds(540,435,90,40);
	F5.setBounds(450,435,90,40);
	
	
	b1.setBounds(790,380,200,50);
	b2.setBounds(750,435,200,50);
	
   g1.add(T1);
   g1.add(F1);
   g2.add(T2);
   g2.add(F2);
   g3.add(T3);
   g3.add(F3);
   g4.add(T4);
   g4.add(F4);
   g5.add(T5);
   g5.add(F5);

	
	
	add(background);
	background.add(l1);
	background.add(l2);
	background.add(T1);
	background.add(F1);
	background.add(T2);
	background.add(F2);
	background.add(T3);
	background.add(F3);
	background.add(T4);
	background.add(F4);
	background.add(T5);
	background.add(F5);
	background.add(ta2);
	background.add(ta3);
	
	background.add(b1);
	background.add(b2);
  
	 
	 
   
	
	b1.addActionListener(this);
	b2.addActionListener(this);
	

	File wavCheer= new File("c1.wav");
	File wavOps= new File("o1.wav");
	try{
	cheer = Applet.newAudioClip(wavCheer.toURL());
	ops = Applet.newAudioClip(wavOps.toURL());}
    catch(Exception e){e.printStackTrace();}}
	
			
	public void actionPerformed(ActionEvent ae) {
					
					
		String s = ae.getActionCommand( );
			
	if(s.equals("Submit!")){
		
			if(T1.isSelected())
				 scoreS++;
				
			if(F2.isSelected()) 
					scoreS++;
			
			if(T3.isSelected()) 
					scoreS++;
			
		    if(T4.isSelected()) 
					scoreS++;
					
			if(F5.isSelected()) 
					scoreS++;
			
		{if(scoreS>=3)
			{cheer.play();
		ta2.setText("CONGRATULATIONS!!\nyour score is:");}
		else if(scoreS<3)
		    {ops.play();
			ta2.setText("Oh no :(\n try again you can do it\nyour score is:" );}
		
		
      StringBuilder sb = new StringBuilder();
      sb.append(scoreS);
      String score = sb.toString();
      ta3.setText(score);}
	}
	
	else if(s.equals("Clear")){
	    g1.clearSelection();
	    g2.clearSelection();
	    g3.clearSelection();
	    g4.clearSelection();
	    g5.clearSelection();
		ta2.setText("");
		ta3.setText("");
		scoreS=0;}


	
	}}

			

}

//========================================
public class progress extends JFrame implements ActionListener{
	JProgressBar pb1,pb2,pb3,pb4;
	public progress(){
		JLabel background = new JLabel(new ImageIcon("prog(1).png"));
		 pb1 = new JProgressBar(0,100);
	     pb2 = new JProgressBar(0,100);
		 pb3 = new JProgressBar(0,100);
		 pb4 = new JProgressBar(0,100);
        JButton b1 =new JButton("Calculate");
		
		
		
		pb1.setBounds(280,30,250,50);
		pb2.setBounds(280,90,250,50);
		pb3.setBounds(280,160,250,50);
		pb4.setBounds(280,220,250,50);
	    b1.setBounds(7,213,150,30);
	    
	    b1.setForeground(Color.WHITE);
	    b1.setBorderPainted(false);
	    b1.setToolTipText("Calculates Your progress in quizes");
	    
		add(background);
		background.add(pb1);
		background.add(pb2);
		background.add(pb3);
		background.add(pb4);
		background.add(b1);
		
		b1.addActionListener(this);}
	public void actionPerformed(ActionEvent ae){
		String s = ae.getActionCommand();
		if(s.equals("Calculate"))
		{ 
		int sn = (int)((scoreN/5.0)*100);
		int sa = (int)((scoreA/5.0)*100);
		int sc = (int)((scoreC/5.0)*100);
		int ss = (int)((scoreS/5.0)*100);
		
		pb1.setValue(sn);
		pb1.setStringPainted(true);
		pb1.setString(String.valueOf(sn)+"%");
		
		pb2.setValue(sa);
		pb2.setStringPainted(true);
		pb2.setString(String.valueOf(sa)+"%");
		
		pb3.setValue(sc);
		pb3.setStringPainted(true);
		pb3.setString(String.valueOf(sc)+"%");
		
		pb4.setValue(ss);
		pb4.setStringPainted(true);
		pb4.setString(String.valueOf(ss)+"%");}
			
	} 
}
//========================================
public static void main (String[] args)   

	 { 
	        
	    	frameA A = new frameA();
	    	A.music.loop();
	    	A.pack();
		    A.setLocationRelativeTo(null);
	    	A.setVisible(true);
	    	A.setTitle("PRESCHOOLERS");
	    	A.setSize(1000,600);
	
}}



