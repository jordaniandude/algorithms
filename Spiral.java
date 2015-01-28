
public class Sprial {

	public static void main(String[] args) {
		// int[][] array ={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		String[][] array = { { "a", "b", "c", "d", "e", "l" }, { "f", "g", "h", "i", "j", "2" },
				{ "k", "m", "l", "n", "o", "3" }, { "p", "q", "r", "s", "t", "4" } };
		StringBuffer str = spiral(array);
		System.out.println(str.toString());
	}

	public static StringBuffer spiral(String[][] matrix) {

		if (matrix.length == 0 || matrix[0].length == 0) {
			/* empty matrix */
			return null;
		}

		// the buffer that I'll append my final entries to it
		StringBuffer str = new StringBuffer(); 
		
		// I'll keep minimizing the counter after each addition to the buffer then stop at 0
		int counter = matrix.length * matrix[0].length;  
		
		// the following four variables will assist in specifying the row/column I started and stopped at after
		// the addition to the buffer, this will help adding the right value following the spiral pattern
		int startRow = 0;
		int endRow = matrix.length - 1;
		int startCol = 0;
		int endCol = matrix[0].length - 1;
		
		// this is variable that will specify to move either horizontally or vertically
		boolean moveCol = true;
		// this is variable that will specify to move either left-to-right or right-to-left when the moveCol is horizontal (true)
		boolean leftToRight = true;
		// this is variable that will specify to move either up-to-down or down-to-up when the moveCol is vertical (false)
		boolean upDown = true;

		// looping through the entire matrix
		while (counter > 0) {

			if (moveCol) {

				if (leftToRight) {

					// moving horizontally by printing the entire row left to right 
					for (int i = startCol; i <= endCol; i++) {
						str.append(matrix[startRow][i]+" ");
						counter--;
					}
					//the next time I'll move horizontally, it's going to be right to left
					leftToRight = false;
					moveCol = false;
					startRow++;
				} else {

					// moving horizontally by printing the entire row right to left
					for (int i = endCol; i >= startCol; i--) {
						str.append(matrix[endRow][i]+" ");
						counter--;
					}
					//the next time I'll move horizontally, it's going to be left to right
					leftToRight = true;
					moveCol = false;
					endRow--;
				}
			} else {
				if (upDown) {

					// moving vertically by printing the column up-to-down
					for (int i = startRow; i <= endRow; i++) {
						str.append(matrix[i][endCol]+" ");
						counter--;
					}
					
					//the next time I'll move vertically, it's going to be down-to-up
					upDown = false;
					moveCol = true;
					endCol--;
				} else {

					// moving vertically by printing the column down-to-up
					for (int i = endRow; i >= startRow; i--) {
						str.append(matrix[i][startCol]+" ");
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
