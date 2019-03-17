package pkgHelper;

import pkgEnum.ePuzzleViolation;

public class PuzzleViolation{
	
	private ePuzzleViolation PuzzleViolation;
	private int iValue;
	
	
	/*
	 * Used to capture a violation of the LatinSquare and / or Sudoku puzzle.
	 */
	public PuzzleViolation(ePuzzleViolation e, int i) {
		
		this.PuzzleViolation = e;
		this.iValue = i;
	}
	/*
	 * returns PuzzleViolation
	 */
	public ePuzzleViolation getPuzzleViolation() {
		return PuzzleViolation;
	}

	/*
	 * returns iValue
	 */
	public int getiValue() {
		return iValue;
	}
	
	
	
}
