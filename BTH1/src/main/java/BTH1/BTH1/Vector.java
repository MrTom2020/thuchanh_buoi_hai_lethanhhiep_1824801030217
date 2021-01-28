package BTH1.BTH1;

public class Vector {
	private float x;
	private float y;
	public Vector() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Vector(float x, float y) {
		super();
		this.x = x;
		this.y = y;
	}
	public float getX() {
		return x;
	}
	public void setX(float x) {
		this.x = x;
	}
	public float getY() {
		return y;
	}
	public void setY(float y) {
		this.y = y;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Float.floatToIntBits(x);
		result = prime * result + Float.floatToIntBits(y);
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vector other = (Vector) obj;
		if (Float.floatToIntBits(x) != Float.floatToIntBits(other.x))
			return false;
		if (Float.floatToIntBits(y) != Float.floatToIntBits(other.y))
			return false;
		return true;
	}
	public Vector add(Vector a)
	{
		this.x+=a.getX();
		this.y+=a.getY();
		return this ;
	}
	public static Vector add(Vector a, Vector  b)
	{
		return new Vector(a.getX()+b.getX(),a.getY()+b.getY());
	}
	public float modul(){
		return (float)Math.sqrt(Math.pow(this.getX(), 2) + Math.pow(this.getY(), 2));
	}
	public Vector Normalize(){
		float z=(float)Math.sqrt(Math.pow(this.getX(), 2)+ Math.pow(this.getY(), 2));
		Vector c= new Vector();
		c.setX(this.getX()/z);
		c.setY(this.getY()/z );
		return c;
	}
	public Vector mudl(float x){
		this.x*=x;
		this.y*=x;
		return this;
	}
	
	
	
	

}
