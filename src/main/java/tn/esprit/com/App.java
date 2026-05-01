package tn.esprit.com;

import java.util.logging.Logger;

public class App
{
    private static final Logger LOGGER = Logger.getLogger(App.class.getName());

    public static void main( String[] args )
    {
        LOGGER.info( greet("World") );
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
