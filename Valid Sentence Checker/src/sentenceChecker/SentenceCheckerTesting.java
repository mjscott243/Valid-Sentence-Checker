package sentenceChecker;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SentenceCheckerTesting {

String checkForSentence;

	

	@Test
	@DisplayName("capitalStart method should detect a capital letter at the start of a string and return true")
	void test_CapitalStart1() {

		// String starts with a capital letter
		checkForSentence = "Hello World!";
		// if the capitalStart(checkForSentence) returns true then the test passes
		Assertions.assertTrue(SentenceChecker.capitalStart(checkForSentence));

	}

	@Test
	@DisplayName("capitalStart method should not detect a capital letter at the start of a string and return false")
	void test_CapitalStart2() {

		// String does not start with a capital letter
		checkForSentence = "hello World";
		// if the capitalStart(checkForSentence) returns false then the test passes
		Assertions.assertFalse(SentenceChecker.capitalStart(checkForSentence));

	}

	@Test
	@DisplayName("terminationCharacter method should throw an IndexOutOfBoundsException for an empty string")
	void test_CapitalStart3() {

		// String is an empty string
		checkForSentence = "";
		// if the capitalStart(checkForSentence) throws an IndexOutOfBoundsException
		// then the test passes
		Assertions.assertThrows(IndexOutOfBoundsException.class, () -> {
			System.out.println("Output to console for test_CapitalStart3 test:");
			SentenceChecker.capitalStart(checkForSentence);
		});
		System.out.println();

	}

	@Test
	@DisplayName("terminationCharacter method should detect a '.' character at the end of a string and return true")
	void test_TerminationCharacter1() {

		// String ends with a termination character ('.')
		checkForSentence = "Hello World.";
		// if the terminationCharacter(checkForSentence) returns true then the test
		// passes
		Assertions.assertTrue(SentenceChecker.terminationCharacter(checkForSentence));

	}

	@Test
	@DisplayName("terminationCharacter method should detect a '!' character at the end of a string and return true")
	void test_TerminationCharacter2() {

		// String ends with a termination character ('!')
		checkForSentence = "Hello World!";
		// if the terminationCharacter(checkForSentence) returns true then the test
		// passes
		Assertions.assertTrue(SentenceChecker.terminationCharacter(checkForSentence));

	}

	@Test
	@DisplayName("terminationCharacter method should detect a '?' character at the end of a string and return true")
	void test_TerminationCharacter3() {

		// String ends with a termination character ('?')
		checkForSentence = "Hello World?";
		// if the terminationCharacter(checkForSentence) returns true then the test
		// passes
		Assertions.assertTrue(SentenceChecker.terminationCharacter(checkForSentence));

	}

	@Test
	@DisplayName("terminationCharacter method should not detect a termination character at the end of a string and return false")
	void test_TerminationCharacter4() {

		// String does not end with a termination character
		checkForSentence = "Hello World";
		// if the terminationCharacter(checkForSentence) returns false then the test
		// passes
		Assertions.assertFalse(SentenceChecker.terminationCharacter(checkForSentence));

	}

	@Test
	@DisplayName("terminationCharacter method should throw an IndexOutOfBoundsException for an empty string")
	void test_TerminationCharacter5() {

		// String is empty
		checkForSentence = "";
		// if the terminationCharacter(checkForSentence) throws an
		// IndexOutOfBoundsException then the test passes
		System.out.println("Output to console for test_TerminationCharacter5 test:");
		Assertions.assertThrows(IndexOutOfBoundsException.class, () -> {
			SentenceChecker.terminationCharacter(checkForSentence);
		});
		System.out.println();
	}

	@Test
	@DisplayName("incorrectPeriod method should detect a period ('.') in the string that is not the last character and return true")
	void test_incorrectPeriod1() {

		// String contains a period ('.') that is not the last letter
		checkForSentence = "Hello. World";
		// if the incorrectPeriod(checkForSentence) returns true then the test passes
		Assertions.assertTrue(SentenceChecker.incorrectPeriod(checkForSentence));

	}

	@Test
	@DisplayName("incorrectPeriod method should detect a period ('.') at the start of string return true")
	void test_incorrectPeriod2() {

		// String contains a period ('.') at the start of the string
		checkForSentence = ".Hello World";
		// if the incorrectPeriod(checkForSentence) returns true then the test passes
		Assertions.assertTrue(SentenceChecker.incorrectPeriod(checkForSentence));

	}

	@Test
	@DisplayName("incorrectPeriod method should not detect a period ('.') in the string and return false")
	void test_incorrectPeriod3() {

		// String does not contain a period ('.')
		checkForSentence = "Hello World";
		// if the incorrectPeriod(checkForSentence) returns false then the test passes
		Assertions.assertFalse(SentenceChecker.incorrectPeriod(checkForSentence));

	}

	@Test
	@DisplayName("incorrectPeriod method should not detect a period ('.') in an empty string and return false")
	void test_incorrectPeriod4() {

		// String is empty, and does not contain a period ('.')
		checkForSentence = "";
		// if the incorrectPeriod(checkForSentence) returns false then the test passes
		Assertions.assertFalse(SentenceChecker.incorrectPeriod(checkForSentence));

	}

	@Test
	@DisplayName("incorrectPeriod method should not detect a period ('.') in the string (that is not the last character) and return false")
	void test_incorrectPeriod5() {

		// String does contain a period ('.'), but it is the last letter
		checkForSentence = "Hello World.";
		// if the incorrectPeriod(checkForSentence) returns false then the test passes
		Assertions.assertFalse(SentenceChecker.incorrectPeriod(checkForSentence));

	}

	@Test
	@DisplayName("incorrectPeriod method should not detect a period ('.') in the string (that is not the last character) and return false")
	void test_incorrectPeriod6() {

		// String does contain a period ('.'), but it is the only letter, and therefore
		// the last letter
		checkForSentence = ".";
		// if the incorrectPeriod(checkForSentence) returns false then the test passes
		Assertions.assertFalse(SentenceChecker.incorrectPeriod(checkForSentence));

	}

	@Test
	@DisplayName("containsSmallNumber method should not detect a small number in the string and return false")
	void test_containsSmallNumber1() {

		// String does not contain a small number
		checkForSentence = "Hello World";
		// if the containsSmallNumber(checkForSentence) returns false then the test
		// passes
		Assertions.assertFalse(SentenceChecker.containsSmallNumber(checkForSentence));

	}

	@Test
	@DisplayName("containsSmallNumber method should detect a small number (below 13) in the middle of the string and return true")
	void test_containsSmallNumber2() {

		// String does contain a small number ('1')
		checkForSentence = "Hello1 World";
		// if the containsSmallNumber(checkForSentence) returns true then the test
		// passes
		Assertions.assertTrue(SentenceChecker.containsSmallNumber(checkForSentence));

	}

	@Test
	@DisplayName("containsSmallNumber method should detect a small number (below 13) in the string, even if it has leading zeros, and return true")
	void test_containsSmallNumber3() {

		// String does contain a small number ('01')
		checkForSentence = "Hello 01 World";
		// if the containsSmallNumber(checkForSentence) returns true then the test
		// passes
		Assertions.assertTrue(SentenceChecker.containsSmallNumber(checkForSentence));

	}

	@Test
	@DisplayName("containsSmallNumber method should detect a small number (below 13) in the string, even if it has leading zeros, and return true")
	void test_containsSmallNumber4() {

		// String does contain a small number ('00001')
		checkForSentence = "Hello 00001 World";
		// if the containsSmallNumber(checkForSentence) returns true then the test
		// passes
		Assertions.assertTrue(SentenceChecker.containsSmallNumber(checkForSentence));

	}

	@Test
	@DisplayName("containsSmallNumber method should not detect a small number (below 13) in the string and return false")
	void test_containsSmallNumber5() {

		// String contains a large number ('101')
		checkForSentence = "Hello 1001 World";
		// if the containsSmallNumber(checkForSentence) returns false then the test
		// passes
		Assertions.assertFalse(SentenceChecker.containsSmallNumber(checkForSentence));

	}

	@Test
	@DisplayName("containsSmallNumber method should not detect a small number (below 13) at the start of the string and return false")
	void test_containsSmallNumber6() {

		// String contains a small number ('0001'), however it is not expected to detect
		// it as the sentenceCheck method will have already verified that the first
		// character in the string is a capital letter
		checkForSentence = "0001 Hello World";
		// if the containsSmallNumber(checkForSentence) returns false then the test
		// passes
		Assertions.assertFalse(SentenceChecker.containsSmallNumber(checkForSentence));

	}

	@Test
	@DisplayName("containsSmallNumber method should not detect a small number (below 13) at the end of the string and return false")
	void test_containsSmallNumber7() {

		// String contains a small number ('1'), however it is not needed to detect
		// it as the sentenceCheck method will have already verified that the last
		// character in the string is a termination character
		checkForSentence = "Hello World 1";
		// if the containsSmallNumber(checkForSentence) returns false then the test
		// passes
		Assertions.assertFalse(SentenceChecker.containsSmallNumber(checkForSentence));

	}

	@Test
	@DisplayName("containsSmallNumber method should detect a negative number (which is therefore below 13) at the end of the string and return false")
	void test_containsSmallNumber8() {

		// String contains a negative number ('-1'),
		checkForSentence = "Hello -1 World";
		// if the containsSmallNumber(checkForSentence) returns true then the test
		// passes
		Assertions.assertTrue(SentenceChecker.containsSmallNumber(checkForSentence));

	}

	@Test
	@DisplayName("containsSmallNumber method should detect a negative number (which is therefore below 13) at the end of the string and return false")
	void test_containsSmallNumber9() {

		// String contains a negative number ('-5446365'),
		checkForSentence = "Hello -5446365 World";
		// if the containsSmallNumber(checkForSentence) returns true then the test
		// passes
		Assertions.assertTrue(SentenceChecker.containsSmallNumber(checkForSentence));

	}

	@Test
	@DisplayName("evenQuotes method should count an even number of quotation marks (\") in the string and return true")
	void test_evenQuotes1() {

		// String contains a 0 quotation marks (")
		checkForSentence = "Hello World";
		// if the evenQuotes(checkForSentence) returns true then the test passes
		Assertions.assertTrue(SentenceChecker.evenQuotes(checkForSentence));

	}

	@Test
	@DisplayName("evenQuotes method should count an even number of quotation marks (\") in the middle of the string and return true")
	void test_evenQuotes2() {

		// String contains a 2 quotation marks (") in the middle of the string
		checkForSentence = "Hello \"\" World";
		// if the evenQuotes(checkForSentence) returns true then the test passes
		Assertions.assertTrue(SentenceChecker.evenQuotes(checkForSentence));

	}

	@Test
	@DisplayName("evenQuotes method should count an even number of quotation marks (\") at the start of in the string and return true")
	void test_evenQuotes3() {

		// String contains a 2 quotation marks (") at the start of the string
		checkForSentence = "\"\"Hello World";
		// if the evenQuotes(checkForSentence) returns true then the test passes
		Assertions.assertTrue(SentenceChecker.evenQuotes(checkForSentence));

	}

	@Test
	@DisplayName("evenQuotes method should count an even number of quotation marks (\") at the end of the string and return true")
	void test_evenQuotes4() {

		// String contains a 2 quotation marks (") at the end of the string
		checkForSentence = "Hello World\"\"";
		// if the evenQuotes(checkForSentence) returns true then the test passes
		Assertions.assertTrue(SentenceChecker.evenQuotes(checkForSentence));

	}

	@Test
	@DisplayName("evenQuotes method should count an odd number of quotation marks (\") in the middle of the string and return false")
	void test_evenQuotes6() {

		// String contains a 1 quotation mark (") in the middle of the string
		checkForSentence = "Hello \" World";
		// if the evenQuotes(checkForSentence) returns false then the test passes
		Assertions.assertFalse(SentenceChecker.evenQuotes(checkForSentence));

	}

	@Test
	@DisplayName("evenQuotes method should count an odd number of quotation marks (\")at the start of the string and return false")
	void test_evenQuotes7() {

		// String contains a 1 quotation mark (") at the start of the string
		checkForSentence = "\"Hello World";
		// if the evenQuotes(checkForSentence) returns false then the test passes
		Assertions.assertFalse(SentenceChecker.evenQuotes(checkForSentence));

	}

	@Test
	@DisplayName("evenQuotes method should count an odd number of quotation marks (\") at the end of the string and return false")
	void test_evenQuotes8() {

		// String contains a 1 quotation mark (") at the end of the string
		checkForSentence = "Hello World\"";
		// if the evenQuotes(checkForSentence) returns false then the test passes
		Assertions.assertFalse(SentenceChecker.evenQuotes(checkForSentence));

	}

	@Test
	@DisplayName("evenQuotes method should count an odd number of quotation marks (\") in the string and return false")
	void test_evenQuotes9() {

		// String consists of a single quotation mark (")
		checkForSentence = "\"";
		// if the evenQuotes(checkForSentence) returns false then the test passes
		Assertions.assertFalse(SentenceChecker.evenQuotes(checkForSentence));

	}

	@Test
	@DisplayName("evenQuotes method should count an even number of quotation marks (\") in the empty string and return true")
	void test_evenQuotes10() {

		// String is empty
		checkForSentence = "";
		// if the evenQuotes(checkForSentence) returns false then the test passes
		Assertions.assertTrue(SentenceChecker.evenQuotes(checkForSentence));

	}

	@Test
	@DisplayName("sentenceCheck method should consider the string a valid sentence and return true")
	void test_sentenceCheck1() {

		// String is a valid sentence
		checkForSentence = "The quick brown fox said \"hello Mr lazy dog\".";

		// if the sentenceCheck(checkForSentence) returns true then the test passes
		System.out.println("Output to console for test_sentenceCheck1 test:");
		Assertions.assertTrue(SentenceChecker.sentenceCheck(checkForSentence));

	}

	@Test
	@DisplayName("sentenceCheck method should consider the string a valid sentence and return true")
	void test_sentenceCheck2() {

		// String contains a period ('.') that is not the last letter
		checkForSentence = "The quick brown fox said hello Mr lazy dog.";

		// if the sentenceCheck(checkForSentence) returns true then the test passes
		System.out.println("Output to console for test_sentenceCheck2 test:");
		Assertions.assertTrue(SentenceChecker.sentenceCheck(checkForSentence));

	}

	@Test
	@DisplayName("sentenceCheck method should consider the string a valid sentence and return true")
	void test_sentenceCheck3() {

		// String is a valid sentence
		checkForSentence = "One lazy dog is too few, 13 is too many.";

		// if the sentenceCheck(checkForSentence) returns true then the test passes
		System.out.println("Output to console for test_sentenceCheck3 test:");
		Assertions.assertTrue(SentenceChecker.sentenceCheck(checkForSentence));

	}

	@Test
	@DisplayName("sentenceCheck method should consider the string a valid sentence and return true")
	void test_sentenceCheck4() {

		// String is a valid sentence
		checkForSentence = "One lazy dog is too few, thirteen is too many.";

		// if the sentenceCheck(checkForSentence) returns true then the test passes
		System.out.println("Output to console for test_sentenceCheck4 test:");
		Assertions.assertTrue(SentenceChecker.sentenceCheck(checkForSentence));

	}

	@Test
	@DisplayName("sentenceCheck method should consider the string a valid sentence and return true")
	void test_sentenceCheck5() {

		// String is a valid sentence
		checkForSentence = "How many \"lazy dogs\" are there?";

		// if the sentenceCheck(checkForSentence) returns true then the test passes
		System.out.println("Output to console for test_sentenceCheck5 test:");
		Assertions.assertTrue(SentenceChecker.sentenceCheck(checkForSentence));

	}

	@Test
	@DisplayName("sentenceCheck method should detect an incorrect period character, consider the string an invalid sentence, and return false")
	void test_sentenceCheck6() {

		// String is an invalid sentence as is there is a period ('.') in the string
		// that is not the last character
		checkForSentence = "The quick brown fox said \"hello Mr. lazy dog\".";

		// if the sentenceCheck(checkForSentence) returns false then the test passes
		System.out.println("Output to console for test_sentenceCheck6 test:");
		Assertions.assertFalse(SentenceChecker.sentenceCheck(checkForSentence));

	}

	@Test
	@DisplayName("sentenceCheck method should detect that the first character is not a capital letter, consider the sentence invalid, and return false")
	void test_sentenceCheck7() {

		// String is an invalid sentence as is the first character is not a capital
		// letter
		checkForSentence = "the quick brown fox said \"hello Mr lazy dog\".";

		// if the sentenceCheck(checkForSentence) returns false then the test passes
		System.out.println("Output to console for test_sentenceCheck7 test:");
		Assertions.assertFalse(SentenceChecker.sentenceCheck(checkForSentence));

	}

	@Test
	@DisplayName("sentenceCheck method should detect that the first character is not a capital letter, consider the sentence invalid, and return false")
	void test_sentenceCheck8() {

		// String is an invalid sentence as is the first character is not a capital
		// letter
		checkForSentence = "\"The quick brown fox said “hello Mr lazy dog.\"";

		// if the sentenceCheck(checkForSentence) returns false then the test passes
		System.out.println("Output to console for test_sentenceCheck8 test:");
		Assertions.assertFalse(SentenceChecker.sentenceCheck(checkForSentence));

	}

	@Test
	@DisplayName("sentenceCheck method should detect that there is an odd number of quotation marks, consider the sentence invalid, and return false")
	void test_sentenceCheck9() {

		// String is an invalid sentence as there is an odd number of quotation marks
		checkForSentence = "The man said that \"The quick brown fox said \"hello Mr lazy dog\".";

		// if the sentenceCheck(checkForSentence) returns false then the test passes
		System.out.println("Output to console for test_sentenceCheck9 test:");
		Assertions.assertFalse(SentenceChecker.sentenceCheck(checkForSentence));

	}

	@Test
	@DisplayName("sentenceCheck method should detect that there is a small number in the string (12), consider the sentence invalid, and return false")
	void test_sentenceCheck10() {

		// String is an invalid sentence as there is a small number in the string(12)
		checkForSentence = "One lazy dog is too few, 12 is too many.";

		// if the sentenceCheck(checkForSentence) returns false then the test passes
		System.out.println("Output to console for test_sentenceCheck10 test:");
		Assertions.assertFalse(SentenceChecker.sentenceCheck(checkForSentence));

	}

	@Test
	@DisplayName("sentenceCheck method should detect that there are small numbers in the string (12), consider the sentence invalid, and return false")
	void test_sentenceCheck11() {

		// String is an invalid sentence as there are small numbers in the string(11,
		// 12)
		checkForSentence = "Are there 11, 12, or 13 lazy dogs?";

		// if the sentenceCheck(checkForSentence) returns false then the test passes
		System.out.println("Output to console for test_sentenceCheck11 test:");
		Assertions.assertFalse(SentenceChecker.sentenceCheck(checkForSentence));

	}

	@Test
	@DisplayName("sentenceCheck method should detect that the last character of the string is not a termination character, consider the sentence invalid, and return false")
	void test_sentenceCheck12() {

		// String is an invalid sentence as the last character is not a termination
		// character
		checkForSentence = "There is no punctuation in this sentence";

		// if the sentenceCheck(checkForSentence) returns false then the test passes
		System.out.println("Output to console for test_sentenceCheck12 test:");
		Assertions.assertFalse(SentenceChecker.sentenceCheck(checkForSentence));

	}


}
