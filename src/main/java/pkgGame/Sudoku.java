package pkgGame;

import java.util.Arrays;

import org.apache.commons.lang.ArrayUtils;

import pkgHelper.LatinSquare;

public class Sudoku extends LatinSquare {
	private static int iSize = 0;
	private int iSqrtSize = 0;

	/**
	 * Sudoku - for Lab #2...this constructor will take in an int to create an
	 * instance of sudoku based on whether the int is a perfect square or not will
	 * allow the instance to be made and assigned a size and region size based on
	 * the input
	 *
	 * @since Lab #2
	 */
	public Sudoku(int i) {
		this.iSize = i;
		this.iSqrtSize = (int) Math.sqrt(i);
	}

	/**
	 * Sudoku - for Lab #2...pass in a given two-dimensional array puzzle, create an
	 * instance.
	 *
	 * @since Lab #2
	 */
	public Sudoku(int[][] latinSquare) {

		super(latinSquare);
		this.iSize = latinSquare.length;
		this.iSqrtSize = (int) Math.sqrt(iSize);
	}

	/**
	 * getPuzzle - return the Sudoku puzzle
	 * 
	 * @return int[][]
	 * @since Lab #2
	 */
	protected int[][] getPuzzle() {
		return super.getLatinSquare();
	}

	/**
	 * getRegion - pass in a given region, get back a one-dimensional array of the
	 * region's content Example, the following Puzzle: 0 1 2 3 <br>
	 * 1 2 3 4 <br>
	 * 3 4 1 2 <br>
	 * 4 1 3 2 <br>
	 * getRegion(2) and return [3],[4],[4],[1]
	 * 
	 * @param r - given region
	 * @return - returns a one-dimensional array from a given region of the puzzle
	 * @since Lab #2
	 */
	protected int[] getRegion(int r) {
		int[][] sudokuSquare = getPuzzle();

		int[] regionArray = new int[iSize];

		int row = (int) Math.floor(r / iSqrtSize) * iSqrtSize;
		int col = (int) (r - row) * iSqrtSize;

		int count = 0;

		for (int i = row; i < row + iSqrtSize; i++) {
			for (int j = col; j < col + iSqrtSize; j++) {
				regionArray[count] = sudokuSquare[i][j];
				count++;
			}
		}

		return regionArray;
	}

	/**
	 * Takes in a row and column of a sudoku and returns what region you're in based
	 * on the given values.
	 * 
	 * @param iCol - given column iRow - given row
	 * @return - returns a one-dimensional array from a given region of the puzzle
	 * @since Lab #2
	 */
	protected int[] getRegion(int Col, int Row) {
		return getRegion((int) (Math.floor(Row / iSqrtSize) * iSqrtSize + Math.floor(Col / iSqrtSize)));
	}

	/**
	 * isSudoku - return 'true' if... Is a partialSudoku Each element doesn't a zero
	 * 
	 * @return - returns 'true' if it's a partialSudoku, element match (row versus
	 *         column) and no zeros
	 * @since Lab #2
	 */
	protected boolean isSudoku() {
		setbIgnoreZero(false);
		boolean isSudoku = true;
		for (int i = 0; i < Sudoku.iSize; i++) {
			if (hasDuplicates(getRow(i)))
				return false;
		}

		for (int j = 0; j < Sudoku.iSize; j++) {
			if (hasDuplicates(getColumn(j)))
				return false;
		}

		for (int i = 1; i < Sudoku.iSize; i++) {

			if (!hasAllValues(getRow(0), getRow(i))) {
				return false;
			}
		}

		for (int j = 1; j < Sudoku.iSize; j++) {

			if (!hasAllValues(getColumn(0), getColumn(j))) {
				return false;
			}
		}

		for (int k = 0; k < Sudoku.iSize; k++) {
			if (hasDuplicates(getRegion(k))) {
				return false;
			}
		}

		for (int k = 1; k < Sudoku.iSize; k++) {
			if (!hasAllValues(getRegion(0), getRegion(k))) {
				return false;
			}
		}

		return isSudoku;
	}

	/**
	 * isPartialSudoku - return 'true' if... It's a LatinSquare If each region
	 * doesn't have duplicates If each element in the first row of the puzzle is in
	 * each region of the puzzle At least one of the elements is a zero
	 * 
	 * @return true if the given puzzle is a partial sudoku
	 * @since Lab #2
	 */
	protected boolean isPartialSudoku() {
		setbIgnoreZero(true);

		boolean isPartialSudoku = true;
		for (int i = 0; i < Sudoku.iSize; i++) {
			if (hasDuplicates(getRow(i)))
				return false;
		}

		for (int j = 0; j < Sudoku.iSize; j++) {
			if (hasDuplicates(getColumn(j)))
				return false;
		}

		for (int k = 0; k < Sudoku.iSize; k++) {
			if (hasDuplicates(getRegion(k))) {
				return false;
			}
		}

		return isPartialSudoku;
	}

	@Override
	/**
	 * Tests to see if any element in a column or row is a duplicate.
	 * 
	 * @return Return 'true' if any element in column or row is duplicate
	 */
	protected boolean hasDuplicates(int[] arr) {
		boolean hasDuplicates = false;
		if (isbIgnoreZero()) {
			removeZeros(arr);
			return super.hasDuplicates(arr);
		} else {
			return super.hasDuplicates(arr);
		}
	}

	/**
	 * isValidValue - test to see if a given value would 'work' for a given column / row
	 *
	 * @param iCol - puzzle column iRow - puzzle row iValue - given value
	 * @return Return 'true' if any element in column or row is duplicate
	 * @since Lab #2
	 */

	protected boolean isValidValue(int iValue, int iRow, int iCol) {
		if (iValue <= Sudoku.iSize && iValue > 0 && super.hasDuplicates(getRow(iRow))
				&& super.hasDuplicates(getColumn(iCol))) {
			return true;
		} else {
			return false;
		}

	}
}