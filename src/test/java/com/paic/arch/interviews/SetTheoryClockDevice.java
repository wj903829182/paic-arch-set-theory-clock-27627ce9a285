package com.paic.arch.interviews;


import com.paic.arch.interviews.com.paic.arch.interviews.impl.TimeConverterImpl;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Test;

import static com.paic.arch.interviews.support.BehaviouralTestEmbedder.aBehaviouralTestRunner;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * Acceptance test class that uses the JBehave (Gerkin) syntax for writing stories.  
 * You will notice the TimeConverter has no implementation ... (hint)
 */
public class SetTheoryClockDevice {

    private TimeConverter setTheoryClock;
    private String theTime;

    @Test
    public void setTheoryClockAcceptanceTests() throws Exception {
        setTheoryClock = new TimeConverterImpl();
        aBehaviouralTestRunner()
                .usingStepsFrom(this)
                .withStory("set-theory-clock.story")
                .run();
    }

    @When("the time is $time")
    public void whenTheTimeIs(String time) {
        theTime = time;
    }

    @Then("the clock should look like $")
    public void thenTheClockShouldLookLike(String theExpectedClockOutput) {
        //System.out.println("33333333333333*************************"+theTime);
        //System.out.println("555555555555555*************************\n"+theExpectedClockOutput);
        //System.out.println("-----------------------------------");

        //System.out.println("j:"+setTheoryClock.convertTime(theTime));
        //System.out.println("-----------------");
        //System.out.println("k:"+theExpectedClockOutput);
        assertThat(setTheoryClock.convertTime(theTime)).isEqualTo(theExpectedClockOutput);
        /*assertThat("Y\n" +
                "OOOO\n" +
                "OOOO\n" +
                "OOOOOOOOOOO\n" +
                "OOOO").isEqualTo("Y\n" +
                "OOOO\n" +
                "OOOO\n" +
                "OOOOOOOOOOO\n" +
                "OOOO");*/
    }
}
