
public class Point {
	protected static int x;
	protected static int y;
	public Point(){}
	public Point(int x, int y){
		setX(x);
		setY(y);
	}
	public void setX(int x){
		this.x = x;
	}
	public void setY(int y){
		this.y = y;
	}
	public int getX(){
		return x;
	}
	public int getY(){
		return y;
	}
	public String toString(){
		return "x :" + x + " " + " y : " + y ;
	}
//	public static void main(String [] args){
//		Point p = new Point(10,20);
//		System.out.print(p.toString());
//	}
}
