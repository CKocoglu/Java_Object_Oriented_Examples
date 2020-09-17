
public class Rectangle extends Shape {
	private double width;
	private double length;
	
	public Rectangle(){
		this.width=1;
		this.length=1;
	}
	public Rectangle(double width,double length){
		this.width=width;
		this.length=length;
	}
	public Rectangle(double width,double length,String color,boolean filled){
		super(color,filled);
		this.length=length;
		this.width=width;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", length=" + length + "]";
	}
	
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	
	

}
