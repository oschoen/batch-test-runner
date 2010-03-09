# Batch Test Runner

Define a junit 4 test suite based on pattern matching.

## Examples:

Runs all classes in package com.example and sub packages, whose name ends with Test.

> package com.example;
>
> import org.junit.runner.RunWith;
>
> @RunWith(de.oschoen.junit.runner.BatchTestRunner.class)
> public class AllTests {
 }

Runs all classes in package com.example and sub packages, whose name ends with Suite.

> package com.example;

> import org.junit.runner.RunWith;

> @RunWith(de.oschoen.junit.runner.BatchTestRunner.class)
> @BatchTestRunner.BatchTestInclude("**.*Suite")
>
> public class AllTests {
}

Exclude a package:

> package com.example;

> import org.junit.runner.RunWith;

> @RunWith(de.oschoen.junit.runner.BatchTestRunner.class)
> @BatchTestRunner.BatchTestExclude("**.shouldBeIgnored.**")

> public class AllTests {
}

