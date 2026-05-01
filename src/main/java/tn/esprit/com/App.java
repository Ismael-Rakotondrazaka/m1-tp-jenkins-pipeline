package tn.esprit.com;

public class App
{
    public static void main( String[] args )
    {
        System.out.println( greet("World") );
    }

    public static String greet( String name )
    {
        if (name == null || name.isEmpty()) {
            return "Hello, stranger!";
        }
        return "Hello, " + name + "!";
    }

    public static int add( int a, int b )
    {
        return a + b;
    }
}
