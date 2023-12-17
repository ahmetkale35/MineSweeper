public class BachelourStudent extends Student implements ProjectScoreBehaviour {

	public BachelourStudent(int id, float mid, float fin) {
		super(id, mid, fin);
	}

	@Override
	float computeTotalScore() {
		return computeBaseScore() + projectScore();
	}

	@Override
	float computeBaseScore() {
		return (float) (mid * 0.4 + fin * 0.6);
	}

	@Override
	public float projectScore() {
		return 20;
	}
}