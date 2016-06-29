package romannumeral;

import static org.junit.Assert.*;

import java.security.InvalidParameterException;

import org.junit.Test;

public class ArabicRomanNumeralTranslationPairTests
{
	@Test
	public void test_constructor_InvalidInput_NegativeArabicNumeral_ThrowsException( ) {
		try {
			ArabicRomanNumeralTranslationPair test = new ArabicRomanNumeralTranslationPair( -1000, "M" );
			fail("Supposed to catch InvalidParameterException");
		} catch ( InvalidParameterException ipe ) {
			
		} catch ( Exception e ) {
			fail("Expected to catch InvalidParameterException");
		}
	}
	
	@Test
	public void test_constructor_InvalidInput_NullArabicNumeral_ThrowsException( ) {
		try {
			ArabicRomanNumeralTranslationPair test = new ArabicRomanNumeralTranslationPair( null, "M" );
			fail("Supposed to catch NullPointerException");
		} catch ( NullPointerException npe ) {
			
		} catch ( Exception e ) {
			fail("Expected to catch NullPointerException");
		}
	}
	
	@Test
	public void test_constructor_InvalidInput_EmptyRomanNumeral_ThrowsException( ) {
		try {
			ArabicRomanNumeralTranslationPair test = new ArabicRomanNumeralTranslationPair( 1000, "" );
			fail("Supposed to catch InvalidParameterException");
		} catch ( InvalidParameterException ipe ) {
			
		} catch ( Exception e ) {
			fail("Expected to catch InvalidParameterException");
		}
	}
	
	@Test
	public void test_constructor_InvalidInput_NullRomanNumeral_ThrowsException( ) {
		try {
			ArabicRomanNumeralTranslationPair test = new ArabicRomanNumeralTranslationPair( 1000, null );
			fail("Supposed to catch NullPointerException");
		} catch ( NullPointerException npe ) {
			
		} catch ( Exception e ) {
			fail("Expected to catch NullPointerException");
		}
	}
}
