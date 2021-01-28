package BTH1.BTH1;

public class SteeringOutput {
	private Vector linear;
	public Vector getLinear() {
		return linear;
	}
	public void setLinear(Vector linear) {
		this.linear = linear;
	}
	public float getAngular() {
		return angular;
	}
	public void setAngular(float angular) {
		this.angular = angular;
	}
	private float angular;
	public SteeringOutput() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SteeringOutput(Vector linear, float angular) {
		super();
		this.linear = linear;
		this.angular = angular;
	}
	
}
