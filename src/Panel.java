import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

public class Panel extends JPanel {
	private Color color=Color.red;
	private Line line;
	private Rectangle Re;
	private Circle cir;
	private Ellipse ell;
	private int type=1;
	public Panel() {
		
		setPreferredSize(new Dimension(800,600));
		setBorder(BorderFactory.createLineBorder(Color.MAGENTA,3));
		
		line = new Line();
		Re= new Rectangle();
		cir = new Circle();
		ell = new Ellipse();
		
	}
	public void setColor(Color color){
		this.color = color;
	}
	public void setType(int type){
		this.type = type;
	}
	public int getType(){
		return type;
	}
	public void draw(){
		repaint();
	}
	
	public void paint(Graphics g){
		super.paint(g);
		g.setColor(color);
		if(type == 1)
			g.drawLine(line.getX(), line.getY(), line.getX2(), line.getY2());
		if(type == 2)
			g.drawRect(Re.getX(), Re.getY(), Re.getW(), Re.getH());
		if(type == 3)
			g.drawOval(cir.getX()-cir.getR(), cir.getY()-cir.getR(), 
					cir.getR()*2,cir.getR()*2);
		if(type == 4)
			g.drawOval(ell.getX()-ell.getW(), ell.getY()-ell.getH(), ell.getW()*2, ell.getH()*2);
	}

}
