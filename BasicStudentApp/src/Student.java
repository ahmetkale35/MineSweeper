public abstract class Student {
	int id;
	float mid;
	float fin;

	public Student(int id, float mid, float fin) {
		this.id = id;
		this.mid = mid;
		this.fin = fin;
	}
	abstract float computeTotalScore();

	abstract float computeBaseScore();
}