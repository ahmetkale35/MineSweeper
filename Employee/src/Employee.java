import java.awt.event.MouseWheelEvent;
import java.security.InvalidAlgorithmParameterException;

import javax.imageio.plugins.bmp.BMPImageWriteParam;

public class Employee {
	public String name;
	public int salary;
	public float wh; // wh = work hours
	public int hy; // hy = work time(year)
	public float tax;
	public float bm; // bm = Bonus
	public float rs; // rs = raise of salary

	Employee(String name, int salary, int wh, int hy) {
		this.name = name;
		this.salary = salary;
		this.wh = wh;
		this.hy = hy;
		this.tax = TaxMethod(salary);
		this.bm = BonusMethod(wh);
		this.rs = RaiseSalary(hy, salary);
	}

	public float TaxMethod(int salary) {
		float tax = 0;
		if (salary > 1000) {
			tax = (float) (0.03 * salary);
			return tax;
		} else {
			return tax;
		}
	}

	public float BonusMethod(float wh) {
		int minute = (int) (60 * wh);
		float bm = 0;
		if (minute > (480 * 5)) {
			bm = 30 * ((minute - (480 * 5)) / 60);
			return bm;
		} else {
			return bm;
		}
	}

	public float RaiseSalary(int hy, int salary) {
		float rs = 0;

		if (hy < 10) {
			rs = (float) ((0.05) * salary);
			return rs;
		} else {
			if ((hy < 20) && (hy > 9)) {
				rs = (float) ((0.10) * salary);
				return rs;
			} else {
				rs = (float) ((0.15) * salary);
				return rs;
			}
		}

	}
}
