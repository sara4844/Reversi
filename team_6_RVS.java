package Reversi;

import java.util.Scanner;

public class team_6_RVS {
	static int[][] board;

	// initialize board
	public static void initialize() {
		board = new int[14][8];

		// make every cell free
		for (int i = 0; i < 14; i++) {
			for (int j = 0; j < 8; j++) {
				board[i][j] = 0;
			}
		}

		// -1 represents invalid cell
		board[0][0] = -1;
		board[0][1] = -1;
		board[0][2] = -1;
		board[1][0] = -1;
		board[1][1] = -1;
		board[2][0] = -1;

		board[13][0] = -1;
		board[13][1] = -1;
		board[13][2] = -1;
		board[12][0] = -1;
		board[12][1] = -1;
		board[11][0] = -1;

		board[0][5] = -1;
		board[0][6] = -1;
		board[0][7] = -1;
		board[1][6] = -1;
		board[1][7] = -1;
		board[2][7] = -1;

		board[13][7] = -1;
		board[13][6] = -1;
		board[13][5] = -1;
		board[12][7] = -1;
		board[12][6] = -1;
		board[11][7] = -1;

		// 1 is light color and your cell
		// 2 is dark color and opponent's cell
		board[6][3] = 1;
		board[7][3] = 2;
		board[6][4] = 2;
		board[7][4] = 1;
	}

	// printing current board
	public static void printBoard() {
		for (int j = 0; j < 8; j++) {
			for (int i = 0; i < 14; i++) {
				if (board[i][j] != -1)
					System.out.print(board[i][j]);
			}
			System.out.println();
		}
	}

	// update board
	public static void update() {

	}

	public static void main(String args[]) {
		initialize();

		//input
		Scanner sc = new Scanner(System.in);
		for (int j = 0; j < 8; j++) {
			for (int i = 0; i < 14; i++) {
				if (board[i][j] != -1)
					board[i][j] = sc.nextInt();
			}
		}
		
		update();

		printBoard();

	}
}
