package pkgEnum;

public enum ePuzzleViolation {
	
	DupRow, DupCol, DupRegion, InvalidValue, ContainsZero, MissingZero;
	
	private ePuzzleViolation() {
		
	}
	
	public static ePuzzleViolation[] value() {
		for (ePuzzleViolation c : ePuzzleViolation.values())
		    System.out.println(c);
		return null;
	}
	
	public static ePuzzleViolation valueOf​(java.lang.String name) {
		return null;
		
	}
}
