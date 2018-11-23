package com.techyourchance.unittestingfundamentals.exercise2;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;

public class StringDuplicatorTest {

    StringDuplicator stu;
    @Before
    public void stup()
    {
        stu=new StringDuplicator();
    }

@Test
    public void test1()

{
    String ans=stu.duplicate("Natansh");
    Assert.assertThat(ans,is("NatanshNatansh"));

}
}