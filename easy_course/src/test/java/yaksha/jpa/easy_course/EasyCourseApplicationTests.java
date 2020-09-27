package yaksha.jpa.easy_course;

import org.junit.Test;

import static yaksha.jpa.easy_course.TestUtils.*;


public class EasyCourseApplicationTests {

	@Test
	public void testMain() throws Exception {
		yakshaAssert(currentTest(),(true?"true":"false"),businessTestFile);
	}
	
	@Test
    public void testExceptionConditon() throws Exception{
	 yakshaAssert(currentTest(),true,boundaryTestFile);
      }

	@Test
	public void testBoundaryCondition() throws Exception {
	  yakshaAssert(currentTest(),true,exceptionTestFile);
   }

}
