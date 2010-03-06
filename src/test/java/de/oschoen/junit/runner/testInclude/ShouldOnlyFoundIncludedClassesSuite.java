package de.oschoen.junit.runner.testInclude;

import de.oschoen.junit.runner.BatchTestRunner;
import org.junit.runner.RunWith;


@RunWith(BatchTestRunner.class)
@BatchTestRunner.BatchTestInclude("*Include.class")
public class ShouldOnlyFoundIncludedClassesSuite {
}
