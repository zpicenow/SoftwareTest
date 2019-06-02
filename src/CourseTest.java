import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CourseTest {
    public Course course;
    @Before
    public void setUp() {
        course=new Course();
    }
    @Test
    public void testaddStudent() {
        assertTrue(course.addStudent());
    }
    @Test
    public void testremoveStudent() {
        assertTrue(course.removeStudent());
    }
    @Test
    public void testaddProfessor() {
        assertTrue(course.addProfessor());
    }
    @Test
    public void testremoveProfessor() {
        assertTrue(course.removeProfessor());
    }
    @Test
    public void testcancel() {
        assertTrue(course.cancel());
    }
    @Test
    public void testcloseRegistration() {
        assertTrue(course.closeRegistration());
    }
    @Test
    public void testclose() {
        assertTrue(course.close());
    }
    @Test
    public void testSendNotice() { assertTrue(course.SendNotice());  }
    @Test
    public void testgenerateClassRoster() {assertTrue(course.generateClassRoster()); }

}

//    public void MyTest() {
//        setUp();
//        testaddProfessor();
//        for(int i=0;i<10;i++) {
//            testaddProfessor();
//        }
//        testclose() ;
//
//        setUp();
//        testclose();
//    }