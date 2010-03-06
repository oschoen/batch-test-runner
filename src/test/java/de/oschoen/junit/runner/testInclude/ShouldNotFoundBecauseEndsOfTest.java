package de.oschoen.junit.runner.testInclude;

import org.junit.Test;

import static org.junit.Assert.fail;

public class ShouldNotFoundBecauseEndsOfTest {

    @Test
    public void shouldFail() {
        fail();
    }
}
