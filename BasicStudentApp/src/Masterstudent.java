public class Masterstudent extends Student implements ConferenceScoreBehaviour {
	int numberOfConf;

	public Masterstudent(int id, float mid, float fin, int numberOfConf) {
		super(id, mid, fin);
		this.numberOfConf = numberOfConf;
	}

	@Override
	public float conferenceScore() {
		return numberOfConf*5;
	}

	@Override
	float computeTotalScore() {
		return computeBaseScore() + conferenceScore(); 
	}

	@Override
	float computeBaseScore() {
		
		return (float) ((float)mid*0.4 + fin*0.6);
	}
}