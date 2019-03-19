package pkgHelper;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

import pkgEnum.ePuzzleViolation;

public class LatinSquareTest {

	@Test
	public void doesElementExist_Test1() {
		LatinSquare LS = new LatinSquare();
		int[] arr = { 1, 3, 5, 2, 4 };
		int iValue = 3;
		boolean bdoesElementExist = LS.doesElementExist(arr, iValue);

		assertEquals(bdoesElementExist, true);
	}

	@Test
	public void doesElementExist_Test2() {
		LatinSquare LS = new LatinSquare();
		int[] arr = { 1, 3, 5, 2, 4 };
		int iValue = 99;
		boolean bdoesElementExist = LS.doesElementExist(arr, iValue);

		assertEquals(bdoesElementExist, false);
	}

	@Test
	public void ePuzzleViolationTest() {
		int[][] array = { { 1, 2 }, { 3, 4 } };
		LatinSquare LS = new LatinSquare(array);
		ePuzzleViolation ePV = ePuzzleViolation.DupCol;
		int iValue = 1;
		System.out.print("ePV = " + ePV.toString());
		PuzzleViolation PV = new PuzzleViolation(ePV, iValue);

		LS.addPuzzleViolation(PV);

		assertEquals(LS.getPV().get(0), PV);
	}

	@Test
	public void getColumn_Test1() {

		int[][] MySquare = { { 1, 2, 3 }, { 3, 1, 2 }, { 2, 3, 1 } };

		LatinSquare LS = new LatinSquare(MySquare);
		int[] ExpectedCol = { 2, 1, 3 };
		int[] Col = LS.getColumn(1);

		assertTrue(Arrays.equals(ExpectedCol, Col));
		System.out.println(Arrays.toString(Col));
	}
	
	@Test
	public void getRow_Test1() {

		int[][] MySquare = { { 1, 2, 3 }, { 3, 1, 2 }, { 2, 3, 1 } };

		LatinSquare LS = new LatinSquare(MySquare);
		int[] ExpectedRow = { 3, 1, 2 };
		int[] Row = LS.getRow(1);

		assertTrue(Arrays.equals(ExpectedRow, Row));
		System.out.println(Arrays.toString(Row));
	}
	
	@Test
	public void hasAllValues_Test1() {
		LatinSquare LS = new LatinSquare();
		int[] arr1 = { 1, 2, 3 };
		int[] arr2 = { 3, 2, 1 };

		boolean bhasAllValues = LS.hasAllValues(arr1, arr2);

		assertEquals(bhasAllValues, true);
	}

	@Test
	public void hasAllValues_Test2() {
		LatinSquare LS = new LatinSquare();
		int[] arr1 = { 1, 2, 3 };
		int[] arr2 = { 3, 2, 99 };

		boolean bhasAllValues = LS.hasAllValues(arr1, arr2);

		assertEquals(bhasAllValues, false);
	}
	
	@Test
	public void hasDuplicates_test1() {

		LatinSquare LS = new LatinSquare();
		int[] arr = { 1, 3, 5, 2, 4 };

		boolean bHasDuplicates = LS.hasDuplicates(arr);

		assertEquals(bHasDuplicates, false);
	}

	@Test
	public void hasDuplicates_test2() {

		LatinSquare LS = new LatinSquare();
		int[] arr = { 1, 3, 5, 2, 3 };

		boolean bHasDuplicates = LS.hasDuplicates(arr);

		assertEquals(bHasDuplicates, true);
	}
	
	@Test
	public void hasDuplicates_test3() {

		int[][] array = {{1, 2, 3, 4}, {2, 3, 4, 1}, {3, 4, 1, 2}, {4, 1, 2, 3}};
		LatinSquare LS = new LatinSquare(array);

		boolean bHasDuplicates = false;
		try {
			bHasDuplicates = LS.hasDuplicates();
		} catch (Exception e) {
			e.printStackTrace();
		}

		assertEquals(bHasDuplicates, true);
	}
	
	@Test
	public void hasDuplicates_test4() {

		int[][] array = {{1, 4, 3, 2}, {3, 2, 4, 1}, {4, 1, 2, 3}, {2, 3, 1, 4}};
		LatinSquare LS = new LatinSquare(array);

		boolean bHasDuplicates = false;
		try {
			bHasDuplicates = LS.hasDuplicates();
		} catch (Exception e) {
			e.printStackTrace();
		}

		assertEquals(bHasDuplicates, false);
	}

	@Test
	public void isLatinSquare_Test1() {

		int[][] MySquare = { { 1, 2, 3 }, { 3, 1, 2 }, { 2, 3, 1 } };

		LatinSquare LS = new LatinSquare(MySquare);

		assertTrue(LS.isLatinSquare());
	}

	@Test
	public void isLatinSquare_Test2() {

		int[][] MySquare = { { 1, 2, 3 }, { 3, 1, 2 }, { 4, 5, 6 } };

		LatinSquare LS = new LatinSquare(MySquare);

		assertFalse(LS.isLatinSquare());
	}
}
