package pkgGame;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

/*
 * creating an instance of Sudoku to test in other methods.
 */
public class SudokuTest {
	
		int[][] ooh = {
				{1, 4, 3, 2},
				{3, 2, 4, 1},
				{4, 1, 2, 3},
				{2, 3, 1, 4}};
		
		Sudoku oooh = new Sudoku(ooh);

	int[] iRegionValuesExpected = {};
	
	int[] iRegionValuesActual;

	@Test
	public void TestRegionNbr() {
		int[] correct_region = {3, 2, 4, 1};
		int[][] ooh = {
				{1, 4, 3, 2},
				{3, 2, 4, 1},
				{4, 1, 2, 3},
				{2, 3, 1, 4}};
		
		Sudoku oooh = new Sudoku(ooh);
		assertEquals(arrToString(oooh.getRegion(2, 1)), arrToString(correct_region));
	}
	
	@Test
	public void TestRegionNbr1() {
		int[] correct_region = {3, 2, 4, 1};
		int[][] ooh = {
				{1, 4, 3, 2},
				{3, 2, 4, 1},
				{4, 1, 2, 3},
				{2, 3, 1, 4}};
		
		Sudoku oooh = new Sudoku(ooh);
		assertEquals(arrToString(oooh.getRegion(1)), arrToString(correct_region));
	}
	
	public String arrToString(int[] array) {
		String result = "";
		for (int num : array) {
			result += num + ", ";
		}
		return result;
	}
	
	@Test
	public void isValidValue_test1() {
		int[][] ooh = {
				{1, 4, 3, 2},
				{3, 2, 4, 1},
				{4, 1, 2, 3},
				{2, 3, 1, 4}};
		
		Sudoku oooh = new Sudoku(ooh);
		assertEquals(oooh.isValidValue(5, 0, 0), false);
	}
	
	@Test
	public void isPartialSudoku_test1() {
		int[][] ooh = {
				{1, 4, 3, 2},
				{3, 2, 4, 1},
				{4, 1, 2, 3},
				{2, 3, 1, 4}};
		
		Sudoku oooh = new Sudoku(ooh);
		
		assertEquals(oooh.isPartialSudoku(), true);
	}
	
	@Test
	public void isPartialSudoku_test2() {
		int[][] ooh = {
				{1, 4, 3, 2},
				{3, 0, 4, 1},
				{4, 1, 0, 3},
				{2, 3, 1, 4}};
		
		Sudoku oooh = new Sudoku(ooh);
		
		assertEquals(oooh.isPartialSudoku(), true);
	
	}
	
	@Test
	public void isSudoku_test1() {
		int[][] ooh = {
				{1, 4, 3, 2},
				{3, 2, 4, 1},
				{4, 1, 2, 3},
				{2, 3, 1, 4}};
		
		Sudoku oooh = new Sudoku(ooh);
		
		assertEquals(oooh.isSudoku(), true);
	}
	
	@Test
	public void isSudoku_test2() {
		int[][] ooh = {
				{1, 4, 3, 2},
				{3, 0, 4, 1},
				{4, 1, 0, 3},
				{2, 3, 1, 4}};
		
		Sudoku oooh = new Sudoku(ooh);
		
		assertEquals(oooh.isSudoku(), false);
	
	}
}
