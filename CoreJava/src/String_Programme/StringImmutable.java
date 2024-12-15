package String_Programme;

public class StringImmutable {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";
        s1.concat(s2); // new object is created in heap
       System.out.println(s1);

       String s3 =  s1.concat(s2);
       System.out.println(s3);
       s2 = s1.concat(s2);
        System.out.println(s3);
    }
}
