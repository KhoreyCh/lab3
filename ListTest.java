import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.*;
import java.util.List;



public class ListTest {
    @Test
    public void checkerTest()
    {
        ListExamples tester = new ListExamples();
        Checkers test = new Checkers();
        ArrayList<String> myTest = new ArrayList<String>();
        myTest.add("hi");
        myTest.add("bye");
        List<String> result = tester.filter(myTest,test);
        assertEquals("hi",result.get(0));
    }
    
}
