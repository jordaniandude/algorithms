// This is an implementation (using Dynamic Programming) of bottom-up algorithm to solve Project Euler problem 18
// to find the maximum sum of a path in a triangle of numbers.

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Triangle {

	public static void main(String[] args) throws Exception {
		int[][] array = readArrayFromFile("C:\\test\\triangle.txt");

		maximumSum(array);

	}

	public static void maximumSum(int[][] array) {
		for (int i = array.length - 1; i > 0; i--)
			for (int j = 0; j < array[i].length - 1; j++)
				array[i - 1][j] += Math.max(array[i][j], array[i][j + 1]);

		System.out.println(array[0][0]);
	}

	public static int[][] readArrayFromFile(String path) {
		FileReader fr = null;
		BufferedReader br = null;
		int rowsSize = 4;
		int columnsSize = 4;
		int[][] lines = new int[rowsSize][columnsSize];

		try {
			fr = new FileReader(path);
			br = new BufferedReader(fr);
			String line = "";
			int rowsCount = 0;
			int columnsCount = 0;
			while ((line = br.readLine()) != null) {
				String lineSplitted[] = line.split(" ");
				for (int i = 0; i < lineSplitted.length; i++) {
					lines[rowsCount][columnsCount] = Integer
							.parseInt(lineSplitted[i]);
					columnsCount++;

				}
				columnsCount = 0;
				rowsCount++;
			}

			System.out
					.println("The 2d Array before apply the spiral function:");
			for (int i = 0; i < lines.length; i++) {

				for (int j = 0; j < lines[0].length; j++) {

					System.out.print(lines[i][j] + " ");

				}
				System.out.println();
			}
			System.out.println();

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fr.close();
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
		return lines;
	}
}
