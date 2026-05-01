package tn.esprit.com.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.After;
import org.junit.Test;

import tn.esprit.com.App;

public class AppTest
{
    @Before
    public void setUp()
    {
        System.out.println("Starting test...");
    }

    @After
    public void tearDown()
    {
        System.out.println("Test finished.");
    }

    @Test
    public void greetWithName()
    {
        assertEquals("Hello, Alice!", App.greet("Alice"));
    }

    @Test
    public void greetWithNullName()
    {
        assertEquals("Hello, stranger!", App.greet(null));
    }

    @Test
    public void greetWithEmptyName()
    {
        assertEquals("Hello, stranger!", App.greet(""));
    }

    @Test
    public void addPositiveNumbers()
    {
        assertEquals(5, App.add(2, 3));
    }

    @Test
    public void addNegativeNumbers()
    {
        assertEquals(-1, App.add(2, -3));
    }
}
