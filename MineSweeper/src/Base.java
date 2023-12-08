import java.util.Scanner;

public class Base {

	public static void main(String[] args) {
		
		int reqmine;
		int minesCounter = 0;

		Scanner sca1 = new Scanner(System.in);

		System.out.println("How many mines do you want in the game?");
		reqmine = sca1.nextInt();

		int matris1[][] = new int[10][10];
		int[][] matris2 = new int[15][15];

		while (minesCounter < reqmine) {
			int row = Coordinates.randomizer();
			int collon = Coordinates.randomizer();
			Coordinates.setMinesToField(matris1, row, collon);
			minesCounter++;
			}

		int currx = Coordinates.randomizer();
		int curry = Coordinates.randomizer();
		matris1[currx][curry] = 2;
		Coordinates.mapCopier(matris1, matris2);
		Coordinates.printMineField(matris1);
		while (true) {
			Coordinates.mapCopier(matris1, matris2);
			System.out.println("Your Score : " + Coordinates.score(matris2));
			System.out.println("8 - up");
			System.out.println("4 - left");
			System.out.println("6 - right");
			System.out.println("2 - down");

			int ch = sca1.nextInt();
			switch (ch) {
			case 8:
				int temp1 = currx;
				if (currx > 0) {
					currx = currx - 1;
				} else {

				}
				if (matris1[currx][curry] == 1) {
					System.out.println("BOOOOOM");
					System.out.println("Game Over");
					System.exit(0);
				} else {
					if(matris1[temp1][curry] == 3) {
						matris1[temp1][curry] = 3;
					}else {
						matris1[temp1][curry] = 4;
					}
					matris1[currx][curry] = 2;
				}
				if(Coordinates.nearMines(matris2, currx +2, curry +2)) {
					matris1[currx][curry] = 3;
				}
				else {
					if(matris1[temp1][curry] == 0) {
						matris1[temp1][curry] = 4;
					}
				}
				Coordinates.printMineField(matris1);
				break;
			case 4:
				int temp2 = curry;
				if (curry > 0) {
					curry = curry - 1;
				} else {

				}
				if (matris1[currx][curry] == 1) {
					System.out.println("BOOOOOM");
					System.out.println("Game Over");
					System.exit(0);
				} else {
					if(matris1[currx][temp2] == 3) {
						matris1[currx][temp2] = 3;
					}else {
						matris1[currx][temp2] = 4;
					}
					matris1[currx][curry] = 2;
				}
				if(Coordinates.nearMines(matris2, currx +2, curry +2)) {
					matris1[currx][curry] = 3;
				}
				else {
					if(matris1[currx][temp2] == 0) {
						matris1[currx][temp2] = 4;
					}
				}
				Coordinates.printMineField(matris1);
				break;
			case 6:
				int temp3 = curry;
				if (curry < 9) {
					curry = curry + 1;
				} else {

				}
				if (matris1[currx][curry] == 1) {
					System.out.println("BOOOOOM");
					System.out.println("Game Over");
					System.exit(0);
				} else {
					if(matris1[currx][temp3] == 3) {
						matris1[currx][temp3] = 3;
					}else {
						matris1[currx][temp3] = 4;
					}
					matris1[currx][curry] = 2;
				}
				if(Coordinates.nearMines(matris2, currx +2, curry +2)) {
					matris1[currx][curry] = 3;
				}
				else {
					if(matris1[currx][temp3] == 0) {
						matris1[currx][temp3] = 4;
					}
				}
				Coordinates.printMineField(matris1);
				break;
			case 2:
				int temp4 = currx;
				if (currx < 9) {
					currx = currx + 1;
				} else {

				}
				if (matris1[currx][curry] == 1) {
					System.out.println("BOOOOOM");
					System.out.println("Game Over");
					System.exit(0);
				} else {
					if(matris1[temp4][curry] == 3) {
						matris1[temp4][curry] = 3;
					}else {
						matris1[temp4][curry] = 4;
					}
					matris1[currx][curry] = 2;
				}
				if(Coordinates.nearMines(matris2, currx +2, curry +2)) {
					matris1[currx][curry] = 3;
				}
				else {
					if(matris1[temp4][curry] == 0) {
						matris1[temp4][curry] = 4;
					}
				}
				Coordinates.printMineField(matris1);
				break;
			default:
				break;
			}
		}
	}
}