package romannumeral;

import java.security.InvalidParameterException;

public class ArabicRomanNumeralTranslationPair
{
	private Integer arabicNumeral;
	private String romanNumeral;
	
	public ArabicRomanNumeralTranslationPair( Integer arabicNumeral, String romanNumeral ) {	
		if ( arabicNumeral == null || romanNumeral == null ) {
			throw new NullPointerException();
		} else if ( arabicNumeral < 0 || romanNumeral.isEmpty( ) ) {
			throw new InvalidParameterException();
		}
		this.arabicNumeral = arabicNumeral;
		this.romanNumeral = romanNumeral;
	}

	public Integer getArabicNumeral( ) {
		return this.arabicNumeral;
	}
	
	public String getRomanNumeral( ) {
		return this.romanNumeral;
	}
}