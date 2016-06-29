package romannumeral;

import static org.junit.Assert.*;

import java.security.InvalidParameterException;

import org.junit.Test;

public class RomanNumeralMoreTests
{
	@Test
	public void test_constructor_InvalidInput_NegativeNumbers_ThrowsException( )
	{
		try {
			RomanNumeral test = new RomanNumeral( -1000 );
			fail("Supposed to catch InvalidParameterException");
		} catch ( InvalidParameterException ipe ) {
			
		} catch ( Exception e ) {
			fail("Expected to catch InvalidParameterException");
		}
	}

	@Test
	public void test_constructor_InvalidInput_NullInteger_ThrowsException( ) {
		try {
			RomanNumeral test = new RomanNumeral( null );
			fail("Supposed to catch NullPointerException");
		} catch ( NullPointerException npe ) {
			
		} catch ( Exception e ) {
			fail("Expected to catch NullPointerException");
		}
	}
}
