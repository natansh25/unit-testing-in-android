package com.techyourchance.unittestingfundamentals.exercise1;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;

public class NegativeNumberValidatorTest {

    NegativeNumberValidator stu;

@Before
    public void setUp()
{
    stu=new NegativeNumberValidator();
}

@Test
    public void test1()
{
    boolean ans=stu.isNegative(-2);
    Assert.assertThat(ans,is(true));
}


}