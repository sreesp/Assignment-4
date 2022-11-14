
public class Launch7 {

	public static void main(String[] args) {
		
		//Finding String contains unique characters 
		
		String s = "AAAAAAAAAAAAAAA";
		
		boolean flag = false;
		
		for(int i = 1; i<s.length(); i++) {
			if(s.charAt(i) == s.charAt(i-1)) {
				flag = true;
			}
			else {
				flag = false;
				break;
			}
		}
		
		if(flag == true) {
			System.out.println("String has unique characters.");
		}
		else
			System.out.println("String contains different characters.");

	}

}
