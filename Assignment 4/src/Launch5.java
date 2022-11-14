
public class Launch5 {

	public static void main(String[] args) {
		
		//Anagram with least inbuilt methods 
		
		String s1 = "Vacation Time";
		String s2 = "I am not active";
		
		String s = "";
		
		//used only length() and charAt() methods
		
		//removing spaces in s1
		for(int i = 0; i<s1.length();i++) {
			if(s1.charAt(i) == ' ') {
				continue;
			}
			else {
				s = s + s1.charAt(i);
			}
		}
		s1 = s;
		s="";
		
		//removing spaces in s2
		for(int i = 0; i<s2.length();i++) {
			if(s2.charAt(i) == ' ') {
				continue;
			}
			else {
				s = s + s2.charAt(i);
			}
		}
		s2 = s;
		s="";
		
		//in an anagram, no. of letters must be same
		if(s1.length() != s2.length()){
			System.out.println("Not an anagram");
		}
		
		else {
			
			//converting all letters in s1 to lower case
			for(int i = 0; i<s1.length();i++) {
				if(s1.charAt(i)>64 && s1.charAt(i)<91) {
					s = s + ((char) (s1.charAt(i) + 32));
				}
				else {
					s = s + s1.charAt(i);
				}
			}
			s1 = s;
			s="";
			
			//converting all letters in s2 to lower case
			for(int i = 0; i<s2.length();i++) {
				if(s2.charAt(i)>64 && s2.charAt(i)<91) {
					s = s + ((char) (s2.charAt(i) + 32));
				}
				else {
						s = s + s2.charAt(i);
				}
			}
			s2 = s;
			s="";
			
			
			//converting s1 to char array
			char[] a1 = new char[s1.length()];
			
			for(int i = 0; i<a1.length; i++) {
				a1[i] = s1.charAt(i);
			}
			
			//sorting array a1 using bubble sort
			for(int i = 0; i<a1.length;i++) {
				for(int j = 1; j<a1.length-i; j++) {
					char temp;
					if(a1[j]<=a1[j-1]) {
						temp = a1[j-1];
						a1[j-1] = a1[j];
						a1[j] = temp;
					}
				}
			}
			
			
			
			//converting s2 to char array
			char[] a2 = new char[s2.length()];
			
			for(int i = 0; i<a2.length; i++) {
				a2[i] = s2.charAt(i);
			}
			
			//sorting array a2 using bubble sort
			for(int i = 0; i<a2.length;i++) {
				for(int j = 1; j<a2.length-i; j++) {
					char temp;
					if(a2[j]<=a2[j-1]) {
						temp = a2[j-1];
						a2[j-1] = a2[j];
						a2[j] = temp;
					}
				}
			}
			
		
			
			boolean flag = false;
			
			//comparing a1 and a2 to check whether both are same or not
			for(int i = 0; i<a1.length; i++) {
				if(a1[i] == a2[i]) {
					flag = true;
				}
				else {
					flag = false;
					break;
				}
					
			}
			
			if(flag == true) {
				System.out.println("Anagram");
			}
			else
				System.out.println("Not an anagram");
			
		
		}
		
		
	}

}
