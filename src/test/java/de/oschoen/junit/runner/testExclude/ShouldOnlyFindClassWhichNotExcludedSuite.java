package de.oschoen.junit.runner.testExclude;

import de.oschoen.junit.runner.BatchTestRunner;
import org.junit.runner.RunWith;

@RunWith(BatchTestRunner.class)
@BatchTestRunner.BatchTestExclude("*ExcludeTest.class")
public class ShouldOnlyFindClassWhichNotExcludedSuite {
}
