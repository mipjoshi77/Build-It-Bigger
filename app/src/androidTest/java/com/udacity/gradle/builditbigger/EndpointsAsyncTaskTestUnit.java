package com.udacity.gradle.builditbigger;

import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.concurrent.TimeUnit;

@RunWith(AndroidJUnit4.class)
public class EndpointsAsyncTaskTestUnit {
    //Before you run the test, be sure to run appengineStart for backend
    @Test
    public void testWhether_asyncTask_retrieves_aNonEmptyString() throws Exception {
        EndpointsAsyncTaskTest aTest =  new EndpointsAsyncTaskTest();
        aTest.execute(InstrumentationRegistry.getContext());
        String joke = aTest.get(5, TimeUnit.SECONDS);
        Assert.assertEquals(45,joke.length());
    }
}
