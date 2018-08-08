import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;


@SuppressWarnings("serial")

public class ShitHead extends JFrame {
	int i=0;	
	 int j=1; // card staggering for pickup
	int x1=120,x2=220,x3=320,	// x position for 6 cards
		x4=550,x5=650,x6=750,
		p1y1=400,p1y2=380,p1y3=400,	//undercards y position for 3 cards	
		p2y1=40,p2y2=60,p2y3=60;
	int turn=0;
	int prevval=0;
	int curval=0;
	long t1=0;
	long t2=5000;
	long t=0;
	int xpos,ypos;
	boolean movesamecard=false;
	
	Dimension dim=null;
	Toolkit tk= Toolkit.getDefaultToolkit();
	JFrame frame=new JFrame();
	JMenuBar menubar=new JMenuBar();
	JMenu menu=new JMenu("File");
	JMenuItem Deal=new JMenuItem("Deal");
	JButton Dealem=new JButton("Deal'em");
	JButton Start=new JButton();
	JButton changecards=new JButton();
	JButton movedone = new JButton("done?"); // for multiple same cards
	JButton pickupcards = new JButton("Pick up?");
	JLabel p1light =new JLabel();
	JLabel p2light =new JLabel();
	JLabel prev=null;
	
	JPanel backgroundPanel=new JPanel();
	
	JLabel backlabel=new JLabel();
    ImageIcon bg=new ImageIcon("src/Background.jpg");    
    
    JLabel aces=new JLabel();
    ImageIcon acesi=new ImageIcon("src/cards/aces.png");
    JLabel twos=new JLabel();
    ImageIcon twosi=new ImageIcon("src/cards/twos.png");
    JLabel threes=new JLabel();
    ImageIcon threesi=new ImageIcon("src/cards/threes.png");
    JLabel fours=new JLabel();
    ImageIcon foursi=new ImageIcon("src/cards/fours.png");
    JLabel fives=new JLabel();
    ImageIcon fivesi=new ImageIcon("src/cards/fives.png");
    JLabel sixs=new JLabel();
    ImageIcon sixsi=new ImageIcon("src/cards/sixs.png");
    JLabel sevens=new JLabel();
    ImageIcon sevensi=new ImageIcon("src/cards/sevens.png");
    JLabel eights=new JLabel();
    ImageIcon eightsi=new ImageIcon("src/cards/eights.png");
    JLabel nines=new JLabel();
    ImageIcon ninesi=new ImageIcon("src/cards/nines.png");
    JLabel tens=new JLabel();
    ImageIcon tensi=new ImageIcon("src/cards/tens.png");
    JLabel jacks=new JLabel();
    ImageIcon jacksi=new ImageIcon("src/cards/jacks.png");
    JLabel queens=new JLabel();
    ImageIcon queensi=new ImageIcon("src/cards/queens.png");
    JLabel kings=new JLabel();
    ImageIcon kingsi=new ImageIcon("src/cards/kings.png");
    JLabel acec=new JLabel();
    ImageIcon aceci=new ImageIcon("src/cards/acec.png");
    JLabel twoc=new JLabel();
    ImageIcon twoci=new ImageIcon("src/cards/twoc.png");
    JLabel threec=new JLabel();
    ImageIcon threeci=new ImageIcon("src/cards/threec.png");
    JLabel fourc=new JLabel();
    ImageIcon fourci=new ImageIcon("src/cards/fourc.png");
    JLabel fivec=new JLabel();
    ImageIcon fiveci=new ImageIcon("src/cards/fivec.png");
    JLabel sixc=new JLabel();
    ImageIcon sixci=new ImageIcon("src/cards/sixc.png");
    JLabel sevenc=new JLabel();
    ImageIcon sevenci=new ImageIcon("src/cards/sevenc.png");
    JLabel eightc=new JLabel();
    ImageIcon eightci=new ImageIcon("src/cards/eightc.png");
    JLabel ninec=new JLabel();
    ImageIcon nineci=new ImageIcon("src/cards/ninec.png");
    JLabel tenc=new JLabel();
    ImageIcon tenci=new ImageIcon("src/cards/tenc.png");
    JLabel jackc=new JLabel();
    ImageIcon jackci=new ImageIcon("src/cards/jackc.png");
    JLabel queenc=new JLabel();
    ImageIcon queenci=new ImageIcon("src/cards/queenc.png");
    JLabel kingc=new JLabel();
    ImageIcon kingci=new ImageIcon("src/cards/kingc.png");
    JLabel aced=new JLabel();
    ImageIcon acedi=new ImageIcon("src/cards/aced.png");
    JLabel twod=new JLabel();
    ImageIcon twodi=new ImageIcon("src/cards/twod.png");
    JLabel threed=new JLabel();
    ImageIcon threedi=new ImageIcon("src/cards/threed.png");
    JLabel fourd=new JLabel();
    ImageIcon fourdi=new ImageIcon("src/cards/fourd.png");
    JLabel fived=new JLabel();
    ImageIcon fivedi=new ImageIcon("src/cards/fived.png");
    JLabel sixd=new JLabel();
    ImageIcon sixdi=new ImageIcon("src/cards/sixd.png");
    JLabel sevend=new JLabel();
    ImageIcon sevendi=new ImageIcon("src/cards/sevend.png");
    JLabel eightd=new JLabel();
    ImageIcon eightdi=new ImageIcon("src/cards/eightd.png");
    JLabel nined=new JLabel();
    ImageIcon ninedi=new ImageIcon("src/cards/nined.png");
    JLabel tend=new JLabel();
    ImageIcon tendi=new ImageIcon("src/cards/tend.png");
    JLabel jackd=new JLabel();
    ImageIcon jackdi=new ImageIcon("src/cards/jackd.png");
    JLabel queend=new JLabel();
    ImageIcon queendi=new ImageIcon("src/cards/queend.png");
    JLabel kingd=new JLabel();
    ImageIcon kingdi=new ImageIcon("src/cards/kingd.png");
    JLabel aceh=new JLabel();
    ImageIcon acehi=new ImageIcon("src/cards/aceh.png");
    JLabel twoh=new JLabel();
    ImageIcon twohi=new ImageIcon("src/cards/twoh.png");
    JLabel threeh=new JLabel();
    ImageIcon threehi=new ImageIcon("src/cards/threeh.png");
    JLabel fourh=new JLabel();
    ImageIcon fourhi=new ImageIcon("src/cards/fourh.png");
    JLabel fiveh=new JLabel();
    ImageIcon fivehi=new ImageIcon("src/cards/fiveh.png");
    JLabel sixh=new JLabel();
    ImageIcon sixhi=new ImageIcon("src/cards/sixh.png");
    JLabel sevenh=new JLabel();
    ImageIcon sevenhi=new ImageIcon("src/cards/sevenh.png");
    JLabel eighth=new JLabel();
    ImageIcon eighthi=new ImageIcon("src/cards/eighth.png");
    JLabel nineh=new JLabel();
    ImageIcon ninehi=new ImageIcon("src/cards/nineh.png");
    JLabel tenh=new JLabel();
    ImageIcon tenhi=new ImageIcon("src/cards/tenh.png");
    JLabel jackh=new JLabel();
    ImageIcon jackhi=new ImageIcon("src/cards/jackh.png");
    JLabel queenh=new JLabel();
    ImageIcon queenhi=new ImageIcon("src/cards/queenh.png");
    JLabel kingh=new JLabel();
    ImageIcon kinghi=new ImageIcon("src/cards/kingh.png");
    JLabel joker1=new JLabel();
    ImageIcon joker1i=new ImageIcon("src/cards/joker1.png");
    JLabel joker2=new JLabel();
    ImageIcon joker2i=new ImageIcon("src/cards/joker2.png");
    ImageIcon backi=new ImageIcon("src/cards/back.png");
    
    ImageIcon lightoni=new ImageIcon("src/greenlight.png");
    ImageIcon lightoffi=new ImageIcon("src/redlight.png");
    JLabel lose=new JLabel();
    ImageIcon lose1i=new ImageIcon("src/p1lose.png");
    ImageIcon lose2i=new ImageIcon("src/p2lose.png");
    
     mouselisten mouse =new mouselisten();
	 MouseMotionAdapter motion;
     dealListener dealbut=new dealListener();
     complisten complist=new complisten();
     
	ArrayList<JLabel> cards =new ArrayList();
	ArrayList<JLabel> cardsinplay =new ArrayList();
	ArrayList<JLabel> player1 =new ArrayList();
	ArrayList<JLabel> player2 =new ArrayList();
	ArrayList<JLabel> player1bottom =new ArrayList();
	ArrayList<JLabel> player2bottom =new ArrayList();
	ArrayList<JLabel> player1top =new ArrayList();
	ArrayList<JLabel> player2top =new ArrayList();
	ArrayList<JLabel> player1hand =new ArrayList();
	ArrayList<JLabel> player2hand =new ArrayList();
	
	ArrayList<JLabel> centerpile =new ArrayList();
	ArrayList<JLabel> player1useable =new ArrayList();
	ArrayList<JLabel> player2useable =new ArrayList();
	
	JLabel changee=null;
	JLabel ico=null;
	JLabel ico2=null; 
	Point loc=null;
	Point loc1=null;
	Point locorig=null;
	Point cardpos=null;
	Point changeeloc=null;
	Point centerpos=null;
	Point toploc=null;
	JLabel temp=null;
	JLabel prev1=null;
	JLabel prev2=null;
	JLabel prev3=null;
	
	
	
public ShitHead(){
 
		this.setSize(800,600);	
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.add(backgroundPanel);
		this.add(menubar,BorderLayout.NORTH);
		this.setResizable(false);
		this.setTitle("Shithead!");
		this.addComponentListener(complist);
		backlabel.addMouseMotionListener(mouse);
	
		
		lose.setBounds(200,110,600,254);
		
		backlabel.add(changecards);
		backlabel.setBounds(0,0,this.getWidth(),this.getHeight());
		backlabel.setIcon(bg);
		backlabel.setName("background");
		
		movedone.setBounds(415,430,100,40);
		movedone.setBackground(Color.white);
		movedone.addActionListener(dealbut);
		movedone.setVisible(false);
		
		pickupcards.setBounds(415,470,100,40);
		pickupcards.setBackground(Color.white);
		pickupcards.addActionListener(dealbut);
		pickupcards.setVisible(true);

		
		menubar.add(menu);
		menu.add(Deal);
		menubar.add(Dealem);
		Deal.addActionListener(dealbut);
		Dealem.addActionListener(dealbut);
		Start.addActionListener(dealbut);
		changecards.addActionListener(dealbut);
		
		backgroundPanel.add(backlabel);	
		dim=tk.getScreenSize();
		xpos=dim.width/2-this.getWidth()/2;
		ypos=dim.height/2-this.getHeight()/2;
		this.setLocation(xpos,ypos);
		centerpos=this.getLocation();
		
		aceh.setName("ace");
		aces.setName("ace");
		acec.setName("ace");
		aced.setName("ace");
		twoh.setName("two");
		twos.setName("two");
		twod.setName("two");
		twoc.setName("two");
		threec.setName("three");
		threeh.setName("three");
		threed.setName("three");
		threes.setName("three");
		fourc.setName("four");
		fourd.setName("four");
		fours.setName("four");
		fourh.setName("four");
		fivec.setName("five");
		fived.setName("five");
		fives.setName("five");
		fiveh.setName("five");
		sixc.setName("six");
		sixd.setName("six");
		sixs.setName("six");
		sixh.setName("six");
		sevenc.setName("seven");
		sevend.setName("seven");
		sevens.setName("seven");
		sevenh.setName("seven");
		eightc.setName("eight");
		eightd.setName("eight");
		eights.setName("eight");
		eighth.setName("eight");
		ninec.setName("nine");
		nined.setName("nine");
		nines.setName("nine");
		nineh.setName("nine");
		tenc.setName("ten");
		tend.setName("ten");
		tens.setName("ten");
		tenh.setName("ten");
		jackc.setName("jack");
		jackd.setName("jack");
		jacks.setName("jack");
		jackh.setName("jack");
		queenc.setName("queen");
		queend.setName("queen");
		queens.setName("queen");
		queenh.setName("queen");
		kingc.setName("king");
		kingd.setName("king");
		kings.setName("king");
		kingh.setName("king");
		joker1.setName("joker");
		joker2.setName("joker");
				
		aceh.setIcon(acehi);
		aces.setIcon(acesi);
		acec.setIcon(aceci);
		aced.setIcon(acedi);	
		twoh.setIcon(twohi);
		twos.setIcon(twosi);
		twod.setIcon(twodi);
		twoc.setIcon(twoci);
		threeh.setIcon(threehi);
		threec.setIcon(threeci);
		threed.setIcon(threedi);
		threes.setIcon(threesi);		
		fourc.setIcon(fourci);
		fourd.setIcon(fourdi);
		fours.setIcon(foursi);
		fourh.setIcon(fourhi);		
		fivec.setIcon(fiveci);
		fived.setIcon(fivedi);
		fives.setIcon(fivesi);
		fiveh.setIcon(fivehi);
		sixc.setIcon(sixci);
		sixd.setIcon(sixdi);
		sixs.setIcon(sixsi);
		sixh.setIcon(sixhi);		
		sevenc.setIcon(sevenci);
		sevend.setIcon(sevendi);
		sevens.setIcon(sevensi);
		sevenh.setIcon(sevenhi);		
		eightc.setIcon(eightci);
		eightd.setIcon(eightdi);
		eights.setIcon(eightsi);
		eighth.setIcon(eighthi);	
		ninec.setIcon(nineci);
		nined.setIcon(ninedi);
		nines.setIcon(ninesi);
		nineh.setIcon(ninehi);	
		tenc.setIcon(tenci);
		tend.setIcon(tendi);
		tens.setIcon(tensi);
		tenh.setIcon(tenhi);	
		jackc.setIcon(jackci);
		jackd.setIcon(jackdi);
		jacks.setIcon(jacksi);
		jackh.setIcon(jackhi);		
		queenc.setIcon(queenci);
		queend.setIcon(queendi);
		queens.setIcon(queensi);
		queenh.setIcon(queenhi);		
		kingc.setIcon(kingci);
		kingd.setIcon(kingdi);
		kings.setIcon(kingsi);
		kingh.setIcon(kinghi);		
		joker1.setIcon(joker1i);
		joker2.setIcon(joker2i);
		
		p1light.setIcon(lightoni);
		p2light.setIcon(lightoni);
		p1light.setDisabledIcon(lightoffi);
		p2light.setDisabledIcon(lightoffi);
		
		backlabel.addMouseListener(mouse);
		backlabel.addMouseMotionListener(mouse);		
		aceh.addMouseListener(mouse);
		aces.addMouseListener(mouse);
		aced.addMouseListener(mouse);
		acec.addMouseListener(mouse);
		twoh.addMouseListener(mouse);
		twos.addMouseListener(mouse);
		twod.addMouseListener(mouse);
		twoc.addMouseListener(mouse);
		threec.addMouseListener(mouse);
		threeh.addMouseListener(mouse);
		threed.addMouseListener(mouse);
		threes.addMouseListener(mouse);		
		fourc.addMouseListener(mouse);
		fourd.addMouseListener(mouse);
		fours.addMouseListener(mouse);
		fourh.addMouseListener(mouse);		
		fivec.addMouseListener(mouse);
		fived.addMouseListener(mouse);
		fives.addMouseListener(mouse);
		fiveh.addMouseListener(mouse);
		sixc.addMouseListener(mouse);
		sixd.addMouseListener(mouse);
		sixs.addMouseListener(mouse);
		sixh.addMouseListener(mouse);		
		sevenc.addMouseListener(mouse);
		sevend.addMouseListener(mouse);
		sevens.addMouseListener(mouse);
		sevenh.addMouseListener(mouse);		
		eightc.addMouseListener(mouse);
		eightd.addMouseListener(mouse);
		eights.addMouseListener(mouse);
		eighth.addMouseListener(mouse);	
		ninec.addMouseListener(mouse);
		nined.addMouseListener(mouse);
		nines.addMouseListener(mouse);
		nineh.addMouseListener(mouse);	
		tenc.addMouseListener(mouse);
		tend.addMouseListener(mouse);
		tens.addMouseListener(mouse);
		tenh.addMouseListener(mouse);	
		jackc.addMouseListener(mouse);
		jackd.addMouseListener(mouse);
		jacks.addMouseListener(mouse);
		jackh.addMouseListener(mouse);		
		queenc.addMouseListener(mouse);
		queend.addMouseListener(mouse);
		queens.addMouseListener(mouse);
		queenh.addMouseListener(mouse);		
		kingc.addMouseListener(mouse);
		kingd.addMouseListener(mouse);
		kings.addMouseListener(mouse);
		kingh.addMouseListener(mouse);		
		joker1.addMouseListener(mouse);
		joker2.addMouseListener(mouse);		 
		aceh.addMouseMotionListener(mouse);
		aces.addMouseMotionListener(mouse);
		aced.addMouseMotionListener(mouse);
		acec.addMouseMotionListener(mouse);		
		twoh.addMouseMotionListener(mouse);
		twos.addMouseMotionListener(mouse);
		twod.addMouseMotionListener(mouse);
		twoc.addMouseMotionListener(mouse);
		threec.addMouseMotionListener(mouse);
		threeh.addMouseMotionListener(mouse);
		threed.addMouseMotionListener(mouse);
		threes.addMouseMotionListener(mouse);		
		fourc.addMouseMotionListener(mouse);
		fourd.addMouseMotionListener(mouse);
		fours.addMouseMotionListener(mouse);
		fourh.addMouseMotionListener(mouse);		
		fivec.addMouseMotionListener(mouse);
		fived.addMouseMotionListener(mouse);
		fives.addMouseMotionListener(mouse);
		fiveh.addMouseMotionListener(mouse);
		sixc.addMouseMotionListener(mouse);
		sixd.addMouseMotionListener(mouse);
		sixs.addMouseMotionListener(mouse);
		sixh.addMouseMotionListener(mouse);		
		sevenc.addMouseMotionListener(mouse);
		sevend.addMouseMotionListener(mouse);
		sevens.addMouseMotionListener(mouse);
		sevenh.addMouseMotionListener(mouse);		
		eightc.addMouseMotionListener(mouse);
		eightd.addMouseMotionListener(mouse);
		eights.addMouseMotionListener(mouse);
		eighth.addMouseMotionListener(mouse);
		ninec.addMouseMotionListener(mouse);
		nined.addMouseMotionListener(mouse);
		nines.addMouseMotionListener(mouse);
		nineh.addMouseMotionListener(mouse);
		tenc.addMouseMotionListener(mouse);
		tend.addMouseMotionListener(mouse);
		tens.addMouseMotionListener(mouse);
		tenh.addMouseMotionListener(mouse);	
		jackc.addMouseMotionListener(mouse);
		jackd.addMouseMotionListener(mouse);
		jacks.addMouseMotionListener(mouse);
		jackh.addMouseMotionListener(mouse);		
		queenc.addMouseMotionListener(mouse);
		queend.addMouseMotionListener(mouse);
		queens.addMouseMotionListener(mouse);
		queenh.addMouseMotionListener(mouse);		
		kingc.addMouseMotionListener(mouse);
		kingd.addMouseMotionListener(mouse);
		kings.addMouseMotionListener(mouse);
		kingh.addMouseMotionListener(mouse);		
		joker1.addMouseMotionListener(mouse);
		joker2.addMouseMotionListener(mouse);
} // end shithead constructor

	
	


public void NewGame(){
	cards.clear();
	cardsinplay.clear();
	player1.clear();
	player2.clear();
	player1useable.clear();
	player2useable.clear();
	player1bottom.clear();
	player2bottom.clear();
	centerpile.clear();
	
	cards.add(aced);
	cards.add(aceh);
	cards.add(acec);
	cards.add(aces);
	cards.add(twod);
	cards.add(threed);
	cards.add(fourd);
	cards.add(fived);
	cards.add(sixd);
	cards.add(sevend);
	cards.add(eightd);
	cards.add(nined);
	cards.add(tend);
	cards.add(jackd);
	cards.add(queend);
	cards.add(kingd);
	cards.add(twoh);
	cards.add(threeh);
	cards.add(fourh);
	cards.add(fiveh);
	cards.add(sixh);
	cards.add(sevenh);
	cards.add(eighth);
	cards.add(nineh);
	cards.add(tenh);
	cards.add(jackh);
	cards.add(queenh);
	cards.add(kingh);
	cards.add(twoc);
	cards.add(threec);
	cards.add(fourc);
	cards.add(fivec);
	cards.add(sixc);
	cards.add(sevenc);
	cards.add(eightc);
	cards.add(ninec);
	cards.add(tenc);
	cards.add(jackc);
	cards.add(queenc);
	cards.add(kingc);
	cards.add(twos);
	cards.add(threes);
	cards.add(fours);
	cards.add(fives);
	cards.add(sixs);
	cards.add(sevens);
	cards.add(eights);
	cards.add(nines);
	cards.add(tens);
	cards.add(jacks);
	cards.add(queens);
	cards.add(kings);	
	cards.add(joker1);
	cards.add(joker2);
	
	deal();
	}// end newgame





public void deal() {
	Collections.shuffle(cards);
	
	for(JLabel b:cards) {b.setDisabledIcon(backi);b.setEnabled(true);	}

	//player1 on the bottom.  (top cards)
	backlabel.add(cards.get(0));
	cards.get(0).setBounds(x1,p1y1,72,96);
	cardsinplay.add(cards.get(0));	player1.add(cards.get(0));
	player1top.add(cards.get(0));
	
	backlabel.add(cards.get(1));
	cards.get(1).setBounds(x2,p1y1,72,96);
	cardsinplay.add(cards.get(1));player1.add(cards.get(1));
	player1top.add(cards.get(1));
	
	backlabel.add(cards.get(2));
	cards.get(2).setBounds(x3,p1y1,72,96);
	cardsinplay.add(cards.get(2));player1.add(cards.get(2));
	player1top.add(cards.get(2));
	
	//bottom1
	backlabel.add(cards.get(3));
	cards.get(3).setBounds(x1,p1y2,72,96);
	cards.get(3).setEnabled(false);
	cardsinplay.add(cards.get(3));player1.add(cards.get(3));
	player1bottom.add(cards.get(3));
	
	//bottom2
	backlabel.add(cards.get(4));
	cards.get(4).setBounds(x2,p1y2,72,96);
	cards.get(4).setEnabled(false);
	cardsinplay.add(cards.get(4));player1.add(cards.get(4));
	player1bottom.add(cards.get(4));
	
	////bottom3
	backlabel.add(cards.get(5));
	cards.get(5).setBounds(x3,p1y2,72,96);
	cards.get(5).setEnabled(false);
	cardsinplay.add(cards.get(5));player1.add(cards.get(5));
	player1bottom.add(cards.get(5));
	
	//hand cards
	backlabel.add(cards.get(6));
	cards.get(6).setBounds(x4,p1y1,72,96);
	cardsinplay.add(cards.get(6));player1.add(cards.get(6));
	player1hand.add(cards.get(6));
	
	backlabel.add(cards.get(7));
	cards.get(7).setBounds(x5,p1y1,72,96);
	cardsinplay.add(cards.get(7));player1.add(cards.get(7));
	player1hand.add(cards.get(7));
	
	backlabel.add(cards.get(8));
	cards.get(8).setBounds(x6,p1y1,72,96);
	cardsinplay.add(cards.get(8));player1.add(cards.get(8));
	player1hand.add(cards.get(8));
	
	
	//player2 top (top cards)
	
	backlabel.add(cards.get(9));
	cards.get(9).setBounds(x1,p2y1,72,96);
	cardsinplay.add(cards.get(9));player2.add(cards.get(9));
	player2top.add(cards.get(9));
	
	backlabel.add(cards.get(10));
	cards.get(10).setBounds(x2,p2y1,72,96);
	cardsinplay.add(cards.get(10));player2.add(cards.get(10));
	player2top.add(cards.get(10));

	backlabel.add(cards.get(11));
	cards.get(11).setBounds(x3,p2y1,72,96);
	cardsinplay.add(cards.get(11));player2.add(cards.get(11));
	player2top.add(cards.get(11));
	
	
	
	//bottom4
	backlabel.add(cards.get(12));
	cards.get(12).setBounds(x1,p2y2,72,96);
	cards.get(12).setEnabled(false);
	cardsinplay.add(cards.get(12));player2.add(cards.get(12));
	player2bottom.add(cards.get(12));
	
	//bottom5
	backlabel.add(cards.get(13));
	cards.get(13).setBounds(x2,p2y2,72,96);
	cards.get(13).setEnabled(false);
	cardsinplay.add(cards.get(13));player2.add(cards.get(13));
	player2bottom.add(cards.get(13));
	
	//bottom4
	backlabel.add(cards.get(14));
	cards.get(14).setBounds(x3,p2y2,72,96);
	cards.get(14).setEnabled(false);
	cardsinplay.add(cards.get(14));player2.add(cards.get(14));
	player2bottom.add(cards.get(14));
	
	//hand cards
	backlabel.add(cards.get(15));
	cards.get(15).setBounds(x4,p2y1,72,96);
	cardsinplay.add(cards.get(15));player2.add(cards.get(15));
	player2hand.add(cards.get(15));
	
	backlabel.add(cards.get(16));
	cards.get(16).setBounds(x5,p2y1,72,96);
	cardsinplay.add(cards.get(16));player2.add(cards.get(16));
	player2hand.add(cards.get(16));
	
	backlabel.add(cards.get(17));
	cards.get(17).setBounds(x6,p2y1,72,96);
	cardsinplay.add(cards.get(17));player2.add(cards.get(17));
	player2hand.add(cards.get(17));
	
	cards.remove(17);
	cards.remove(16);
	cards.remove(15);
	cards.remove(14);
	cards.remove(13);
	cards.remove(12);
	cards.remove(11);
	cards.remove(10);
	cards.remove(9);
	cards.remove(8);
	cards.remove(7);
	cards.remove(6);
	cards.remove(5);
	cards.remove(4);
	cards.remove(3);
	cards.remove(2);
	cards.remove(1);
	cards.remove(0);
	
	//set back face for pile cards, and layout center stack staggered
	int offset=1;
	for(JLabel c:cards) { 
			c.setEnabled(false);
			backlabel.add(c);
			c.setBounds(660+offset,200+offset,72,96);
			offset++;	
			}
turn=0;
movesamecard=false;
p1light.setBounds(450,360,30,30);
backlabel.add(p1light);
p1light.setVisible(true);

p2light.setBounds(450,20,30,30);
backlabel.add(p2light);
p2light.setVisible(true);
backlabel.add(movedone);
backlabel.add(pickupcards);
movedone.setVisible(false);
}//end deal







//at beginning
public void sortcards() {
	int where=player1hand.indexOf(ico);
	int forloc=ico.getLocation().x;
	if( ico.getName()!="background"){
	
		for(i=0;i<3;i++) {
		if(((forloc <=player1top.get(i).getX()+20)&&
		(forloc>=player1top.get(i).getX()-20)&&
		(ico.getLocation().y <=player1top.get(i).getY()+40)&&
		(ico.getLocation().y>=player1top.get(i).getY()-40)&&player1.contains(ico)	)	
		&&(cards.size()>=35))
		{
		toploc=player1top.get(i).getLocation();
		temp=ico;
		temp.setLocation(toploc); //set to correct location
		ico=player1top.get(i);	//hand card is now the top card
		player1top.remove(i);
		player1top.add(i,temp);  //ico now in top cards array
		player1hand.remove(temp);
		player1hand.add(where,ico);
		ico.setLocation(locorig);	//topcard now located in hand cards

		backlabel.add(ico);
		replaceall(ico);
	//	showarrays();
		repaint();
		
		}//end inner if
		else {ico.setLocation(locorig); // i=0;
		}
	}// end for loop
		
	} // end if not background
}//end sortcards
	
	




private void replaceall(JLabel card) {
	backlabel.add(pickupcards);
	backlabel.remove(card); 
	backlabel.remove(ico); 

	for(JLabel b:player1top) {
		backlabel.remove(b); 
		}
	for(JLabel b:player2top) {
		backlabel.remove(b); 
		}
	for(JLabel b:player1bottom) {
		backlabel.remove(b); 
		}
	for(JLabel b:player2bottom) {
		backlabel.remove(b); 
		}
		for(JLabel b:player1hand) {
		backlabel.remove(b); 
		}
	for(JLabel b:player2hand) {
		backlabel.remove(b); 
		}
		backlabel.add(ico); 
		backlabel.add(card);	//from swap at start of game; 
	
	for(JLabel b:player1top) {
		if(( (b)!=ico)&& ((b)!=card))
		backlabel.add(b); 
		}
	for(JLabel b:player2top) {
		if(( (b)!=ico)&& ((b)!=card))
		backlabel.add(b); 
		}
		for(JLabel b:player1bottom) {
		if( (b)!=ico)
		backlabel.add(b); 
		}
	for(JLabel b:player2bottom) {
		if( (b)!=ico)
		backlabel.add(b); 
		}
	for(JLabel b:player1hand) {
		if( (b)!=ico)
		backlabel.add(b); 
		}
	for(JLabel b:player2hand) {
		if( (b)!=ico)
		backlabel.add(b); 
		}
		for(JLabel b:centerpile) {
		backlabel.remove(b); 
		backlabel.add(b); 
	//	System.out.println("center pile "+b.getName());
		}
		
		for(JLabel b:cards) {
			backlabel.remove(b); 
			backlabel.add(b); 
		}
		
	
	
	Collections.reverse(centerpile);
	System.out.println("reverse replaceall ");
}// end replace all







//turn=players 1 or 2 not touched here
private boolean validmove(){
JLabel pres=ico;
if(centerpile.size()>0) {
prev=centerpile.get(centerpile.size()-1);
}else { prev=ico;}

	if(prev.getName()=="two") {prevval=2;}
	if(pres.getName()=="two") {curval=2;}
	if(prev.getName()=="three") {prevval=3;}
	if(pres.getName()=="three") {curval=3;}
	if(prev.getName()=="four") {prevval=4;}
	if(pres.getName()=="four") {curval=4;}
	if(prev.getName()=="five") {prevval=5;}
	if(pres.getName()=="five") {curval=5;}
	if(prev.getName()=="six") {prevval=6;}
	if(pres.getName()=="six") {curval=6;}
	if(prev.getName()=="seven") {prevval=7;}
	if(pres.getName()=="seven") {curval=7;}
	if(prev.getName()=="eight") {prevval=8;}
	if(pres.getName()=="eight") {curval=8;}
	if(prev.getName()=="nine") {prevval=9;}
	if(pres.getName()=="nine") {curval=9;}
	if(prev.getName()=="ten") {prevval=16;}
	if(pres.getName()=="ten") {curval=16;}
	if(prev.getName()=="jack") {prevval=11;}
	if(pres.getName()=="jack") {curval=11;}
	if(prev.getName()=="queen") {prevval=12;}
	if(pres.getName()=="queen") {curval=12;}
	if(prev.getName()=="king") {prevval=13;}
	if(pres.getName()=="king") {curval=13;}
	if(prev.getName()=="ace") {prevval=14;}
	if(pres.getName()=="ace") {curval=14;}
	if(prev.getName()=="joker") {prevval=1;}
	if(pres.getName()=="joker") {curval=1;}
	
	/*-------------------------------*/
	
	if(curval==16) {return true;}	//ten
	if(curval==1){	return true;} //joker	
	if(prevval==1){	return true;} //joker	
	if(prevval==2){return true;}	
	if(curval==2){return true;}
	if( prevval==curval  ) {return true;}
	if( (prevval<curval ) &&  (prevval!=7) ) {return true;}
	if((centerpile.size())==0) {return true;}
	if( (prevval==7) &&  ((curval<=7)||(curval==16)))	{return true;}
	if( (prevval==7) && (curval>7) ){return false;}
	if(prevval>curval) {return false;} //try keep falses at end
	
	System.out.println("end of valid move = FALSE!");
	return false;	
}







private void cleardeck() {
	for(JLabel b: centerpile) {
		backlabel.remove(b);
		backlabel.remove(ico);
		}
		repaint();
		centerpile.clear();
	}//end clear deck for ten or 4 of a kind








//make sure card is on top of previous card
private boolean ontop(JLabel pres, JLabel prev){
	if(  (pres.getX()<=prev.getX()-60)||
		 (pres.getX()>=prev.getX()+80)) {return false;}
	return true;
}
	




private boolean checkforwin(){
	if(player1.size()==0) {backlabel.removeAll();
	lose.setIcon(lose2i);backlabel.add(lose);repaint();
	lose.setIcon(lose1i);		
		return true;}
	if(player2.size()==0) {backlabel.removeAll();
	lose.setIcon(lose1i);backlabel.add(lose);repaint();
		lose.setIcon(lose1i);		
		return true;}
	return false;
}






// cards into centre of board
private boolean incenter() {
	if(  ((int)(loc.getX()-centerpos.x) >300) &&
			((int)(loc.getX()-centerpos.x)  <570) &&
			( (int)(loc.getY()-centerpos.y)   >220)   &&
			((int)(loc.getY()-centerpos.y)  <364)){return true;}
	return false;
}





private boolean validturn() {
	if(turn==0) {return true;}else
	if( (turn==1) && player1.contains(ico))	{return true;}else
	if( (turn==2) && player2.contains(ico)) {return true;}else
		System.out.println("NOT valid move turn=  "+turn+ " ico= " +ico);
		return false;
}//end validate turn







//same as prev card
public boolean same4card() {
	if(centerpile.size()>3) 
	{
		if(ico.getName()== centerpile.get(1).getName()&&
			ico.getName()==centerpile.get(2).getName()&&
			ico.getName()==centerpile.get(3).getName() )
			{return true;}
	}
	return false;		
}// end same 4 cards





private void reverseturn() {
	if(turn==1) {turn=2;} else if(turn==2) {turn=1;}
}




private void lights() {
	if(turn==1) {p1light.setEnabled(true); p2light.setEnabled(false);}	
	if(turn==2) {p2light.setEnabled(true); p1light.setEnabled(false);}	
}






private void replacecard() {
	if((player1hand.size()<3) && (cards.size()>0)) {
		//add deck card to empty space
		cards.get(0).setEnabled(true);
		backlabel.add(cards.get(0));
		cards.get(0).setLocation(cardpos);
		player1hand.add(cards.get(0));
		player1.add(cards.get(0));
		cards.remove(0);
	}
	if((player2hand.size()<3) && (cards.size()>0)) {
		//add deck card to empty space
		cards.get(0).setEnabled(true);
		backlabel.add(cards.get(0));
		cards.get(0).setLocation(comporigpos);
		player2hand.add(cards.get(0));
		player2.add(cards.get(0));
		cards.remove(0);
	}
}//end replace card






private boolean isuseable() {
	if((turn==0)&&(player1hand.contains(ico)||player2hand.contains(ico))) {return true;}
	if(player1hand.contains(ico)&&(turn==1)) {return true;}
	if(player2hand.contains(ico)&&(turn==2)) {return true;}
	if(player1top.contains(ico)&&(player1hand.size()==0)) {return true;}
	if(player2top.contains(ico)&&(player2hand.size()==0)) {return true;}
	if(player1bottom.contains(ico)&&(player1top.size()==0)&&(player1hand.size()==0)) {ico.setEnabled(true);return true;}
	if(player2bottom.contains(ico)&&(player2top.size()==0)&&(player2hand.size()==0)) {ico.setEnabled(true);return true;}

	return false;
}

//for testing
private void showarrays() {
//	for(JLabel b:player1top) {System.out.println("p1top "+b.getName());}
//	for(JLabel b:player1hand) {System.out.println("p1hand "+b.getName());}	
	for(JLabel b:centerpile) {System.out.println("centerpile "+b.getName());}
//	for(JLabel b:player1) {System.out.println("p1 all "+b.getName());}
//	for(JLabel b:player2) {System.out.println("p2 all "+b.getName());}
//	for(JLabel b:player2hand) {System.out.println("p2hand "+b.getName());}	
//	

}







	
	 
//pick up cards
 private void pickup() {
		j=1;
		i=0;
		int h=400;
		int k=25;
		if(turn==1)  { 
			player1hand.addAll(centerpile);player1.addAll(centerpile); 
			centerpile.clear();
		for(JLabel b:player1hand) {
			i=i+25;
			j=j+1;
			if(i>300) {i=0;j=j+50;k=20;h=h+40;}
			if(player1hand.size()>20) {h=450;}
			b.setLocation(x6+50-i,h-j);
			b.setEnabled(true);
			backlabel.add(b);
		}//end for player 1
	}else
		if(turn==2)  {
			player2hand.addAll(centerpile);player2.addAll(centerpile);
			centerpile.clear();
		for(JLabel b:player2hand) {
			i=i+25;
			j=j+1;
			if(i>300) {i=0;j=j+50;;h=h+40;}
			b.setEnabled(true);
			b.setLocation(x6+50-i,h-300-j);
			 backlabel.add(b);
		 }//end for player 2
		}//end if player2
		
		repaint();
		reverseturn();
		lights();
		}//end pickup
	 
	 
	 
	 
	 
	





private void movecard() {
lights();

	//for same value card not empty pile
	if((movesamecard==true) &&(centerpile.size()!=0)
			&&	ontop(ico,centerpile.get(centerpile.size()-1))) 
			{	
				if(samecard()) {
				docardmove();movesamecard=false;}
			}
	
	else 	
		
		//normal move
		if((centerpile.size()!=0)&&(movesamecard==false)&&(turn!=0) &&
			validmove()&&ontop(ico,centerpile.get(centerpile.size()-1))	)
	 		{docardmove();}
	
	else 	
		
		
		//first move
		if(  (centerpile.size()==0) && (cards.size()==36) )
			 {	if(player1.contains(ico)) {turn=1;}else 
				if(player2.contains(ico)) {turn=2;}
			docardmove();}
	
	else 
		
		// empty pile
		if(  (centerpile.size()==0) && (cards.size()!=36)   )
			{ docardmove();}
	
	else 
		
		{	// not valid move
		ico.setLocation(locorig);
		Collections.reverse(centerpile);
		System.out.println("not valid move end .. move");
		}
}//end movecard








private void docardmove() {
	ico.setEnabled(true);
	centerpile.add(ico);
	Collections.reverse(centerpile);
	if(ico.getName()=="ten") {	cleardeck();centerpile.remove(ico);	reverseturn();	}
	if((ico.getName()=="joker")){reverseturn();}
	
	if(centerpile.size()>2) {
	if(same4card()) {cleardeck();centerpile.remove(ico);	reverseturn();}
	}
	
	if(player1.contains(ico)) {player1.remove(ico);}	
	if(player1hand.contains(ico)) {player1hand.remove(ico);}		
	if(player1top.contains(ico)) {player1top.remove(ico);}		
	if(player1bottom.contains(ico)) {player1bottom.remove(ico);}		
	if(player2.contains(ico)) {player2.remove(ico);}	
	if(player2hand.contains(ico)) {player2hand.remove(ico);}		
	if(player2top.contains(ico)) {player2top.remove(ico);}		
	if(player2bottom.contains(ico)) {player2bottom.remove(ico);}	
	reverseturn();
}// end do card move




// switch turn
private void multiinstance() {
	i=0;
	String name=ico.getName();
	
	if(turn==2) {
		for(JLabel b:player1hand) {
			if(b.getName()==name) {++i;}
			}
			if(i>0) {
				System.out.println("i>0");
				movedone.setVisible(true);
				movesamecard=true;
				turn=1;
			}else {	
				turn=2;
				movedone.setVisible(false);
				movesamecard=false;}
	}//end if
}// end multi instance







public boolean samecard() {
	if(centerpile.size()>0) 
		{
			if(ico.getName()== (centerpile.get(centerpile.size()-1)).getName())
			{return true;}
		}
	ico.setLocation(locorig);
	Collections.reverse(centerpile);
	return false;		
}//end same card












JLabel topcardl =new JLabel();	//of centerpile

int compcardval=0;
//easy first
private void aiturn() {
	
String topcard=topcardl.getName();
	topcardl=centerpile.get(0);
	
	if(topcard=="two") {prevval=2;}
	if(topcard=="three") {prevval=3;}
	if(topcard=="four") {prevval=4;}
	if(topcard=="five") {prevval=5;}
	if(topcard=="six") {prevval=6;}
	if(topcard=="seven") {prevval=7;}
	if(topcard=="eight") {prevval=8;}
	if(topcard=="nine") {prevval=9;}
	if(topcard=="ten") {prevval=16;}
	if(topcard=="jack") {prevval=11;}
	if(topcard=="queen") {prevval=12;}
	if(topcard=="king") {prevval=13;}
	if(topcard=="ace") {prevval=14;}
	if(topcard=="joker") {prevval=1;}
	
	System.out.println("top card value="+centerpile.get(0).getName());

	for(JLabel b: player2hand) {System.out.println("b= "+b.getName());}
	
	for(JLabel b: player2hand) {
		if(b.getName()=="two") {compcardval=2;}
		if(b.getName()=="three") {compcardval=3;}
		if(b.getName()=="four") {compcardval=4;}
		if(b.getName()=="five") {compcardval=5;}
		if(b.getName()=="six") {compcardval=6;}
		if(b.getName()=="seven") {compcardval=7;}
		if(b.getName()=="eight") {compcardval=8;}
		if(b.getName()=="nine") {compcardval=9;}
		if(b.getName()=="ten") {compcardval=16;}
		if(b.getName()=="jack") {compcardval=11;}
		if(b.getName()=="queen") {compcardval=12;}
		if(b.getName()=="king") {compcardval=13;}
		if(b.getName()=="ace") {compcardval=14;}
		if(b.getName()=="joker") {compcardval=16;}
		
		if(compcardval>prevval) {ico=b;break;}
	}
	
	if(compcardval>prevval) {playcompcard();}else {pickup();}
	
	
	//	System.out.println("ai ico= "+ico.getName());
	//	System.out.println("comp cardval= "+compcardval);
	//	System.out.println("prevval= "+prevval);
	//	System.out.println("comp card= "+ico.getName()+ " turn= "+turn);
	//	System.out.println("comp card equal= "+ico.getName()+ " turn= "+turn);

	

	
}//end aiturn


	Point topcardpos=new Point(); 
	Point compcardpos=new Point();
	Point comporigpos=new Point();
	
private void playcompcard() {
	comporigpos=ico.getLocation();
	

	System.out.println("comp card pos== "+compcardpos);
	topcardpos=	topcardl.getLocation();
	
	compcardpos.x=topcardpos.x+15;
	compcardpos.y=topcardpos.y;
	ico.setLocation(compcardpos.x,compcardpos.y);
//	docardmove();
//	movecard();
//	player2hand.remove(i);
//	player2.remove(i);
//	reverseturn();
//	replacecard();
//	replaceall(ico);
//	lights();
	Collections.reverse(centerpile);
	System.out.println("comp card= "+ico.getName()+ " turn= "+turn);

if (ico!=null) {
	
	backlabel.add(ico);	
	replaceall(ico);
	repaint();
	movecard();     
	multiinstance();
	replacecard();
	System.out.println("comp orig pos== "+comporigpos );
	
}else {
	Collections.reverse(centerpile);
	System.out.println(" ");
	ico.setLocation(locorig);	
	}

lights();
checkforwin();










}


































//	mouse released
//	movecard();     
//	multiinstance();
//	replacecard();


	
	
private class dealListener implements ActionListener{
	
	public void actionPerformed(ActionEvent e) {
		if((e.getSource()==Deal)||(e.getSource()==Dealem))
		{System.out.println("Deal");
		cards.clear();
		cardsinplay.clear();
		player1.clear();
		player2.clear();
		player1useable.clear();
		player2useable.clear();
		player1bottom.clear();
		player2bottom.clear();
		player1top.clear();
		player2top.clear();
		player1hand.clear();
		player2hand.clear();
		backlabel.removeAll();
		centerpile.clear();
		NewGame();
		}
		
		
		
		if(e.getSource()==movedone) {
			movedone.setVisible(false);	reverseturn();
			
			lights();
			movesamecard=false;	//only able to move same card in extra go
			}
		
	
		// pick up cards
		if(e.getSource()==pickupcards) {pickup();	}
	}// end action performed
	
	
}//end dealListener
	
	


	private class mouselisten implements MouseListener, MouseMotionListener{
	


	
		
		@Override
		public void mousePressed(MouseEvent e) {
				ico=(JLabel) e.getComponent();
				cardpos=ico.getLocation();
				loc= ico.getLocation();	//get position
				locorig=loc;
			
			if((ico.getName()!="background") && isuseable()) {	
				backlabel.add(ico);	
				replaceall(ico);
				repaint();
				}else{Collections.reverse(centerpile);}
				}// end pressed
		
 
		
		
		
		
		
		
			@Override
		public void mouseDragged(MouseEvent e) {
				loc=e.getLocationOnScreen();
				if((ico.getName()!="background") && isuseable()) {	
					    ico.setLocation(((int)loc.getX()+50-centerpos.x),
						(int)(loc.getY()-80)-centerpos.y); }
			}//end dragged
		
		
	
			
			

		@Override
		public void mouseReleased(MouseEvent e) {
	
			if( (ico.getName()!="background")&&(centerpile.size()==0) &!incenter()
					&&(cards.size()==36)&& isuseable() )
					 {
						sortcards(); 
					 }else
			
			if((ico.getName()!="background")&&	validturn()&& 
					isuseable() && incenter()&&validmove()) 
					{			
						movecard();     
						multiinstance();
						replacecard();
						System.out.println(" ");
					}else {
						Collections.reverse(centerpile);
						System.out.println(" ");
						ico.setLocation(locorig);	
						}
			
				lights();
				checkforwin();
				if(turn==2) {aiturn();
				if(ico.getName()=="ten") {aiturn();}
				if(ico.getName()=="joker") {aiturn();}
				if(same4card()) {aiturn();}
				}
			}//end mouse released

	
		
		
		
		
		
		
		
		@Override
		public void mouseClicked(MouseEvent e) {
			//	System.out.println("x= "+e.getX()+" y= "+e.getY());
			}

				@Override
				public void mouseEntered(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}

				@Override
				public void mouseExited(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}
		
		
		
		@Override
		public void mouseMoved(MouseEvent e) {
		//		 changee=(JLabel) e.getComponent();
		//		 changeeloc=changee.getLocation(); 
				}

		private String getX() {
			// TODO Auto-generated method stub
			return null;}
			
		}

	
	private class complisten implements ComponentListener{

	


	@Override
	public void componentHidden(ComponentEvent e) {
		// TODO Auto-generated method stub
		
	}


//for window move correction
	@Override
	public void componentMoved(ComponentEvent e) {
		
		 centerpos=getLocation();	
		
	}



	@Override
	public void componentResized(ComponentEvent e) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void componentShown(ComponentEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
	

public static void main(String args[]) {
	new ShitHead();
}//end main
	
	
	
	
	
}//end shithead