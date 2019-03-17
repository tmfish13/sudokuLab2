package pkgGame;

import java.util.Arrays;

import org.apache.commons.lang.ArrayUtils;

import pkgHelper.LatinSquare;

public class Sudoku extends LatinSquare{
	private static int iSize ;
	private int iSqrtSize;
	
	
	/* this constructor will take in an int to create an instance of sudoku
	 * based on whether the int is a perfect square or not will allow the instance 
	 * to be made and assigned a size and region size based on the input
	 */
	public Sudoku(int i) {
		double well = Math.sqrt(i) - Math.floor(Math.sqrt(i));
		if(well == 0) {
			this.iSize = i;
			this.iSqrtSize = (int) Math.sqrt(i);
		}else {
			
		}
	}
	/*
	 * This constructor for sudoku takes in a defined latinsquare and sets it to a sudoku
	 */
	public Sudoku(int[][] latinSquare) {
		
		super(latinSquare);
	}
	
	protected int[][] getPuzzle(){
		return super.getLatinSquare();
	}
	
	protected int[] getRegion(int iRegionNbr) {
		
		int[][] sudokuSquare = getPuzzle();
			
		int[] regionArray = new int[iSize];
			
		int regionLength = iSqrtSize;
			
		int row = (int) Math.floor(iRegionNbr/regionLength)*regionLength;
		int col = (int) (iRegionNbr-row)*regionLength;
			
		int count = 0;
			
		for(int i = row; i < row+regionLength; i++) {
			for(int j = col; j < col+regionLength; j++) {
				regionArray[count] = sudokuSquare[i][j];
			}
		}
			
		return regionArray;
	}
		
	protected int[] getRegion(int Col, int Row) {
		return getRegion((int)(Math.floor(Row/iSqrtSize)*iSqrtSize+Math.floor(Col/iSqrtSize)));	
	}

	
	protected boolean isSudoku() {
		setbIgnoreZero(false);
		return true;
	}
	
	protected boolean isPartialSudoku() {
		setbIgnoreZero(true);
		return false;
	}
	
	@Override
	protected boolean hasDuplicates(int[] arr) {
		boolean hasDuplicates = false;
		if(isbIgnoreZero()) {
			removeZeros(arr);
			return super.hasDuplicates(arr);
			}else {
				return super.hasDuplicates(arr);
		}
	}
	
	protected boolean isValidValue(int iValue, int iRow, int iCol) {
		if(iValue <= Sudoku.iSize && iValue > 0 && super.hasDuplicates(getRow(iRow)) && super.hasDuplicates(getColumn(iCol))) {
			return true;
		}else {
			return false;
		}
		
	}
}