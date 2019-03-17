package pkgGame;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

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
		
		assertEquals(correct_region, oooh.getRegion(1));
		
	}
	
	}
