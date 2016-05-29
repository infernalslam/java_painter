public class Circle extends Point{
	private static int r;
	public Circle() {
		
	}
	public Circle(int x,int y,int r) {
		setX(x);
		setY(y);
		setR(r);
	}
	public void setR(int r){
		this.r = r;
	}
	public int getR(){
		return r;
	}
	
	public String toString(){
		return "x :" + x + " " + " y : " + y + " r : " + r;
	}
	
//	public static void main(String [] args){
//		Circle p = new Circle(10,20,5);
//		System.out.print(p.toString());
//	}
}
