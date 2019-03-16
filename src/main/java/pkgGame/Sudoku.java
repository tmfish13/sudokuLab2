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
	
	
	// The hasDuplicates for Sudoku should use the parts of the old 
	// method and add in checking through regions for duplicates as well
	
	@Override
	public boolean hasDuplicates() {
		super.hasDuplicates();
		
		for (int k = 0; k < sortedArray.length - 1; k++) {
			if (sortedArray[k] == sortedArray[=k + 1]) {
				hasDuplicates = true;
				addPV.
				break;
	}
	
	
	

	// getRegion will access the Sudoku and based on which int is inputted,
	// The method will return the region designated to that int
	protected int[] getRegion(int n) {
		int[] myRegion = new int[puzzle.length];
		int index = 0;
		int iSize = puzzle.length;
		int iSizeSqrt = (int) Math.sqrt(iSize);
		
		if ((n+1) > iSize)
			throw new Exception("No region available");
			
		for (int iRow = (n / iSizeSqrt) * iSizeSqrt; iRow <((n / iSizeSqrt) * iSizeSqrt))
			for(int iCol = (n % iSizeSqrt) * iSizeSqrt; iCol < ((n % iSizeSqrt)* iSizeSqrt))
				myRegion[++index] = puzzle[iRow][iCol];
		}
		
	}
	
}
