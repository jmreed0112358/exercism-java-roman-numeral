package romannumeral;

import java.security.InvalidParameterException;

import exceptions.NotImplementedException;

public class RomanNumeral
{
	private Integer arabicNumeral;
	
	private final ArabicRomanNumeralTranslationPair[] translationArray = 
		{ new ArabicRomanNumeralTranslationPair( 1, "I" ),
			new ArabicRomanNumeralTranslationPair( 2, "II" ),
			new ArabicRomanNumeralTranslationPair( 3, "III" ),
			new ArabicRomanNumeralTranslationPair( 4, "IV" ),
			new ArabicRomanNumeralTranslationPair( 5, "V" ),
			new ArabicRomanNumeralTranslationPair( 6, "VI" ),
			new ArabicRomanNumeralTranslationPair( 7, "VII" ),
			new ArabicRomanNumeralTranslationPair( 8, "VIII" ),
			new ArabicRomanNumeralTranslationPair( 9, "IX" ),
			new ArabicRomanNumeralTranslationPair( 10, "X" ),
			new ArabicRomanNumeralTranslationPair( 40, "XL" ),
			new ArabicRomanNumeralTranslationPair( 50, "L" ),
			new ArabicRomanNumeralTranslationPair( 90, "XC" ),
			new ArabicRomanNumeralTranslationPair( 100, "C" ),
			new ArabicRomanNumeralTranslationPair( 400, "CD" ),
			new ArabicRomanNumeralTranslationPair( 500, "D" ),
			new ArabicRomanNumeralTranslationPair( 900, "CM" ),
			new ArabicRomanNumeralTranslationPair( 1000, "M" )
		};
	public RomanNumeral( Integer arabicNumeral ) {
		if ( arabicNumeral == null ) {
			throw new NullPointerException();
		} else if ( arabicNumeral < 0 ) {
			throw new InvalidParameterException();
		}
		
		this.arabicNumeral = arabicNumeral;
	}
	
	public String getRomanNumeral() {
		StringBuilder sb = new StringBuilder();
		for ( int i = this.translationArray.length - 1 ; i >= 0 ; i-- ) {
			while ( this.arabicNumeral >= this.translationArray[i].getArabicNumeral( ) ) {
				this.arabicNumeral -= this.translationArray[i].getArabicNumeral( );
				sb.append( this.translationArray[i].getRomanNumeral( ) );
			}
		}
		
		return sb.toString( );
	}
}
