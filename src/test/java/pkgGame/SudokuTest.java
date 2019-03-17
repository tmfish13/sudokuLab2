package pkgGame;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

/*
 * creating an instance of soduku to test in other methods.
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
	public void getRegion_test1() {
		int[] correct_region = {3, 2, 4, 1};
		int[][] ooh = {
				{1, 4, 3, 2},
				{3, 2, 4, 1},
				{4, 1, 2, 3},
				{2, 3, 1, 4}};
		
		Sudoku oooh = new Sudoku(ooh);
		assertArrayEquals(correct_region, oooh.getRegion(1));
		
	}
	
	}
