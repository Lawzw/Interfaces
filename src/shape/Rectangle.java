package shape;

public class Rectangle extends Shape {

	private float a;
	private float b;
	private float sum;
	private float area;
	public void setPerimeter(float a,float b){
		this.a=a;
		this.b=b;
		sum=2*(a+b);
	}
	public void getPerimeter() {
		// TODO Auto-generated method stub
		System.out.println("长方形周长为："+sum);
	}

	public void setArea(float a,float b){
		this.a=a;
		this.b=b;
		area=a*b;
	}
	public void getArea() {
		// TODO Auto-generated method stub
		System.out.println("长方形面积为："+area);
	}

}
