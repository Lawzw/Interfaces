package demo;

public class Initail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo01 demo=new Demo01();
		demo.age=20;
		Demo01 demo2=new Demo01();
		demo2.age=20;
		if(demo.equals(demo2)){
			System.out.println("两个对象相同");
		}else 
			System.out.println("两个对象不相同");
	}

}
