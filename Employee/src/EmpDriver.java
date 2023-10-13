
public class EmpDriver {

	public static void main(String[] args) {
		Employee e1 = new Employee("Kemal", 2000, 45, 17);

		System.out.println("Name : " + e1.name);
		System.out.println("Salary : " + e1.salary);
		System.out.println("Work Hour : " + e1.wh);
		System.out.println("work time(year) : " + e1.hy);
		System.out.println("Tax : " + e1.tax);
		System.out.println("Bonus : " + e1.bm);
		System.out.println("Raise of Salary : " + e1.rs);

	}

}
