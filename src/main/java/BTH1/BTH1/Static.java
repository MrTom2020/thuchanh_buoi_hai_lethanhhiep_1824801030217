package BTH1.BTH1;

public class Static
{
	private Vector position;
    private float orientation;
	public Vector getPosition() {
		return position;
	}
	public void setPosition(Vector position) {
		this.position = position;
	}
	public float getOrientation() {
		return orientation;
	}
	public void setOrientation(float orientation) {
		this.orientation = orientation;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	public float getX() {
		return position.getX();
	}
	public void setX(float x) {
		position.setX(x);
	}
	public float getY() {
		return position.getY();
	}
	public void setY(float y) {
		position.setY(y);
	}
	public Vector add(Vector a) {
		return position.add(a);
	}
	public float modul() {
		return position.modul();
	}
	public Vector Normalize() {
		return position.Normalize();
	}
	public Vector mudl(float x) {
		return position.mudl(x);
	}
	
	
}
