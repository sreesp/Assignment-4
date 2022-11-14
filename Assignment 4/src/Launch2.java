
public class Launch2 {

	public static void main(String[] args) {
		
		//Finding duplicate characters 
		
		String s1 = "grass is greener on the other side";
		s1 = s1.replace(" ", "");
		
		char[] arr = s1.toCharArray();
		String s2 = "";
		
		for(int i = 0; i<arr.length; i++) {
			
			int check = 0;
			for(int j = i+1; j< arr.length; j++) {
				if(arr[i] == arr[j] && arr[j] != ' ') {
					check++;
					arr[j] = ' ';
				}
			}
			if(check>0) {
				s2 = s2 + arr[i];	
			}
			
		}
		
		System.out.println("Duplicates in string are: " + s2);
		
//		System.out.print("Duplicates in string are: ");
//		for(int i = 0; i<s2.length(); i++) {
//			System.out.print(s2.charAt(i) + " ");
//		}
		
	}

}
