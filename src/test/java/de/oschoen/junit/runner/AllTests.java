package de.oschoen.junit.runner;

import org.junit.runner.RunWith;


@RunWith(BatchTestRunner.class)
@BatchTestRunner.BatchTestInclude("**.*Suite")
public class AllTests {
}
