package com.pranav.app;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class AppTest 
    extends TestCase
{
    public void testApp()
    {
        assertEquals(App.add(1, 1), 2);
        assertEquals(App.sub(1, 1), 0);
        assertEquals(App.mul(1, 1), 1);
        assertEquals(App.div(1, 1), 1);
    }
}
