package sentenceChecker;

import java.util.regex.*;

public class SentenceChecker {

	/**
	 * Method capitalStart returns takes a parameter of type string.
	 * 
	 * 
	 * It returns false if the first character or the string is not a capital
	 * letter, and true if it is.
	 * 
	 * @param input
	 * @return
	 */
	public static boolean capitalStart(String input) {

		try {

			// if the string does not start with a capital letter return false
			if (input.charAt(0) < 'A' || input.charAt(0) > 'Z') {
				return false;
			}

		} catch (IndexOutOfBoundsException e) {
			System.out.println("String is empty\n" + e.getMessage());
			throw e;
		}
		return true;
	}

	/**
	 * Method terminationCharacter takes a parameter of type string.
	 * 
	 * It returns false if the last character of the string is not a termination
	 * character.
	 * 
	 * @param input
	 * @return
	 */
	public static boolean terminationCharacter(String input) {
		try {

			// if the last the last character is not '.', '!' or '?' return false
			if ((input.charAt(input.length() - 1) != '.') && (input.charAt(input.length() - 1) != '!')
					&& (input.charAt(input.length() - 1) != '?')) {
				return false;
			}

		} catch (IndexOutOfBoundsException e) {
			System.out.println("String is empty\n" + e.getMessage());
			throw e;
		}
		return true;
	}

	/**
	 * Method containsSmallNumber takes a parameter of type string.
	 * 
	 * It returns false if it does not contains the numbers 0 - 12 written
	 * numerically, or true if it does.
	 * 
	 * @param input
	 * @return
	 */
	public static boolean containsSmallNumber(String input) {

		// NOTE ABOUT SEARCHING FOR INSTANCES OF SMALL NUMBERS
		// this method is to be used after the first and last characters have been
		// verified to be a capital letter and a temination character, therefore this
		// method does not need to check for instances of [null]0*[0-9][null] in the
		// string.

		// This method is also used after the 'incorrectPeriod' method, so it does not
		// need to check for decimals

		// matcher true if there is 0 - 9 in the string
		Pattern p0to9 = Pattern.compile("[^0-9|.]0*[0-9][^0-9]");
		Matcher checkFor0to9 = p0to9.matcher(input);

		// matcher true if there is 10 - 12 in the string
		Pattern p10to12 = Pattern.compile("[^0-9|.]0*[1][0-2][^0-9]");
		Matcher checkFor10to12 = p10to12.matcher(input);

		// matcher is true if there is a negative number in the string
		Pattern pNegativeNum = Pattern.compile("[-][0-9]*[^0-9]");
		Matcher checkForNegativeNum = pNegativeNum.matcher(input);

		// returns true if 0 - 12 is in the string
		return checkFor0to9.find() || checkFor10to12.find() || checkForNegativeNum.find();
	}

	/**
	 * Method IncorrectTerminator takes a parameter of type string.
	 * 
	 * It returns true if it contains a period character ('.') that is not the last
	 * letter, or false if it does not.
	 * 
	 * @param input
	 * @return
	 */
	public static boolean incorrectPeriod(String input) {

		Pattern TCharacter = Pattern.compile("[.].");
		TCharacter.toString();
		Matcher checkForTCharacter = TCharacter.matcher(input);

		// returns true if there is a termination character in the string that is not
		// the last letter
		return checkForTCharacter.find();
	}

	/**
	 * Method evenQuotes takes a parameter of type string.
	 * 
	 * It returns true if it contains an even number of the char '"' and false if it
	 * does not.
	 * 
	 * @param input
	 * @return
	 */

	public static boolean evenQuotes(String input) {

		int count = 0;
		// iterate through the characters of the string
		for (int i = 0; i < input.length(); i++) {

			// if the character is '"' increase the quote count
			if (input.charAt(i) == '"') {
				count++;
			}

		}

		// return true if there is an even number of quotes or false if there is an odd
		// number of quotes
		return (count % 2 == 0);
	}

	/**
	 * Method sentenceCheck takes a parameter of type String and returns true if the
	 * String is a valid sentence.
	 * 
	 * A “valid” valid sentence must obey the following rules:
	 * 
	 * · String starts with a capital letter; · String has an even number of
	 * quotation marks; · String ends with one of the following sentence termination
	 * characters: ".", "?", "!"; · String has no period characters other than the
	 * last character; · Numbers below 13 are spelled out (”one”, “two”, "three”,
	 * etc…).
	 * 
	 * @param input
	 * @return
	 */
	public static boolean sentenceCheck(String input) {

		// if the string does not start with a capital letter return false
		if (!capitalStart(input)) {
			System.out.println("String does not start with a capitcal letter.\n");
			return false;
		}

		// if the last the last character is not '.', '!' or '?' return false
		if (terminationCharacter(input) == false) {
			System.out.println("String is missing a termination character at the end of the sentence.\n");

			return false;
		}

		// if the string contains a termination character that isnt the last letter
		// return false
		if (incorrectPeriod(input)) {
			System.out.println("String contains a period character that is not at the end of the sentence.\n");
			return false;
		}

		// if the string contains the a number between 0 and 12 written numerically
		// (instead of alphabetically) return false
		if (containsSmallNumber(input)) {
			System.out.println("String contains a number less than 13 that is not spelled out.\n");
			return false;
		}

		// if the number of '"' chars in the string is not an even number return false
		if (!evenQuotes(input)) {
			System.out.println("String contains an odd number of quotation marks.\n");
			return false;
		}

		System.out.println("Sentence is valid.\n");
		return true;
	}

}
