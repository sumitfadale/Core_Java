package Stream_Programme;

public class CountOccurences {
    public static void main(String[] args) {
        String s1 = "Hello World";
        long count = s1.chars().filter(x -> x == 'l').count();
        System.out.println(count);
    }
}
