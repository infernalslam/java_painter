import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.BorderFactory;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Ui extends JApplet implements MouseMotionListener,ActionListener,MouseListener{
	
	private JPanel p2,p3; /*กำหนด panel*/
	private JButton Line,Rec,Circle,Ell,Quit; /*ปุ่มกดเลือกรูป*/
	private JButton Red,Green,Blue,Black,Magenta,Cyan,Yellow; /*ปุ่มสี*/
	private JLabel Line1,Line2; /* ========= */
	private JTextField t1,t2,t3,t4,t5; /*เเสดงสถานะข้างล่าง*/
	/*class สร้างไว้เเสดงผล ชื่อ panel*/
	private Panel p ; /*วาดรูป*/
	
	/*ตัวแปรค่า class*/
	private Line line;
	private Rectangle Re;
	private Circle cir;
	private Ellipse ell;
	
	
	
	
	public void init(){
		super.setSize(1024, 768); /*กำหนดขนาดน่าจอเเสดงผล*/
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		/*class variable*/
		line = new Line();
		Re= new Rectangle();
		cir = new Circle();
		ell = new Ellipse();
		
		
		/*กำหนดค่า*/
		Line = 	new JButton("      Line      ");Line.addActionListener(this);
		Rec = 	new JButton(" Rectangle");Rec.addActionListener(this);
		Circle= new JButton("    Circle     ");Circle.addActionListener(this);
		Ell = 	new JButton("    Ellipse    ");Ell.addActionListener(this);
		
		Red = 	new JButton("       Red      ");Red.addActionListener(this);
		Green = new JButton("    Green     ");Green.addActionListener(this);
		Black = new JButton("     BLack    ");Black.addActionListener(this);
		Magenta=new JButton("  Magenta  ");Magenta.addActionListener(this);
		Blue=new JButton("      Blue      ");Blue.addActionListener(this);
		Cyan = 	new JButton("      Cyan     ");Cyan.addActionListener(this);
		Yellow= new JButton("     Yellow   ");Yellow.addActionListener(this);
		Quit =  new JButton("       Quit      ");Quit.addActionListener(this);
		Line1 = new JLabel("=============");
		Line2 = new JLabel("=============");
		
		
		t1 = new JTextField(15);t1.setEditable(false);
		t2 = new JTextField(15);t2.setEditable(false);
		t3 = new JTextField(15);t3.setEditable(false);
		t4 = new JTextField(15);t4.setEditable(false);
		t5 = new JTextField(10);t5.setEditable(false);
		
		/*p2*/
		p2 = new JPanel();
		p2.setPreferredSize(new Dimension(120,600));
		p2.setBorder(BorderFactory.createBevelBorder(0));
		p2.add(Line);
		p2.add(Rec);
		p2.add(Circle);
		p2.add(Ell);
		p2.add(Line1);
		p2.add(Red);
		p2.add(Green);
		p2.add(Blue);
		p2.add(Black);
		p2.add(Magenta);
		p2.add(Cyan);
		p2.add(Yellow);
		p2.add(Line2);
		p2.add(Quit);
		
		/*p3*/
		p3 = new JPanel();
		p3.setPreferredSize(new Dimension(930,50));
		p3.setBorder(BorderFactory.createBevelBorder(0));
		p3.add(t1);
		p3.add(t2);
		p3.add(t3);
		p3.add(t4);
		p3.add(t5);
		
		/*p*/
		p = new Panel();
		p.addMouseMotionListener(this);
		p.addMouseListener(this);
		
		/*ค่าเริ่มต้นของ container*/
		c.add(p);
		c.add(p2);
		c.add(p3);
		
		
		
		/*ค่าเริ่มต้น*/
		t1.setText("Type : Line");
		t2.setText("Color : Red");
		
	}
	
	public void paint(Graphics g){
		super.paint(g);
		
	}
	
	
	/*action performed*/
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == Line){
			p.setType(1);
			t1.setText("Type : Line");
		}
		if(e.getSource() == Rec){
			p.setType(2);
			t1.setText("Type : Rectangle");
		}
		if(e.getSource() == Circle){
			p.setType(3);
			t1.setText("Type : Circle");
		}
		if(e.getSource() == Ell){
			p.setType(4);
			t1.setText("Type : Ellipse");
		}
		
		if(e.getSource() == Red){
			p.setColor(Color.red);
			t2.setText("Color : Red");
			
		}
		if(e.getSource() == Green){
			p.setColor(Color.GREEN);
			t2.setText("Color : Green");
			
		}
		if(e.getSource() == Blue){
			p.setColor(Color.BLUE);
			t2.setText("Color : Blue");
			
		}
		if(e.getSource() == Black){
			p.setColor(Color.BLACK);
			t2.setText("Color : Black");
			
		}
		if(e.getSource() == Magenta){
			p.setColor(Color.MAGENTA);
			t2.setText("Color : Magenta");
			
		}
		if(e.getSource() == Cyan){
			p.setColor(Color.CYAN);
			t2.setText("Color : Cyan");
			
		}
		if(e.getSource() == Yellow){
			p.setColor(Color.YELLOW);
			t2.setText("Color : Yellow");
			
		}
		if(e.getSource()==Quit){
			System.exit(0);
		}	
		
	}
	
	/*action mouse*/
	public void mousePressed(MouseEvent e) {
		t3.setText("X1 : "+e.getX()+", Y1 : "+e.getY());
		if(p.getType()==1){
			line.setX(e.getX());
			line.setY(e.getY());
		}
		if(p.getType()==2){
			Re.setX(e.getX());
			Re.setY(e.getY());	
		}
		if(p.getType() == 3){
			cir.setX(e.getX());
			cir.setY(e.getY());
		}
		if(p.getType() == 4){
			ell.setX(e.getX());
			ell.setY(e.getY());	
		}
	}
	
	public void mouseDragged(MouseEvent e) {
		t4.setText("X2 : "+e.getX()+", Y2 : "+e.getY());
		if(p.getType() == 1){
		line.setX2(e.getX());
		line.setY2(e.getY());
		}
		if(p.getType() == 2){
			Re.setW(e.getX()-Re.getX());
			Re.setH(e.getY()-Re.getY());
		}
		if(p.getType() == 3){
			cir.setR((e.getX()-cir.getX()));
			
			
		}
		if(p.getType() == 4){
			ell.setW(e.getX()-ell.getX());
			ell.setH(e.getY()-ell.getY());
		}
		p.draw();
	}
	public void mouseMoved(MouseEvent e) {
		t5.setText(e.getX()+"  ,  "+e.getY());
	}
	
	public void mouseClicked(MouseEvent e) {}	
	public void mouseEntered(MouseEvent e) {}	
	public void mouseExited(MouseEvent e) {}	
	public void mouseReleased(MouseEvent e) {}
	
    
}
