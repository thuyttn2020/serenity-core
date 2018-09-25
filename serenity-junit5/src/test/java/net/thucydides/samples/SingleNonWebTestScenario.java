package net.thucydides.samples;

import net.serenitybdd.junit5.extensions.Serenity;
import net.thucydides.core.annotations.Steps;
import org.junit.jupiter.api.Test;

@Serenity
public class SingleNonWebTestScenario {
    
    @Steps
    public SampleNonWebSteps steps;
        
    @Test
    public void happy_day_scenario() {
        steps.stepThatSucceeds();
        steps.stepThatIsIgnored();
        steps.stepThatIsPending();
        steps.anotherStepThatSucceeds();
        steps.stepThatFails();
        steps.stepThatSucceeds();
    }

    @Test
    public void failing_scenario() {
        steps.stepThatFails();
        steps.stepThatSucceeds();
        steps.anotherStepThatSucceeds();
    }
}
