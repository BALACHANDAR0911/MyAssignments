package week3Day1;

public class ChangeOddIndexUpp {

	public static void main(String[] args) {
		
		String s1= "changeme";
		char[] chars = s1.toCharArray();
		for(int i =chars.length - 1;i >= 0;i--) {
			if(i%2 != 0) {
			chars[i]=Character.toUpperCase(chars[i]);	
		}
	}
		String result = new String(chars);
		System.out.println(result);

}
}
