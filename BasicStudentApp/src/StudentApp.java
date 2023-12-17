
public class StudentApp {

	public static void main(String[] args) {
		Student s1 = new BachelourStudent(1, 50f, 50f);
		BachelourStudent b1 = new BachelourStudent(2, 50f, 50f);
		Masterstudent m1 = new Masterstudent(3, 50f, 50f, 2);
		
		System.out.println("Total Score of s1 :" + s1.computeBaseScore());
		System.out.println("Total Score of b1 :" + b1.computeTotalScore());
		System.out.println("Total Score of m1 :" + m1.computeTotalScore());
		
	}

}
