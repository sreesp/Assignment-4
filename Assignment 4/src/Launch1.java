
public class Launch1 {

	public static void main(String[] args) {
		
		//Removing duplicates from String
		
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
		
		System.out.print("String after removing duplicates: ");
		for(int i =0; i<arr.length; i++) {
			if(arr[i] == ' ') {
				continue;
			}
			else {
				System.out.print(arr[i]);
			}
		}

	}

}
