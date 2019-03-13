package pkgGame;

import java.util.Arrays;

import pkgHelper.LatinSquare;

public class Sudoku extends LatinSquare{
	private double iSize ;
	private double iSqrtSize;
	
	public Sudoku() {
		super();
	}
	
	public Sudoku(int size) {
		this.iSize = size;
		this.iSqrtSize = Math.sqrt(size);
	}
	
	public Sudoku(int[][] puzzle) {
		super(puzzle);
	}
	
	protected int[][] getPuzzle(){
		return super.getSudoku();
	}
	
	protected int[] getRegion(int iRegionNbr) {
		return null;
	}
	
}
