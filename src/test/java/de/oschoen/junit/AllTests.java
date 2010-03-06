package de.oschoen.junit;

import de.oschoen.junit.runner.BatchTestRunner;
import org.junit.runner.RunWith;

@RunWith(BatchTestRunner.class)
@BatchTestRunner.BatchTestExclude("*DontFindThisTest.class")
public class AllTests {
}
