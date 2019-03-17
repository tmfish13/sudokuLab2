package pkgGame;

import java.util.Arrays;

import pkgHelper.LatinSquare;

public class Sudoku extends LatinSquare{
	private static double iSize ;
	private double iSqrtSize;
	
	
	/* this constructor will take in an int to create an instance of sudoku
	 * based on whether the int is a perfect square or not will allow the instance 
	 * to be made and assigned a size and region size based on the input
	 */
	public Sudoku(int i) {
		double well = Math.sqrt(i) - Math.floor(i);
		if(well == 0) {
			this.iSize = i;
			this.iSqrtSize = Math.sqrt(i);
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
	
	protected int[] getRegion(int regionNumber) {
		return null;
	}
	
	protected int[] getRegion(int colNum, int rowNum) {
		return null;
	}
	
	protected boolean isSudoku() {
		bIgnoreZero = false;
		return false;
	}
	
	protected boolean isPartialSudoku() {
		bIgnoreZero = true;
		return false;
	}
	
	protected boolean isValidValue(int iValue, int iRow, int iCol) {
		if(iValue <= Sudoku.iSize) {
			getRow(iRow);
			getColumn(iCol);
			return true;
		}else {
			return false;
		}
		
	}
}