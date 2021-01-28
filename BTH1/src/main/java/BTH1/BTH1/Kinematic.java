package BTH1.BTH1;

public class Kinematic {
	private Vector position;
	private float orientation ;
	
	public Kinematic(Vector position, float orientation, Vector velocity, float rotation) {
		super();
		this.position = position;
		this.orientation = orientation;
		this.velocity = velocity;
		this.rotation = rotation;
	}
	public Kinematic() {
		super();
		// TODO Auto-generated constructor stub
	}
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
	public Vector getVelocity() {
		return velocity;
	}
	public void setVelocity(Vector velocity) {
		this.velocity = velocity;
	}
	public float getRotation() {
		return rotation;
	}
	public void setRotation(float rotation) {
		this.rotation = rotation;
	}
	private Vector velocity; 
	
	private float rotation ;
	public void update(SteeringOutput steering,float time){
		//position.setX((float)(position.getX()+ velocity.modul()*time +0.5 * steering.getLinear().Normalize().modul() * time * time));
		//position.a
		position.add(velocity.mudl(time));
	}
}
