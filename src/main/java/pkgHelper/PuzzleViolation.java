package pkgHelper;

import pkgEnum.ePuzzleViolation;

public class PuzzleViolation{
	
	private ePuzzleViolation PuzzleViolation;
	private int iValue;
	
	public PuzzleViolation(ePuzzleViolation e, int i) {
		
		this.PuzzleViolation = e;
		this.iValue = i;
	}

	public ePuzzleViolation getPuzzleViolation() {
		return PuzzleViolation;
	}

	public int getiValue() {
		return iValue;
	}
	
	
	
}
