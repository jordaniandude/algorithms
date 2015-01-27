public class Sprial {

	public static void main(String[] args) {
		// int[][] array ={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		String[][] array = { { "a", "b", "c", "d", "e", "l" }, { "f", "g", "h", "i", "j", "2" },
				{ "k", "m", "l", "n", "o", "3" }, { "p", "q", "r", "s", "t", "4" } };
		StringBuffer str = spiral(array);
		System.out.println(str.toString());
	}

	public static StringBuffer spiral(String[][] mat) {

		if (mat.length == 0 || mat[0].length == 0) {
			/* empty matrix */
			return null;
		}

		StringBuffer str = new StringBuffer();
		int counter = mat.length * mat[0].length;
		int startRow = 0;
		int endRow = mat.length - 1;
		int startCol = 0;
		int endCol = mat[0].length - 1;
		boolean moveCol = true;
		boolean leftToRight = true;
		boolean upDown = true;

		// looping through the entire matrix
		while (counter > 0) {

			if (moveCol) {

				if (leftToRight) {

					/* printing entire row left to right */
					for (int i = startCol; i <= endCol; i++) {
						str.append(mat[startRow][i]+" ");
						counter--;
					}
					leftToRight = false;
					moveCol = false;
					startRow++;
				} else {

					/* printing entire row right to left */
					for (int i = endCol; i >= startCol; i--) {
						str.append(mat[endRow][i]+" ");
						counter--;
					}
					leftToRight = true;
					moveCol = false;
					endRow--;
				}
			} else {
				if (upDown) {

					/* printing column up down */
					for (int i = startRow; i <= endRow; i++) {
						str.append(mat[i][endCol]+" ");
						counter--;
					}
					upDown = false;
					moveCol = true;
					endCol--;
				} else {

					/* printing entire col down up */
					for (int i = endRow; i >= startRow; i--) {
						str.append(mat[i][startCol]+" ");
						counter--;
					}
					upDown = true;
					moveCol = true;
					startCol++;
				}
			}
		}
		return str;
	}
}
