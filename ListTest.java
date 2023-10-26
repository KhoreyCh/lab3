import static org.junit.Assert.*;

import java.beans.Transient;
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

    @Test
    public void mergTest()
    {
        ArrayList<String> merg1 = new ArrayList<String>();
        ArrayList<String> merge2 = new ArrayList<String>();

        merg1.add("a");
        merg1.add("a");
        merg1.add("b");
        merg1.add("c");

        merge2.add("a");
        merge2.add("a");
        merge2.add("a");
        merge2.add("b");

        List<String> result = ListExamples.merge(merg1, merge2);
    }
    
}
