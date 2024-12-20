package StaticMethod;

public class StaticMethodExample {

    public static String display()
    {
       String s = "Hello Display";
        return s;
    }

    public String show(String input)
    {
        System.out.println(input);
        return "Hello Show";
    }
    public static void main(String[] args) {

        // if method is a static method then no need to create an object of the class
        String result = display(); // 1st way to call static method
        System.out.println(result);

        String result1 = StaticMethodExample.display(); // second way to call static method
        System.out.println(result1);

        // if method is not a static method then we need to create an object of the class.
        StaticMethodExample staticMethodExample = new StaticMethodExample();
        String showMethodResult = staticMethodExample.show("Hello non static");
        System.out.println(showMethodResult);

        /*
         static method is generally use to for the memory management.
         for static methods we are not creating a object. so it will consume the less memory. and execution speed of application will increase.
        */
    }
}
