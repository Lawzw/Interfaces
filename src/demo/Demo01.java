package demo;

public class Demo01 extends Object{
	public int age;
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Demo01 other = (Demo01) obj;
		if (age != other.age)
			return false;
		return true;
	}
	
}
