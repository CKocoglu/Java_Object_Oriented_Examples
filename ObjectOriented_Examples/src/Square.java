
public class Square extends Rectangle {
	private double side;
	public Square(){
		
	}
	public Square(double side) {
		super(side, side);
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Square(double side, String color, boolean filled) {
		super(side, side, color, filled);
		// TODO Auto-generated constructor stub
	}


	public Square(double width, double length) {
		super(width, length);
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return "Square [side=" + side + "]";
	}
	
	
	
	@Override
	public void setWidth(double side){
		super.setWidth(side);
		super.setLength(side);
	}
	@Override
	public void setLength(double side){
		super.setWidth(side);
		super.setLength(side);
	}
	
	public double getSide() {
		return side;
	}
	public void setSide(double side) {
		this.side = side;
	}
	@Override
	public double getArea() {
		
		return 0;
	}

	@Override
	public double getPerimeter() {
		
		return 0;
	}

}
