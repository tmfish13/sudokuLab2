package pkgEnum;

public enum ePuzzleViolation {
	
	DupRow, DupCol, DupRegion, InvalidValue, ContainsZero, MissingZero;
	
	private ePuzzleViolation() {
		
	}
	
	/*
	 * Returns an array containing the constants of this enum type,
	 * in the order that they are declared.
	 */
	public static ePuzzleViolation[] value() {
		for (ePuzzleViolation c : ePuzzleViolation.values())
		    System.out.println(c);
		return null;
	}
	/*
	 * Returns the enum constant of the this type with the specified name.
	 */
	public static ePuzzleViolation valueOf​(String name) {
		return null;
		
	}
}
