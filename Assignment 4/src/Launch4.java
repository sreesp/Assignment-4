
public class Launch4 {

	public static void main(String[] args) {
		
		//Finding count of Consonants, Vowels, Special Characters and Numbers in a String.
		
		String pw = "AbcdEfghijkLmNopQrsTuVWXyz1234567890!@#$%^&*()_+-=:;<>,.?/{}|][";
		
		String vowels = "";
		String consonants = "";
		String numbers = "";
		String specialCharacters = "";
		
		
		
		for(int i = 0;i < pw.length(); i++) {
			
			if(pw.charAt(i) == 'a' || pw.charAt(i) == 'e' || pw.charAt(i) == 'i'|| pw.charAt(i) == 'o' || pw.charAt(i) == 'u' || pw.charAt(i) == 'A' || pw.charAt(i) == 'E' || pw.charAt(i) == 'I'|| pw.charAt(i) == 'O' || pw.charAt(i) == 'U') {
				vowels = vowels + pw.charAt(i);
			}
			else if((pw.charAt(i)>64  &&  pw.charAt(i)<91 ) || (pw.charAt(i)>96 && pw.charAt(i)<123)) {
				consonants = consonants + pw.charAt(i);
			}
			else if(pw.charAt(i)>47 && pw.charAt(i)<58) {
				numbers=numbers+pw.charAt(i);
			}
			else {
				specialCharacters = specialCharacters + pw.charAt(i);
			}
		}

		System.out.println("Vowels: "  + vowels);
		System.out.println("Consonants: "  + consonants);
		System.out.println("Numbers: "  + numbers);
		System.out.println("SpecialCharacters: "  + specialCharacters);
		
		System.out.println();
		
		System.out.println("No. of Vowels: "  + vowels.length());
		System.out.println("No. of Consonants: "  + consonants.length());
		System.out.println("No. of Numbers: "  + numbers.length());
		System.out.println("No. of SpecialCharacters: "  + specialCharacters.length());
		
	}

}
