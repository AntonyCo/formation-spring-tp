package com.training.spring.bigcorp;

import com.training.spring.bigcorp.utils.OutputCapture;
import org.junit.Rule;
import org.junit.Test;

import static org.hamcrest.Matchers.containsString;
import static org.junit.Assert.*;

public class BigCorpApplicationTest {

    @Rule
    public OutputCapture output = new OutputCapture();

    private BigCorpApplication application = new BigCorpApplication();

    @Test
    public void run() {
        application.run();
        assertThat(output.toString(), containsString("Application [BigCorp application (dev)] - version : 1"));
    }
}