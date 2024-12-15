package String_Programme;

public class StringConcat {

	public static void main(String[] args) {
      String str1 = "Hello";
      String str2 = "World";
      
      System.out.println(str1.concat(" ").concat(str2));
      
      System.out.println(String.join(" ", str1,str2));
	}

}
