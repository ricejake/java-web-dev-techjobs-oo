package org.launchcode.techjobs_oo.Tests;
import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;
import static org.junit.Assert.assertNotEquals;

public class JobTest {
    Job test_job1;
    Job test_job2;
    Job test_job3;
    Job test_job4;
    Job test_job5;

    @Before
    public void createJobObject() {
        test_job1 = new Job();
        test_job2 = new Job();
        test_job3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        test_job4 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        test_job5 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency(""));
    }

    @Test
    public void testSettingJobId() {
        assertNotEquals("test_job1 id should not equal test_job2 id", test_job1.getId(), test_job2.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        assertTrue(test_job3 instanceof Job);
    }

    @Test
    public void testJobsForEquality() {
        assertNotEquals("test_job3 should not equal test_job4", test_job3, test_job4 );
    }

    @Test
    public void firstJobsToStringTest(){
        assertEquals("ID: 23 \n" +
        "Name: Product tester\n" +
                "Employer: ACME\n" +
                "Location: Desert\n" +
                "Position Type: Quality control\n" +
                "Core Competency: Persistence" , test_job3.toString());
    }

    @Test
    public void testForEmptyFields(){
        assertEquals("ID: 10 \n" +
        "Name: Product tester\n" +
                "Employer: ACME\n" +
                "Location: Desert\n" +
                "Position Type: Quality control\n" +
                "Core Competency: Data not available" , test_job5.toString());
    }

}
