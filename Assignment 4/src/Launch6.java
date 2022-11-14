
public class Launch6 {

	public static void main(String[] args) {
		
		//Pangram with least inbuilt methods 
		
		String s1 = "Brown jars prevented the mixture from freezing too quickly";
		String s = "";
	
		//removing spaces
		for(int i = 0; i<s1.length(); i++) {
			if(s1.charAt(i)==' ') {
				continue;
			}
			else {
				s = s + s1.charAt(i);
			}
		}
		s1 = s;
		s="";
		
		//converting s1 to upper/lower case
		for(int i = 0; i<s1.length(); i++) {
			if(s1.charAt(i)>='a') {
				s = s + (char)(s1.charAt(i) - 32);
			}
			else
				s = s + s1.charAt(i);
		}
		s1 = s;
		s="";
		
		int[] a = new int[26];
		
		
		for(int i = 0; i<s1.length();i++) {
			a[s1.charAt(i)-65]++;
		}
		
		boolean flag = false;
		
		for(int num : a) {
			if(num>0) {
				flag = true;
			}
			else {
				flag = false;
				break;
			}
		}
		
		if(flag) {
			System.out.println("Pangram");
		}
		else
			System.out.println("Not Pangram");
	
	}

}
