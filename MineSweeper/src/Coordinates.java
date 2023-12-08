import java.io.StreamCorruptedException;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArraySet;

import org.w3c.dom.ls.LSOutput;

public class Coordinates {
	int row1;
	int collon1;

	public Coordinates(int row1, int collon1) {
		this.row1 = row1;
		this.collon1 = collon1;
	}

	public static int score(int matris[][]) {
		int score = 0;
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++)
				switch (matris[i][j]) {
				case 3:
					score += 5;
					break;
				case 4:
					score += 1;
					break;
				default:
					break;
				}
		}
		return score;
	}

	public static int randomizer() {

		Random rand1 = new Random();
		int min = 0;
		int max = 9;
		int x1 = rand1.nextInt((max - min) + 1) + min;

		return x1;
	}

	public static void setMinesToField(int matris[][], int x1, int y1) {
		matris[x1][y1] = 1;
	}

	public static void printMineField(int matris[][]) {
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				switch (matris[i][j]) {
				case 0:
					System.out.print("- ");
					break;
				case 1:
					System.out.print("- ");
					break;
				case 2:
					System.out.print("* ");
					break;
				case 3:
					System.out.print("o ");
					break;
				case 4:
					System.out.print("x ");
					break;

				}
			}
			System.out.println();
		}

	}

	public static void startLocation(int matris[][]) {
		int currx = randomizer();
		int curry = randomizer();
		matris[currx][curry] = 2;
	}

	public static Boolean nearMines(int matris[][], int currx, int curry) {
		if (matris[currx - 1][curry] == 1) {
			return true;
		} else {
			if (matris[currx][curry + 1] == 1) {
				return true;
			} else {
				if (matris[currx + 1][curry] == 1) {
					return true;
				} else {
					if (matris[currx][curry - 1] == 1) {
						return true;
					} else {
						return false;
					}
				}
			}
		}

	}

	public static int[][] mapCopier(int matris1[][], int matris2[][]) {
		int i, j;

		for (i = 0; i < 10; i++) {
			for (j = 0; j < 10; j++) {
				matris2[i + 2][j + 2] = matris1[i][j];
			}
		}

		return matris2;
	}

}