public class Line extends Point {
	protected static int x2;
	protected static int y2;
	
	public Line(){}
	public Line(int x1, int y1, int x2, int y2){
		setX(x1);
		setY(y1);
		setX2(x2);
		setY2(y2);
	}
	
	public void setX2(int x2){
		this.x2 = x2;
	}
	public void setY2(int y2){
		this.y2 = y2;
	}
	
	public int getX2(){
		return x2;
	}
	public int getY2(){
		return y2;
	}
	
	
	public String toString(){
		return "x1 :" + x + " " + " y1 : " + y  + " x2 : " + x2 + " y2 : " + y2;
	}
	
	
//	public static void main(String [] args){
//		Line p = new Line(10,20,21,56);
//		System.out.print(p.toString());
//	}
}
