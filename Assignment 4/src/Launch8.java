
public class Launch8 {

	public static void main(String[] args) {
		
		//Finding maximum occurring characters
		
		String s1 = "Opppositiion";
		
		char[] c = s1.replace(" ", "").toLowerCase().toCharArray();
		
		int[] n = new int[c.length];
		
		for(int i = 0; i<c.length; i++) {
			n[i] = 0;
			for(int j = i+1; j<c.length;j++) {
				if(c[i] == c[j] && c[i] != ' ') {
					n[i]++;
					c[j] = ' ';
				}
			}
		}
		
//		for(int a : n) {
//			System.out.print(a + " ");
//		}
		
		int max = 0;
		char maxRepeatedChar = ' ';

		for(int i = 0; i<n.length; i++) {
			if(n[i]>=max) {
				max = n[i];
			}
		}
		
		System.out.print("The maximum occurring character in give String is/are: ");
		for(int i = 0; i<n.length; i++) {
			if(n[i]==max) {
				maxRepeatedChar = c[i];
				System.out.print(maxRepeatedChar + " ");
			}
		}
	
	}

}
