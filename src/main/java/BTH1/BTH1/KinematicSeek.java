package BTH1.BTH1;

public class KinematicSeek
{
	
	public static float maxSpeed =0;
	public static float getMaxSpeed() {
		return maxSpeed;
	}

	public static void setMaxSpeed(float maxSpeed) {
		KinematicSeek.maxSpeed = maxSpeed;
	}

	public Vector getTarget() {
		return target;
	}

	public void setTarget(Vector target) {
		this.target = target;
	}

	public Vector getCharactor() {
		return charactor;
	}

	public void setCharactor(Vector charactor) {
		this.charactor = charactor;
	}

	private Vector target;
	private Vector charactor;
	
	public KinematicSeek() {
		super();
		// TODO Auto-generated constructor stub
	}

}
