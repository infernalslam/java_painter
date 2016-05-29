public class Ellipse extends Point {
	private static int  h;
	private static int w;
	public Ellipse() {
		
	}
	public Ellipse(int x,int y,int h,int w) {
		setX(x);
		setY(y);
		setH(h);
		setW(w);
	}
	public void setH(int h){
		this.h = h;
		
	}
	public void setW(int w){
		this.w = w;
		
	}
	public int getH(){
		
		return h;
	}
	public int getW(){
		
		return w;
	}
	
	public String toString(){
		return "x :" + x + " " + " y : " + y + " w : " + w +  " h : " + h;
	}
	
//	public static void main(String [] args){
//		Ellipse p = new Ellipse(10,20,5,12);
//		System.out.print(p.toString());
//	}
}
